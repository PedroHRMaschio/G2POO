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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnTrue.setText("Colocar Moeda");
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

        BtnFalse.setText("Não Colocar Moeda");
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

        LblJogadaAdveressario.setText("Jogada Adverssário");
        LblJogadaAdveressario.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                LblJogadaAdveressarioInputMethodTextChanged(evt);
            }
        });

        LblMoedasJogador.setText("Moedas Jogador");
        LblMoedasJogador.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                LblMoedasJogadorInputMethodTextChanged(evt);
            }
        });

        LblMoedasAdverssario.setText("Moedas Adverssário");
        LblMoedasAdverssario.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                LblMoedasAdverssarioInputMethodTextChanged(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/evolução_da_confiança.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblMoedasJogador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnTrue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblJogadajogador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnFalse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblJogadaAdveressario)
                    .addComponent(LblMoedasAdverssario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(107, 107, 107))
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel1)
                .addContainerGap(186, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblMoedasJogador, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(LblMoedasAdverssario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
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
    // End of variables declaration//GEN-END:variables
}
