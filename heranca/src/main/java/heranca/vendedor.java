

package heranca;

import java.util.Date;


public class vendedor extends funcionario {
    
    private int totalVendas;
    private float comissao;
   
    
    public vendedor() {
        super();
    }
    
    public float calcularSalario() {
        return super.getSalario() + (this.comissao * totalVendas);
    }

    public int getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(int totalVendas) {
        this.totalVendas = totalVendas;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    
}
