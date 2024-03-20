package pratica4;

import javax.swing.JOptionPane;

public class maiorMenorNumero {
	public static void main(String[] args) {
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        String input;
        boolean continuar = true;

        while (continuar) {
            input = JOptionPane.showInputDialog("Informe um número inteiro (ou digite 'fim' para encerrar):");

            if (input.equalsIgnoreCase("fim")) {
                continuar = false;
            } else {
                try {
                    int numero = Integer.parseInt(input);
                    if (numero > maior) {
                        maior = numero;
                    }
                    if (numero < menor) {
                        menor = numero;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira um número inteiro válido.");
                }
            }
        }

        JOptionPane.showMessageDialog(null, "O maior número informado é: " + maior + "\nO menor número informado é: " + menor);
    }
}