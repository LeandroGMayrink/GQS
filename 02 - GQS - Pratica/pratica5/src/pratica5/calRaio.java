package pratica5;

import java.util.Scanner;

public class calRaio {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o valor do raio da esfera: ");

        System.out.print("Raio: ");
        float raio = scanner.nextFloat();

        float comprimento = (float) (2 * Math.PI * raio);
        float area = (float) (Math.PI * Math.pow(raio, 2));
        float volume = (float) ((3.0 / 4.0) * Math.PI * Math.pow(raio, 3));

        System.out.printf("\nComprimento: %.2f\n", comprimento);
        System.out.printf("Área: %.2f\n", area);
        System.out.printf("Volume: %.2f\n", volume);
        
        scanner.close();
	}
}