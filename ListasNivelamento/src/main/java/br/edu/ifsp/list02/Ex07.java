package br.edu.ifsp.list02;

import java.util.Scanner;

/*
    Clara está organizando as fotos da sua última viagem num álbum de fotos. Como ela tem muitas fotos, para economizar
    páginas do álbum ela quer colar duas fotos por página do álbum.

    Como as fotos são retangulares, as fotos podem ser coladas giradas (mas sempre com lados paralelos aos da página do
    álbum, para preservar o equilíbrio estético do álbum), mas elas devem sempre ficar inteiramente contidas no interior
    da página, e não devem se sobrepor.

    Em geral, das muitas formas de posicionar as fotos do álbum só algumas (ou nenhuma) satisfazem estas restrições,
    então pode ser difícil decidir se é possível colar as duas fotos em uma mesma página do álbum e, por isso, Clara
    pediu a sua ajuda para escrever um programa que, dadas as dimensões da página e das fotos, decide se é possível
    colar as fotos na página.

    Por exemplo, cada página pode ser 5×7, e duas fotos são 3×4. Nesse caso, é possível colar as duas fotos:
    https://olimpiada.ic.unicamp.br/static/img/task_images/2012f2p2_album.png

    Faça um programa que receba como entrada na primeira linha dois inteiros X e Y, indicando a largura e a altura
    da página do álbum. Cada uma das duas linhas seguintes contém dois inteiros L e H, indicando a largura e a altura
    das fotos.

    Seu programa deve imprimir uma única linha, contendo um único caractere: "S", se é possível colar as duas fotos na
    página do álbum, e "N", caso contrário.

    Exemplos de entrada e saída:

    | Entrada            | Saída  |
    | -------            | ------ |
    | 7 5                | S      |
    | 3 4                |        |
    | 3 4                |        |
    | -------            | ------ |
    | 10 10              | N      |
    | 6 6                |        |
    | 6 6                |        |


    Fonte: Adaptado de Olimpíada Brasileira de Informática (OBI)
    => Exercício gentilmente cedido pelos profs. Jorge Cutigi e Adenilso Simão (ICMC/USP)
 */
public class Ex07 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] rawInputs = input.split(" ");
        final int x = Integer.parseInt(rawInputs[0]);
        final int y = Integer.parseInt(rawInputs[1]);

        input = scanner.nextLine();
        rawInputs = input.split(" ");
        final int l1 = Integer.parseInt(rawInputs[0]);
        final int h1 = Integer.parseInt(rawInputs[1]);

        input = scanner.nextLine();
        rawInputs = input.split(" ");
        final int l2 = Integer.parseInt(rawInputs[0]);
        final int h2 = Integer.parseInt(rawInputs[1]);

        final Ex07 ex07 = new Ex07();
        System.out.println(ex07.compute(x, y, l1, h1, l2, h2));
    }

    String compute(int x, int y, int l1, int h1, int l2, int h2) {
        int pageSize1 = x;
        int pageSize2 = y;

        for (int i = 0; i < 2; i++) {
            if (pageSize1 >= l1 + l2 && !(pageSize2 < h1 || pageSize2 < h2)) {
                return "S";
            }
            if (pageSize1 >= l1 + h2 && !(pageSize2 < h1 || pageSize2 < l2)) {
                return "S";
            }
            if (pageSize1 >= h1 + l2 && !(pageSize2 < l1 || pageSize2 < h2)) {
                return "S";
            }
            if (pageSize1 >= h1 + h2 && !(pageSize2 < l1 || pageSize2 < l2)) {
                return "S";
            }
            pageSize1 = y;
            pageSize2 = x;
        }
        return "N";
    }
}
