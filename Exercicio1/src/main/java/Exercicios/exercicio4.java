
package Exercicios;


public class exercicio4 {
    public static void main(String[] args) {
        
        Invoice inv = new Invoice(1, "Mousepad", 10, 50.0f);
        
        System.out.println("Valor total = " + inv.getInvoiceAmount());
    }
}
