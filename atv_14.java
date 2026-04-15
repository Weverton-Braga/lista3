package Atividades.lista_4_revisao;

import java.util.Scanner;

public class atv_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu salário, o sistema vai calcular seu imposto:");
        double salario = sc.nextInt();

        double imposto = (salario<=2000) ? 0 :
                (salario<=5000) ? salario*0.1 : salario*0.2;
        String txt = (salario<=2000) ? "Imposto isento.":
                (salario<=5000) ? "Imposto de 10%: R$:"+imposto : "Imposto de 20%: R$"+imposto;

        System.out.println(txt);
        sc.close();

    }
}
