
package classes;

import java.util.Scanner;

public class classes {
    public static void main(String[] args) {
        
        Pessoa objetoPessoa = new Pessoa();  
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o peso da pessoa:");
        objetoPessoa.peso = leitor.nextFloat();
        System.out.println("Digite a altura da pessoa:");
        objetoPessoa.altura = leitor.nextFloat();
        
        System.out.println("IMC = " + objetoPessoa.calcularIMC());
    }
}
