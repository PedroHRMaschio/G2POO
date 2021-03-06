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
public class GameVisual extends javax.swing.JFrame {

    boolean jogada1;
    boolean jogada2;
    /**
     * Creates new form GameVisual
     */
    public GameVisual() {
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
        jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel moedas_jogador = new javax.swing.JLabel();
        moedas_adverssario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnTrue.setText("Colocar Moeda");
        BtnTrue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnTrueMouseClicked(evt);
            }
        });
        BtnTrue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTrueActionPerformed(evt);
            }
        });
        BtnTrue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnTrueKeyPressed(evt);
            }
        });

        BtnFalse.setText("N??o Colocar Moeda");
        BtnFalse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnFalseKeyPressed(evt);
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

        LblJogadaAdveressario.setText("Jogada Adverss??rio");
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
        LblMoedasAdverssario.setText("Moedas Adverss??rio");
        LblMoedasAdverssario.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                LblMoedasAdverssarioInputMethodTextChanged(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/evolu????o_da_confian??a.png"))); // NOI18N

        moedas_jogador.setText(jogador.moedas);

        moedas_adverssario.setText(adversario.moedas);

        jLabel2.setText("Rodada:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnTrue)
                    .addComponent(LblJogadajogador)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblMoedasJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(moedas_jogador)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnFalse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LblJogadaAdveressario)
                            .addComponent(LblMoedasAdverssario, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGap(107, 107, 107))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(moedas_adverssario)
                        .addGap(151, 151, 151))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LblMoedasAdverssario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LblMoedasJogador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moedas_jogador, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moedas_adverssario))
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
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

    private void BtnTrueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTrueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnTrueActionPerformed

    private void BtnTrueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnTrueKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnTrueKeyPressed

    private void BtnFalseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnFalseKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnFalseKeyPressed

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

    private void BtnTrueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnTrueMouseClicked
        jogada1 = true;
    }//GEN-LAST:event_BtnTrueMouseClicked

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
            java.util.logging.Logger.getLogger(GameVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameVisual().setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel moedas_adverssario;
    // End of variables declaration//GEN-END:variables
}
