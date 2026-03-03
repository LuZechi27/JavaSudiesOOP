package br.edu.ifsp.list01;

import java.util.Locale;
import java.util.Scanner;

/*
    Faça um programa que leia um conjunto de valores que correspondem as idades de pessoas de uma comunidade. Quando
    o valor fornecido for um número negativo, significa que não existem mais idades para serem lidas. Após a leitura,
    o programa deve informar:

    A média das idades das pessoas (com duas casas decimais)
    A quantidade de pessoas maiores de idade
    A porcentagem de pessoas idosas (considere quem uma pessoa idosa tem mais de 75 anos) (com duas casas decimais)

    Exemplos de entrada e saída:
    | Entrada             | Saída          |
    | -------             | ------         |
    | 10 20 30 80 -1      | 35.00 3 25.00% |
    | 25 30 45 -1         | 33.33 3 0.00%  |
    => Exercício gentilmente cedido pelos profs. Jorge Cutigi (IFSP/SCL) e Adenilso Simão (ICMC/USP)
*/
public class Ex09 {

    public static void main(String[] args) {
        final int ARRAY_SIZE = 200;
        final Scanner scanner = new Scanner(System.in);
        int[] array = new int[ARRAY_SIZE];
        int input = 0;
        int index = 0;
        do {
            input = scanner.nextInt();
            array[index++] = input;
        } while (input >= 0);

        final Ex09 ex09 = new Ex09();
        System.out.println(ex09.compute(array));
    }

    String compute(int[] input) {
        int i = 0;
        int sumAges = 0;
        int totalAdults = 0;
        int totalElderly = 0;

        while (i < input.length && input[i] >= 0){
            sumAges += input[i];
            if (input[i] >= 18) {
                totalAdults++;
                if (input[i] > 75) totalElderly++;
            }
            i++;
        }
        double mean = (double) sumAges / i;
        double percentageElderly = ((double) totalElderly / i) * 100;

        return String.format(Locale.US, "%.2f %d %.2f%%", mean, totalAdults, percentageElderly);
    }
}
