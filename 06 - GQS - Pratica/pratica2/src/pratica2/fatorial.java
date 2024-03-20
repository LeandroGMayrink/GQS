package pratica2;

import javax.swing.JOptionPane;

public class fatorial {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Informe um número natural:");
        
        try {
            int numero = Integer.parseInt(input);
            if (numero < 0) {
                JOptionPane.showMessageDialog(null, "Número inválido. Insira um número natural positivo.");
            } else {
                long fatorial = calcularFatorial(numero);
                JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é: " + fatorial);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Número inválido. Insira um número natural válido.");
        }
    }

    public static long calcularFatorial(int numero) {
        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}