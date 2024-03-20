package pratica3;

import javax.swing.JOptionPane;

public class mediaIdades {
	public static void main(String[] args) {
	int soma = 0;
    int contador = 0;

    while (true) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade (ou digite -1 para encerrar): "));
        
        if (idade == -1) {
            break;
        }

        soma += idade;
        contador++;
    }

    double media = contador > 0 ? (double) soma / contador : 0;

    JOptionPane.showMessageDialog(null, "A média aritmética das idades informadas é: " + media);
	}
}