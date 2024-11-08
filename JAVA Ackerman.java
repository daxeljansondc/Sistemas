import javax.swing.JOptionPane;

public class Ackermann {

    public static void main(String[] args) {
        try {
            int m = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de m (no negativo):"));
            int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de n (no negativo):"));

            if (m < 0 || n < 0) {
                JOptionPane.showMessageDialog(null, "Los valores deben ser no negativos.");
                return;
            }

            int result = ackermann(m, n);
            JOptionPane.showMessageDialog(null, "El resultado de A(" + m + ", " + n + ") es: " + result);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese números válidos.");
        }
    }

    public static int ackermann(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m == 1) {
            return n + 2;
        } else if (m == 2) {
            return 2 * n + 3;
        } else if (m == 3) {
            return (1 << (n + 3)) - 3; // 2^(n+3) - 3, que es 2 elevado a (n+3)
        } else {
            return ackermann(m - 1, ackermann(m, n - 1));
        }
    }
}