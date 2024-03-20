package pratica2;

import java.util.Scanner;

public class pesquisaPrefeitura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPessoas = 0;
        double somaSalarios = 0;
        int somaFilhos = 0;

        System.out.println("Bem-vindo à pesquisa da prefeitura!");
        System.out.println("Insira os dados dos habitantes (digite um salário negativo para encerrar):");

        while (true) {
            System.out.print("Salário: ");
            double salario = scanner.nextDouble();

            if (salario < 0) {
                break; // Sai do loop se o salário for negativo
            }

            System.out.print("Número de filhos: ");
            int filhos = scanner.nextInt();

            // Atualiza as estatísticas
            totalPessoas++;
            somaSalarios += salario;
            somaFilhos += filhos;
        }

        if (totalPessoas > 0) {
            double mediaSalarios = somaSalarios / totalPessoas;
            double mediaFilhos = (double) somaFilhos / totalPessoas;

            System.out.println("\nResultados da pesquisa:");
            System.out.println("a. Média salarial da população: " + mediaSalarios);
            System.out.println("b. Média do número de filhos: " + mediaFilhos);
        } else {
            System.out.println("Nenhum habitante foi registrado.");
        }

        scanner.close();
    }
}