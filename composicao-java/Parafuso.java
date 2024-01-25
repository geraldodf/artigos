package composicao;

public class Parafuso {
    Double tamanho;
    Double peso;

    public Parafuso() {
    }

    public Parafuso(Double tamanho, Double peso) {
        this.tamanho = tamanho;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "\n Parafuso [ tamanho = " + tamanho + ", peso = " + peso + " ]";
    }
    
}