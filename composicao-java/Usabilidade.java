package composicao;

import java.util.Arrays;
import java.util.List;

public class Usabilidade {
    public static void main(String[] args) {
        Parafuso parafusoPequeno = new Parafuso(2.5, 0.30);
        Parafuso parafusoGrande = new Parafuso(6.0, 0.90);
        List<Parafuso> parafusos = Arrays.asList(parafusoGrande, parafusoPequeno);

        Porta portaMotorista = new Porta();
        Porta portaCaroneiro = new Porta();
        List<Porta> portas = Arrays.asList(portaMotorista, portaCaroneiro);

        Bateria bateria = new Bateria("Modelo ABC123", "70 Ah");

        Motor motor = new Motor("V8", "198 cv", parafusos);
        Carro carro = new Carro("SUV", "ABC-123", "4", motor, bateria, portas);
        System.out.println(carro);
    }
}