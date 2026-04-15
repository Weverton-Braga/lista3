package Atividades.lista_4_revisao;

import java.util.Scanner;

public class atv_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu dia e mes de nascimento, o sistema vai verificar se você é do signo de Áries.");
        System.out.println("Dia de nascimento:");
        int dia = sc.nextInt();
        while (dia < 1 || dia > 31) {
            System.out.println("Dia inválido.");
            System.out.println("Digite um dia de nascimento válido:");
            dia = sc.nextInt();
        }
        System.out.println("Mes des nascimento:");
        int mes = sc.nextInt();
        while (mes < 1 || mes > 12) {
            System.out.println("Mes inválido.");
            System.out.println("Digite um mes de nascimento válido:");
            mes = sc.nextInt();
        }
        if (mes >= 3 && mes <= 4) {
            if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
                System.out.println("Você é do signo de Aries.");
            } else {
                System.out.println("Você não é do signo de Aries.");
            }
        } else {
            System.out.println("Você não é do signo de Aries.");
        }
        sc.close();
    }
}
