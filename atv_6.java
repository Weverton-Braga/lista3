package Atividades.lista_4_revisao;

import java.util.Scanner;

public class atv_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora Simples");
        System.out.println("Modo de uso: Escreva o primeiro número, \ndepois escreva o caractere da operação (+ adição, - subtração, * multiplicação, / divisão) \ne depois o segundo número");

        System.out.println("Pimeiro número:");
        int n1 = sc.nextInt();

        System.out.println("Caractere da operação:");
        char c = sc.next().charAt(0);

        while (c != '+' && c != '-' && c != '*' && c != '/') {
            System.out.println("Caractere inválida.\nDigite uma caractere valida(+ adição, - subtração, * multiplicação, / divisão):");
            c = sc.next().charAt(0);
        }

        System.out.println("Segundo número:");
        int n2 = sc.nextInt();

        int result = (c == '+') ? n1 + n2 :
                (c == '-') ? n1 - n2 :
                        (c == '*') ? n1 * n2 : n1 / n2;

        System.out.println(n1 + " " + c + " " + n2 + " = " + result);
        sc.close();

    }
}
