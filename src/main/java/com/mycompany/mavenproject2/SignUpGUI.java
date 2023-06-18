/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject2;

import javax.swing.JOptionPane;
import Model.User;
import Dao.UserDao;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author ravindu
 */
public class SignUpGUI extends javax.swing.JFrame {

    public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    public String mobileNumberPattern = "^[0-9]*$";

    /**
     * Creates new form SingUpGUI
     */
    public SignUpGUI() {
        initComponents();
        btnSave.setEnabled(false);
    }

    //this will create all the fields and it will also disable save button
    public void clear() {
        txtName.setText("");
        txtEmail.setText("");
        txtMobileNumber.setText("");
        txtAddress.setText("");
        txtPassword.setText("");
        btnSave.setEnabled(false);
    }

    public void validateFields() {
        String name = txtName.getText();
        String email = txtEmail.getText();
        String mobileNumber = txtMobileNumber.getText();
        String address = txtAddress.getText();
        String password = txtPassword.getText();
        if (!name.equals("") && email.matches(emailPattern) && mobileNumber.matches(mobileNumberPattern) && mobileNumber.length() == 10 && !address.equals("") && !password.equals("")) {
            btnSave.setEnabled(true);
        } else {
            btnSave.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtMobileNumber = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnEnglish = new javax.swing.JButton();
        btnFrench = new javax.swing.JButton();
        btnGerman = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Bundle"); // NOI18N
        jLabel1.setText(bundle.getString("SignUpGUI.jLabel1.text")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(bundle.getString("SignUpGUI.jLabel2.text")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(bundle.getString("SignUpGUI.jLabel3.text")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(bundle.getString("SignUpGUI.jLabel4.text")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(bundle.getString("SignUpGUI.jLabel5.text")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, -1, -1));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(bundle.getString("SignUpGUI.jLabel6.text")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, -1, -1));

        txtName.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 350, -1));

        txtEmail.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 350, -1));

