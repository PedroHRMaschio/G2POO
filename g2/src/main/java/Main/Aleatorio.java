package Main;

import java.util.Random;
/* Clásse do perfil de jogo do aleaório criada para seguir o principio de aleatoriedade do
gerador random do próprio java, cujo retorno em true ou false determina a jogada final, 
tambem contando com variaveis de controle de moedas e um nome
*/
public class Aleatorio {
    String nome = "Aleatório";
    int moedas = 1;
    public boolean GetJogada() {
        Random gerador = new Random();
        return gerador.nextBoolean();
    }
}
