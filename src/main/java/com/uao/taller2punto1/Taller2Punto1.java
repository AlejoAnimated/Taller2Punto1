/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.uao.taller2punto1;

import modelo.Competencia;
import modelo.Competidor;
import modelo.Equipo;
import vista.Interfaz;

/**
 *
 * @author efrai
 */
public class Taller2Punto1 {

    public static void main(String[] args) {

        Competencia competencia = new Competencia("Mundial de Ciclismo de Pista");
        int opcion;

        do {
            opcion = Interfaz.menu();

            switch (opcion) {

                case 1:
                    int numEquipos = Interfaz.numero("Ingrese el número de equipos:");

                    for (int i = 0; i < numEquipos; i++) {
                        String nombreEquipo = Interfaz.texto("Nombre del equipo " + (i + 1) + ":");
                        String paisEquipo = Interfaz.texto("País del equipo " + (i + 1) + ":");

                        Equipo equipo = new Equipo(nombreEquipo, paisEquipo);
                        competencia.agregarEquipo(equipo);

                        int numCompetidores = Interfaz.numero("¿Cuántos competidores tiene el equipo " + nombreEquipo + "?");
                        for (int j = 0; j < numCompetidores; j++) {
                            String nomComp = Interfaz.texto("Nombre del competidor " + (j + 1) + ":");
                            int edad = Interfaz.numero("Edad de " + nomComp + ":");
                            String paisComp = Interfaz.texto("País de " + nomComp + ":");
                            int ranking = Interfaz.numero("Ranking inicial de " + nomComp + ":");
                            double estatura = Interfaz.decimal("Estatura (m) de " + nomComp + ":");
                            double peso = Interfaz.decimal("Peso (kg) de " + nomComp + ":");
                            int puntos = Interfaz.numero("Puntos iniciales de " + nomComp + ":");

                            Competidor competidor = new Competidor(nomComp, edad, paisComp, ranking, estatura, peso, puntos);
                            competidor.actualizarRanking();
                            equipo.agregarCompetidor(competidor);
                        }
                    }
                    Interfaz.mostrar("Registro completado exitosamente.");
                    break;

                case 2:
                    if (competencia.getEquipos().isEmpty()) {
                        Interfaz.mostrar("Primero debe registrar equipos y competidores (opción 1).");
                        break;
                    }

                    for (Equipo equipo : competencia.getEquipos()) {
                        for (Competidor competidor : equipo.getCompetidores()) {
                            int puntos = Interfaz.numero("Ingrese los puntos obtenidos en esta competencia por " + competidor.getNombre() + ":");
                            competidor.actualizarRanking(puntos); // ✅ se suman y recalculan automáticamente
                        }
                    }

                    Interfaz.mostrar("Ranking actualizado correctamente según los nuevos puntos.");
                    break;

                case 3:
                    Interfaz.mostrar(competencia.generarReporte());
                    break;

                case 4:
                    break;

                default:
                    Interfaz.mostrar("Opción no válida.");
                    break;
            }

        } while (opcion != 4);
    }
}
