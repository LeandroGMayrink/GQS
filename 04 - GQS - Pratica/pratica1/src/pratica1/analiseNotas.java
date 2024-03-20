package pratica1;

import java.util.Scanner;

public class analiseNotas {
	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        int alunosNota90ouMais = 0;
	        int alunosReprovados = 0;
	        double maiorNota = Double.MIN_VALUE;
	        double menorNota = Double.MAX_VALUE;
	        double somaNotas = 0;
	        int totalAlunos = 0;

	        while (true) {
	            System.out.print("Nota final (ou negativa para sair): ");
	            double nota = scanner.nextDouble();

	            if (nota < 0) {
	                break;
	            }

	            System.out.print("Total de faltas: ");
	            int faltas = scanner.nextInt();

	            totalAlunos++;
	            somaNotas += nota;

	            if (nota >= 90) {
	                alunosNota90ouMais++;
	            }

	            if (nota < 70 || faltas >= 20) {
	                alunosReprovados++;
	            }

	            maiorNota = Math.max(maiorNota, nota);
	            menorNota = Math.min(menorNota, nota);
	        }

	        if (totalAlunos > 0) {
	            double mediaNotas = somaNotas / totalAlunos;

	            System.out.println("\nEstatísticas:");
	            System.out.println("a. Alunos com nota final maior ou igual a 90: " + alunosNota90ouMais);
	            System.out.println("b. Alunos reprovados por nota ou falta: " + alunosReprovados);
	            System.out.println("c. Maior nota: " + (maiorNota == Double.MIN_VALUE ? "N/A" : maiorNota));
	            System.out.println("   Menor nota: " + (menorNota == Double.MAX_VALUE ? "N/A" : menorNota));
	            System.out.println("d. Média de notas da turma: " + mediaNotas);
	        } else {
	            System.out.println("Nenhum aluno foi registrado.");
	        }


	        scanner.close();
	 }
}
