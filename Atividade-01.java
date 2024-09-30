/*
1. Escreva um programa que:
• leia 100 fichas, onde cada ficha contém o número de matrícula e a nota de cada aluno de
um determinado curso;
• determine e imprima as duas maiores notas, juntamente com o número de matrícula do
aluno que obteve cada uma delas;
• assuma que não exista dois ou mais alunos com a mesma nota;
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        int[] matri = new int[100];
        double[] notas = new double[100];

        double maiorNota1 = -1, maiorNota2 = -1;
        int matricula1 = -1, matricula2 = -1;

        for (int i = 0; i < 100; i++) {
            System.out.print("Digite o número de matrícula do aluno " + (i + 1) + ": ");
            matri[i] = scanner.nextInt();

            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();

           
            if (notas[i] > maiorNota1) {
                maiorNota2 = maiorNota1;
                matricula2 = matricula1;
                maiorNota1 = notas[i];
                matricula1 = matri[i];
              
            } else if (notas[i] > maiorNota2) {
                maiorNota2 = notas[i];
                matricula2 = matri[i];
            }
        }

        System.out.println("\nA maior nota é: " + maiorNota1 + " - Matrícula do aluno: " + matricula1);
        System.out.println("A segunda maior nota é: " + maiorNota2 + " - Matrícula do aluno: " + matricula2);
        
        scanner.close();
    }
}
