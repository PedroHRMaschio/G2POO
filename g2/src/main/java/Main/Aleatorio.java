package Main;

import java.util.Random;

public class Aleatorio {
    
    public boolean GetJogada() {
        Random gerador = new Random();
        return gerador.nextBoolean();
    }
}
