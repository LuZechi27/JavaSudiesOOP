package br.edu.ifsp.list02;

import java.util.Scanner;

/*
    Leia um conjunto de cinco números inteiros não repetidos em uma única linha e os armazene em um vetor de 10 posições.
    A partir daí, leia um número por vez. Se o número ainda não estiver no conjunto, faça a inclusão após o último número.
    Caso ele esteja no conjunto, remova o número e libere espaço no array. A cada iteração imprima o vetor. O programa
    acaba quando o array ficar totalmente cheio ou vazio. Veja o exemplo na imagem anexa.

    Qualquer valor fora do domínio de entrada tem como saída esperada a String "Erro".
 */
public class Ex03 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int[] firstFive = new int[5];
        for (int i = 0; i < 5; i++) {
            firstFive[i] = scanner.nextInt();
        }
        int[] otherInts = new int[10];
        for (int i = 0; i < 10; i++) {
            otherInts[i] = scanner.nextInt();
        }
        final Ex03 ex03 = new Ex03();
        System.out.println(ex03.compute(firstFive, otherInts));
    }

    String compute(int[] firstFive, int[] otherInts) {
        if (firstFive == null || firstFive.length != 5) {
            return "Erro";
        }
        for (int i = 0; i < firstFive.length; i++) {
            for (int j = 0; j < firstFive.length; j++) {
                if (i != j && firstFive[i] == firstFive[j]) {
                    return "Erro";
                }
            }
        }
        String output = "";
        int[] array = new int[10];
        int size = 5;
        for (int i = 0; i < firstFive.length; i++) {
            array[i] = firstFive[i];
        }
        int index = 0;
//        while (size > 0 && size < 10 && index < otherInts.length) {
//            for (int i = 0; i < size; i++) {
//                output = output.concat(String.valueOf(array[i])).concat(" ");
//            }
//            output = output.substring(0, output.length() - 1).concat("\n");
//
//        }
        return output;
    }
}
