package pratica2;

import java.util.Scanner;

public class hotel {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tipo de apartamento (S para simples, D para duplo): ");
        char tipoApartamento = Character.toUpperCase(scanner.next().charAt(0));

        System.out.println("Digite a quantidade de dias hospedado: ");
        int quantidadeDias = scanner.nextInt();

        double totalAPagar = calcularTotalAPagar(tipoApartamento, quantidadeDias);

        System.out.println("Total a ser pago: " + totalAPagar);

        scanner.close();
    }

    public static double calcularTotalAPagar(char tipoApartamento, int quantidadeDias) {
        double precoDiaria;

        if (tipoApartamento == 'S') {
            if (quantidadeDias < 10)
                precoDiaria = 100.00;
            else if (quantidadeDias <= 15)
                precoDiaria = 90.00;
            else
                precoDiaria = 80.00;
        } else if (tipoApartamento == 'D') {
            if (quantidadeDias < 10)
                precoDiaria = 140.00;
            else if (quantidadeDias <= 15)
                precoDiaria = 120.00;
            else
                precoDiaria = 100.00;
        } else {
            System.out.println("Tipo de apartamento inválido.");
            return 0;
        }

        return precoDiaria;
    }
}
