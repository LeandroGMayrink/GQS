package pratica1;

import java.util.Scanner;

public class calContaCorrente {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char continuar;
        do {
            System.out.print("Informe o número da conta corrente (com 3 dígitos): ");
            int numeroConta = scanner.nextInt();

            int digitoVerificador = calcularDigitoVerificador(numeroConta);

            System.out.println("O dígito verificador da conta " + numeroConta + " é: " + digitoVerificador);

            System.out.print("Deseja calcular o dígito verificador de outra conta? (S/N): ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');

        scanner.close();
    }

    public static int calcularDigitoVerificador(int numeroConta) {
        int inverso = Integer.parseInt(new StringBuilder(Integer.toString(numeroConta)).reverse().toString());
        int soma = numeroConta + inverso;
        int digitoVerificador = 0;
        for (int i = 0; i < 4; i++) {
            digitoVerificador += (soma % 10) * i;
            soma /= 10;
        }
        return digitoVerificador % 10;
    }
}