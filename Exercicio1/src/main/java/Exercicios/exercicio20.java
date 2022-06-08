package Exercicios;

import java.util.Scanner;

public class exercicio20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char desejaContinuar = 'S';
        double valorVeiculo;
        double desconto = 0.00d;
        double valorFinal = 0.0d;

        int anoVeiculo;
        int totalCarros = 0;
        int totalCarrosAntigos = 0;

        while (desejaContinuar != 'N') {

            System.out.println("Qual o valor do veiculo: ");
            valorVeiculo = input.nextFloat();

            System.out.println("Digite o ano do veiculo: ");
            anoVeiculo = input.nextInt();

            if (anoVeiculo <= 2000) {
                desconto = (valorVeiculo * 0.12);

            } else {
                desconto = (valorVeiculo * 0.07);

                totalCarrosAntigos++;
            }
            totalCarros++;

            valorFinal = valorVeiculo - desconto;

            System.out.println("O desconto é de" + desconto
                    + "o valor final é de: " + valorFinal
                    + "e o total de carros antigos é: "
                    + totalCarrosAntigos + "enquanto o total são: "
                    + totalCarros);

            System.out.println("Deseja continuar? S - Sim / N - Não");
            desejaContinuar = input.next().charAt(0);

        }

    }
}
