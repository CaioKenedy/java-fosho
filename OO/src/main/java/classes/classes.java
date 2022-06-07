
package classes;

import java.util.Scanner;

public class classes {
    public static void main(String[] args) {
        
        Pessoa objetoPessoa = new Pessoa(72.0f, 1.72f);  
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o peso da pessoa:");
        objetoPessoa.setPeso(leitor.nextFloat());
        System.out.println("Digite a altura da pessoa:");
        objetoPessoa.setAltura(leitor.nextFloat());
        
        
        System.out.println("IMC = " + objetoPessoa.calcularIMC());
    }
}
