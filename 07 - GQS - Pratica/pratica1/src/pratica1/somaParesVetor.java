package pratica1;

import java.util.Scanner;

public class somaParesVetor {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10]; 
        int somaPares = 0; 

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe o " + (i + 1) + "º número inteiro: ");
            vetor[i] = scanner.nextInt();

            if (vetor[i] % 2 == 0) {
                somaPares += vetor[i];
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

        System.out.println("A soma dos números pares é: " + somaPares);

        scanner.close();
    }
}