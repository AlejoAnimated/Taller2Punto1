/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author efrai
 */
public class Competidor extends Equipo {

    private String nombre;
    private int edad;
    private String pais;
    private int rankingMundial;
    private double estatura;
    private double peso;
    private int puntos;

    public Competidor(String nombre, int edad, String pais, int rankingMundial, double estatura, double peso, int puntos) {
        super("", pais);
        this.nombre = nombre;
        this.edad = edad;
        this.pais = pais;
        this.rankingMundial = rankingMundial;
        this.estatura = estatura;
        this.peso = peso;
        this.puntos = puntos;
    }

    public void actualizarRanking() {
        this.puntos += puntos;
        recalcularRanking();
    }

    public void actualizarRanking(int puntos) {
        this.puntos += puntos;
        recalcularRanking();
    }

    private void recalcularRanking() {
        if (puntos >= 100) {
            this.rankingMundial = 1;
        } else if (puntos >= 80) {
            this.rankingMundial = 2;
        } else if (puntos >= 60) {
            this.rankingMundial = 3;
        } else if (puntos >= 40) {
            this.rankingMundial = 4;
        } else {
            this.rankingMundial = 5;
        }
    }

    @Override
    public String obtenerDescripcion() {
        return "Competidor: " + nombre + " (" + pais + ") | Edad: " + edad
                + " | Ranking: " + rankingMundial + " | Estatura: " + estatura
                + "m | Peso: " + peso + "kg | Puntos: " + puntos;
    }

    @Override
    public String toString() {
        return obtenerDescripcion();
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPais() {
        return pais;
    }

    public int getRankingMundial() {
        return rankingMundial;
    }

    public double getEstatura() {
        return estatura;
    }

    public double getPeso() {
        return peso;
    }

    public int getPuntos() {
        return puntos;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setRankingMundial(int rankingMundial) {
        this.rankingMundial = rankingMundial;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
