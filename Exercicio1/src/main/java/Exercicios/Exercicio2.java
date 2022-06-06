package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner inserir = new Scanner(System.in);

        char desejaContinuar = 'S';

        while (desejaContinuar == 'S' || desejaContinuar == 's') {

            System.out.println("Digite um número: ");

            int number = inserir.nextInt();

            if (number > 0) {
                System.out.println("Positivo");

            } else if (number < 0) {

                System.out.println("Negativo");
            } else {

                System.out.println("é 0");
            }

            System.out.println("Deseja continuar? S - Sim / N - Não");
            desejaContinuar = inserir.next().charAt(0);
        }

    }

}
