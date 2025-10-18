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
public class EquipoTest {

    @Test
    public void testAgregarCompetidor() {
        Equipo equipo = new Equipo("Team A", "España");
        Competidor c = new Competidor("Luis", 30, "España", 3, 1.82, 75, 60);

        equipo.agregarCompetidor(c);
        ArrayList<Competidor> lista = equipo.getCompetidores();

        assertEquals(1, lista.size());
        assertEquals("Luis", lista.get(0).getNombre());
    }

    @Test
    public void testObtenerDescripcion() {
        Equipo equipo = new Equipo("Team B", "Italia");
        assertTrue(equipo.obtenerDescripcion().contains("Team B"));
    }
}
