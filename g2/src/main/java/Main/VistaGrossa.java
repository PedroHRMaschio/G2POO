package Main;
/* Classe criada com o nome de vistagrossa corresponde ao perfil de olhinho por olhinho
criada para gerenciar as variaveis de nome e sistema de funcionamento do perfil de acordo
com a variável contador a qual conta o numero de resultados negativos recebidos por jogada
fazendo isso para que ele após dois erros recebidos comece a copiar a ultima jogada do adverssário
*/
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
