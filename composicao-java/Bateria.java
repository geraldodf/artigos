package composicao;

public class Bateria {
    String modelo;
    String capacidade;

    public Bateria() {
    }
   
    public Bateria(String modelo, String capacidade) {
        this.modelo = modelo;
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "Bateria [ modelo = " + modelo + ", capacidade = " + capacidade + " ]";
    }
}