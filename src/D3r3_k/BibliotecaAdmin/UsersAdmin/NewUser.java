package D3r3_k.BibliotecaAdmin.UsersAdmin;

import D3r3_k.DataBase.db_users;
import D3r3_k.Principal.Inicio;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class NewUser extends javax.swing.JFrame {

    public NewUser() {
        initComponents();
        initComponents2();
    }

    private void initComponents2() {
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        icon_usuario = new javax.swing.JLabel();
        IDTxt = new javax.swing.JLabel();
        input_id = new javax.swing.JTextField();
        NombreTxt = new javax.swing.JLabel();
        input_name = new javax.swing.JTextField();
        ApellidoTxt = new javax.swing.JLabel();
        input_lastname = new javax.swing.JTextField();
        UsuarioTxt = new javax.swing.JLabel();
        input_user = new javax.swing.JTextField();
        ContraseñaTxt = new javax.swing.JLabel();
        input_password = new javax.swing.JPasswordField();
        ConfirmarTxt = new javax.swing.JLabel();
        input_password2 = new javax.swing.JPasswordField();
        btn_cancel = new javax.swing.JButton();
        btn_new = new javax.swing.JButton();
        RolTxt = new javax.swing.JLabel();
        input_rol = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crear Usuario");
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new_user.png"))); // NOI18N
        jPanel1.add(icon_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        IDTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IDTxt.setForeground(java.awt.Color.white);
        IDTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        IDTxt.setText("ID");
        IDTxt.setPreferredSize(new java.awt.Dimension(80, 30));
        jPanel1.add(IDTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        input_id.setForeground(java.awt.Color.gray);
        input_id.setText("010203040506");
        input_id.setPreferredSize(new java.awt.Dimension(250, 30));
        input_id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                input_idFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                input_idFocusLost(evt);
            }
        });
        input_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_idActionPerformed(evt);
            }
        });
        input_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input_idKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_idKeyTyped(evt);
            }
        });
        jPanel1.add(input_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        NombreTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NombreTxt.setForeground(java.awt.Color.white);
        NombreTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NombreTxt.setText("Nombre");
        NombreTxt.setPreferredSize(new java.awt.Dimension(80, 30));
        jPanel1.add(NombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        input_name.setForeground(java.awt.Color.gray);
        input_name.setText("Nombre...");
        input_name.setPreferredSize(new java.awt.Dimension(250, 30));
        input_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                input_nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                input_nameFocusLost(evt);
            }
        });
        input_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_nameActionPerformed(evt);
            }
        });
        input_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input_nameKeyPressed(evt);
            }
        });
        jPanel1.add(input_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        ApellidoTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ApellidoTxt.setForeground(java.awt.Color.white);
        ApellidoTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ApellidoTxt.setText("Apellido");
        ApellidoTxt.setPreferredSize(new java.awt.Dimension(80, 30));
        jPanel1.add(ApellidoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        input_lastname.setForeground(java.awt.Color.gray);
        input_lastname.setText("Apellido...");
        input_lastname.setPreferredSize(new java.awt.Dimension(250, 30));
        input_lastname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                input_lastnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                input_lastnameFocusLost(evt);
            }
        });
        input_lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_lastnameActionPerformed(evt);
            }
        });
        input_lastname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input_lastnameKeyPressed(evt);
            }
        });
        jPanel1.add(input_lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        UsuarioTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UsuarioTxt.setForeground(java.awt.Color.white);
        UsuarioTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        UsuarioTxt.setText("Usuario");
        UsuarioTxt.setPreferredSize(new java.awt.Dimension(80, 30));
        jPanel1.add(UsuarioTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        input_user.setForeground(java.awt.Color.gray);
        input_user.setText("Usuario...");
        input_user.setPreferredSize(new java.awt.Dimension(250, 30));
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
        jPanel1.add(input_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        ContraseñaTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ContraseñaTxt.setForeground(java.awt.Color.white);
        ContraseñaTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ContraseñaTxt.setText("Contraseña");
        ContraseñaTxt.setPreferredSize(new java.awt.Dimension(80, 30));
        jPanel1.add(ContraseñaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        input_password.setForeground(java.awt.Color.gray);
        input_password.setText("password123");
        input_password.setPreferredSize(new java.awt.Dimension(250, 30));
        input_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                input_passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                input_passwordFocusLost(evt);
            }
        });
        input_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_passwordActionPerformed(evt);
            }
        });
        input_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input_passwordKeyPressed(evt);
            }
        });
        jPanel1.add(input_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, -1));

        ConfirmarTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ConfirmarTxt.setForeground(java.awt.Color.white);
        ConfirmarTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ConfirmarTxt.setText("Confirmar");
        ConfirmarTxt.setPreferredSize(new java.awt.Dimension(80, 30));
        jPanel1.add(ConfirmarTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        input_password2.setForeground(java.awt.Color.gray);
        input_password2.setText("password123");
        input_password2.setPreferredSize(new java.awt.Dimension(250, 30));
        input_password2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                input_password2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                input_password2FocusLost(evt);
            }
        });
        input_password2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_password2ActionPerformed(evt);
            }
        });
        input_password2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input_password2KeyPressed(evt);
            }
        });
        jPanel1.add(input_password2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, -1));

        btn_cancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cancel.setForeground(java.awt.Color.white);
        btn_cancel.setText("Cancelar");
        btn_cancel.setFocusable(false);
        btn_cancel.setPreferredSize(new java.awt.Dimension(100, 30));
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, -1, -1));

        btn_new.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_new.setForeground(java.awt.Color.white);
        btn_new.setText("Crear");
        btn_new.setPreferredSize(new java.awt.Dimension(100, 30));
        btn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newActionPerformed(evt);
            }
        });
        jPanel1.add(btn_new, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, -1, -1));

        RolTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RolTxt.setForeground(java.awt.Color.white);
        RolTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        RolTxt.setText("Rol");
        RolTxt.setPreferredSize(new java.awt.Dimension(80, 30));
        jPanel1.add(RolTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        input_rol.setForeground(java.awt.Color.white);
        input_rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Administrador" }));
        input_rol.setPreferredSize(new java.awt.Dimension(250, 30));
        jPanel1.add(input_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        AdminUsers adminUsers = new AdminUsers();
        this.dispose();
        adminUsers.refresh();
        adminUsers.setVisible(true);
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void input_nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_nameFocusGained
        if (input_name.getText().equals("Nombre...")) {
            input_name.setText("");
            input_name.setForeground(Color.white);
        }
    }//GEN-LAST:event_input_nameFocusGained

    private void input_lastnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_lastnameFocusGained
        if (input_lastname.getText().equals("Apellido...")) {
            input_lastname.setText("");
            input_lastname.setForeground(Color.white);
        }
    }//GEN-LAST:event_input_lastnameFocusGained

    private void input_userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_userFocusGained
        if (input_user.getText().equals("Usuario...")) {
            input_user.setText("");
            input_user.setForeground(Color.white);
        }
    }//GEN-LAST:event_input_userFocusGained

    private void input_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_passwordFocusGained
        if (String.valueOf(input_password.getPassword()).equals("password123")) {
            input_password.setText("");
            input_password.setForeground(Color.white);
        }
    }//GEN-LAST:event_input_passwordFocusGained

    private void input_password2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_password2FocusGained
        if (String.valueOf(input_password2.getPassword()).equals("password123")) {
            input_password2.setText("");
            input_password2.setForeground(Color.white);
        }
    }//GEN-LAST:event_input_password2FocusGained

    private void input_nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_nameFocusLost
        if (input_name.getText().isEmpty()) {
            input_name.setText("Nombre...");
            input_name.setForeground(Color.gray);

        }
    }//GEN-LAST:event_input_nameFocusLost

    private void input_lastnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_lastnameFocusLost
        if (input_lastname.getText().isEmpty()) {
            input_lastname.setText("Apellido...");
            input_lastname.setForeground(Color.gray);

        }
    }//GEN-LAST:event_input_lastnameFocusLost

    private void input_userFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_userFocusLost
        if (input_user.getText().isEmpty()) {
            input_user.setText("Usuario...");
            input_user.setForeground(Color.gray);

        }
    }//GEN-LAST:event_input_userFocusLost

    private void input_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_passwordFocusLost
        if (String.valueOf(input_password.getPassword()).isEmpty()) {
            input_password.setText("password123");
            input_password.setForeground(Color.gray);

        }
    }//GEN-LAST:event_input_passwordFocusLost

    private void input_password2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_password2FocusLost
        if (String.valueOf(input_password2.getPassword()).isEmpty()) {
            input_password2.setText("password123");
            input_password2.setForeground(Color.gray);

        }
    }//GEN-LAST:event_input_password2FocusLost

    private void input_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_nameActionPerformed
        if (input_name.getText().equals("Nombre...")) {
            input_name.setText("");
            input_name.setForeground(Color.white);
        }
    }//GEN-LAST:event_input_nameActionPerformed

    private void input_lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_lastnameActionPerformed
        if (input_lastname.getText().equals("Apellido...")) {
            input_lastname.setText("");
            input_lastname.setForeground(Color.white);
        }
    }//GEN-LAST:event_input_lastnameActionPerformed

    private void input_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_userActionPerformed
        if (input_user.getText().equals("Usuario...")) {
            input_user.setText("");
            input_user.setForeground(Color.white);
        }
    }//GEN-LAST:event_input_userActionPerformed

    private void input_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_passwordActionPerformed
        if (String.valueOf(input_password.getPassword()).equals("password123")) {
            input_password.setText("");
            input_password.setForeground(Color.white);
        }
    }//GEN-LAST:event_input_passwordActionPerformed

    private void input_password2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_password2ActionPerformed
        if (String.valueOf(input_password2.getPassword()).equals("password123")) {
            input_password2.setText("");
            input_password2.setForeground(Color.white);
        }
    }//GEN-LAST:event_input_password2ActionPerformed

    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newActionPerformed
        newUser();
    }//GEN-LAST:event_btn_newActionPerformed

    private void input_idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_idFocusGained
        if (input_id.getText().equals("010203040506")) {
            input_id.setText("");
            input_id.setForeground(Color.white);
        }
    }//GEN-LAST:event_input_idFocusGained

    private void input_idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_idFocusLost
        if (input_id.getText().isEmpty()) {
            input_id.setText("010203040506");
            input_id.setForeground(Color.gray);
        }
    }//GEN-LAST:event_input_idFocusLost

    private void input_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_idActionPerformed
        if (input_id.getText().equals("010203040506")) {
            input_id.setText("");
            input_id.setForeground(Color.white);
        }
    }//GEN-LAST:event_input_idActionPerformed

    private void input_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_idKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_input_idKeyTyped

    private void input_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_idKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            newUser();
        }
    }//GEN-LAST:event_input_idKeyPressed

    private void input_nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_nameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            newUser();
        }
    }//GEN-LAST:event_input_nameKeyPressed

    private void input_lastnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_lastnameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            newUser();
        }
    }//GEN-LAST:event_input_lastnameKeyPressed

    private void input_userKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_userKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            newUser();
        }
    }//GEN-LAST:event_input_userKeyPressed

    private void input_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_passwordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            newUser();
        }
    }//GEN-LAST:event_input_passwordKeyPressed

    private void input_password2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_password2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            newUser();
        }
    }//GEN-LAST:event_input_password2KeyPressed

    private void newUser() {
        AdminUsers adminUsers = new AdminUsers();

        String _id = input_id.getText();
        long id = Long.parseLong(_id);
        String nombre = input_name.getText();
        String apellido = input_lastname.getText();
        String usuario = input_user.getText().toLowerCase();
        String pass1 = String.valueOf(input_password.getPassword());
        String pass2 = String.valueOf(input_password2.getPassword());
        int option_rol = input_rol.getSelectedIndex();

        String rol = "usuario";
        if (option_rol == 0) {
            rol = "usuario";
        } else if (option_rol == 1) {
            rol = "admin";
        }

        if (!adminUsers.capacidadUsers(adminUsers.usuariosDB)) {
            adminUsers.usuariosDB = adminUsers.redimUsers(adminUsers.usuariosDB);
        }

        if (_id.isBlank() || nombre.isBlank() || apellido.isBlank() || usuario.isBlank() || pass1.isBlank() || pass2.isBlank()
                || _id.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || usuario.isEmpty() || pass1.isEmpty() || pass2.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Datos vacios", "Error", JOptionPane.ERROR_MESSAGE);
            if (pass1.equals("password123") || pass2.equals("password123")) {
                input_password.setText("password123");
                input_password2.setText("password123");
            } else if (pass1.isEmpty() || pass2.isEmpty()) {
                input_password.setText("password123");
                input_password2.setText("password123");
            }
        } else if (_id.equals("010203040506") || nombre.equals("Nombre...") || apellido.equals("Apellido...") || usuario.equals("Usuario...") || pass1.equals("password123") || pass2.equals("password123")) {
            JOptionPane.showMessageDialog(null, "Datos vacios", "Error", JOptionPane.ERROR_MESSAGE);
            if (pass1.equals("password123") || pass2.equals("password123")) {
                input_password.setText("password123");
                input_password2.setText("password123");
            } else if (pass1.isEmpty() || pass2.isEmpty()) {
                input_password.setText("password123");
                input_password2.setText("password123");
            }
        } else {
            if (pass1.equals(pass2)) {
                for (int i = 0; i < adminUsers.usuariosDB.length; i++) {
                    if (adminUsers.usuariosDB[i] == null) {
                        for (int j = 0; j < adminUsers.usuariosDB.length; j++) {
                            if (adminUsers.usuariosDB[j].getUser().equals(usuario)) {
                                JOptionPane.showMessageDialog(null, "Ya existe el usuario en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
                                break;
                            } else {
                                if (adminUsers.usuariosDB[j].getId() == id) {
                                    JOptionPane.showMessageDialog(null, "Ya existe el ID en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
                                    break;
                                } else {
                                    adminUsers.usuariosDB[i] = new db_users(id, nombre, apellido, usuario, pass1, rol);
                                    JOptionPane.showMessageDialog(null, "Usuario creado con exito", "Guardado!", JOptionPane.INFORMATION_MESSAGE);
                                    adminUsers.refresh();
                                    this.dispose();
                                    adminUsers.setVisible(true);
                                    break;
                                }
                            }
                        }
                        break;
                    }
                }
            } else {
                if (pass1.equals("password123") || pass2.equals("password123")) {
                    input_password.setText("password123");
                    input_password2.setText("password123");
                } else if (pass1.isEmpty() || pass2.isEmpty()) {
                    input_password.setText("password123");
                    input_password2.setText("password123");
                }
                JOptionPane.showMessageDialog(null, "Las contraseñas no son iguales", "Error", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new FlatDarkLaf());
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                }
                new NewUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApellidoTxt;
    private javax.swing.JLabel ConfirmarTxt;
    private javax.swing.JLabel ContraseñaTxt;
    private javax.swing.JLabel IDTxt;
    private javax.swing.JLabel NombreTxt;
    private javax.swing.JLabel RolTxt;
    private javax.swing.JLabel UsuarioTxt;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_new;
    private javax.swing.JLabel icon_usuario;
    private javax.swing.JTextField input_id;
    private javax.swing.JTextField input_lastname;
    private javax.swing.JTextField input_name;
    private javax.swing.JPasswordField input_password;
    private javax.swing.JPasswordField input_password2;
    private javax.swing.JComboBox<String> input_rol;
    private javax.swing.JTextField input_user;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
