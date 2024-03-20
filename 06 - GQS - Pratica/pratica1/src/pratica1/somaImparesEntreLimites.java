package pratica1;

import javax.swing.JOptionPane;

public class somaImparesEntreLimites {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número inteiro positivo: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número inteiro positivo: "));

        int min = Math.min(n1, n2);
        int max = Math.max(n1, n2);

        int soma = 0;
        for (int i = min; i <= max; i++)
            if (i % 2 != 0) soma += i;

        JOptionPane.showMessageDialog(null, "A soma dos números ímpares entre " + min + " e " + max + " é: " + soma);
	}

}