        txtMobileNumber.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        txtMobileNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMobileNumberKeyReleased(evt);
            }
        });
        getContentPane().add(txtMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 350, -1));

        txtAddress.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddressKeyReleased(evt);
            }
        });
        getContentPane().add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 350, -1));

        txtPassword.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 350, -1));

        btnSave.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon("D:\\JavaProject\\JFrame Cafe Image & Icon\\Cafe Image & Icon\\images\\save.png")); // NOI18N
        btnSave.setText(bundle.getString("SignUpGUI.btnSave.text")); // NOI18N
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 150, -1));

        btnClear.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon("D:\\JavaProject\\JFrame Cafe Image & Icon\\Cafe Image & Icon\\images\\clear.png")); // NOI18N
        btnClear.setText(bundle.getString("SignUpGUI.btnClear.text")); // NOI18N
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, 130, -1));

        btnExit.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon("D:\\JavaProject\\JFrame Cafe Image & Icon\\Cafe Image & Icon\\images\\exit small.png")); // NOI18N
        btnExit.setText(bundle.getString("SignUpGUI.btnExit.text")); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 490, 140, -1));

        jButton4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon("D:\\JavaProject\\JFrame Cafe Image & Icon\\Cafe Image & Icon\\images\\login.png")); // NOI18N
        jButton4.setText(bundle.getString("SignUpGUI.jButton4.text")); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 560, 160, -1));

        btnEnglish.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEnglish.setText(bundle.getString("SignUpGUI.btnEnglish.text")); // NOI18N
        btnEnglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnglishActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnglish, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 730, 50, -1));

        btnFrench.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnFrench.setText(bundle.getString("SignUpGUI.btnFrench.text")); // NOI18N
        btnFrench.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrenchActionPerformed(evt);
            }
        });
        getContentPane().add(btnFrench, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 730, 50, -1));

        btnGerman.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGerman.setText(bundle.getString("SignUpGUI.btnGerman.text")); // NOI18N
        btnGerman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGermanActionPerformed(evt);
            }
        });
        getContentPane().add(btnGerman, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 730, 50, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\JavaProject\\JFrame Cafe Image & Icon\\Cafe Image & Icon\\images\\peakpx.jpg")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Are You Sure?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        User user = new User();
        user.setName(txtName.getText());
        user.setEmail(txtEmail.getText());
        user.setMobileNumber(txtMobileNumber.getText());
        user.setAddress(txtAddress.getText());
        user.setPassword(txtPassword.getText());
        UserDao.save(user);
        clear();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtMobileNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMobileNumberKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtMobileNumberKeyReleased

    private void txtAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtAddressKeyReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new LogInGUI().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnEnglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnglishActionPerformed
        // TODO add your handling code here:
        Locale l = new Locale("en", "US");
        ResourceBundle r = ResourceBundle.getBundle("Bundle", l);
        jLabel2.setText(r.getString("SignUpGUI.jLabel2.text"));
        btnSave.setText(r.getString("SignUpGUI.btnSave.text"));
        jLabel1.setText(r.getString("SignUpGUI.jLabel1.text"));
        jLabel6.setText(r.getString("SignUpGUI.jLabel6.text"));
        jLabel5.setText(r.getString("SignUpGUI.jLabel5.text"));
        jButton4.setText(r.getString("SignUpGUI.jButton4.text"));
        jLabel4.setText(r.getString("SignUpGUI.jLabel4.text"));
        btnExit.setText(r.getString("SignUpGUI.btnExit.text"));
        jLabel3.setText(r.getString("SignUpGUI.jLabel3.text"));
        btnClear.setText(r.getString("SignUpGUI.btnClear.text"));

    }//GEN-LAST:event_btnEnglishActionPerformed

    private void btnFrenchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrenchActionPerformed
        // TODO add your handling code here:
        Locale l = new Locale("fr", "FR");
        ResourceBundle r = ResourceBundle.getBundle("Bundle", l);
        jLabel2.setText(r.getString("SignUpGUI.jLabel2.text"));
        btnSave.setText(r.getString("SignUpGUI.btnSave.text"));
        jLabel1.setText(r.getString("SignUpGUI.jLabel1.text"));
        jLabel6.setText(r.getString("SignUpGUI.jLabel6.text"));
        jLabel5.setText(r.getString("SignUpGUI.jLabel5.text"));
        jButton4.setText(r.getString("SignUpGUI.jButton4.text"));
        jLabel4.setText(r.getString("SignUpGUI.jLabel4.text"));
        btnExit.setText(r.getString("SignUpGUI.btnExit.text"));
        jLabel3.setText(r.getString("SignUpGUI.jLabel3.text"));
        btnClear.setText(r.getString("SignUpGUI.btnClear.text"));
    }//GEN-LAST:event_btnFrenchActionPerformed

    private void btnGermanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGermanActionPerformed
        // TODO add your handling code here:
        Locale l = new Locale("de", "DE");
        ResourceBundle r = ResourceBundle.getBundle("Bundle", l);
        jLabel2.setText(r.getString("SignUpGUI.jLabel2.text"));
        btnSave.setText(r.getString("SignUpGUI.btnSave.text"));
        jLabel1.setText(r.getString("SignUpGUI.jLabel1.text"));
        jLabel6.setText(r.getString("SignUpGUI.jLabel6.text"));
        jLabel5.setText(r.getString("SignUpGUI.jLabel5.text"));
        jButton4.setText(r.getString("SignUpGUI.jButton4.text"));
        jLabel4.setText(r.getString("SignUpGUI.jLabel4.text"));
        btnExit.setText(r.getString("SignUpGUI.btnExit.text"));
        jLabel3.setText(r.getString("SignUpGUI.jLabel3.text"));
        btnClear.setText(r.getString("SignUpGUI.btnClear.text"));
    }//GEN-LAST:event_btnGermanActionPerformed

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
            java.util.logging.Logger.getLogger(SignUpGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEnglish;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFrench;
    private javax.swing.JButton btnGerman;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobileNumber;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
