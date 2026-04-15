package Atividades.lista_4_revisao;

import java.util.Scanner;

public class atv_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;

        System.out.println("Digite sua idade para a classificação: ");
        idade = sc.nextInt();

        String idade2 = (idade <= 4) ? "Idade inválida." :
                (idade <= 7) ? "Classificação: Infantil" :
                        (idade <= 17) ? "Classificação: Juvenil" : "Classificação: Sênior";
        System.out.println(idade2);

        sc.close();
    }
}
