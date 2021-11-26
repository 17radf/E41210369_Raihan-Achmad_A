/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;
import java.sql.*;
import javax.swing.*;
import Controller.Koneksi;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Raihan
 */
public class Login_Form extends javax.swing.JFrame {
	Connection conn;
	ResultSet rs = null;
	PreparedStatement pst = null;
    /**
     * Creates new form Login_Form
     */
    public Login_Form() throws SQLException, ClassNotFoundException {
	this.conn = Koneksi.getKoneksi();
	initComponents();
	hide_pass.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                txt_username = new javax.swing.JTextField();
                txt_password = new javax.swing.JPasswordField();
                jSeparator1 = new javax.swing.JSeparator();
                jSeparator2 = new javax.swing.JSeparator();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jPanel2 = new javax.swing.JPanel();
                btn_login = new javax.swing.JLabel();
                jPanel3 = new javax.swing.JPanel();
                btn_register = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                jLabel9 = new javax.swing.JLabel();
                view_pass = new javax.swing.JLabel();
                hide_pass = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setBackground(new java.awt.Color(54, 33, 89));
                jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                txt_username.setBackground(new java.awt.Color(54, 33, 89));
                txt_username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                txt_username.setForeground(new java.awt.Color(255, 255, 255));
                txt_username.setToolTipText("");
                txt_username.setBorder(null);
                txt_username.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                txt_usernameFocusGained(evt);
                        }
                });
                txt_username.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txt_usernameActionPerformed(evt);
                        }
                });
                jPanel1.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 108, 217, 30));

                txt_password.setBackground(new java.awt.Color(54, 33, 89));
                txt_password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                txt_password.setForeground(new java.awt.Color(255, 255, 255));
                txt_password.setToolTipText("");
                txt_password.setBorder(null);
                txt_password.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                txt_passwordFocusGained(evt);
                        }
                });
                jPanel1.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 149, 217, 32));

                jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
                jSeparator1.setAlignmentX(1.0F);
                jSeparator1.setAlignmentY(1.0F);
                jSeparator1.setAutoscrolls(true);
                jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 220, 30));

                jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
                jSeparator2.setAlignmentX(1.0F);
                jSeparator2.setAlignmentY(1.0F);
                jSeparator2.setAutoscrolls(true);
                jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 220, 30));

                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/padlock-2-20.png"))); // NOI18N
                jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 20, 30));

                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/user-20.png"))); // NOI18N
                jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 20, 30));

                jPanel2.setBackground(new java.awt.Color(54, 33, 89));
                jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

                btn_login.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                btn_login.setForeground(new java.awt.Color(255, 255, 255));
                btn_login.setText("       Sign In");
                btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                btn_loginMouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_login, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                );
                jPanel2Layout.setVerticalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_login, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                );

                jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, 30));

                jPanel3.setBackground(new java.awt.Color(54, 33, 89));
                jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

                btn_register.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                btn_register.setForeground(new java.awt.Color(255, 255, 255));
                btn_register.setText("       Sign Up");
                btn_register.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                btn_registerMouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_register, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                );
                jPanel3Layout.setVerticalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_register, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                );

                jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, 30));

                jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                jLabel7.setForeground(new java.awt.Color(255, 255, 255));
                jLabel7.setText("TOKO BUAH");
                jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

                jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                jLabel8.setForeground(new java.awt.Color(255, 255, 255));
                jLabel8.setText("APLIKASI TRANSAKSI ");
                jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

                jLabel9.setBackground(new java.awt.Color(255, 255, 255));
                jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
                jLabel9.setForeground(new java.awt.Color(255, 255, 255));
                jLabel9.setText("x");
                jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jLabel9MouseClicked(evt);
                        }
                });
                jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 20, -1));

                view_pass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/visible-20.png"))); // NOI18N
                view_pass.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                view_passMouseClicked(evt);
                        }
                });
                jPanel1.add(view_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, 30));

                hide_pass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/invisible-20.png"))); // NOI18N
                hide_pass.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                hide_passMouseClicked(evt);
                        }
                });
                jPanel1.add(hide_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, 30));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                );

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void txt_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_usernameFocusGained
    txt_username.setText("");
    }//GEN-LAST:event_txt_usernameFocusGained

    private void txt_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_passwordFocusGained
       txt_password.setText("");
    }//GEN-LAST:event_txt_passwordFocusGained

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
         int dialogbtn = JOptionPane.YES_NO_OPTION;
       int dialogresult = JOptionPane.showConfirmDialog(this, "Are you sure?", "Warning", dialogbtn);
       
       if (dialogresult == 0){
          System.exit(0);
       }
       else {
       }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void btn_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseClicked
   String sql = "select * from tb_user where username=? and password=?";
   
   try {
       pst= conn.prepareStatement(sql);
       pst.setString(1, txt_username.getText());
       pst.setString(2, String.valueOf(txt_password.getPassword()));
       rs=pst.executeQuery();
       if(rs.next()){
           JOptionPane.showMessageDialog(null,"Berhasil Login");
           this.setVisible(false);
           new Dashboard(rs.getString(1)).setVisible(true);
       }else
           JOptionPane.showMessageDialog(null,"Username dan Password Yang Anda Masukkan Salah");
   }catch (Exception e){
       JOptionPane.showMessageDialog(null, e);
   }
    }//GEN-LAST:event_btn_loginMouseClicked

    private void btn_registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registerMouseClicked
		try {
			this.setVisible(false);
			new Register_Form().setVisible(true);
		} catch (SQLException | ClassNotFoundException ex) {
			Logger.getLogger(Login_Form.class.getName()).log(Level.SEVERE, null, ex);
		}
    }//GEN-LAST:event_btn_registerMouseClicked

    private void view_passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_passMouseClicked
     hide_pass.setVisible(true);
     view_pass.setVisible(false);
     txt_password.setEchoChar((char)0);
     
   
    }//GEN-LAST:event_view_passMouseClicked

    private void hide_passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide_passMouseClicked
     //hide_pass.setVisible(true);
      //view_pass.setVisible(false);
    txt_password.setEchoChar('*');
    hide_pass.setVisible(false);
    view_pass.setVisible(true);
     
    }//GEN-LAST:event_hide_passMouseClicked

        private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_txt_usernameActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
		//</editor-fold>
		
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
		    try {
			    new Login_Form().setVisible(true);
		    } catch (SQLException | ClassNotFoundException ex) {
			    Logger.getLogger(Login_Form.class.getName()).log(Level.SEVERE, null, ex);
		    }
            }
        });
    }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel btn_login;
        private javax.swing.JLabel btn_register;
        private javax.swing.JLabel hide_pass;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JSeparator jSeparator1;
        private javax.swing.JSeparator jSeparator2;
        private javax.swing.JPasswordField txt_password;
        private javax.swing.JTextField txt_username;
        private javax.swing.JLabel view_pass;
        // End of variables declaration//GEN-END:variables
}
