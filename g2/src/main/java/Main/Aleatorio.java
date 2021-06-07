package Main;

import java.util.Random;

public class Aleatorio {
    String nome = "Aleatório";
    int moedas = 1;
    public boolean GetJogada() {
        Random gerador = new Random();
        return gerador.nextBoolean();
    }
}
