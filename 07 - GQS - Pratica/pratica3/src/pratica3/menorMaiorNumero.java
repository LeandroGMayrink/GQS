package pratica3;

import java.util.Scanner;

public class menorMaiorNumero {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vetor = new double[10]; 

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe o " + (i + 1) + "º número real: ");
            vetor[i] = scanner.nextDouble();
        }

        double menor = vetor[0];
        double maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        System.out.print("Vetor: [");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i < vetor.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.println("Menor número: " + menor);
        System.out.println("Maior número: " + maior);

        scanner.close();
    }
}