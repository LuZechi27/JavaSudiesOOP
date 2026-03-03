package br.edu.ifsp.list03;

import java.util.Scanner;

/*
Faça um programa que, dada uma String, encontra a primeira e a última substrings de tamanho K de acordo com a ordem
alfabética. Por exemplo, para a String “welcometojava” e K = 3; A substring “ava” é a primeira substring de tamanho
3 e “wel” é a última, considerando a ordem alfabética (saída: "ava wel"). Para dados de entrada inválidos, o programa
deverá imprimir uma String vazia.
 */
public class Ex02 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String word = scanner.nextLine();
        final int number = scanner.nextInt();

        final Ex02 ex02 = new Ex02();
        System.out.println(ex02.compute(word, number));
    }

    String compute(String word, int number) {
        if (word == null || number <= 0 || number > word.length()) {
            return null;
        }
        int substringNumber = word.length() - number;
        String[] substrings = new String[substringNumber + 1];

        for (int i = 0; i <= substringNumber; i++) {
            substrings[i] = word.substring(i, i + number);
        }
        String firstSubstring = substrings[0];
        String lastSubstring = substrings[0];

        for (String substring : substrings) {
            if (substring.compareTo(firstSubstring) < 0) {
                firstSubstring = substring;
            } else if (substring.compareTo(lastSubstring) > 0) {
                lastSubstring = substring;
            }
        }
        return firstSubstring.concat(" ").concat(lastSubstring);
    }
}
