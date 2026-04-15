package Atividades.lista_4_revisao;

import java.util.Scanner;

public class atv_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma letra, o sistema vai declarar se ela é vogal ou consoante:");
        char c = sc.next().charAt(0);

        String result = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? c+" é uma vogal.": c+" é uma consoante.";

        System.out.println(result);
        sc.close();
    }
}
