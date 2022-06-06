
package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner inserir = new Scanner(System.in);
        
        int number = inserir.nextInt();
        
        
        if (number >= 100 && number <= 200) {
            System.out.println("beleza");
        } else {
            System.out.println("Da nao meu patrao");
        }
    }
}
