/* Classe jogador para controle e padronização de variaveis de moedas e metodo de analise
de escolha de jogada para implementação no codigo principal*/
package Main;


public class Jogador {
    String nome = "Jogador";
    int moedas = 1;
    
    
    public boolean Decisao(String escolha){
        if("1".equals(escolha)){
            return true;
        }
        else if("2".equals(escolha)){
            return false;
        }
        return false;
    }
    
    
    
    
    
    
    
}
