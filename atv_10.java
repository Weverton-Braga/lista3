package Atividades.lista_4_revisao;

import java.util.Scanner;

public class atv_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora de inicio de um jogo e de fim do jogo, o sistema vai calcular a duração do jogo.");

        System.out.println("Hora de inicio:");
        int horaI = sc.nextInt();
        while (horaI > 24 || horaI < 1) {
            System.out.println("Hora de inicio invalida.");
            System.out.println("Digite uma hora de inicio valida:");
            horaI = sc.nextInt();
        }
        System.out.println("Hora final:");
        int horaF = sc.nextInt();
        while (horaF > 24 || horaF < 1) {
            System.out.println("Hora final invalida.");
            System.out.println("Digite uma hora final valida:");
            horaF = sc.nextInt();
        }

        int horaT = (horaI > horaF) ? (horaF + 24) - horaI : horaF - horaI;

        System.out.println("Duração total do jogo " + horaT + " hora(s).");
        sc.close();
    }
}
