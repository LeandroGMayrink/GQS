package pratica2;

import java.util.Scanner;

public class validacaoDados {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        validarNota(scanner);
        validarSalario(scanner);
        validarSexo(scanner);
        validarIdade(scanner);

        System.out.println("Todos os dados foram informados corretamente. Parabéns!");

        scanner.close();
    }

    public static void validarNota(Scanner scanner) {
        double nota;
        do {
            System.out.print("Informe a nota (entre 0 e 10): ");
            nota = scanner.nextDouble();
        } while (nota < 0 || nota > 10);

        System.out.println("Nota válida!");
    }

    public static void validarSalario(Scanner scanner) {
        double salario;
        do {
            System.out.print("Informe o salário (maior que zero): ");
            salario = scanner.nextDouble();
        } while (salario <= 0);

        System.out.println("Salário válido!");
    }

    public static void validarSexo(Scanner scanner) {
        char sexo;
        do {
            System.out.print("Informe o sexo (M ou F): ");
            sexo = scanner.next().charAt(0);
        } while (sexo != 'M' && sexo != 'm' && sexo != 'F' && sexo != 'f');

        System.out.println("Sexo válido!");
    }

    public static void validarIdade(Scanner scanner) {
        int idade;
        do {
            System.out.print("Informe a idade (entre 0 e 150): ");
            idade = scanner.nextInt();
        } while (idade < 0 || idade > 150);

        System.out.println("Idade válida!");
	}

}