package br.edu.ifsp.list02;

import java.util.Scanner;

/*
    Faça um programa que leia um valor inteiro N. Após isso, leia dois vetores A e B de tamanho N. Em seguida, o programa
    deve criar um vetor C com os elementos de A e B intercalados.

    Exemplos de entrada e saída:

    | Entrada                 | Saída                         |
    | -------                 | ------                        |
    | 6                       | 5 10 6 20 3 30 8 40 2 50 0 60 |
    | 5 6 3 8 2 0             |                               |
    | 10 20 30 40 50 60       |                               |
      ---
    | 3                       | 1 1 2 1 3 1                   |
    | 1 2 3                   |                               |
    | 1 1 1                   |                               |

    => Exercício gentilmente cedido pelos profs. Jorge Cutigi e Adenilso Simão (ICMC/USP)
 */
public class Ex06 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        final int size = Integer.parseInt(input);
        final int[] arrayA = new int[size];
        final int[] arrayB = new int[size];

        input = scanner.nextLine();
        String[] arrayInputs = input.split(" ");
        for (int i = 0; i < size; i++) {
            arrayA[i] = Integer.parseInt(arrayInputs[i]);
        }
        input = scanner.nextLine();
        arrayInputs = input.split(" ");
        for (int i = 0; i < size; i++) {
            arrayB[i] = Integer.parseInt(arrayInputs[i]);
        }
        final Ex06 ex06 = new Ex06();
        System.out.println(ex06.compute(arrayA, arrayB));
    }

    String compute(int[] arrayA, int[] arrayB) {
        String output = "";

        for (int i = 0; i < arrayA.length; i++) {
            output = output.concat(String.valueOf(arrayA[i]));
            output = output.concat(" ")
                    .concat(String.valueOf(arrayB[i]))
                    .concat(" ");
        }
        return output.substring(0, output.length() - 1);
    }
}
