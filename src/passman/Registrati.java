/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package passman;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author nicoa
 */
public class Registrati extends javax.swing.JFrame {

    /**
     * Creates new form Registrati
     */
    public Registrati() {
        initComponents();

        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        nomeUt_label = new javax.swing.JLabel();
        nomeUt_tf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pass_tf = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        confpass_tf = new javax.swing.JPasswordField();
        bRegistrati = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TornaLogin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setText("Gestore di Password");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nomeUt_label.setText("Nome utente:");

        jLabel2.setText("Password:");

        jLabel3.setText("Conferma Password:");

        bRegistrati.setText("Registrati");
        bRegistrati.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistratiActionPerformed(evt);
            }
        });

        jLabel1.setText("Oppure");

        TornaLogin.setText("Torna al Login");
        TornaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TornaLoginActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setText("Gestore di Password");

        jLabel6.setText("Registrati");

        jCheckBox1.setText("Mostra Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(212, 212, 212)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(290, 290, 290)
                                .addComponent(jLabel6)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TornaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jLabel1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(confpass_tf)
                                .addComponent(nomeUt_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nomeUt_tf)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pass_tf)
                                .addComponent(bRegistrati, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jCheckBox1)))
                .addContainerGap(254, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(nomeUt_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeUt_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pass_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confpass_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(bRegistrati)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(TornaLogin)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //facciamo in modo che con i dati immessi venga creato un utente nel db
    private void bRegistratiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistratiActionPerformed

        if (!nomeUt_tf.getText().trim().isEmpty() && !pass_tf.getText().trim().isEmpty() && !confpass_tf.getText().trim().isEmpty()) {

            String nomeUt = nomeUt_tf.getText().trim();
            String pass = pass_tf.getText().trim();
            String conf_pass = confpass_tf.getText().trim();

            //se l'utente non esiste già viene creato un nuovo utente
            try {
                Connection c = (Connection) DriverManager.getConnection(connessionee.Jdbc);
                Statement s = c.createStatement();

                String q = "SELECT * FROM utente WHERE nomeutente = '" + nomeUt + "'";
                ResultSet r = s.executeQuery(q);

                if (r.next()) {
                    JOptionPane.showMessageDialog(null, "l'utente esiste già, Riprova");
                    nomeUt_tf.setText(null);
                    pass_tf.setText(null);
                    confpass_tf.setText(null);
                } else {
                    String query = "insert into utente values('" + nomeUt + "','" + pass + "')";

                    if (pass.equals(conf_pass)) {
                        s.execute(query);
                        JOptionPane.showMessageDialog(null, "Account Registrato");
                        nomeUt_tf.setText(null);
                        pass_tf.setText(null);
                        this.setVisible(false);
                        Login l = new Login();
                        l.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "le password non coincidono ");
                    }
                }

            } catch (SQLException ex) {
                Logger.getLogger(Registrati.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Registrati.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Inserisci i campi");
        }

    }//GEN-LAST:event_bRegistratiActionPerformed

    //Se si clicca questo bottone si torna indietro al login
    private void TornaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TornaLoginActionPerformed

        this.setVisible(false);
        try {
            Login l = new Login();
            l.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Registrati.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Registrati.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TornaLoginActionPerformed

    //se il checkbox mostra password è selezionato mostra la password sennò la nasconde
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

        if (jCheckBox1.isSelected()) {
            pass_tf.setEchoChar((char) 0);
            confpass_tf.setEchoChar((char) 0);
        } else {
            pass_tf.setEchoChar('*');
            confpass_tf.setEchoChar('*');
        }

    }//GEN-LAST:event_jCheckBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Registrati.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrati.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrati.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrati.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Registrati().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton TornaLogin;
    private javax.swing.JButton bRegistrati;
    private javax.swing.JPasswordField confpass_tf;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel nomeUt_label;
    private javax.swing.JTextField nomeUt_tf;
    private javax.swing.JPasswordField pass_tf;
    // End of variables declaration//GEN-END:variables
}