package br.edu.ifsp.list03;

import java.util.Scanner;

/*
Implemente um programa que gere senhas provisórias a partir do nome do usuário, seguindo o mesmo
padrão dos exemplos a seguir:

EXEMPLO 1 Entrada: Java | Saída: J*Ja*Jav*Jav*Ja* J
EXEMPLO 2 Entrada: POOS3 | Saída: P*PO*POO*POOS*POOS*POO*PO*P
EXEMPLO 3 Entrada: KO | Saída: K*K
EXEMPLO 4 Entrada: O | Saída: Invalido
EXEMPLO 5 Entrada: | Saída: Invalido
*/
public class Ex01 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String input = scanner.nextLine();

        final Ex01 ex01 = new Ex01();
        System.out.println(ex01.compute(input));
    }

    String compute(String input) {
        if (input == null || input.length() <= 1) {
            return "Invalido";
        }
        String output = "";
        for (int i = 1; i < input.length(); i++) {
            output = output.concat(input.substring(0, i));
            output = output.concat("*");
        }
        for (int i = input.length() - 1; i >= 0; i--) {
            output = output.concat(input.substring(0, i));
            output = output.concat("*");
        }
        output = output.substring(0, output.length() - 2);
        return output;
    }
}
