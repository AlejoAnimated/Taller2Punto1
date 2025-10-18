/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package modelo;

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
public class CompetidorTest {

    @Test
    public void testActualizarRankingSinParametros() {
        Competidor c = new Competidor("Juan", 25, "Colombia", 3, 1.80, 70, 50);
        c.actualizarRanking(); // suma los mismos puntos
        assertEquals(100, c.getPuntos()); // 50 + 50 = 100
        assertEquals(1, c.getRankingMundial());
    }

    @Test
    public void testActualizarRankingConParametros() {
        Competidor c = new Competidor("Pedro", 28, "México", 5, 1.75, 68, 30);
        c.actualizarRanking(50); // suma 50 → total 80
        assertEquals(80, c.getPuntos());
        assertEquals(2, c.getRankingMundial());
    }

    @Test
    public void testSettersYGetters() {
        Competidor c = new Competidor("Ana", 22, "Chile", 4, 1.65, 55, 40);
        c.setNombre("Ana María");
        c.setEdad(23);
        c.setPeso(56);
        assertEquals("Ana María", c.getNombre());
        assertEquals(23, c.getEdad());
        assertEquals(56, c.getPeso(), 0.01);
    }
}
