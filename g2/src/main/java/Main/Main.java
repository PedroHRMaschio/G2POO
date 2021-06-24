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
    int rodadas = 5;
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
        LblJogadaAdveressario = new javax.swing.JLabel();
        LblMoedasJogador = new javax.swing.JLabel();
        LblMoedasAdverssario = new javax.swing.JLabel();
        LblVfx = new javax.swing.JLabel();
        LblRodada = new javax.swing.JLabel();

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
        LblJogadajogador.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                LblJogadajogadorInputMethodTextChanged(evt);
            }
        });

        LblJogadaAdveressario.setText("Jogada Adverssário");
        LblJogadaAdveressario.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                LblJogadaAdveressarioInputMethodTextChanged(evt);
            }
        });

        LblMoedasJogador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblMoedasJogador.setText("Moedas Jogador");
        LblMoedasJogador.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                LblMoedasJogadorInputMethodTextChanged(evt);
            }
        });

        LblMoedasAdverssario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblMoedasAdverssario.setText("Moedas Adverssário");
        LblMoedasAdverssario.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                LblMoedasAdverssarioInputMethodTextChanged(evt);
            }
        });

        LblRodada.setText("Rodada:");
        LblRodada.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                LblRodadaInputMethodTextChanged(evt);
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
                    .addComponent(BtnTrue)
                    .addComponent(LblJogadajogador)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblMoedasJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(LblRodada, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnFalse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblJogadaAdveressario)
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
                    .addComponent(BtnFalse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblJogadajogador)
                    .addComponent(LblJogadaAdveressario))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LblMoedasJogadorInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_LblMoedasJogadorInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_LblMoedasJogadorInputMethodTextChanged

    private void LblMoedasAdverssarioInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_LblMoedasAdverssarioInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_LblMoedasAdverssarioInputMethodTextChanged

    private void LblJogadajogadorInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_LblJogadajogadorInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_LblJogadajogadorInputMethodTextChanged

    private void LblJogadaAdveressarioInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_LblJogadaAdveressarioInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_LblJogadaAdveressarioInputMethodTextChanged

    private void BtnFalseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFalseMouseClicked
        jogada1 = false;
    }//GEN-LAST:event_BtnFalseMouseClicked

    private void BtnTrueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnTrueMouseClicked
        jogada1 = true;
    }//GEN-LAST:event_BtnTrueMouseClicked

    private void LblRodadaInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_LblRodadaInputMethodTextChanged
        
    }//GEN-LAST:event_LblRodadaInputMethodTextChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /**
        
        jogada2 = vistagrossa.GetJogada(jogada1);
        jogada1 = BtnTrueMouseClicked;

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnFalse;
    private javax.swing.JButton BtnTrue;
    private javax.swing.JLabel LblJogadaAdveressario;
    private javax.swing.JLabel LblJogadajogador;
    private javax.swing.JLabel LblMoedasAdverssario;
    private javax.swing.JLabel LblMoedasJogador;
    private javax.swing.JLabel LblRodada;
    private javax.swing.JLabel LblVfx;
    // End of variables declaration//GEN-END:variables
}
