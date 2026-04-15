package Atividades.lista_4_revisao;

import java.util.Scanner;

public class atv_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número, o sistema vai declarar se ele é multiplo de 7 ou 11:");
        int n = sc.nextInt();

        String result = (n % 7 == 0) ? n + " é multiplo de 7." :
                (n % 11 == 0) ? n + " é multiplo de 11." : n + " não é multiplo nem de 7 nem de 11.";

        System.out.println(result);
        sc.close();

    }
}
