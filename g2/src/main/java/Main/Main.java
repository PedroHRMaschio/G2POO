/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author pedro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aleatorio aleatorio = new Aleatorio();
        VistaGrossa vistagrossa = new VistaGrossa();
        int rodadas = 5;
        boolean jogada1 = false;
        boolean jogada2 = false;
        for(int i = 0; i < rodadas; ++i){
            System.out.println("Rodada: "+(i+1));
            System.out.println("Vista Grossa: "+vistagrossa.moedas+"          "+"Aleatório: "+aleatorio.moedas);
            jogada1 = vistagrossa.GetJogada(jogada2);
            jogada2 = aleatorio.GetJogada();
            if(jogada1){
                if(jogada2){
                    vistagrossa.moedas = vistagrossa.moedas + 2;
                    aleatorio.moedas = aleatorio.moedas + 2;
                }else{
                    vistagrossa.moedas = vistagrossa.moedas - 1;
                    aleatorio.moedas = aleatorio.moedas + 3;
                }
            }else{
                if(jogada2){
                    vistagrossa.moedas = vistagrossa.moedas + 3;
                    aleatorio.moedas = aleatorio.moedas - 1;
                }
            }
            System.out.println("Jogada Vista Grossa: "+jogada1+"          Jogada Aleatório: "+jogada2+"\n");
        }
        System.out.println("Placar final:");
        System.out.println("Vista Grossa: "+vistagrossa.moedas+"          "+"Aleatório: "+aleatorio.moedas);
    }
}
