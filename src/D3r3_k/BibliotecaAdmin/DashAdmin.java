package D3r3_k.BibliotecaAdmin;

import D3r3_k.BibliotecaAdmin.BooksAdmin.AdminBooks;
import D3r3_k.BibliotecaAdmin.UsersAdmin.AdminUsers;
import D3r3_k.BibliotecaUser.UserExtras.VerPrestamos;
import D3r3_k.Principal.Inicio;
import com.formdev.flatlaf.FlatDarkLaf;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class DashAdmin extends javax.swing.JFrame {

    private int userLogin;

    public DashAdmin() {
        initComponents();
        initComponents2();
        panel_reportes.setVisible(false);
    }

    public void userLogin(int pos) {
        AdminUsers au = new AdminUsers();
        for (int i = 0; i < au.usuariosDB.length; i++) {
            if (au.usuariosDB[i].getUser().equals(au.usuariosDB[pos].getUser())) {
                userLogin = i;
            }
        }

    }

    private void initComponents2() {
        this.setLocationRelativeTo(null);
        AdminUsers adminUsers = new AdminUsers();
        AdminBooks adminBooks = new AdminBooks();

        text_name.setText(adminUsers.usuariosDB[userLogin].getName());
        // Contador de usuarios segun el rol
        int usersCount = 0;
        for (int i = 0; i < adminUsers.usuariosDB.length; i++) {
            if (adminUsers.usuariosDB[i] != null) {
                if ("usuario" == adminUsers.usuariosDB[i].getRol()) {
                    usersCount += 1;
                }

            }
        }
        text_usersCount.setText(String.valueOf(usersCount));
        int adminsCount = 0;
        for (int i = 0; i < adminUsers.usuariosDB.length; i++) {
            if (adminUsers.usuariosDB[i] != null) {
                if ("admin" == adminUsers.usuariosDB[i].getRol()) {
                    adminsCount += 1;
                }

            }
        }
        text_adminsCount.setText(String.valueOf(adminsCount));
        int booksCount = 0;

        for (int i = 0; i < adminBooks.booksDB.length; i++) {
            if (adminBooks.booksDB[i] != null) {
                booksCount += 1;
            }
        }

        text_booksCount.setText(String.valueOf(booksCount));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        panel_left = new javax.swing.JPanel();
        separadorHorizontal = new javax.swing.JSeparator();
        SeparadorVertical = new javax.swing.JSeparator();
        LogoUsac = new javax.swing.JLabel();
        panel_home = new javax.swing.JPanel();
        icon_home = new javax.swing.JLabel();
        btn_home = new javax.swing.JButton();
        panel_users = new javax.swing.JPanel();
        icon_user = new javax.swing.JLabel();
        btn_users = new javax.swing.JButton();
        panel_bibliografy = new javax.swing.JPanel();
        icon_bibliography = new javax.swing.JLabel();
        btn_bibliographys = new javax.swing.JButton();
        panel_reports = new javax.swing.JPanel();
        icon_reports = new javax.swing.JLabel();
        btn_reports = new javax.swing.JButton();
        text_name = new javax.swing.JLabel();
        panel_right = new javax.swing.JPanel();
        panel_userCount = new javax.swing.JPanel();
        UsuariosTxt = new javax.swing.JLabel();
        text_usersCount = new javax.swing.JLabel();
        panel_adminCount = new javax.swing.JPanel();
        AdminsTxt = new javax.swing.JLabel();
        text_adminsCount = new javax.swing.JLabel();
        panel_bookCount = new javax.swing.JPanel();
        BibliografiasTxt = new javax.swing.JLabel();
        text_booksCount = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();
        separador = new javax.swing.JSeparator();
        panel_reportes = new javax.swing.JPanel();
        ReporteUsuariosTxt = new javax.swing.JLabel();
        btn_generarUsuarios = new javax.swing.JButton();
        ReporteLibrosTxt = new javax.swing.JLabel();
        btn_generarLibros = new javax.swing.JButton();
        panel_inicio = new javax.swing.JPanel();
        BienvenidoTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca Virtual [Administrador]");
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 700));

        background.setMinimumSize(new java.awt.Dimension(1000, 700));
        background.setPreferredSize(new java.awt.Dimension(1200, 700));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_left.setPreferredSize(new java.awt.Dimension(300, 700));
        panel_left.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        separadorHorizontal.setPreferredSize(new java.awt.Dimension(300, 3));
        panel_left.add(separadorHorizontal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, -1));

        SeparadorVertical.setOrientation(javax.swing.SwingConstants.VERTICAL);
        SeparadorVertical.setPreferredSize(new java.awt.Dimension(3, 700));
        panel_left.add(SeparadorVertical, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 0, -1, -1));

        LogoUsac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LogoUsac.png"))); // NOI18N
        panel_left.add(LogoUsac, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

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
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });
        panel_home.add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        panel_left.add(panel_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        panel_users.setPreferredSize(new java.awt.Dimension(300, 70));
        panel_users.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        panel_users.add(icon_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btn_users.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_users.setForeground(java.awt.Color.white);
        btn_users.setText("Usuarios");
        btn_users.setFocusable(false);
        btn_users.setPreferredSize(new java.awt.Dimension(160, 30));
        btn_users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usersActionPerformed(evt);
            }
        });
        panel_users.add(btn_users, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        panel_left.add(panel_users, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, -1, -1));

        panel_bibliografy.setPreferredSize(new java.awt.Dimension(300, 70));
        panel_bibliografy.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon_bibliography.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/book.png"))); // NOI18N
        panel_bibliografy.add(icon_bibliography, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btn_bibliographys.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_bibliographys.setForeground(java.awt.Color.white);
        btn_bibliographys.setText("Bibliografias");
        btn_bibliographys.setFocusable(false);
        btn_bibliographys.setPreferredSize(new java.awt.Dimension(160, 30));
        btn_bibliographys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bibliographysActionPerformed(evt);
            }
        });
        panel_bibliografy.add(btn_bibliographys, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        panel_left.add(panel_bibliografy, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, -1));

        panel_reports.setPreferredSize(new java.awt.Dimension(300, 70));
        panel_reports.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon_reports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reports.png"))); // NOI18N
        panel_reports.add(icon_reports, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btn_reports.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_reports.setForeground(java.awt.Color.white);
        btn_reports.setText("Reportes");
        btn_reports.setFocusable(false);
        btn_reports.setPreferredSize(new java.awt.Dimension(160, 30));
        btn_reports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportsActionPerformed(evt);
            }
        });
        panel_reports.add(btn_reports, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        panel_left.add(panel_reports, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, -1, -1));

        text_name.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        text_name.setForeground(java.awt.Color.cyan);
        text_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text_name.setText("{Usuario}");
        text_name.setFocusable(false);
        text_name.setPreferredSize(new java.awt.Dimension(300, 30));
        panel_left.add(text_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));

        background.add(panel_left, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panel_right.setPreferredSize(new java.awt.Dimension(900, 700));
        panel_right.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_userCount.setMinimumSize(new java.awt.Dimension(175, 120));
        panel_userCount.setPreferredSize(new java.awt.Dimension(175, 120));
        panel_userCount.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UsuariosTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UsuariosTxt.setForeground(java.awt.Color.white);
        UsuariosTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UsuariosTxt.setText("Usuarios");
        UsuariosTxt.setPreferredSize(new java.awt.Dimension(175, 30));
        panel_userCount.add(UsuariosTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        text_usersCount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        text_usersCount.setForeground(java.awt.Color.cyan);
        text_usersCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text_usersCount.setText("0");
        text_usersCount.setPreferredSize(new java.awt.Dimension(170, 20));
        panel_userCount.add(text_usersCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        panel_right.add(panel_userCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panel_adminCount.setMinimumSize(new java.awt.Dimension(175, 120));
        panel_adminCount.setPreferredSize(new java.awt.Dimension(175, 120));
        panel_adminCount.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AdminsTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AdminsTxt.setForeground(java.awt.Color.white);
        AdminsTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdminsTxt.setText("Administradores");
        AdminsTxt.setPreferredSize(new java.awt.Dimension(175, 30));
        panel_adminCount.add(AdminsTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        text_adminsCount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        text_adminsCount.setForeground(java.awt.Color.cyan);
        text_adminsCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text_adminsCount.setText("0");
        text_adminsCount.setPreferredSize(new java.awt.Dimension(170, 20));
        panel_adminCount.add(text_adminsCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        panel_right.add(panel_adminCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 0, -1, -1));

        panel_bookCount.setMinimumSize(new java.awt.Dimension(175, 120));
        panel_bookCount.setPreferredSize(new java.awt.Dimension(175, 120));
        panel_bookCount.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BibliografiasTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BibliografiasTxt.setForeground(java.awt.Color.white);
        BibliografiasTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BibliografiasTxt.setText("Bibliografias");
        BibliografiasTxt.setPreferredSize(new java.awt.Dimension(175, 30));
        panel_bookCount.add(BibliografiasTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        text_booksCount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        text_booksCount.setForeground(java.awt.Color.cyan);
        text_booksCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text_booksCount.setText("0");
        text_booksCount.setPreferredSize(new java.awt.Dimension(170, 20));
        panel_bookCount.add(text_booksCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        panel_right.add(panel_bookCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, -1));

        btn_logout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_logout.setForeground(java.awt.Color.white);
        btn_logout.setText("Cerrar Sesion");
        btn_logout.setBorderPainted(false);
        btn_logout.setFocusable(false);
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        panel_right.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 35, -1, -1));

        separador.setPreferredSize(new java.awt.Dimension(900, 3));
        panel_right.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        panel_reportes.setOpaque(false);
        panel_reportes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReporteUsuariosTxt.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ReporteUsuariosTxt.setForeground(java.awt.Color.white);
        ReporteUsuariosTxt.setText("Reporte de Usuarios");
        panel_reportes.add(ReporteUsuariosTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        btn_generarUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_generarUsuarios.setForeground(java.awt.Color.white);
        btn_generarUsuarios.setText("Generar");
        btn_generarUsuarios.setPreferredSize(new java.awt.Dimension(120, 40));
        btn_generarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarUsuariosActionPerformed(evt);
            }
        });
        panel_reportes.add(btn_generarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, -1, -1));

        ReporteLibrosTxt.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ReporteLibrosTxt.setForeground(java.awt.Color.white);
        ReporteLibrosTxt.setText("Reporte por Libros");
        panel_reportes.add(ReporteLibrosTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, -1, -1));

        btn_generarLibros.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_generarLibros.setForeground(java.awt.Color.white);
        btn_generarLibros.setText("Generar");
        btn_generarLibros.setPreferredSize(new java.awt.Dimension(120, 40));
        btn_generarLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarLibrosActionPerformed(evt);
            }
        });
        panel_reportes.add(btn_generarLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, -1, -1));

        panel_right.add(panel_reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 900, 580));

        panel_inicio.setPreferredSize(new java.awt.Dimension(900, 580));
        panel_inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BienvenidoTxt.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BienvenidoTxt.setForeground(java.awt.Color.white);
        BienvenidoTxt.setText("Bienvenido");
        panel_inicio.add(BienvenidoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        panel_right.add(panel_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        background.add(panel_right, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        Inicio inicio = new Inicio();
        this.dispose();
        inicio.setVisible(true);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_usersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usersActionPerformed
        AdminUsers adminUsers = new AdminUsers();
        this.dispose();
        adminUsers.setVisible(true);
    }//GEN-LAST:event_btn_usersActionPerformed

    private void btn_reportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportsActionPerformed
        btn_reports.setEnabled(false);
        btn_home.setEnabled(true);
        panel_inicio.setVisible(false);
        panel_reportes.setVisible(true);
    }//GEN-LAST:event_btn_reportsActionPerformed

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        btn_reports.setEnabled(true);
        btn_home.setEnabled(false);
        panel_inicio.setVisible(true);
        panel_reportes.setVisible(false);
    }//GEN-LAST:event_btn_homeActionPerformed

    private void btn_bibliographysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bibliographysActionPerformed
        AdminBooks adminBooks = new AdminBooks();
        this.dispose();
        adminBooks.setVisible(true);
    }//GEN-LAST:event_btn_bibliographysActionPerformed

    private void btn_generarLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarLibrosActionPerformed
        VerPrestamos vp = new VerPrestamos();
        String cadena = "<!DOCTYPE html>\n"
                + "<html lang=\"en\">\n"
                + "<head>\n"
                + "    <meta charset=\"UTF-8\">\n"
                + "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n"
                + "    <title>Reporte por Libros</title>\n"
                + "    <style>\n"
                + "        * {\n"
                + "            font-family: sans-serif;\n"
                + "        }\n"
                + "        table {\n"
                + "            width: 80%;\n"
                + "            border-collapse: collapse;\n"
                + "        }\n"
                + "\n"
                + "        th,td {\n"
                + "            padding: 8px;\n"
                + "            text-align: left;\n"
                + "            border: 1px solid #dee2e6;\n"
                + "            background-color: white;\n"
                + "        }\n"
                + "\n"
                + "        th {\n"
                + "            height: 40px;\n"
                + "            text-align: center;\n"
                + "            background-color: lightslategray;\n"
                + "        }\n"
                + "    </style>\n"
                + "</head>\n"
                // AQUI EMPIEZA EL CUERPO DEL HTML
                + "<body>\n"
                + "    <h1>Reporte por Libros</h1>\n"
                + "    <table>\n"
                + "        <tr>\n"
                + "            <th>CodeBook</th>\n"
                + "            <th>Titulo</th>\n"
                + "            <th>Usuario</th>\n"
                + "            <th>Estado</th>\n"
                + "            <th>Tipo</th>\n"
                + "        </tr>\n";
        for (int i = 0; i < vp.prestamosDB.length; i++) {
            if (vp.prestamosDB[i] != null) {
                cadena += "<tr>\n";
                cadena += "<td>" + vp.prestamosDB[i].getCodeBook() + "</td>\n";
                cadena += "<td>" + vp.prestamosDB[i].getTitulo() + "</td>\n";
                cadena += "<td>" + vp.prestamosDB[i].getUsuario() + "</td>\n";
                cadena += "<td>" + vp.prestamosDB[i].getEstado() + "</td>\n";
                int _tipo = vp.prestamosDB[i].getTipo();
                String tipo = "";
                if (_tipo == 0) {
                    tipo = "Libro";
                } else if (_tipo == 1) {
                    tipo = "Revista";
                }
                if (_tipo == 2) {
                    tipo = "Tesis";
                }
                cadena += "<td>" + tipo + "</td>\n";
                cadena += "</tr>\n";
            }
        }
        cadena += "    </table>\n"
                + "\n"
                + "</body>\n"
                + "</html>";

        File reporte = new File("reporte por Libros.html");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(reporte));
            bw.write(cadena);
            bw.close();
            JOptionPane.showMessageDialog(null, "Reporte creado", "EXITO", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_generarLibrosActionPerformed

    private void btn_generarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarUsuariosActionPerformed
        VerPrestamos vp = new VerPrestamos();
        AdminUsers au = new AdminUsers();
        String cadena = "<!DOCTYPE html>\n"
                + "<html lang=\"en\">\n"
                + "<head>\n"
                + "    <meta charset=\"UTF-8\">\n"
                + "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n"
                + "    <title>Reporte de Usuarios</title>\n"
                + "    <style>\n"
                + "        * {\n"
                + "            font-family: sans-serif;\n"
                + "        }\n"
                + "        table {\n"
                + "            width: 80%;\n"
                + "            border-collapse: collapse;\n"
                + "        }\n"
                + "\n"
                + "        th,td {\n"
                + "            padding: 8px;\n"
                + "            text-align: left;\n"
                + "            border: 1px solid #dee2e6;\n"
                + "            background-color: white;\n"
                + "        }\n"
                + "\n"
                + "        th {\n"
                + "            height: 40px;\n"
                + "            text-align: center;\n"
                + "            background-color: lightslategray;\n"
                + "        }\n"
                + "    </style>\n"
                + "</head>\n"
                // AQUI EMPIEZA EL CUERPO DEL HTML
                + "<body>\n"
                + "    <h1>Reporte de Usuarios</h1>\n";
        for (int j = 0; j < au.usuariosDB.length; j++) {
            if (au.usuariosDB[j] != null) {
                for (int i = 0; i < vp.prestamosDB.length; i++) {
                    if (vp.prestamosDB[i] != null) {
                        if (vp.prestamosDB[i].getUsuario() == au.usuariosDB[j].getUser()) {
                            cadena += "   <h3>" + vp.prestamosDB[i].getUsuario() + " </h3>"
                                    + "    <table>\n"
                                    + "        <tr>\n"
                                    + "            <th>CodeBook</th>\n"
                                    + "            <th>Titulo</th>\n"
                                    + "            <th>Usuario</th>\n"
                                    + "            <th>Estado</th>\n"
                                    + "            <th>Tipo</th>\n"
                                    + "        </tr>\n";
                            for (int s = 0; s < vp.prestamosDB.length; s++) {
                                if (vp.prestamosDB[s] != null) {
                                    if (vp.prestamosDB[s].getUsuario() == au.usuariosDB[j].getUser()) {
                                        cadena += "        <tr>\n"
                                                + "            <td>" + vp.prestamosDB[s].getCodeBook() + "</td>\n"
                                                + "            <td>" + vp.prestamosDB[s].getTitulo() + "</td>\n"
                                                + "            <td>" + vp.prestamosDB[s].getUsuario() + "</td>\n"
                                                + "            <td>" + vp.prestamosDB[s].getEstado() + "</td>\n";
                                        int _tipo = vp.prestamosDB[s].getTipo();
                                        String tipo = "";
                                        if (_tipo == 0) {
                                            tipo = "Libro";
                                        } else if (_tipo == 1) {
                                            tipo = "Revista";
                                        }
                                        if (_tipo == 2) {
                                            tipo = "Tesis";
                                        }
                                        cadena += "            <td>" + tipo + "</td>\n"
                                                + "        </tr>\n";
                                    }
                                }
                            }
                            cadena += " </table>\n";
                            break;
                        }
                    }
                }
            }
        }

        cadena += "</body>\n"
                + "</html>";

        File reporte = new File("reporte de usuarios.html");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(reporte));
            bw.write(cadena);
            bw.close();
            JOptionPane.showMessageDialog(null, "Reporte creado", "EXITO", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_generarUsuariosActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DashAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new FlatDarkLaf());
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                }
                new DashAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminsTxt;
    private javax.swing.JLabel BibliografiasTxt;
    private javax.swing.JLabel BienvenidoTxt;
    private javax.swing.JLabel LogoUsac;
    private javax.swing.JLabel ReporteLibrosTxt;
    private javax.swing.JLabel ReporteUsuariosTxt;
    private javax.swing.JSeparator SeparadorVertical;
    private javax.swing.JLabel UsuariosTxt;
    private javax.swing.JPanel background;
    private javax.swing.JButton btn_bibliographys;
    private javax.swing.JButton btn_generarLibros;
    private javax.swing.JButton btn_generarUsuarios;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_reports;
    private javax.swing.JButton btn_users;
    private javax.swing.JLabel icon_bibliography;
    private javax.swing.JLabel icon_home;
    private javax.swing.JLabel icon_reports;
    private javax.swing.JLabel icon_user;
    private javax.swing.JPanel panel_adminCount;
    private javax.swing.JPanel panel_bibliografy;
    private javax.swing.JPanel panel_bookCount;
    private javax.swing.JPanel panel_home;
    private javax.swing.JPanel panel_inicio;
    private javax.swing.JPanel panel_left;
    private javax.swing.JPanel panel_reportes;
    private javax.swing.JPanel panel_reports;
    private javax.swing.JPanel panel_right;
    private javax.swing.JPanel panel_userCount;
    private javax.swing.JPanel panel_users;
    private javax.swing.JSeparator separador;
    private javax.swing.JSeparator separadorHorizontal;
    private javax.swing.JLabel text_adminsCount;
    private javax.swing.JLabel text_booksCount;
    public javax.swing.JLabel text_name;
    private javax.swing.JLabel text_usersCount;
    // End of variables declaration//GEN-END:variables

}
