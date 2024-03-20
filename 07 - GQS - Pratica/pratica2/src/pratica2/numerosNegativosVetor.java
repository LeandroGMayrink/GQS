package pratica2;

import java.util.Scanner;

public class numerosNegativosVetor {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vetor = new double[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe o " + (i + 1) + "º número real: ");
            vetor[i] = scanner.nextDouble();
        }

        System.out.print("Vetor: [");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i < vetor.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("Posições dos números negativos: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}