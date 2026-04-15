package Atividades.lista_4_revisao;

import java.util.Scanner;

public class atv_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número de 4 digitos, o sistema vai verificar se a soma dos dois primeiros digitos com os dois últimos elevada ao quadrado resulta no próprio número:");
        int n = sc.nextInt();
        while (n < 1000 || n > 9999) {
            System.out.println("Número invalido.");
            System.out.println("Digite um número de 4 digito:");
            n = sc.nextInt();
        }
        int met1 = n / 100;
        int met2 = n % 100;
        int result = (met1 + met2) * (met1 + met2);

        System.out.println("Operação: (" + met1 + "+" + met2 + ")²=" + result);

        String txt = (n == result) ? "Sim, ele é um número mágico" : "Não, ele não é um número mágico";

        System.out.println(txt);
        sc.close();
    }
}
