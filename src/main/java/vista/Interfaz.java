/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;

/**
 *
 * @author efrai
 */
public class Interfaz {

    public static void mostrar(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static String texto(String mensaje) {
        return JOptionPane.showInputDialog(null, mensaje);
    }

    public static int numero(String mensaje) {
        return Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
    }

    public static double decimal(String mensaje) {
        return Double.parseDouble(JOptionPane.showInputDialog(null, mensaje));
    }

    public static int menu() {
        String menu
                = "=== MENÚ PRINCIPAL ===\n"
                + "1. Registrar equipos y competidores\n"
                + "2. Actualizar datos\n"
                + "3. Mostrar reporte\n"
                + "4. Salir\n"
                + "Seleccione una opción:";
        return Integer.parseInt(JOptionPane.showInputDialog(null, menu));
    }
}
