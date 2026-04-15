package Atividades.lista_4_revisao;

import java.util.Scanner;

public class atv_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1, n2;
        n2 = Integer.MIN_VALUE;

        System.out.println("Digite 3 números para o sistema vai declarar qual é o maior.");

        for (int cont = 0; cont <3; cont++){
            System.out.println("Digite o número:");
            n1 = sc.nextInt();

            n2 = (n1>n2) ? n1 : n2;
        }
        System.out.println("O Maior número é o "+n2);
        sc.close();
    }
}
