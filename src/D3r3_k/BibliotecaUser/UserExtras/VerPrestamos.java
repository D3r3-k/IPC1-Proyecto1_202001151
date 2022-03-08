package D3r3_k.BibliotecaUser.UserExtras;

import D3r3_k.BibliotecaAdmin.BooksAdmin.AdminBooks;
import D3r3_k.BibliotecaAdmin.UsersAdmin.AdminUsers;
import D3r3_k.BibliotecaUser.PrestarLibro;
import D3r3_k.DataBase.db_prestamos;
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

public class VerPrestamos extends javax.swing.JFrame {
    
    DefaultTableModel modelo;

    // ARREGLOS DE PRESTAMOS
    public static db_prestamos[] prestamosDB = new db_prestamos[4];

    // -----===== REDIMENSIONAR LISTA DE PRESTAMOS =====-----
    public static db_prestamos[] redimPrestamos(db_prestamos[] arreglo) {
        db_prestamos[] temp = new db_prestamos[prestamosDB.length + 1];
        for (int i = 0; i < prestamosDB.length; i++) {
            temp[i] = arreglo[i];
        }
        return temp;
    }
    
    public static boolean capacidadPrestamos(db_prestamos[] arreglo) {
        boolean capacidades = false;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == null) {
                capacidades = true;
                break;
            }
        }
        return capacidades;
    }
    
    private int userLogin;
    
    public void userLogin(int pos) {
        AdminUsers au = new AdminUsers();
        for (int i = 0; i < au.usuariosDB.length; i++) {
            if (au.usuariosDB[i] != null) {
                if (au.usuariosDB[i].getUser().equals(au.usuariosDB[pos].getUser())) {
                    userLogin = i;
                    initComponents2();
                }
            }
        }

    }
    
    public VerPrestamos() {
        initComponents();
    }
    
    private void initComponents2() {
        this.setLocationRelativeTo(null);
        
        AdminUsers au = new AdminUsers();
        
        System.out.println("VP | Usuario en linea: " + au.usuariosDB[userLogin].getUser());
        
        table_prestamos.setDefaultRenderer(Object.class, new RenderTable());
        modelo = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        modelo.addColumn("CodeBook");
        modelo.addColumn("Titulo");
        modelo.addColumn("Tipo");
        modelo.addColumn("Devolver");
        
        for (int i = 0; i < prestamosDB.length; i++) {
            if (prestamosDB[i] != null) {
                if (prestamosDB[i].getUsuario().equals(au.usuariosDB[userLogin].getUser())) {
                    if (prestamosDB[i].getEstado().equals("Prestado")) {
                        Object[] lista = new Object[4];
                        lista[0] = prestamosDB[i].getCodeBook();
                        lista[1] = prestamosDB[i].getTitulo();
                        int _tipo = prestamosDB[i].getTipo();
                        String tipo = "";
                        if (_tipo == 0) {
                            tipo = "Libro";
                        } else if (_tipo == 1) {
                            tipo = "Revista";
                        } else if (_tipo == 2) {
                            tipo = "Tesis";
                        }
                        lista[2] = tipo;
                        JButton btn = new JButton("Devolver");
                        btn.setName("btn" + i);
                        lista[3] = btn;
                        
                        modelo.addRow(lista);
                    }
                }
            }
        }
        
        table_prestamos.setModel(modelo);
        table_prestamos.setRowHeight(40);
        
    }
    
    public void refresh() {
        if (!capacidadPrestamos(prestamosDB)) {
            prestamosDB = redimPrestamos(prestamosDB);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        input_search = new javax.swing.JTextField();
        btn_back = new javax.swing.JButton();
        icon_book = new javax.swing.JLabel();
        PrestamosTxt = new javax.swing.JLabel();
        tabla = new javax.swing.JScrollPane();
        table_prestamos = new javax.swing.JTable();
        input_option = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prestamos");
        setResizable(false);

        background.setPreferredSize(new java.awt.Dimension(1205, 705));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        background.add(input_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        btn_back.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_back.setForeground(java.awt.Color.white);
        btn_back.setText("Regresar");
        btn_back.setFocusable(false);
        btn_back.setPreferredSize(new java.awt.Dimension(100, 30));
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        background.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        icon_book.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/book.png"))); // NOI18N
        background.add(icon_book, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        PrestamosTxt.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        PrestamosTxt.setForeground(java.awt.Color.white);
        PrestamosTxt.setText("Mis Prestamos");
        PrestamosTxt.setPreferredSize(new java.awt.Dimension(300, 30));
        background.add(PrestamosTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        tabla.setPreferredSize(new java.awt.Dimension(1150, 460));

        table_prestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table_prestamos.setFocusable(false);
        table_prestamos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table_prestamos.getTableHeader().setReorderingAllowed(false);
        table_prestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_prestamosMouseClicked(evt);
            }
        });
        tabla.setViewportView(table_prestamos);

        background.add(tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        input_option.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prestados", "Historial" }));
        input_option.setPreferredSize(new java.awt.Dimension(250, 40));
        input_option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_optionActionPerformed(evt);
            }
        });
        background.add(input_option, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

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
        table_prestamos.setDefaultRenderer(Object.class, new RenderTable());
        DefaultTableModel modelo = (DefaultTableModel) table_prestamos.getModel();
        TableRowSorter<DefaultTableModel> tabla = new TableRowSorter<>(modelo);
        table_prestamos.setRowSorter(tabla);
        tabla.setRowFilter(RowFilter.regexFilter(input_search.getText().trim()));
    }//GEN-LAST:event_input_searchKeyReleased

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        PrestarLibro pl = new PrestarLibro();
        this.dispose();
        pl.userLogin(userLogin);
        pl.setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void input_optionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_optionActionPerformed
        AdminUsers au = new AdminUsers();
        
        int op = input_option.getSelectedIndex();
        
        if (op == 0) {
            table_prestamos.setDefaultRenderer(Object.class, new RenderTable());
            modelo = new DefaultTableModel() {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            modelo.addColumn("CodeBook");
            modelo.addColumn("Titulo");
            modelo.addColumn("Tipo");
            modelo.addColumn("Devolver");
            
            for (int i = 0; i < prestamosDB.length; i++) {
                if (prestamosDB[i] != null) {
                    if (prestamosDB[i].getUsuario().equals(au.usuariosDB[userLogin].getUser())) {
                        if (prestamosDB[i].getEstado().equals("Prestado")) {
                            Object[] lista = new Object[4];
                            lista[0] = prestamosDB[i].getCodeBook();
                            lista[1] = prestamosDB[i].getTitulo();
                            int _tipo = prestamosDB[i].getTipo();
                            String tipo = "";
                            if (_tipo == 0) {
                                tipo = "Libro";
                            } else if (_tipo == 1) {
                                tipo = "Revista";
                            } else if (_tipo == 2) {
                                tipo = "Tesis";
                            }
                            lista[2] = tipo;
                            JButton btn = new JButton("Devolver");
                            btn.setName("btn" + i);
                            lista[3] = btn;
                            
                            modelo.addRow(lista);
                        }
                    }
                }
            }
            
            table_prestamos.setModel(modelo);
            table_prestamos.setRowHeight(40);
            if (!input_search.getText().isEmpty()) {
                input_search.setText("Buscar...");
                input_search.setForeground(Color.gray);
                input_search.setFont(new java.awt.Font("Segoe UI", 2, 14));
                DefaultTableModel modelo = (DefaultTableModel) table_prestamos.getModel();
                TableRowSorter<DefaultTableModel> tabla = new TableRowSorter<>(modelo);
                table_prestamos.setRowSorter(tabla);
            }
        } else if (op == 1) {
            table_prestamos.setDefaultRenderer(Object.class, new RenderTable());
            modelo = new DefaultTableModel() {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            modelo.addColumn("CodeBook");
            modelo.addColumn("Titulo");
            modelo.addColumn("Tipo");
            modelo.addColumn("Estado");
            
            for (int i = 0; i < prestamosDB.length; i++) {
                if (prestamosDB[i] != null) {
                    if (prestamosDB[i].getUsuario().equals(au.usuariosDB[userLogin].getUser())) {
                        
                        Object[] lista = new Object[4];
                        lista[0] = prestamosDB[i].getCodeBook();
                        lista[1] = prestamosDB[i].getTitulo();
                        int _tipo = prestamosDB[i].getTipo();
                        String tipo = "";
                        if (_tipo == 0) {
                            tipo = "Libro";
                        } else if (_tipo == 1) {
                            tipo = "Revista";
                        } else if (_tipo == 2) {
                            tipo = "Tesis";
                        }
                        lista[2] = tipo;
                        lista[3] = prestamosDB[i].getEstado();
                        
                        modelo.addRow(lista);
                        
                    }
                }
            }
            
            table_prestamos.setModel(modelo);
            table_prestamos.setRowHeight(40);
            if (!input_search.getText().isEmpty()) {
                input_search.setText("Buscar...");
                input_search.setForeground(Color.gray);
                input_search.setFont(new java.awt.Font("Segoe UI", 2, 14));
                DefaultTableModel modelo = (DefaultTableModel) table_prestamos.getModel();
                TableRowSorter<DefaultTableModel> tabla = new TableRowSorter<>(modelo);
                table_prestamos.setRowSorter(tabla);
            }
        }
    }//GEN-LAST:event_input_optionActionPerformed

    private void table_prestamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_prestamosMouseClicked
        AdminUsers au = new AdminUsers();
        AdminBooks ab = new AdminBooks();
        
        int column = table_prestamos.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / table_prestamos.getRowHeight();
        
        if (row < table_prestamos.getRowCount() && row >= 0 && column < table_prestamos.getColumnCount() && column >= 0) {
            Object value = table_prestamos.getValueAt(row, column);
            
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton btn = (JButton) value;
                
                int pos = table_prestamos.getSelectedRow();
                String codeBook = (String) modelo.getValueAt(pos, 0);
                
                if (btn.getName().equals(btn.getName())) {
                    
                    System.out.println(btn.getName());
                    
                    String devuelto = "Devuelto";
                    String prestado = "Prestado";
                    String _tipo = (String) modelo.getValueAt(pos, 2);
                    int tipo = 0;
                    if (_tipo.equals("Libro")) {
                        tipo = 0;
                    } else if (_tipo.equals("Revista")) {
                        tipo = 1;
                    } else if (_tipo.equals("Tesis")) {
                        tipo = 2;
                    }
                    
                    for (int i = 0; i < ab.booksDB.length; i++) {
                        if (ab.booksDB[i] != null) {
                            if (ab.booksDB[i].getCodeBook().equals(codeBook)) {
                                if (ab.booksDB[i].getDisponibles() > 0) {
                                    for (int p = 0; p < prestamosDB.length; p++) {
                                        if (prestamosDB[p] != null) {
                                            if (prestamosDB[p].getCodeBook().equals(codeBook)) {
                                                if (prestamosDB[p].getUsuario().equals(au.usuariosDB[userLogin].getUser())) {
                                                    if (prestamosDB[p].getEstado().equals(prestado)) {
                                                        int n = ab.booksDB[i].getDisponibles();
                                                        int disponibles = n + 1;
                                                        actualizarDB(codeBook, disponibles);
                                                        prestamosDB[p].setEstado(devuelto);
                                                        refresh();
                                                        actualizarTabla();
                                                        JOptionPane.showMessageDialog(null, "Has devuelto el libro", "Prestamos", JOptionPane.INFORMATION_MESSAGE);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    
                }
            }
        }

    }//GEN-LAST:event_table_prestamosMouseClicked
    
    private void actualizarDB(String codeBook, int disponibles) {
        AdminBooks ab = new AdminBooks();
        
        for (int i = 0; i < ab.booksDB.length; i++) {
            if (ab.booksDB[i] != null) {
                if (ab.booksDB[i].getCodeBook().equals(codeBook)) {
                    ab.booksDB[i].setDisponibles(disponibles);
                }
            }
        }
        
        for (int i = 0; i < ab.librosDB.length; i++) {
            if (ab.librosDB[i] != null) {
                if (ab.librosDB[i].getCodeBook().equals(codeBook)) {
                    ab.librosDB[i].setDisponibles(disponibles);
                }
            }
        }
        for (int i = 0; i < ab.tesisDB.length; i++) {
            if (ab.tesisDB[i] != null) {
                if (ab.tesisDB[i].getCodeBook().equals(codeBook)) {
                    ab.tesisDB[i].setDisponibles(disponibles);
                }
            }
        }
        for (int i = 0; i < ab.revistasDB.length; i++) {
            if (ab.revistasDB[i] != null) {
                if (ab.revistasDB[i].getCodeBook().equals(codeBook)) {
                    ab.revistasDB[i].setDisponibles(disponibles);
                }
            }
        }
        
    }
    
    private void actualizarTabla() {
        AdminUsers au = new AdminUsers();
        
        table_prestamos.setDefaultRenderer(Object.class, new RenderTable());
        modelo = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        modelo.addColumn("CodeBook");
        modelo.addColumn("Titulo");
        modelo.addColumn("Tipo");
        modelo.addColumn("Devolver");
        
        for (int i = 0; i < prestamosDB.length; i++) {
            if (prestamosDB[i] != null) {
                if (prestamosDB[i].getUsuario().equals(au.usuariosDB[userLogin].getUser())) {
                    if (prestamosDB[i].getEstado().equals("Prestado")) {
                        Object[] lista = new Object[4];
                        lista[0] = prestamosDB[i].getCodeBook();
                        lista[1] = prestamosDB[i].getTitulo();
                        int _tipo = prestamosDB[i].getTipo();
                        String tipo = "";
                        if (_tipo == 0) {
                            tipo = "Libro";
                        } else if (_tipo == 1) {
                            tipo = "Revista";
                        } else if (_tipo == 2) {
                            tipo = "Tesis";
                        }
                        lista[2] = tipo;
                        JButton btn = new JButton("Devolver");
                        btn.setName("btn" + i);
                        lista[3] = btn;
                        
                        modelo.addRow(lista);
                    }
                }
            }
        }
        
        table_prestamos.setModel(modelo);
        table_prestamos.setRowHeight(40);
        if (!input_search.getText().isEmpty()) {
            input_search.setText("Buscar...");
            input_search.setForeground(Color.gray);
            input_search.setFont(new java.awt.Font("Segoe UI", 2, 14));
            DefaultTableModel modelo = (DefaultTableModel) table_prestamos.getModel();
            TableRowSorter<DefaultTableModel> tabla = new TableRowSorter<>(modelo);
            table_prestamos.setRowSorter(tabla);
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
            java.util.logging.Logger.getLogger(VerPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new FlatDarkLaf());
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(MiBibliotecaVirtual.class.getName()).log(Level.SEVERE, null, ex);
                }
                new VerPrestamos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PrestamosTxt;
    private javax.swing.JPanel background;
    private javax.swing.JButton btn_back;
    private javax.swing.JLabel icon_book;
    private javax.swing.JComboBox<String> input_option;
    private javax.swing.JTextField input_search;
    private javax.swing.JScrollPane tabla;
    private javax.swing.JTable table_prestamos;
    // End of variables declaration//GEN-END:variables
}
