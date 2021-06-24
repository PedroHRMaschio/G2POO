package Main;
/*Comportamento: Colocar moeda, não colocar, colocar, colocar. Dependendo da jogada na 5º rodada o detetive
muda seu compartamento para "sempre rouba" ou "olho por olho"
*/
public class Detetive { 
    
    String nome = "Detetive";
    int moedas = 1;
    int contador = 0;
    boolean inimigo_ladrao = false;
    
    public boolean GetJogada(boolean jogada_inimiga){
        boolean vai_roubar = true;
        if(jogada_inimiga != true){
            vai_roubar = false;
        }
        if(this.contador == 1){
            this.contador += 1;
            return false;
        }else if (this.contador == 0 || this.contador == 2 || this.contador == 3){
            this.contador += 1;
            return true;
        }else if(vai_roubar){
            return false;
        }else{
            return jogada_inimiga;
        }
    }
}


