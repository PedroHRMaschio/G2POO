/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author User
 */
public class Main extends javax.swing.JFrame {
    boolean jogada1;
    boolean jogada2;
    int rodadas = 1;
    Aleatorio aleatorio = new Aleatorio();
    VistaGrossa vistagrossa = new VistaGrossa();
    SempreRouba semprerouba = new SempreRouba();
    Detetive detetive = new Detetive();
    Jogador jogador = new Jogador();

    /**
     * Creates new form GameVisual
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnTrue = new javax.swing.JButton();
        BtnFalse = new javax.swing.JButton();
        LblJogadajogador = new javax.swing.JLabel();
        LblJogadaAdverssario = new javax.swing.JLabel();
        LblMoedasJogador = new javax.swing.JLabel();
        LblMoedasAdverssario = new javax.swing.JLabel();
        LblVfx = new javax.swing.JLabel();
        LblRodada = new javax.swing.JLabel();
        BtnStart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnTrue.setText("Colocar Moeda");
        BtnTrue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnTrueMouseClicked(evt);
            }
        });

        BtnFalse.setText("Não Colocar Moeda");
        BtnFalse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnFalseMouseClicked(evt);
            }
        });

        LblJogadajogador.setText("Jogada Jogador");

        LblJogadaAdverssario.setText("Jogada Adverssário");

        LblMoedasJogador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblMoedasJogador.setText("Moedas Jogador");

        LblMoedasAdverssario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblMoedasAdverssario.setText("Moedas Adverssário");

        LblRodada.setText("Rodada:");
        LblRodada.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                LblRodadaInputMethodTextChanged(evt);
            }
        });

        BtnStart.setText("Start");
        BtnStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnStartMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(LblVfx)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnTrue)
                        .addGap(86, 86, 86)
                        .addComponent(BtnStart))
                    .addComponent(LblJogadajogador)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblMoedasJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(LblRodada, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnFalse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblJogadaAdverssario)
                    .addComponent(LblMoedasAdverssario, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addGap(107, 107, 107))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblMoedasAdverssario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblMoedasJogador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblRodada))
                .addGap(64, 64, 64)
                .addComponent(LblVfx)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnTrue)
                    .addComponent(BtnFalse)
                    .addComponent(BtnStart))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblJogadajogador)
                    .addComponent(LblJogadaAdverssario))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnFalseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFalseMouseClicked
        jogada1 = false;
        this.LblJogadajogador.setText("Não Colocou a moeda");
    }//GEN-LAST:event_BtnFalseMouseClicked

    private void BtnTrueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnTrueMouseClicked
        jogada1 = true;
        this.LblJogadajogador.setText("Colocou a moeda");
    }//GEN-LAST:event_BtnTrueMouseClicked

    private void LblRodadaInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_LblRodadaInputMethodTextChanged
        
    }//GEN-LAST:event_LblRodadaInputMethodTextChanged

    private void BtnStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnStartMouseClicked
        this.Game();
    }//GEN-LAST:event_BtnStartMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true); 
            }
        });
    }
    
    public void Game(){
        for(int i=0 ;rodadas> i ;i++){
            //jogada1 = this.BtnTrue||this.BtnFalse;
            jogada2 = aleatorio.GetJogada();
            if(jogada2 == true){
                this.LblJogadaAdverssario.setText("Colocou a moeda");
                if(jogada1 == true){
                    jogador.moedas = jogador.moedas +2;
                    aleatorio.moedas = aleatorio.moedas +2;
                    this.LblMoedasJogador.setText("Moedas: "+jogador.moedas);
                    this.LblMoedasAdverssario.setText("Moedas: "+aleatorio.moedas);
                }
                else{
                    jogador.moedas = jogador.moedas +3;
                    aleatorio.moedas = aleatorio.moedas -1;
                    this.LblMoedasJogador.setText("Moedas: "+jogador.moedas);
                    this.LblMoedasAdverssario.setText("Moedas: "+aleatorio.moedas);
                }
            }
            else{
                this.LblJogadaAdverssario.setText("Não Colocou a moeda");
                if(jogada1 == true){
                    jogador.moedas = jogador.moedas -1;
                    aleatorio.moedas = aleatorio.moedas +3;
                    this.LblMoedasJogador.setText("Moedas: "+jogador.moedas);
                    this.LblMoedasAdverssario.setText("Moedas: "+aleatorio.moedas);
                } 
            }
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnFalse;
    private javax.swing.JButton BtnStart;
    private javax.swing.JButton BtnTrue;
    private javax.swing.JLabel LblJogadaAdverssario;
    private javax.swing.JLabel LblJogadajogador;
    private javax.swing.JLabel LblMoedasAdverssario;
    private javax.swing.JLabel LblMoedasJogador;
    private javax.swing.JLabel LblRodada;
    private javax.swing.JLabel LblVfx;
    // End of variables declaration//GEN-END:variables
}
