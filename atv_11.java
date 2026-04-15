package Atividades.lista_4_revisao;

import java.util.Scanner;

public class atv_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result;

        System.out.println("Digite um número, o sistema vai declarar se ele é par e menor que 100 \nou ímpar e maior que 100:");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            result = (n < 100) ? n + " é par e é menor que 100" : n + " é par mas não é menor que 100";
        }else {
            result = (n > 100) ? n + " é impar e é maior que 100" : n + " é impar mas não é maior que 100";
        }
        System.out.println(result);
        sc.close();
    }
}
