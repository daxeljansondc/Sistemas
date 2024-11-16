package ackerman;

import javax.swing.JOptionPane;

public class Ackerman {
    public static void main(String[] args) {
        try {
            int m = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de m (no negativo):"));
            int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de n (no negativo):"));

            // Validación de entrada
            if (m < 0 || n < 0) {
                JOptionPane.showMessageDialog(null, "Los valores deben ser no negativos.");
                return;
            }

            // Llamada a la función de Ackermann
            int result = ackermann(m, n);
            JOptionPane.showMessageDialog(null, "El resultado de A(" + m + ", " + n + ") es: " + result);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese números válidos.");
        } catch (StackOverflowError e) {
            JOptionPane.showMessageDialog(null, "Los valores ingresados son demasiado grandes y causan un desbordamiento de pila.");
        }
    }         //JAVIER TALENO

    // Función de Ackermann corregida
    public static int ackermann(int m, int n) {
        if (m == 0) {
            return n + 1; // Caso base
        } else if (n == 0) {
            return ackermann(m - 1, 1); // Caso cuando n = 0
        } else {
            return ackermann(m - 1, ackermann(m, n - 1)); // Caso recursivo
        }
    }
}
