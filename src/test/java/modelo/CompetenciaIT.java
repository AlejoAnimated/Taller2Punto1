/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author efrai
 */
public class CompetenciaIT {

    private Competencia competencia;
    private Equipo equipoColombia;
    private Competidor c1, c2;

    @BeforeEach
    public void setUp() {
        System.out.println("=== Preparando entorno de prueba ===");
        competencia = new Competencia("Mundial de Ciclismo de Pista");

        equipoColombia = new Equipo("Colombia Power", "Colombia");

        c1 = new Competidor("Andrés", 24, "Colombia", 3, 1.78, 70, 60);
        c2 = new Competidor("Carlos", 27, "Colombia", 2, 1.80, 72, 85);

        equipoColombia.agregarCompetidor(c1);
        equipoColombia.agregarCompetidor(c2);

        competencia.agregarEquipo(equipoColombia);
    }

    @Test
    public void testGenerarReporte() {
        System.out.println("\n--- Test: Generar reporte completo ---");
        System.out.println(competencia.generarReporte());
    }

    @Test
    public void testActualizarRankingDeCompetidor() {
        System.out.println("\n--- Test: Actualizar ranking de competidor ---");
        System.out.println("Antes: " + c1.obtenerDescripcion());
        c1.actualizarRanking(50); // suma 50 puntos y recalcula ranking
        System.out.println("Después: " + c1.obtenerDescripcion());
    }

    @Test
    public void testAgregarOtroEquipoYCompetidor() {
        System.out.println("\n--- Test: Agregar otro equipo y competidor ---");

        Equipo equipoEspaña = new Equipo("España Team", "España");
        Competidor miguel = new Competidor("Miguel", 26, "España", 4, 1.75, 68, 40);

        equipoEspaña.agregarCompetidor(miguel);
        competencia.agregarEquipo(equipoEspaña);

        System.out.println(competencia.generarReporte());
    }
}
