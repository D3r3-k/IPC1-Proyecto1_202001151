package D3r3_k.BibliotecaUser.UserExtras;

import D3r3_k.BibliotecaAdmin.BooksAdmin.AdminBooks;
import D3r3_k.BibliotecaAdmin.UsersAdmin.AdminUsers;
import D3r3_k.BibliotecaUser.BibliotecaVirtual;
import D3r3_k.DataBase.db_enBiblioteca;
import D3r3_k.Principal.Inicio;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MiBibliotecaVirtual extends javax.swing.JFrame {

    private int userLogin;
    
    public static db_enBiblioteca[] enBiblioteca = new db_enBiblioteca[2];

    //REDIMENSIONAR ARREGLOS 
    // -----===== REDIMENSIONAR LISTA DE BOOKS =====-----
    public static db_enBiblioteca[] redimBiblioteca(db_enBiblioteca[] arreglo) {
        db_enBiblioteca[] temp = new db_enBiblioteca[enBiblioteca.length + 1];
        for (int i = 0; i < enBiblioteca.length; i++) {
            temp[i] = arreglo[i];
        }
        return temp;
    }

    public static boolean capacidadBiblioteca(db_enBiblioteca[] arreglo) {
        boolean capacidades = false;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == null) {
                capacidades = true;
                break;
            }
        }
        return capacidades;
    }

    public void userLogin(int pos) {
        AdminUsers au = new AdminUsers();
        for (int i = 0; i < au.usuariosDB.length; i++) {
            if (au.usuariosDB[i].getUser().equals(au.usuariosDB[pos].getUser())) {
                userLogin = i;
                initComponents2();
            }
        }

    }

    public MiBibliotecaVirtual() {
        initComponents();
    }

    private void initComponents2() {
        this.setLocationRelativeTo(null);
        InfoLibros.setVisible(false);
        
        AdminUsers adminUsers = new AdminUsers();
        AdminBooks adminBooks = new AdminBooks();

        
        System.out.println("MBV | Usuario en linea: "+adminUsers.usuariosDB[userLogin].getUser());
        
        
        for (int j = 0; j < enBiblioteca.length; j++) {
            if (enBiblioteca[j] != null) {
                if (enBiblioteca[j].getUsuario().equals(adminUsers.usuariosDB[userLogin].getUser())) {
                    JPanel panel_lista = new JPanel();
                    panel_lista.setName(enBiblioteca[j].getCodeBook());
                    panel_lista.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
                    panel_lista.setPreferredSize(new java.awt.Dimension(150, 250));
                    panel_lista.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

                    JLabel icon = new JLabel();
                    icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_virtualBook.png")));
                    icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    panel_lista.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 200, 150));

                    JScrollPane scroll = new javax.swing.JScrollPane();
                    scroll.setBorder(null);
                    scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
                    scroll.setToolTipText("");
                    scroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
                    panel_lista.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 150, 180, 50));

                    JButton btn = new JButton("Leer");
                    btn.setName(enBiblioteca[j].getCodeBook());
                    btn.setFont(new java.awt.Font("Segoe UI", 1, 14));
                    btn.addActionListener((e) -> {

                        InfoLibros.setVisible(true);
                        for (int i = 0; i < adminBooks.digitalesDB.length; i++) {
                            if (adminBooks.digitalesDB[i] != null) {
                                if (adminBooks.digitalesDB[i].getCodeBook().equals(btn.getName())) {
                                    text_codebook.setText(adminBooks.digitalesDB[i].getCodeBook());
                                    textarea_titulo.setText(adminBooks.digitalesDB[i].getTitulo());
                                    text_autor.setText(adminBooks.digitalesDB[i].getAutor());
                                    text_edicion.setText(adminBooks.digitalesDB[i].getEdicion());
                                    text_year.setText(adminBooks.digitalesDB[i].getYear());
                                    text_filesize.setText(adminBooks.digitalesDB[i].getFileSize());
                                    textarea_desc.setText(adminBooks.digitalesDB[i].getDesc());
                                    String[] _pclave = adminBooks.digitalesDB[i].getP_clave();
                                    if (_pclave != null) {
                                        String pclaves = String.join(", ", _pclave);
                                        textarea_temas.setText(pclaves);
                                    }
                                    String[] _tema = adminBooks.digitalesDB[i].getTemas();
                                    if (_tema != null) {
                                        String temas = String.join(" , ", _tema);
                                        textarea_pclave.setText(temas);
                                    }
                                    btn_eliminar.setName(btn.getName());

                                }
                            }
                        }

                    });
                    panel_lista.add(btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 260, 190, 30));

                    JTextArea titulo = new javax.swing.JTextArea();
                    titulo.setEditable(false);
                    titulo.setLineWrap(true);
                    titulo.setFont(new java.awt.Font("Segoe UI", 1, 14));
                    String tituloTex = enBiblioteca[j].getTitulo();
                    if (tituloTex.length() > 50) {
                        tituloTex = tituloTex.substring(0, 35) + "...";
                    }
                    titulo.setText(tituloTex);
                    titulo.setFocusable(false);
                    titulo.setForeground(Color.white);
                    scroll.setViewportView(titulo);

                    GridBag.add(panel_lista);
                }
            }
        }
    }

    public void refresh() {
        AdminUsers adminUsers = new AdminUsers();
        AdminBooks adminBooks = new AdminBooks();

        for (int j = 0; j < enBiblioteca.length; j++) {
            if (enBiblioteca[j] != null) {
                if (enBiblioteca[j].getUsuario().equals(adminUsers.usuariosDB[userLogin].getUser())) {
                    JPanel panel_lista = new JPanel();
                    panel_lista.setName(enBiblioteca[j].getCodeBook());
                    panel_lista.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
                    panel_lista.setPreferredSize(new java.awt.Dimension(150, 250));
                    panel_lista.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

                    JLabel icon = new JLabel();
                    icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_virtualBook.png")));
                    icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    panel_lista.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 200, 150));

                    JScrollPane scroll = new javax.swing.JScrollPane();
                    scroll.setBorder(null);
                    scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
                    scroll.setToolTipText("");
                    scroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
                    panel_lista.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 150, 180, 50));

                    JButton btn = new JButton("Leer");
                    btn.setName(enBiblioteca[j].getCodeBook());
                    btn.setFont(new java.awt.Font("Segoe UI", 1, 14));
                    btn.addActionListener((e) -> {

                        InfoLibros.setVisible(true);
                        for (int i = 0; i < adminBooks.digitalesDB.length; i++) {
                            if (adminBooks.digitalesDB[i] != null) {
                                if (adminBooks.digitalesDB[i].getCodeBook().equals(btn.getName())) {
                                    text_codebook.setText(adminBooks.digitalesDB[i].getCodeBook());
                                    textarea_titulo.setText(adminBooks.digitalesDB[i].getTitulo());
                                    text_autor.setText(adminBooks.digitalesDB[i].getAutor());
                                    text_edicion.setText(adminBooks.digitalesDB[i].getEdicion());
                                    text_year.setText(adminBooks.digitalesDB[i].getYear());
                                    text_filesize.setText(adminBooks.digitalesDB[i].getFileSize());
                                    textarea_desc.setText(adminBooks.digitalesDB[i].getDesc());
                                    String[] _pclave = adminBooks.digitalesDB[i].getP_clave();
                                    if (_pclave != null) {
                                        String pclaves = String.join(", ", _pclave);
                                        textarea_temas.setText(pclaves);
                                    }
                                    String[] _tema = adminBooks.digitalesDB[i].getTemas();
                                    if (_tema != null) {
                                        String temas = String.join(" , ", _tema);
                                        textarea_pclave.setText(temas);
                                    }
                                    btn_eliminar.setName(btn.getName());

                                }
                            }
                        }

                    });
                    panel_lista.add(btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 260, 190, 30));

                    JTextArea titulo = new javax.swing.JTextArea();
                    titulo.setEditable(false);
                    titulo.setLineWrap(true);
                    titulo.setFont(new java.awt.Font("Segoe UI", 1, 14));
                    String tituloTex = enBiblioteca[j].getTitulo();
                    if (tituloTex.length() > 50) {
                        tituloTex = tituloTex.substring(0, 35) + "...";
                    }
                    titulo.setText(tituloTex);
                    titulo.setFocusable(false);
                    titulo.setForeground(Color.white);
                    scroll.setViewportView(titulo);

                    GridBag.add(panel_lista);
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        MisLibrosVirtuales = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        ListaLibros = new javax.swing.JScrollPane();
        GridBag = new javax.swing.JPanel();
        InfoLibros = new javax.swing.JScrollPane();
        panel_info = new javax.swing.JPanel();
        btn_eliminar = new javax.swing.JButton();
        icon_libro = new javax.swing.JLabel();
        titulo = new javax.swing.JScrollPane();
        textarea_titulo = new javax.swing.JTextArea();
        text_codebook = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        AñoTxT = new javax.swing.JLabel();
        text_year = new javax.swing.JLabel();
        AutorTxt = new javax.swing.JLabel();
        text_autor = new javax.swing.JLabel();
        EdicionTxt = new javax.swing.JLabel();
        text_edicion = new javax.swing.JLabel();
        FileSizeTxt = new javax.swing.JLabel();
        text_filesize = new javax.swing.JLabel();
        descripcion = new javax.swing.JScrollPane();
        textarea_desc = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        Temas = new javax.swing.JScrollPane();
        textarea_temas = new javax.swing.JTextArea();
        TemasTxt = new javax.swing.JLabel();
        Pclave = new javax.swing.JScrollPane();
        textarea_pclave = new javax.swing.JTextArea();
        PClaveTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        background.setPreferredSize(new java.awt.Dimension(1300, 800));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MisLibrosVirtuales.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        MisLibrosVirtuales.setForeground(java.awt.Color.white);
        MisLibrosVirtuales.setText("Mis Libros Virtuales");
        background.add(MisLibrosVirtuales, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        btn_back.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_back.setForeground(java.awt.Color.white);
        btn_back.setText("Regresar");
        btn_back.setPreferredSize(new java.awt.Dimension(100, 30));
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        background.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btn_logout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_logout.setForeground(java.awt.Color.white);
        btn_logout.setText("Cerrar Sesion");
        btn_logout.setPreferredSize(new java.awt.Dimension(150, 40));
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        background.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 20, -1, -1));

        ListaLibros.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ListaLibros.setPreferredSize(new java.awt.Dimension(620, 640));

        GridBag.setLayout(new java.awt.GridLayout(0, 3, 10, 10));
        ListaLibros.setViewportView(GridBag);

        background.add(ListaLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        InfoLibros.setPreferredSize(new java.awt.Dimension(620, 640));

        panel_info.setPreferredSize(new java.awt.Dimension(600, 600));
        panel_info.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_eliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_eliminar.setForeground(java.awt.Color.white);
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        panel_info.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        icon_libro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_virtualBook.png"))); // NOI18N
        panel_info.add(icon_libro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        titulo.setBorder(null);
        titulo.setForeground(java.awt.Color.white);
        titulo.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        titulo.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        textarea_titulo.setEditable(false);
        textarea_titulo.setColumns(20);
        textarea_titulo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        textarea_titulo.setForeground(java.awt.Color.white);
        textarea_titulo.setLineWrap(true);
        textarea_titulo.setTabSize(0);
        textarea_titulo.setText("Titulo");
        textarea_titulo.setPreferredSize(new java.awt.Dimension(330, 30));
        titulo.setViewportView(textarea_titulo);

        panel_info.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 410, 50));

        text_codebook.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        text_codebook.setForeground(java.awt.Color.white);
        text_codebook.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text_codebook.setText("codeBook");
        text_codebook.setPreferredSize(new java.awt.Dimension(100, 20));
        panel_info.add(text_codebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 125, -1, -1));

        separador.setPreferredSize(new java.awt.Dimension(610, 3));
        panel_info.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

        AñoTxT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AñoTxT.setForeground(java.awt.Color.white);
        AñoTxT.setText("Año: ");
        panel_info.add(AñoTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        text_year.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        text_year.setForeground(java.awt.Color.white);
        text_year.setText("0000");
        panel_info.add(text_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        AutorTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AutorTxt.setForeground(java.awt.Color.white);
        AutorTxt.setText("Autor:");
        panel_info.add(AutorTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        text_autor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        text_autor.setForeground(java.awt.Color.white);
        text_autor.setText("nombre autor");
        panel_info.add(text_autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        EdicionTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EdicionTxt.setForeground(java.awt.Color.white);
        EdicionTxt.setText("Edicion:");
        panel_info.add(EdicionTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        text_edicion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        text_edicion.setForeground(java.awt.Color.white);
        text_edicion.setText("No. edicion");
        panel_info.add(text_edicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        FileSizeTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FileSizeTxt.setForeground(java.awt.Color.white);
        FileSizeTxt.setText("Tamaño:");
        panel_info.add(FileSizeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, -1));

        text_filesize.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        text_filesize.setForeground(java.awt.Color.white);
        text_filesize.setText("00000");
        panel_info.add(text_filesize, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, -1));

        descripcion.setBorder(null);

        textarea_desc.setEditable(false);
        textarea_desc.setColumns(20);
        textarea_desc.setForeground(java.awt.Color.white);
        textarea_desc.setLineWrap(true);
        textarea_desc.setTabSize(0);
        textarea_desc.setToolTipText("");
        descripcion.setViewportView(textarea_desc);

        panel_info.add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 590, 360));

        jSeparator1.setPreferredSize(new java.awt.Dimension(610, 3));
        panel_info.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, -1, -1));

        Temas.setBorder(null);
        Temas.setPreferredSize(new java.awt.Dimension(240, 100));

        textarea_temas.setEditable(false);
        textarea_temas.setColumns(20);
        textarea_temas.setForeground(java.awt.Color.white);
        textarea_temas.setRows(5);
        Temas.setViewportView(textarea_temas);

        panel_info.add(Temas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        TemasTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TemasTxt.setForeground(java.awt.Color.white);
        TemasTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TemasTxt.setText("Temas");
        TemasTxt.setPreferredSize(new java.awt.Dimension(240, 20));
        panel_info.add(TemasTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, -1, -1));

        Pclave.setBorder(null);
        Pclave.setPreferredSize(new java.awt.Dimension(240, 100));

        textarea_pclave.setEditable(false);
        textarea_pclave.setColumns(20);
        textarea_pclave.setForeground(java.awt.Color.white);
        textarea_pclave.setRows(5);
        Pclave.setViewportView(textarea_pclave);

        panel_info.add(Pclave, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 560, -1, -1));

        PClaveTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PClaveTxt.setForeground(java.awt.Color.white);
        PClaveTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PClaveTxt.setText("Palabras Clave");
        PClaveTxt.setPreferredSize(new java.awt.Dimension(240, 20));
        panel_info.add(PClaveTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 530, -1, -1));

        InfoLibros.setViewportView(panel_info);

        background.add(InfoLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, -1, -1));

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

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        BibliotecaVirtual bv = new BibliotecaVirtual();
        this.dispose();
        bv.userLogin(userLogin);
        bv.setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        Inicio inicio = new Inicio();
        this.dispose();
        inicio.setVisible(true);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        AdminUsers adminUsers = new AdminUsers();
        BibliotecaVirtual bv = new BibliotecaVirtual();
        
        for (int i = 0; i < enBiblioteca.length; i++) {
            if (enBiblioteca[i] != null) {
                if (enBiblioteca[i].getUsuario().equals(adminUsers.usuariosDB[userLogin].getUser())) {
                    if (enBiblioteca[i].getCodeBook().equals(btn_eliminar.getName())) {
                        borrar(enBiblioteca, i);
                        this.dispose();
                        bv.userLogin(userLogin);
                        bv.setVisible(true);
                        break;
                    }
                }
            }
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void borrar(db_enBiblioteca[] arr, int index) {
        db_enBiblioteca[] temp = new db_enBiblioteca[enBiblioteca.length - 1];
        int restantes = enBiblioteca.length - (index + 1);
        System.arraycopy(arr, 0, temp, 0, index);
        System.arraycopy(arr, index + 1, temp, index, restantes);
        enBiblioteca = null;
        enBiblioteca = temp;
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
            java.util.logging.Logger.getLogger(MiBibliotecaVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MiBibliotecaVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MiBibliotecaVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MiBibliotecaVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new FlatDarkLaf());
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(MiBibliotecaVirtual.class.getName()).log(Level.SEVERE, null, ex);
                }
                new MiBibliotecaVirtual().setVisible(true);
            }
        });
    }
    private javax.swing.JButton btn;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AutorTxt;
    private javax.swing.JLabel AñoTxT;
    private javax.swing.JLabel EdicionTxt;
    private javax.swing.JLabel FileSizeTxt;
    private javax.swing.JPanel GridBag;
    private javax.swing.JScrollPane InfoLibros;
    private javax.swing.JScrollPane ListaLibros;
    private javax.swing.JLabel MisLibrosVirtuales;
    private javax.swing.JLabel PClaveTxt;
    private javax.swing.JScrollPane Pclave;
    private javax.swing.JScrollPane Temas;
    private javax.swing.JLabel TemasTxt;
    private javax.swing.JPanel background;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_logout;
    private javax.swing.JScrollPane descripcion;
    private javax.swing.JLabel icon_libro;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panel_info;
    private javax.swing.JSeparator separador;
    private javax.swing.JLabel text_autor;
    private javax.swing.JLabel text_codebook;
    private javax.swing.JLabel text_edicion;
    private javax.swing.JLabel text_filesize;
    private javax.swing.JLabel text_year;
    private javax.swing.JTextArea textarea_desc;
    private javax.swing.JTextArea textarea_pclave;
    private javax.swing.JTextArea textarea_temas;
    private javax.swing.JTextArea textarea_titulo;
    private javax.swing.JScrollPane titulo;
    // End of variables declaration//GEN-END:variables

}
