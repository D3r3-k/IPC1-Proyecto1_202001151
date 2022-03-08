package D3r3_k.BibliotecaUser;

import D3r3_k.BibliotecaUser.UserExtras.MiBibliotecaVirtual;
import D3r3_k.BibliotecaAdmin.UsersAdmin.AdminUsers;
import D3r3_k.BibliotecaUser.UserExtras.VerPrestamos;
import D3r3_k.Principal.Inicio;
import com.formdev.flatlaf.FlatDarkLaf;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class DashUser extends javax.swing.JFrame {

    private int userLogin;

    public void userLogin(int pos) {
        AdminUsers au = new AdminUsers();
        for (int i = 0; i < au.usuariosDB.length; i++) {
            if (au.usuariosDB[i].getUser().equals(au.usuariosDB[pos].getUser())) {
                userLogin = i;
                initComponents2();
            }
        }

    }

    public DashUser() {
        initComponents();
    }

    private void initComponents2() {
        MiBibliotecaVirtual mbv = new MiBibliotecaVirtual();
        AdminUsers au = new AdminUsers();
        VerPrestamos vp = new VerPrestamos();

        this.setLocationRelativeTo(null);
        text_name.setText(au.usuariosDB[userLogin].getName());

        input_id.setText(String.valueOf(au.usuariosDB[userLogin].getId()));
        input_name.setText(au.usuariosDB[userLogin].getName());
        input_lastname.setText(au.usuariosDB[userLogin].getLastname());
        input_user.setText(au.usuariosDB[userLogin].getUser());

        int enMiBibliotecaVirtual = 0;
        for (int i = 0; i < mbv.enBiblioteca.length; i++) {
            if (mbv.enBiblioteca[i] != null) {
                if (mbv.enBiblioteca[i].getUsuario() == au.usuariosDB[userLogin].getUser()) {
                    enMiBibliotecaVirtual += 1;
                }
            }
        }
        text_enBibliotecaCount.setText(String.valueOf(enMiBibliotecaVirtual));

        int enPrestamos = 0;
        for (int i = 0; i < vp.prestamosDB.length; i++) {
            if (vp.prestamosDB[i] != null) {
                if (vp.prestamosDB[i].getUsuario().equals(au.usuariosDB[userLogin].getUser())) {
                    if (vp.prestamosDB[i].getEstado() == "Prestado") {
                        enPrestamos += 1;
                    }
                }
            }
        }
        text_prestadosCount.setText(String.valueOf(enPrestamos));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        panel_left = new javax.swing.JPanel();
        SeparadorVertical = new javax.swing.JSeparator();
        LogoLector = new javax.swing.JLabel();
        text_name = new javax.swing.JLabel();
        separadorHorizontal = new javax.swing.JSeparator();
        panel_home = new javax.swing.JPanel();
        icon_home = new javax.swing.JLabel();
        btn_home = new javax.swing.JButton();
        panel_bibliotecaV = new javax.swing.JPanel();
        icon_bibliotecaV = new javax.swing.JLabel();
        btn_bibliotecaV = new javax.swing.JButton();
        panel_prestamos = new javax.swing.JPanel();
        icon_prestamos = new javax.swing.JLabel();
        btn_prestamos = new javax.swing.JButton();
        panel_logout = new javax.swing.JPanel();
        btn_logout = new javax.swing.JButton();
        panel_right = new javax.swing.JPanel();
        panel_enBiblioteca = new javax.swing.JPanel();
        enBibliotecaVirtualTxt = new javax.swing.JLabel();
        text_enBibliotecaCount = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        panel_prestados = new javax.swing.JPanel();
        PrestadosTxt = new javax.swing.JLabel();
        text_prestadosCount = new javax.swing.JLabel();
        TuInformacionTxt = new javax.swing.JLabel();
        IDTxt = new javax.swing.JLabel();
        input_id = new javax.swing.JTextField();
        NombreTxt = new javax.swing.JLabel();
        input_name = new javax.swing.JTextField();
        ApellidoTxt = new javax.swing.JLabel();
        input_lastname = new javax.swing.JTextField();
        UsuarioTxt = new javax.swing.JLabel();
        input_user = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca Virtual");
        setResizable(false);

        background.setPreferredSize(new java.awt.Dimension(1000, 700));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_left.setPreferredSize(new java.awt.Dimension(300, 700));
        panel_left.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SeparadorVertical.setOrientation(javax.swing.SwingConstants.VERTICAL);
        SeparadorVertical.setPreferredSize(new java.awt.Dimension(3, 700));
        panel_left.add(SeparadorVertical, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 0, -1, -1));

        LogoLector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lector.png"))); // NOI18N
        panel_left.add(LogoLector, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        text_name.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        text_name.setForeground(java.awt.Color.cyan);
        text_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text_name.setText("{Usuario}");
        text_name.setFocusable(false);
        text_name.setPreferredSize(new java.awt.Dimension(300, 30));
        panel_left.add(text_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));

        separadorHorizontal.setPreferredSize(new java.awt.Dimension(300, 3));
        panel_left.add(separadorHorizontal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, -1));

        panel_home.setPreferredSize(new java.awt.Dimension(300, 70));
        panel_home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        panel_home.add(icon_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btn_home.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_home.setForeground(java.awt.Color.white);
        btn_home.setText("Inicio");
        btn_home.setEnabled(false);
        btn_home.setFocusable(false);
        btn_home.setPreferredSize(new java.awt.Dimension(160, 30));
        panel_home.add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        panel_left.add(panel_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        panel_bibliotecaV.setPreferredSize(new java.awt.Dimension(300, 70));
        panel_bibliotecaV.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon_bibliotecaV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_biblioteca.png"))); // NOI18N
        panel_bibliotecaV.add(icon_bibliotecaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btn_bibliotecaV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_bibliotecaV.setForeground(java.awt.Color.white);
        btn_bibliotecaV.setText("Biblioteca Virtual");
        btn_bibliotecaV.setFocusable(false);
        btn_bibliotecaV.setPreferredSize(new java.awt.Dimension(160, 30));
        btn_bibliotecaV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bibliotecaVActionPerformed(evt);
            }
        });
        panel_bibliotecaV.add(btn_bibliotecaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        panel_left.add(panel_bibliotecaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, -1, -1));

        panel_prestamos.setPreferredSize(new java.awt.Dimension(300, 70));
        panel_prestamos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon_prestamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_prestamo.png"))); // NOI18N
        panel_prestamos.add(icon_prestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btn_prestamos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_prestamos.setForeground(java.awt.Color.white);
        btn_prestamos.setText("Prestar Libros");
        btn_prestamos.setFocusable(false);
        btn_prestamos.setPreferredSize(new java.awt.Dimension(160, 30));
        btn_prestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prestamosActionPerformed(evt);
            }
        });
        panel_prestamos.add(btn_prestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        panel_left.add(panel_prestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, -1));

        panel_logout.setPreferredSize(new java.awt.Dimension(300, 70));
        panel_logout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_logout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_logout.setForeground(java.awt.Color.white);
        btn_logout.setText("Cerrar Sesion");
        btn_logout.setFocusable(false);
        btn_logout.setPreferredSize(new java.awt.Dimension(160, 30));
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        panel_logout.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        panel_left.add(panel_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, -1, -1));

        background.add(panel_left, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panel_right.setPreferredSize(new java.awt.Dimension(700, 700));
        panel_right.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_enBiblioteca.setMinimumSize(new java.awt.Dimension(175, 120));
        panel_enBiblioteca.setPreferredSize(new java.awt.Dimension(350, 120));
        panel_enBiblioteca.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enBibliotecaVirtualTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        enBibliotecaVirtualTxt.setForeground(java.awt.Color.white);
        enBibliotecaVirtualTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enBibliotecaVirtualTxt.setText("En Tu Biblioteca Virtual");
        enBibliotecaVirtualTxt.setPreferredSize(new java.awt.Dimension(350, 30));
        panel_enBiblioteca.add(enBibliotecaVirtualTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        text_enBibliotecaCount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        text_enBibliotecaCount.setForeground(java.awt.Color.cyan);
        text_enBibliotecaCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text_enBibliotecaCount.setText("0");
        text_enBibliotecaCount.setPreferredSize(new java.awt.Dimension(350, 20));
        panel_enBiblioteca.add(text_enBibliotecaCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        panel_right.add(panel_enBiblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        separador.setPreferredSize(new java.awt.Dimension(700, 3));
        panel_right.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        panel_prestados.setMinimumSize(new java.awt.Dimension(175, 120));
        panel_prestados.setPreferredSize(new java.awt.Dimension(350, 120));
        panel_prestados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PrestadosTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PrestadosTxt.setForeground(java.awt.Color.white);
        PrestadosTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PrestadosTxt.setText("Libros Prestados ");
        PrestadosTxt.setPreferredSize(new java.awt.Dimension(350, 30));
        panel_prestados.add(PrestadosTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        text_prestadosCount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        text_prestadosCount.setForeground(java.awt.Color.cyan);
        text_prestadosCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text_prestadosCount.setText("0");
        text_prestadosCount.setPreferredSize(new java.awt.Dimension(350, 20));
        panel_prestados.add(text_prestadosCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        panel_right.add(panel_prestados, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, -1));

        TuInformacionTxt.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TuInformacionTxt.setForeground(java.awt.Color.white);
        TuInformacionTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TuInformacionTxt.setText("Tu informacion");
        TuInformacionTxt.setPreferredSize(new java.awt.Dimension(700, 40));
        panel_right.add(TuInformacionTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));

        IDTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IDTxt.setForeground(java.awt.Color.white);
        IDTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        IDTxt.setText("ID");
        IDTxt.setPreferredSize(new java.awt.Dimension(80, 30));
        panel_right.add(IDTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        input_id.setEditable(false);
        input_id.setForeground(java.awt.Color.gray);
        input_id.setText("010203040506");
        input_id.setToolTipText("");
        input_id.setEnabled(false);
        input_id.setFocusable(false);
        input_id.setPreferredSize(new java.awt.Dimension(250, 30));
        panel_right.add(input_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

        NombreTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NombreTxt.setForeground(java.awt.Color.white);
        NombreTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NombreTxt.setText("Nombre");
        NombreTxt.setPreferredSize(new java.awt.Dimension(80, 30));
        panel_right.add(NombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        input_name.setEditable(false);
        input_name.setForeground(java.awt.Color.gray);
        input_name.setText("Nombre...");
        input_name.setEnabled(false);
        input_name.setFocusable(false);
        input_name.setPreferredSize(new java.awt.Dimension(250, 30));
        panel_right.add(input_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, -1));

        ApellidoTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ApellidoTxt.setForeground(java.awt.Color.white);
        ApellidoTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ApellidoTxt.setText("Apellido");
        ApellidoTxt.setPreferredSize(new java.awt.Dimension(80, 30));
        panel_right.add(ApellidoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        input_lastname.setEditable(false);
        input_lastname.setForeground(java.awt.Color.gray);
        input_lastname.setText("Apellido...");
        input_lastname.setEnabled(false);
        input_lastname.setFocusable(false);
        input_lastname.setPreferredSize(new java.awt.Dimension(250, 30));
        panel_right.add(input_lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, -1));

        UsuarioTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UsuarioTxt.setForeground(java.awt.Color.white);
        UsuarioTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        UsuarioTxt.setText("Usuario");
        UsuarioTxt.setPreferredSize(new java.awt.Dimension(80, 30));
        panel_right.add(UsuarioTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, -1));

        input_user.setEditable(false);
        input_user.setForeground(java.awt.Color.gray);
        input_user.setText("Usuario...");
        input_user.setEnabled(false);
        input_user.setFocusable(false);
        input_user.setPreferredSize(new java.awt.Dimension(250, 30));
        panel_right.add(input_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, -1, -1));

        background.add(panel_right, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, 700));

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

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        Inicio inicio = new Inicio();
        this.dispose();
        inicio.setVisible(true);

    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_bibliotecaVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bibliotecaVActionPerformed
        BibliotecaVirtual bv = new BibliotecaVirtual();
        this.dispose();
        bv.userLogin(userLogin);
        bv.setVisible(true);
    }//GEN-LAST:event_btn_bibliotecaVActionPerformed

    private void btn_prestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prestamosActionPerformed
        PrestarLibro pl = new PrestarLibro();
        this.dispose();
        pl.userLogin(userLogin);
        pl.setVisible(true);
    }//GEN-LAST:event_btn_prestamosActionPerformed

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
            java.util.logging.Logger.getLogger(DashUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new FlatDarkLaf());
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                }
                new DashUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApellidoTxt;
    private javax.swing.JLabel IDTxt;
    private javax.swing.JLabel LogoLector;
    private javax.swing.JLabel NombreTxt;
    private javax.swing.JLabel PrestadosTxt;
    private javax.swing.JSeparator SeparadorVertical;
    private javax.swing.JLabel TuInformacionTxt;
    private javax.swing.JLabel UsuarioTxt;
    private javax.swing.JPanel background;
    private javax.swing.JButton btn_bibliotecaV;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_prestamos;
    private javax.swing.JLabel enBibliotecaVirtualTxt;
    private javax.swing.JLabel icon_bibliotecaV;
    private javax.swing.JLabel icon_home;
    private javax.swing.JLabel icon_prestamos;
    private javax.swing.JTextField input_id;
    private javax.swing.JTextField input_lastname;
    private javax.swing.JTextField input_name;
    private javax.swing.JTextField input_user;
    private javax.swing.JPanel panel_bibliotecaV;
    private javax.swing.JPanel panel_enBiblioteca;
    private javax.swing.JPanel panel_home;
    private javax.swing.JPanel panel_left;
    private javax.swing.JPanel panel_logout;
    private javax.swing.JPanel panel_prestados;
    private javax.swing.JPanel panel_prestamos;
    private javax.swing.JPanel panel_right;
    private javax.swing.JSeparator separador;
    private javax.swing.JSeparator separadorHorizontal;
    private javax.swing.JLabel text_enBibliotecaCount;
    public javax.swing.JLabel text_name;
    private javax.swing.JLabel text_prestadosCount;
    // End of variables declaration//GEN-END:variables

}
