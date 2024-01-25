package composicao;

import java.util.List;

public class Motor {
    String modelo;
    String potencia;
    List<Parafuso> parafusos;

    public Motor() {
    }

    public Motor(String modelo, String potencia, List<Parafuso> parafusos) {
        this.modelo = modelo;
        this.potencia = potencia;
        this.parafusos = parafusos;
    }

    @Override
    public String toString() {
        return "Motor [ modelo = " + modelo + ", potencia = " + potencia + ", parafusos = " + parafusos + " ]";
    }
}