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
public class Equipo extends Competencia {

    private String nombreEquipo;
    private String pais;
    private ArrayList<Competidor> competidores;

    public Equipo(String nombreEquipo, String pais) {
        super(""); // no necesitamos el nombre del evento aquí
        this.nombreEquipo = nombreEquipo;
        this.pais = pais;
        competidores = new ArrayList<>();
    }

    public void agregarCompetidor(Competidor competidoor) {
        competidores.add(competidoor);
    }

    public ArrayList<Competidor> getCompetidores() {
        return competidores;
    }

    @Override
    public String obtenerDescripcion() {
        return "Equipo: " + nombreEquipo + " (" + pais + ")";
    }

    @Override
    public String toString() {
        return obtenerDescripcion();
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public String getPais() {
        return pais;
    }

}
