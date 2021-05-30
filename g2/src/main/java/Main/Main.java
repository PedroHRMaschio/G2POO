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
        System.out.println(vistagrossa.GetJogada(true));
        System.out.println(aleatorio.GetJogada());
    }
}
