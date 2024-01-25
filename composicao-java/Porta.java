package composicao;

public class Porta {
    boolean aberta = false;

    void abrir() {
        System.out.println("Abrindo porta...");
        this.aberta = true;
    }

    void fechar() {
        System.out.println("Fechando porta...");
        this.aberta = false;
    }

    @Override
    public String toString() {
        return "Porta [aberta = " + aberta + "]";
    }
}