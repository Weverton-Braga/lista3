package Atividades.lista_4_revisao;

import java.util.Scanner;

public class atv_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número, o sistema vai identivicar ele está entre 100 e 200.\nSe não estiver, ele vai informar se ele é maior ou menor que o intervalo:");
        int n = sc.nextInt();

        String txt = (n>100 && n<200) ? n+" está entre 100 e 200." :
                (n<=100) ? n+" é menor que o intervalo entre 100 e 200." : n+" é maior que o intervalo entre 100 e 200";

        System.out.println(txt);

        sc.close();
    }
}
