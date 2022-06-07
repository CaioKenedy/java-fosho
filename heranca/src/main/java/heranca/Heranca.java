
package heranca;

import java.util.Date;


public class Heranca {

    public static void main(String[] args) {
        
        vendedor v = new vendedor();
        v.setName("Caio");
        v.setSalario(1000.0f);
        v.setCpf("123456789022");
        v.setDataNascimento(new Date());
        v.setComissao(10);
        v.setTotalVendas(10);
        
        System.out.println("o salario do vendedor é: " + v.calcularSalario());
        
        motorista m = new motorista();
        
    }
}
