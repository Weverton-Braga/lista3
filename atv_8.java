package Atividades.lista_4_revisao;

import java.util.Scanner;

public class atv_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu peso e sua altura, o sistema vai calcular seu IMC e dizer se você está abaixo do peso, no peso ideal ou acima.");
        System.out.println("Digite sua altura:");
        double alt = sc.nextDouble();

        System.out.println("Digite seu peso:");
        double peso = sc.nextDouble();

        double IMC =peso/(alt*alt);

        String resultIMC = (IMC < 18.5) ? "Abaixo do peso.":
                (IMC <= 24.9) ? "Peso idela." : "Excesso de peso.";

        System.out.printf("Seu IMC é %.2f%n",IMC);
        System.out.println(resultIMC);
        sc.close();

    }
}
