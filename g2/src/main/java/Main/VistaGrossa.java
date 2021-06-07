package Main;

public class VistaGrossa {
    int contador = 0;
    int moedas = 1;
    String nome = "Vista Grossa";
    
    public boolean GetJogada(boolean jogada_inimiga) {
        if(jogada_inimiga) {
            return true;
        }else if(contador < 2) {
            contador = contador + 1;
            return true;
        }else {
            return false;
        }
    }
}
