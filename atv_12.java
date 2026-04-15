package Atividades.lista_4_revisao;

import java.util.Scanner;

public class atv_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do produto e depois o código da forma de pagamaento para o sistema calcular o valor final do cliente.");
        System.out.println("Valor do produto:");
        double valor = sc.nextDouble();
        System.out.println("Código da forma de pagamento (1: À vista 10% desc; 2: Cartão 5% desc; 3: 2x preço normal):");
        int cod = sc.nextInt();
        while (cod < 1 || cod > 3) {
            System.out.println("Código inválido.");
            System.out.println("Digite um código valido (1: À vista 10% desc; 2: Cartão 5% desc; 3: 2x preço normal):");
            cod = sc.nextInt();
        }

        double valorF = (cod == 1) ? valor - (valor * 0.1) :
                (cod == 2) ? valor - (valor * 0.05) : valor;
        String desc = (cod == 1) ? "com um desconto de 10%." :
                (cod == 2) ? "com um desconto de 5%" : "sem desconto";

        System.out.printf("Sua compra ficou %s%nValor final da compra: R$%.2f%n", desc, valorF);
        sc.close();
    }
}
