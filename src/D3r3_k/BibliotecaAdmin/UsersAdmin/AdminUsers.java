package D3r3_k.BibliotecaAdmin.UsersAdmin;

import D3r3_k.BibliotecaAdmin.DashAdmin;
import D3r3_k.DataBase.db_users;
import D3r3_k.Principal.Inicio;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class AdminUsers extends javax.swing.JFrame {

    DefaultTableModel modelo;

    public static db_users[] usuariosDB = new db_users[3];

    public static db_users[] redimUsers(db_users[] arreglo) {
        db_users[] temp = new db_users[usuariosDB.length + 1];
        for (int i = 0; i < usuariosDB.length; i++) {
            temp[i] = arreglo[i];
        }
        return temp;
    }

    public static boolean capacidadUsers(db_users[] arreglo) {
        boolean capacidades = false;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == null) {
                capacidades = true;
                break;
            }
        }
        return capacidades;
    }

    public AdminUsers() {
        initComponents();
        initComponents2();
    }

    public void refresh() {
        initComponents2();
    }

    private void initComponents2() {
        this.setLocationRelativeTo(null);

        modelo = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Usuario");
        modelo.addColumn("Contraseña");
        modelo.addColumn("Rol");

        for (int i = 0; i < usuariosDB.length; i++) {
            if (usuariosDB[i] != null) {
                Object[] listaUsuarios = new Object[6];
                listaUsuarios[0] = usuariosDB[i].getId();
                listaUsuarios[1] = usuariosDB[i].getName();
                listaUsuarios[2] = usuariosDB[i].getLastname();
                listaUsuarios[3] = usuariosDB[i].getUser();
                listaUsuarios[4] = usuariosDB[i].getPassword();
                listaUsuarios[5] = usuariosDB[i].getRol();
                modelo.addRow(listaUsuarios);
            }
        }
        table_users.setModel(modelo);

        if (usuariosDB[0] == null) {
            usuariosDB[0] = new db_users(1, "Admin", "", "admin", "admin", "admin");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        btn_back = new javax.swing.JButton();
        btn_newUser = new javax.swing.JButton();
        ListaUsuariosTxt = new javax.swing.JLabel();
        btn_editUser = new javax.swing.JButton();
        btn_deleteUser = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_users = new javax.swing.JTable();
        input_search = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador de usuarios");
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 700));

        background.setPreferredSize(new java.awt.Dimension(1200, 700));
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

        btn_newUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_newUser.setForeground(java.awt.Color.white);
        btn_newUser.setText("Crear");
        btn_newUser.setPreferredSize(new java.awt.Dimension(100, 40));
        btn_newUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newUserActionPerformed(evt);
            }
        });
        background.add(btn_newUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 150, -1, -1));

        ListaUsuariosTxt.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ListaUsuariosTxt.setForeground(java.awt.Color.white);
        ListaUsuariosTxt.setText("Lista de Usuarios");
        ListaUsuariosTxt.setPreferredSize(new java.awt.Dimension(195, 30));
        background.add(ListaUsuariosTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        btn_editUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_editUser.setForeground(java.awt.Color.white);
        btn_editUser.setText("Editar");
        btn_editUser.setPreferredSize(new java.awt.Dimension(100, 40));
        btn_editUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editUserActionPerformed(evt);
            }
        });
        background.add(btn_editUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 150, -1, -1));

        btn_deleteUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_deleteUser.setForeground(java.awt.Color.white);
        btn_deleteUser.setText("Borrar");
        btn_deleteUser.setPreferredSize(new java.awt.Dimension(100, 40));
        btn_deleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteUserActionPerformed(evt);
            }
        });
        background.add(btn_deleteUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 150, -1, -1));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1150, 460));

        table_users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table_users.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table_users);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        DashAdmin dashAdmin = new DashAdmin();
        this.dispose();
        dashAdmin.setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_deleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteUserActionPerformed
        int fila = table_users.getSelectedRow();

        if (fila >= 0) {
            long id = (long) modelo.getValueAt(fila, 0);
            for (int i = 0; i < usuariosDB.length; i++) {
                if (usuariosDB[i] != null) {
                    if (usuariosDB[i].getId() == id) {
                        borrar(usuariosDB, i);
                        break;
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un usuario");
        }
    }//GEN-LAST:event_btn_deleteUserActionPerformed

    private void borrar(db_users[] arr, int index) {
        db_users[] temp = new db_users[usuariosDB.length - 1];
        int restantes = usuariosDB.length - (index + 1);
        System.arraycopy(arr, 0, temp, 0, index);
        System.arraycopy(arr, index + 1, temp, index, restantes);
        usuariosDB = null;
        usuariosDB = temp;
        refresh();
    }

    private void btn_editUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editUserActionPerformed
        EditUser editUser = new EditUser();
        int fila = table_users.getSelectedRow();

        if (fila >= 0) {
            long getPos = (long) table_users.getValueAt(fila, 0);
            for (int i = 0; i < usuariosDB.length; i++) {
                if (usuariosDB[i] != null) {
                    if (usuariosDB[i].getId() == getPos) {
                        editUser.thisedit(i);
                        this.dispose();
                        editUser.setVisible(true);
                        break;
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un usuario");
        }
    }//GEN-LAST:event_btn_editUserActionPerformed

    private void btn_newUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newUserActionPerformed
        NewUser newUser = new NewUser();
        this.dispose();
        newUser.setVisible(true);
    }//GEN-LAST:event_btn_newUserActionPerformed

    private void input_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_searchKeyReleased
        DefaultTableModel modelo = (DefaultTableModel) table_users.getModel();
        TableRowSorter<DefaultTableModel> tabla = new TableRowSorter<>(modelo);
        table_users.setRowSorter(tabla);
        tabla.setRowFilter(RowFilter.regexFilter(input_search.getText().trim()));
    }//GEN-LAST:event_input_searchKeyReleased

    private void input_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_searchActionPerformed
        if (input_search.getText().equals("Buscar...")) {
            input_search.setText("");
            input_search.setForeground(Color.white);
        }
    }//GEN-LAST:event_input_searchActionPerformed

    private void input_searchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_searchFocusLost
        if (input_search.getText().isEmpty()) {
            input_search.setText("Buscar...");
            input_search.setForeground(Color.gray);
            input_search.setFont(new java.awt.Font("Segoe UI", 2, 14));
        }
    }//GEN-LAST:event_input_searchFocusLost

    private void input_searchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_searchFocusGained
        if (input_search.getText().equals("Buscar...")) {
            input_search.setText("");
            input_search.setForeground(Color.white);
            input_search.setFont(new java.awt.Font("Segoe UI", 0, 14));
        }
    }//GEN-LAST:event_input_searchFocusGained

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
            java.util.logging.Logger.getLogger(AdminUsers.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminUsers.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminUsers.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminUsers.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new FlatDarkLaf());
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                }
                new AdminUsers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ListaUsuariosTxt;
    private javax.swing.JPanel background;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_deleteUser;
    private javax.swing.JButton btn_editUser;
    private javax.swing.JButton btn_newUser;
    private javax.swing.JTextField input_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_users;
    // End of variables declaration//GEN-END:variables

}
