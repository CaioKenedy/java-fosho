package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner inserir = new Scanner(System.in);

        for (int i = 0; i <= 40; i++) {

            System.out.println("Digite o custo: ");

            float custo = inserir.nextFloat();

            System.out.println("Digite o valor: ");

            float venda = inserir.nextFloat();
            float media = (custo / venda);

            if (custo == venda) {
                System.out.println("O produto custa:" + custo);
                System.out.println("Foi vendido por:" + venda);
                System.out.println("A media foi:" + media);
                System.out.println("Empate.");

            } else {
                if (custo < venda) {
                    System.out.println("O produto custa:" + custo);
                    System.out.println("Foi vendido por:" + venda);
                    System.out.println("A media foi:" + media);
                    System.out.println("Lucro.");
                } else {
                    System.out.println("O produto custa:" + custo);
                    System.out.println("Foi vendido por:" + venda);
                    System.out.println("A media foi:" + media);
                    System.out.println("Prejuizo.");
                }
            }

        }

    }

}
