package br.edu.ifsp.list03;

import java.util.Scanner;

/*
Dada uma String arbitrária, faça um programa que imprima “Sim” se essa for palíndromo e “Nao”, caso contrário.
Palíndromo é uma frase ou palavra que pode ser lida, indiferentemente, da esquerda para a direita ou vice-versa.
Por exemplo, “arara” é um palíndromo. Considere como entrada apenas palavras com letras minúsculas.
 */
public class Ex03 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String input = scanner.nextLine();

        final Ex03 ex03 = new Ex03();
        System.out.println(ex03.compute(input));
    }

    String compute(String input) {
        String output = "Sim";
        if (input == null) {
            return output;
        }
        int lastIndex = input.length() - 1;

        for (int firstIndex = 0; firstIndex < lastIndex; firstIndex++) {
            if (input.charAt(firstIndex) != input.charAt(lastIndex)) {
                output = "Nao";
                return output;
            }
            lastIndex--;
        }
        return output;
    }
}
