package Atividades.lista_4_revisao;

import java.util.Scanner;

public class atv_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número, o sistema vai verificar se ele é divisivel por 2, 3 e 5 ao mesmo tempo:");
        int n = sc.nextInt();

        String result = (n % 2 == 0 && n % 3 == 0 && n % 5 == 0) ? n + " é divisivel por 2, 3 e 5." : n + " NÃO é divisivel por 2, 3 e 5.";
        System.out.println(result);
        sc.close();
    }
}
