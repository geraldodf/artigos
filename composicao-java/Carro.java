package composicao;

import java.util.List;

public class Carro {
    String modelo;
    String placa;
    String qtdDeLugares;

    Motor motor; // Carro tem um Motor
    Bateria bateria; // Carro tem uma Bateria
    List<Porta> portas; // Carro tem Portas.

    public Carro() {
    }

    public Carro(String modelo, String placa, String qtdDeLugares, Motor motor, Bateria bateria,
            List<Porta> portas) {
        this.modelo = modelo;
        this.placa = placa;
        this.qtdDeLugares = qtdDeLugares;
        this.motor = motor;
        this.bateria = bateria;
        this.portas = portas;
    }

    @Override
    public String toString() {
        return "Carro: \n modelo = " + modelo + ", \n placa = " + placa + ", \n qtdDeLugares = " + qtdDeLugares
                + ", \n motor = " + motor + ", \n bateria = " + bateria + ", \n portas = " + portas + "]";
    }
}