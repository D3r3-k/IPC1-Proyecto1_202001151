package D3r3_k.BibliotecaUser;

import D3r3_k.BibliotecaUser.UserExtras.MiBibliotecaVirtual;
import D3r3_k.BibliotecaUser.UserExtras.RenderTable;
import D3r3_k.BibliotecaAdmin.BooksAdmin.AdminBooks;
import D3r3_k.BibliotecaAdmin.UsersAdmin.AdminUsers;
import D3r3_k.DataBase.db_enBiblioteca;
import D3r3_k.Principal.Inicio;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class BibliotecaVirtual extends javax.swing.JFrame {

    DefaultTableModel modelo;

    public BibliotecaVirtual() {
        initComponents();
    }

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

    public void refresh() {
        MiBibliotecaVirtual mbv = new MiBibliotecaVirtual();
        if (!mbv.capacidadBiblioteca(mbv.enBiblioteca)) {
            mbv.enBiblioteca = mbv.redimBiblioteca(mbv.enBiblioteca);
        }

        AdminBooks ab = new AdminBooks();

        table_digitales.setDefaultRenderer(Object.class, new RenderTable());
        modelo = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        modelo.addColumn("CodeBook");
        modelo.addColumn("Titulo");
        modelo.addColumn("Autor");
        modelo.addColumn("Año");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Edicion");
        modelo.addColumn("Palabras Clave");
        modelo.addColumn("Temas");
        modelo.addColumn("Tamaño");
        modelo.addColumn("Agregar");

        for (int i = 0; i < ab.digitalesDB.length; i++) {
            if (ab.digitalesDB[i] != null) {
                Object[] digitales = new Object[10];
                digitales[0] = ab.digitalesDB[i].getCodeBook();
                digitales[1] = ab.digitalesDB[i].getTitulo();
                digitales[2] = ab.digitalesDB[i].getAutor();
                digitales[3] = ab.digitalesDB[i].getYear();
                digitales[4] = ab.digitalesDB[i].getDesc();
                digitales[5] = ab.digitalesDB[i].getEdicion();
                String[] _pclave = ab.digitalesDB[i].getP_clave();
                if (_pclave != null) {
                    String pclaves = String.join(", ", _pclave);
                    digitales[6] = pclaves;
                }
                String[] _tema = ab.digitalesDB[i].getTemas();
                if (_tema != null) {
                    String temas = String.join(" , ", _tema);
                    digitales[7] = temas;
                }
                digitales[8] = ab.digitalesDB[i].getFileSize();

                JButton btn = new JButton("Agregar");
                btn.setName("btn" + i);
                digitales[9] = btn;

                modelo.addRow(digitales);
            }
        }
        table_digitales.setModel(modelo);
        table_digitales.setRowHeight(40);
        return;
    }

    private void initComponents2() {
        this.setLocationRelativeTo(null);

        AdminBooks ab = new AdminBooks();
        
        AdminUsers au = new AdminUsers();
        System.out.println("BV | Usuario en linea: "+au.usuariosDB[userLogin].getUser());
        
        
        table_digitales.setDefaultRenderer(Object.class, new RenderTable());
        modelo = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        modelo.addColumn("CodeBook");
        modelo.addColumn("Titulo");
        modelo.addColumn("Autor");
        modelo.addColumn("Año");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Edicion");
        modelo.addColumn("Palabras Clave");
        modelo.addColumn("Temas");
        modelo.addColumn("Tamaño");
        modelo.addColumn("Agregar");

        for (int i = 0; i < ab.digitalesDB.length; i++) {
            if (ab.digitalesDB[i] != null) {
                Object[] digitales = new Object[10];
                digitales[0] = ab.digitalesDB[i].getCodeBook();
                digitales[1] = ab.digitalesDB[i].getTitulo();
                digitales[2] = ab.digitalesDB[i].getAutor();
                digitales[3] = ab.digitalesDB[i].getYear();
                digitales[4] = ab.digitalesDB[i].getDesc();
                digitales[5] = ab.digitalesDB[i].getEdicion();
                String[] _pclave = ab.digitalesDB[i].getP_clave();
                if (_pclave != null) {
                    String pclaves = String.join(", ", _pclave);
                    digitales[6] = pclaves;
                }
                String[] _tema = ab.digitalesDB[i].getTemas();
                if (_tema != null) {
                    String temas = String.join(" , ", _tema);
                    digitales[7] = temas;
                }
                digitales[8] = ab.digitalesDB[i].getFileSize();

                JButton btn = new JButton("Agregar");
                btn.setName("btn" + i);
                digitales[9] = btn;

                modelo.addRow(digitales);
            }
        }
        table_digitales.setModel(modelo);
        table_digitales.setRowHeight(40);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        btn_back = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        icon_book = new javax.swing.JLabel();
        ListaLibrosTxt = new javax.swing.JLabel();
        input_search = new javax.swing.JTextField();
        tabla = new javax.swing.JScrollPane();
        table_digitales = new javax.swing.JTable();
        btn_miBiblioteca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca Virtual");
        setPreferredSize(new java.awt.Dimension(1205, 715));
        setResizable(false);

        background.setPreferredSize(new java.awt.Dimension(1205, 715));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        background.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 20, -1, -1));

        icon_book.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_biblioteca.png"))); // NOI18N
        background.add(icon_book, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        ListaLibrosTxt.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ListaLibrosTxt.setForeground(java.awt.Color.white);
        ListaLibrosTxt.setText("Lista de Libros Digitales");
        ListaLibrosTxt.setPreferredSize(new java.awt.Dimension(300, 30));
        background.add(ListaLibrosTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        input_search.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        input_search.setForeground(java.awt.Color.gray);
        input_search.setText("Buscar...");
        input_search.setPreferredSize(new java.awt.Dimension(350, 40));
        input_search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                input_searchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                input_searchFocusLost(evt);
            }
        });
        input_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_searchActionPerformed(evt);
            }
        });
        input_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                input_searchKeyReleased(evt);
            }
        });
        background.add(input_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        tabla.setPreferredSize(new java.awt.Dimension(1150, 460));

        table_digitales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table_digitales.setFocusable(false);
        table_digitales.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table_digitales.getTableHeader().setReorderingAllowed(false);
        table_digitales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_digitalesMouseClicked(evt);
            }
        });
        tabla.setViewportView(table_digitales);

        background.add(tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        btn_miBiblioteca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_miBiblioteca.setForeground(java.awt.Color.white);
        btn_miBiblioteca.setText("Ver mi Biblioteca Virtual");
        btn_miBiblioteca.setPreferredSize(new java.awt.Dimension(200, 40));
        btn_miBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_miBibliotecaActionPerformed(evt);
            }
        });
        background.add(btn_miBiblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 150, -1, -1));

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

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        DashUser dashUser = new DashUser();
        this.dispose();
        dashUser.userLogin(userLogin);
        dashUser.setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void input_searchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_searchFocusGained
        if (input_search.getText().equals("Buscar...")) {
            input_search.setText("");
            input_search.setForeground(Color.white);
            input_search.setFont(new java.awt.Font("Segoe UI", 0, 14));
        }
    }//GEN-LAST:event_input_searchFocusGained

    private void input_searchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_searchFocusLost
        if (input_search.getText().isEmpty()) {
            input_search.setText("Buscar...");
            input_search.setForeground(Color.gray);
            input_search.setFont(new java.awt.Font("Segoe UI", 2, 14));
        }
    }//GEN-LAST:event_input_searchFocusLost

    private void input_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_searchActionPerformed
        if (input_search.getText().equals("Buscar...")) {
            input_search.setText("");
            input_search.setForeground(Color.white);
        }
    }//GEN-LAST:event_input_searchActionPerformed

    private void input_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_searchKeyReleased
        table_digitales.setDefaultRenderer(Object.class, new RenderTable());
        DefaultTableModel modelo = (DefaultTableModel) table_digitales.getModel();
        TableRowSorter<DefaultTableModel> tabla = new TableRowSorter<>(modelo);
        table_digitales.setRowSorter(tabla);
        tabla.setRowFilter(RowFilter.regexFilter(input_search.getText().trim()));
    }//GEN-LAST:event_input_searchKeyReleased

    private void btn_miBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_miBibliotecaActionPerformed
        MiBibliotecaVirtual mbv = new MiBibliotecaVirtual();
        mbv.userLogin(userLogin);
        this.dispose();
        mbv.setVisible(true);
    }//GEN-LAST:event_btn_miBibliotecaActionPerformed

    private void table_digitalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_digitalesMouseClicked
        MiBibliotecaVirtual mbv = new MiBibliotecaVirtual();
        AdminUsers au = new AdminUsers();
        AdminBooks ab = new AdminBooks();

        int columna = table_digitales.getColumnModel().getColumnIndexAtX(evt.getX());
        int fila = evt.getY() / table_digitales.getRowHeight();

        if (fila < table_digitales.getRowCount() && fila >= 0 && columna < table_digitales.getColumnCount() && columna >= 0) {
            Object value = table_digitales.getValueAt(fila, columna);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton btn = (JButton) value;

                int pos = Integer.parseInt(btn.getName().replace("btn", ""));
                String codeBook = (String) modelo.getValueAt(pos, 0);

                if (btn.getName().equals(btn.getName())) {

                    boolean enMiBibliteca = false;
                    for (int i = 0; i < mbv.enBiblioteca.length; i++) {
                        if (mbv.enBiblioteca[i] != null) {
                            if (mbv.enBiblioteca[i].getUsuario().equals(au.usuariosDB[userLogin].getUser())) {
                                if (mbv.enBiblioteca[i].getCodeBook().equals(codeBook)) {
                                    enMiBibliteca = true;
                                    break;
                                }
                            }
                        }
                    }

                    if (enMiBibliteca) {
                        JOptionPane.showMessageDialog(null, "El libro ya esta en tu biblioteca virtual.", "Error", JOptionPane.WARNING_MESSAGE);
                    } else {
                        String _titulo = (String) modelo.getValueAt(pos, 1);

                        for (int i = 0; i < mbv.enBiblioteca.length; i++) {
                            if (mbv.enBiblioteca[i] == null) {
                                for (int j = 0; j < ab.digitalesDB.length; j++) {
                                    if (ab.digitalesDB[j] != null) {
                                        if (ab.digitalesDB[j].getCodeBook().equals(codeBook)) {
                                            String usuario = au.usuariosDB[userLogin].getUser();
                                            String titulo = _titulo;
                                            mbv.enBiblioteca[i] = new db_enBiblioteca(usuario, titulo, codeBook);
                                            refresh();
                                            mbv.refresh();
                                            break;
                                        }
                                    }
                                }
                                break;
                            }
                        }
                        JOptionPane.showMessageDialog(null, "Libro agregado en tu biblioteca virtual.", "Completado", JOptionPane.INFORMATION_MESSAGE);
                    }
                    if (!input_search.getText().isEmpty()) {
                        input_search.setText("Buscar...");
                        input_search.setForeground(Color.gray);
                        input_search.setFont(new java.awt.Font("Segoe UI", 2, 14));
                        DefaultTableModel modelo = (DefaultTableModel) table_digitales.getModel();
                        TableRowSorter<DefaultTableModel> tabla = new TableRowSorter<>(modelo);
                        table_digitales.setRowSorter(tabla);
                    }
                }
            }
        }
    }//GEN-LAST:event_table_digitalesMouseClicked

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
            java.util.logging.Logger.getLogger(BibliotecaVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BibliotecaVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BibliotecaVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BibliotecaVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new FlatDarkLaf());
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                }
                new BibliotecaVirtual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ListaLibrosTxt;
    private javax.swing.JPanel background;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_miBiblioteca;
    private javax.swing.JLabel icon_book;
    private javax.swing.JTextField input_search;
    private javax.swing.JScrollPane tabla;
    private javax.swing.JTable table_digitales;
    // End of variables declaration//GEN-END:variables

}
