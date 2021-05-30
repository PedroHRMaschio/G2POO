package Main;

public class VistaGrossa {
    int contador = 0;
    
    public boolean GetJogada(boolean jogada_inimiga) {
        if(jogada_inimiga) {
            return true;
        }else if(contador < 3) {
            contador = contador + 1;
            return true;
        }else {
            return false;
        }
    }
}
