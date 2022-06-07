package classes;

public class Pessoa {

    private float peso;
    private float altura;

    public Pessoa() {
        System.out.println("teste");
    }

    public float calcularIMC() {
        float imc = peso / (altura * altura);
        return imc;
    }

    public void setPeso(float peso) {

        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }
}
