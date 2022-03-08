package D3r3_k.Principal;

import D3r3_k.BibliotecaAdmin.UsersAdmin.AdminUsers;
import D3r3_k.BibliotecaAdmin.DashAdmin;
import D3r3_k.BibliotecaUser.DashUser;
import D3r3_k.DataBase.db_users;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        initComponents2();
    }

    public void initComponents2() {
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        icon_usuario = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        contraseña = new javax.swing.JLabel();
        input_user = new javax.swing.JTextField();
        input_pass = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar Sesion");
        setResizable(false);
        setSize(new java.awt.Dimension(500, 650));

        background.setMinimumSize(new java.awt.Dimension(500, 650));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario.png"))); // NOI18N
        background.add(icon_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        usuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        usuario.setForeground(java.awt.Color.white);
        usuario.setText("Usuario");
        background.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        contraseña.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        contraseña.setForeground(java.awt.Color.white);
        contraseña.setText("Contraseña");
        background.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        input_user.setForeground(java.awt.Color.gray);
        input_user.setText("Nombre de usuario");
        input_user.setPreferredSize(new java.awt.Dimension(375, 35));
        input_user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                input_userFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                input_userFocusLost(evt);
            }
        });
        input_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_userActionPerformed(evt);
            }
        });
        input_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input_userKeyPressed(evt);
            }
        });
        background.add(input_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        input_pass.setForeground(java.awt.Color.gray);
        input_pass.setText("1234567890");
        input_pass.setPreferredSize(new java.awt.Dimension(375, 35));
        input_pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                input_passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                input_passFocusLost(evt);
            }
        });
        input_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_passActionPerformed(evt);
            }
        });
        input_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input_passKeyPressed(evt);
            }
        });
        background.add(input_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        btn_login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_login.setForeground(java.awt.Color.white);
        btn_login.setText("Iniciar Sesion");
        btn_login.setPreferredSize(new java.awt.Dimension(125, 30));
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        background.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, -1, -1));

        btn_cancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cancel.setForeground(java.awt.Color.white);
        btn_cancel.setText("Cancelar");
        btn_cancel.setPreferredSize(new java.awt.Dimension(100, 30));
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        background.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        Inicio vistaInicio = new Inicio();
        this.dispose();
        vistaInicio.setVisible(true);
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void input_userKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_userKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_input_userKeyPressed

    private void input_passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_passKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_input_passKeyPressed

    private void input_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_userActionPerformed
        if (input_user.getText().equals("Nombre de usuario")) {
            input_user.setText("");
            input_user.setForeground(Color.white);
        }
    }//GEN-LAST:event_input_userActionPerformed

    private void input_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_passActionPerformed
        if (String.valueOf(input_pass.getPassword()).equals("1234567890")) {
            input_pass.setText("");
            input_pass.setForeground(Color.white);
        }
    }//GEN-LAST:event_input_passActionPerformed

    private void input_userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_userFocusGained
        if (input_user.getText().equals("Nombre de usuario")) {
            input_user.setText("");
            input_user.setForeground(Color.white);
        }
    }//GEN-LAST:event_input_userFocusGained

    private void input_userFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_userFocusLost
        if (input_user.getText().isEmpty()) {
            input_user.setText("Nombre de usuario");
            input_user.setForeground(Color.gray);
        }
    }//GEN-LAST:event_input_userFocusLost

    private void input_passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_passFocusGained
        if (String.valueOf(input_pass.getPassword()).equals("1234567890")) {
            input_pass.setText("");
            input_pass.setForeground(Color.white);
        }
    }//GEN-LAST:event_input_passFocusGained

    private void input_passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_passFocusLost
        if (String.valueOf(input_pass.getPassword()).isEmpty()) {
            input_pass.setText("1234567890");
            input_pass.setForeground(Color.gray);
        }
    }//GEN-LAST:event_input_passFocusLost

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        login();
    }//GEN-LAST:event_btn_loginActionPerformed

    private void login() {
        AdminUsers au = new AdminUsers();

        String user = input_user.getText();
        String pass = new String(input_pass.getPassword());

        String rol = "usuario";
        int userLogin = -1;
        boolean existe = false;

        for (int i = 0; i < au.usuariosDB.length; i++) {
            if (au.usuariosDB[i] != null) {
                if (au.usuariosDB[i].getUser().equals(user)) {
                    existe = true;
                    if (au.usuariosDB[i].getRol().equals("admin")) {
                        rol = "admin";
                        userLogin = i;
                    } else if (au.usuariosDB[i].getRol().equals("usuario")) {
                        rol = "usuario";
                        userLogin = i;
                    }
                }
            }
        }
        if (user.isBlank() || pass.isBlank() || user.equals("Nombre de usuario") || pass.equals("1234567890")) {
            JOptionPane.showMessageDialog(null, "Ingrese sus datos", "Iniciar Sesion", JOptionPane.WARNING_MESSAGE);
        } else {
            if (existe) {
                if (au.usuariosDB[userLogin].getUser().equals(user) && au.usuariosDB[userLogin].getPassword().equals(pass)) {
                    if (rol == "admin") {
                        DashAdmin da = new DashAdmin();
                        this.dispose();
                        da.setVisible(true);
                    } else if (rol == "usuario") {
                        DashUser du = new DashUser();
                        this.dispose();
                        du.userLogin(userLogin);
                        du.setVisible(true);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Los datos no coinciden", "Iniciar Sesion", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "El usuario no existe", "Iniciar Sesion", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new FlatDarkLaf());
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                }
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel contraseña;
    private javax.swing.JLabel icon_usuario;
    private javax.swing.JPasswordField input_pass;
    private javax.swing.JTextField input_user;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables

}
