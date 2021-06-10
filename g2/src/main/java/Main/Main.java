
package Main;
import java.util.Scanner;
/**
 *
 * @author pedro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner jogada = new Scanner(System.in);
        Aleatorio aleatorio = new Aleatorio();
        VistaGrossa vistagrossa = new VistaGrossa();
        Jogador jogador = new Jogador();
        int rodadas = 5;
        boolean jogada1 = false;
        boolean jogada2 = false;
        /*Partida contra o aleatorio*/  
        for(int i = 0; i < rodadas; ++i){
            System.out.println("Rodada: "+(i+1));
            System.out.println("Para jogar basta colaborar:\n Colocar a moeda(1)\n Não colocar a moeda(2)");
            System.out.println(jogador.nome+": "+jogador.moedas+"          "+aleatorio.nome+": "+aleatorio.moedas);
            System.out.println("Sua jogada:");
            String decisao = jogada.next();
            jogada1 = jogador.Decisao(decisao);
            jogada2 = aleatorio.GetJogada();
            if(jogada1){
                if(jogada2){
                    jogador.moedas = jogador.moedas + 2;
                    aleatorio.moedas = aleatorio.moedas + 2;
                }else{
                    jogador.moedas = jogador.moedas - 1;
                    aleatorio.moedas = aleatorio.moedas + 3;
                }
            }else{
                if(jogada2){
                    jogador.moedas = jogador.moedas + 3;
                    aleatorio.moedas = aleatorio.moedas - 1;
                }
            }
            System.out.println("Jogada "+jogador.nome+": " +jogada1+"          Jogada "+aleatorio.nome+": "+jogada2+"\n");
        }
        System.out.println("Placar final:");
        System.out.println(jogador.nome+": "+jogador.moedas+"          "+aleatorio.nome+": "+aleatorio.moedas);
        System.out.println("Próxima partida......\n\n");
        jogador.moedas = 1;
        jogada1 = true;
        jogada2 = true;
        /*Partida contra o vista grossa*/        
        for(int i = 0; i < rodadas; ++i){
            System.out.println("Rodada: "+(i+1));
            System.out.println("Para jogar basta colaborar:\n Colocar a moeda(1)\n Não colocar a moeda(2)");
            System.out.println(jogador.nome+": "+jogador.moedas+"          "+vistagrossa.nome+": "+vistagrossa.moedas);
            System.out.println("Sua jogada:");
            String decisao = jogada.next();
            jogada2 = vistagrossa.GetJogada(jogada1);
            jogada1 = jogador.Decisao(decisao);
            
            if(jogada1){
                if(jogada2){
                    jogador.moedas = jogador.moedas + 2;
                    vistagrossa.moedas = vistagrossa.moedas + 2;
                }else{
                    jogador.moedas = jogador.moedas - 1;
                    vistagrossa.moedas = vistagrossa.moedas + 3;
                }
            }else{
                if(jogada2){
                    jogador.moedas = jogador.moedas + 3;
                    vistagrossa.moedas = vistagrossa.moedas - 1;
                }
            }
            System.out.println("Jogada "+jogador.nome+": " +jogada1+"          Jogada "+vistagrossa.nome+": "+jogada2+"\n");
        }
        System.out.println("Placar final:");
        System.out.println(jogador.nome+": "+jogador.moedas+"          "+vistagrossa.nome+": "+vistagrossa.moedas);

    }
}
