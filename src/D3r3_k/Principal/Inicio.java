package D3r3_k.Principal;

import D3r3_k.BibliotecaAdmin.UsersAdmin.AdminUsers;
import D3r3_k.DataBase.db_users;
import com.formdev.flatlaf.FlatDarkLaf;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Inicio extends javax.swing.JFrame {

    public Inicio() {
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
        logo = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        btn_about = new javax.swing.JButton();
        btn_login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca Virtual");
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 650));

        background.setPreferredSize(new java.awt.Dimension(1000, 650));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_usac.png"))); // NOI18N
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titulo.setForeground(java.awt.Color.white);
        titulo.setText("BIBLIOTECA VIRTUAL");
        background.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        separador.setPreferredSize(new java.awt.Dimension(1000, 3));
        background.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        btn_about.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_about.setForeground(java.awt.Color.white);
        btn_about.setText("About");
        btn_about.setFocusable(false);
        btn_about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aboutActionPerformed(evt);
            }
        });
        background.add(btn_about, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 40, -1, -1));

        btn_login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_login.setForeground(java.awt.Color.white);
        btn_login.setText("Iniciar Sesion");
        btn_login.setFocusable(false);
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        background.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img_inicio.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel1.setFocusable(false);
        jLabel1.setPreferredSize(new java.awt.Dimension(850, 400));
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Bienvenido");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

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

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        Login vistaLogin = new Login();
        this.dispose();
        vistaLogin.setVisible(true);
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aboutActionPerformed
        About about = new About();
        this.dispose();
        about.setVisible(true);
    }//GEN-LAST:event_btn_aboutActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new FlatDarkLaf());
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                }
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btn_about;
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel logo;
    private javax.swing.JSeparator separador;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

}
