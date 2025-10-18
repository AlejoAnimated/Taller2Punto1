/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author efrai
 */
public class Competencia {

    private String nombreEvento;
    private ArrayList<Equipo> equipos;

    public Competencia(String nombreEvento) {
        this.nombreEvento = nombreEvento;
        equipos = new ArrayList<>();
    }

    public void agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public String obtenerDescripcion() {
        return "Competencia: " + nombreEvento;
    }

    public String generarReporte() {
        String reporte = "=== REPORTE DE LA COMPETENCIA ===\n";
        reporte += obtenerDescripcion() + "\n";
        reporte += "Total equipos: " + equipos.size() + "\n\n";

        for (Equipo equipo : equipos) {
            reporte += equipo.obtenerDescripcion() + "\n";

            if (equipo.getCompetidores().isEmpty()) {
                reporte += "   (Sin competidores registrados)\n";
            } else {
                for (Competidor c : equipo.getCompetidores()) {
                    reporte += "   - " + c.obtenerDescripcion() + "\n";
                }
            }
            reporte += "\n";
        }
        return reporte;
    }

    @Override
    public String toString() {
        return obtenerDescripcion();
    }
}
