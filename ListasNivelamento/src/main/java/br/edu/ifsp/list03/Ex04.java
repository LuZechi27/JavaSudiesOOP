package br.edu.ifsp.list03;

import java.util.Scanner;

/*
Dada duas Strings A e B, faça um programa que imprima “Sim” se A e B são anagramas e “Nao”, caso contrário.
Um anagrama é a transposição de letras de palavra ou frase para formar outra palavra ou frase diferente.
Por exemplo, as palavras “roma” e “amor” são anagramas. Considere como entrada apenas palavras com letras minúsculas.
 */
public class Ex04 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String wordA = scanner.nextLine();
        final String wordB = scanner.nextLine();

        final Ex04 ex04 = new Ex04();
        System.out.println(ex04.compute(wordA, wordB));
    }

    String compute(String wordA, String wordB) {
        if (wordA.length() != wordB.length()) {
            return "Nao";
        }
        int lengthA = wordA.length();
        int lengthB = wordB.length();

        for (int i = lengthA - 1; i >= 0; i--) {
            boolean hasSameChar = false;

            for (int j = 0; j < lengthB; j++) {
                if (wordA.charAt(i) == wordB.charAt(j)) {
                    wordA = wordA.substring(0, i);
                    wordB = wordB.substring(0, j)
                            .concat(j + 1 == lengthB? "" : wordB.substring(j + 1, lengthB));
                    hasSameChar = true;
                    lengthB--;
                    break;
                }
            }
            if (!hasSameChar) {
                return "Nao";
            }
        }
        if (wordA.isEmpty() && wordB.isEmpty()) {
            return "Sim";
        }
        return "Nao";
    }
}
