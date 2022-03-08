package D3r3_k.BibliotecaUser;

import D3r3_k.BibliotecaAdmin.BooksAdmin.AdminBooks;
import D3r3_k.BibliotecaAdmin.UsersAdmin.AdminUsers;
import D3r3_k.BibliotecaUser.UserExtras.RenderTable;
import D3r3_k.BibliotecaUser.UserExtras.VerPrestamos;
import D3r3_k.DataBase.db_prestamos;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class PrestarLibro extends javax.swing.JFrame {

    DefaultTableModel modelo;

    private int userLogin;

    public PrestarLibro() {
        initComponents();
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

    private void initComponents2() {
        this.setLocationRelativeTo(null);

        AdminBooks ab = new AdminBooks();

        AdminUsers au = new AdminUsers();
        System.out.println("PL | Usuario en linea: " + au.usuariosDB[userLogin].getUser());

        table_prestarLibros.setDefaultRenderer(Object.class, new RenderTable());
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
        modelo.addColumn("Copias");
        modelo.addColumn("Disponibles");
        modelo.addColumn("Tipo");
        modelo.addColumn("Prestar");

        for (int i = 0; i < ab.booksDB.length; i++) {
            if (ab.booksDB[i] != null) {
                if (ab.booksDB[i].getTipo() != 3) {
                    Object[] info = new Object[12];
                    info[0] = ab.booksDB[i].getCodeBook();
                    info[1] = ab.booksDB[i].getTitulo();
                    info[2] = ab.booksDB[i].getAutor();
                    info[3] = ab.booksDB[i].getDesc();
                    info[4] = ab.booksDB[i].getYear();

                    String[] _pclave = ab.booksDB[i].getP_clave();
                    if (_pclave != null) {
                        String pclaves = String.join(", ", _pclave);
                        info[5] = pclaves;
                    }

                    info[6] = ab.booksDB[i].getEdicion();

                    String[] _tema = ab.booksDB[i].getTemas();
                    if (_tema != null) {
                        String temas = String.join(" , ", _tema);
                        info[7] = temas;
                    }
                    info[8] = ab.booksDB[i].getCopias();
                    info[9] = ab.booksDB[i].getDisponibles();
                    int _tipo = ab.booksDB[i].getTipo();
                    String tipo = "";
                    if (_tipo == 0) {
                        tipo = "Libro";
                    } else if (_tipo == 1) {
                        tipo = "Revista";
                    } else if (_tipo == 2) {
                        tipo = "Tesis";
                    }
                    info[10] = tipo;
                    JButton btn = new JButton("Prestar");
                    btn.setName("btn" + i);
                    info[11] = btn;
                    modelo.addRow(info);
                }
            }
        }

        table_prestarLibros.setModel(modelo);
        table_prestarLibros.setRowHeight(35);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        btn_back = new javax.swing.JButton();
        btn_verPrestamos = new javax.swing.JButton();
        btn_generarReporte = new javax.swing.JButton();
        ListaLibrosTxt = new javax.swing.JLabel();
        icon_book = new javax.swing.JLabel();
        input_search = new javax.swing.JTextField();
        input_option = new javax.swing.JComboBox<>();
        tabla = new javax.swing.JScrollPane();
        table_prestarLibros = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        background.setPreferredSize(new java.awt.Dimension(1205, 705));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        btn_verPrestamos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_verPrestamos.setForeground(java.awt.Color.white);
        btn_verPrestamos.setText("Ver Prestamos");
        btn_verPrestamos.setPreferredSize(new java.awt.Dimension(150, 40));
        btn_verPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verPrestamosActionPerformed(evt);
            }
        });
        background.add(btn_verPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 100, -1, -1));

        btn_generarReporte.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_generarReporte.setForeground(java.awt.Color.white);
        btn_generarReporte.setText("Reporte de Existencias");
        btn_generarReporte.setPreferredSize(new java.awt.Dimension(180, 40));
        btn_generarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarReporteActionPerformed(evt);
            }
        });
        background.add(btn_generarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 150, -1, -1));

        ListaLibrosTxt.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ListaLibrosTxt.setForeground(java.awt.Color.white);
        ListaLibrosTxt.setText("Libros en existencia");
        ListaLibrosTxt.setPreferredSize(new java.awt.Dimension(300, 30));
        background.add(ListaLibrosTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        icon_book.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/book.png"))); // NOI18N
        background.add(icon_book, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

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

        input_option.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todo", "Libros", "Revistas", "Tesis" }));
        input_option.setPreferredSize(new java.awt.Dimension(250, 40));
        input_option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_optionActionPerformed(evt);
            }
        });
        background.add(input_option, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        tabla.setPreferredSize(new java.awt.Dimension(1150, 460));

        table_prestarLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table_prestarLibros.setFocusable(false);
        table_prestarLibros.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table_prestarLibros.getTableHeader().setReorderingAllowed(false);
        table_prestarLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_prestarLibrosMouseClicked(evt);
            }
        });
        tabla.setViewportView(table_prestarLibros);

        background.add(tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 460));

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
        DashUser du = new DashUser();
        this.dispose();
        du.userLogin(userLogin);
        du.setVisible(true);

    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_verPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verPrestamosActionPerformed
        VerPrestamos vp = new VerPrestamos();
        this.dispose();
        vp.userLogin(userLogin);
        vp.setVisible(true);
    }//GEN-LAST:event_btn_verPrestamosActionPerformed

    private void btn_generarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarReporteActionPerformed
        AdminBooks ab = new AdminBooks();
        String cadena = "<!DOCTYPE html>\n"
                + "<html lang=\"en\">\n"
                + "<head>\n"
                + "    <meta charset=\"UTF-8\">\n"
                + "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n"
                + "    <title>Reporte de Libros en Existencia</title>\n"
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
                + "    <h1>Reporte de Libros en Existencia</h1>\n"
                + "    <h2>Libros</h2>\n"
                + "    <table>\n"
                + "        <tr>\n"
                + "            <th>CodeBook</th>\n"
                + "            <th>Titulo</th>\n"
                + "            <th>Autor</th>\n"
                + "            <th>Descripcion</th>\n"
                + "            <th>Año</th>\n"
                + "            <th>Palabras Clave</th>\n"
                + "            <th>Edicion</th>\n"
                + "            <th>Temas</th>\n"
                + "            <th>Tipo</th>\n"
                + "            <th>Copias</th>\n"
                + "            <th>Disponibles</th>\n"
                + "        </tr>\n";
        for (int i = 0; i < ab.librosDB.length; i++) {
            if (ab.librosDB[i] != null) {
                cadena += "<tr>\n";
                cadena += "<td>" + ab.librosDB[i].getCodeBook() + "</td>\n";
                cadena += "<td>" + ab.librosDB[i].getTitulo() + "</td>\n";
                cadena += "<td>" + ab.librosDB[i].getAutor() + "</td>\n";
                cadena += "<td>" + ab.librosDB[i].getDesc() + "</td>\n";
                cadena += "<td>" + ab.librosDB[i].getYear() + "</td>\n";

                String[] _pclave = ab.librosDB[i].getP_clave();
                String pclaves = "";
                if (_pclave != null) {
                    pclaves = String.join(", ", _pclave);
                }
                cadena += "<td>" + pclaves + "</td>\n";
                cadena += "<td>" + ab.librosDB[i].getEdicion() + "</td>\n";

                String[] _temas = ab.librosDB[i].getTemas();
                String temas = "";
                if (_temas != null) {
                    temas = String.join(", ", _temas);
                }

                cadena += "<td>" + temas + "</td>\n";
                int _tipo = ab.librosDB[i].getTipo();
                String tipo = "";
                if (_tipo == 0) {
                    tipo = "Libro";
                } else if (_tipo == 1) {
                    tipo = "Revista";
                }
                if (_tipo == 2) {
                    tipo = "Tesis";
                }
                cadena += "<td>" + ab.librosDB[i].getCopias() + "</td>\n";
                cadena += "<td>" + ab.librosDB[i].getDisponibles() + "</td>\n";
                cadena += "<td>" + tipo + "</td>\n";
                cadena += "</tr>\n";
            }
        }
        cadena += "    </table>\n"
                + "    <h2>Revistas</h2>\n"
                + "    <table>\n"
                + "        <tr>\n"
                + "            <th>CodeBook</th>\n"
                + "            <th>Titulo</th>\n"
                + "            <th>Autor</th>\n"
                + "            <th>Descripcion</th>\n"
                + "            <th>Año</th>\n"
                + "            <th>Palabras Clave</th>\n"
                + "            <th>Edicion</th>\n"
                + "            <th>Temas</th>\n"
                + "            <th>Tipo</th>\n"
                + "            <th>Copias</th>\n"
                + "            <th>Disponibles</th>\n"
                + "        </tr>\n";
        for (int i = 0; i < ab.revistasDB.length; i++) {
            if (ab.revistasDB[i] != null) {
                cadena += "<tr>\n";
                cadena += "<td>" + ab.revistasDB[i].getCodeBook() + "</td>\n";
                cadena += "<td>" + ab.revistasDB[i].getTitulo() + "</td>\n";
                cadena += "<td>" + ab.revistasDB[i].getAutor() + "</td>\n";
                cadena += "<td>" + ab.revistasDB[i].getDesc() + "</td>\n";
                cadena += "<td>" + ab.revistasDB[i].getYear() + "</td>\n";

                String[] _pclave = ab.revistasDB[i].getP_clave();
                String pclaves = "";
                if (_pclave != null) {
                    pclaves = String.join(", ", _pclave);
                }
                cadena += "<td>" + pclaves + "</td>\n";
                cadena += "<td>" + ab.revistasDB[i].getEdicion() + "</td>\n";

                String[] _temas = ab.revistasDB[i].getTemas();
                String temas = "";
                if (_temas != null) {
                    temas = String.join(", ", _temas);
                }

                cadena += "<td>" + temas + "</td>\n";
                int _tipo = ab.revistasDB[i].getTipo();
                String tipo = "";
                if (_tipo == 0) {
                    tipo = "Libro";
                } else if (_tipo == 1) {
                    tipo = "Revista";
                }
                if (_tipo == 2) {
                    tipo = "Tesis";
                }
                cadena += "<td>" + ab.revistasDB[i].getCopias() + "</td>\n";
                cadena += "<td>" + ab.revistasDB[i].getDisponibles() + "</td>\n";
                cadena += "<td>" + tipo + "</td>\n";
                cadena += "</tr>\n";
            }
        }
        cadena += "    </table>\n"
                + "    <h2>Tesis</h2>\n"
                + "    <table>\n"
                + "        <tr>\n"
                + "            <th>CodeBook</th>\n"
                + "            <th>Titulo</th>\n"
                + "            <th>Autor</th>\n"
                + "            <th>Descripcion</th>\n"
                + "            <th>Año</th>\n"
                + "            <th>Palabras Clave</th>\n"
                + "            <th>Edicion</th>\n"
                + "            <th>Temas</th>\n"
                + "            <th>Tipo</th>\n"
                + "            <th>Copias</th>\n"
                + "            <th>Disponibles</th>\n"
                + "        </tr>\n";
        for (int i = 0; i < ab.tesisDB.length; i++) {
            if (ab.tesisDB[i] != null) {
                cadena += "<tr>\n";
                cadena += "<td>" + ab.tesisDB[i].getCodeBook() + "</td>\n";
                cadena += "<td>" + ab.tesisDB[i].getTitulo() + "</td>\n";
                cadena += "<td>" + ab.tesisDB[i].getAutor() + "</td>\n";
                cadena += "<td>" + ab.tesisDB[i].getDesc() + "</td>\n";
                cadena += "<td>" + ab.tesisDB[i].getYear() + "</td>\n";

                String[] _pclave = ab.tesisDB[i].getP_clave();
                String pclaves = "";
                if (_pclave != null) {
                    pclaves = String.join(", ", _pclave);
                }
                cadena += "<td>" + pclaves + "</td>\n";
                cadena += "<td>" + ab.tesisDB[i].getEdicion() + "</td>\n";

                String[] _temas = ab.tesisDB[i].getTemas();
                String temas = "";
                if (_temas != null) {
                    temas = String.join(", ", _temas);
                }

                cadena += "<td>" + temas + "</td>\n";
                int _tipo = ab.tesisDB[i].getTipo();
                String tipo = "";
                if (_tipo == 0) {
                    tipo = "Libro";
                } else if (_tipo == 1) {
                    tipo = "Revista";
                }
                if (_tipo == 2) {
                    tipo = "Tesis";
                }
                cadena += "<td>" + ab.tesisDB[i].getCopias() + "</td>\n";
                cadena += "<td>" + ab.tesisDB[i].getDisponibles() + "</td>\n";
                cadena += "<td>" + tipo + "</td>\n";
                cadena += "</tr>\n";
            }
        }
        cadena += "    </table>\n"
                + "\n"
                + "</body>\n"
                + "</html>";

        File reporte = new File("reporte libros en existencia.html");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(reporte));
            bw.write(cadena);
            bw.close();
            JOptionPane.showMessageDialog(null, "Reporte creado", "EXITO", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_generarReporteActionPerformed

    private void input_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_searchActionPerformed
        if (input_search.getText().equals("Buscar...")) {
            input_search.setText("");
            input_search.setForeground(Color.white);
        }
    }//GEN-LAST:event_input_searchActionPerformed

    private void input_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_searchKeyReleased
        table_prestarLibros.setDefaultRenderer(Object.class, new RenderTable());
        DefaultTableModel modelo = (DefaultTableModel) table_prestarLibros.getModel();
        TableRowSorter<DefaultTableModel> tabla = new TableRowSorter<>(modelo);
        table_prestarLibros.setRowSorter(tabla);
        tabla.setRowFilter(RowFilter.regexFilter(input_search.getText().trim()));
    }//GEN-LAST:event_input_searchKeyReleased

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

    private void input_optionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_optionActionPerformed
        AdminBooks ab = new AdminBooks();

        int opcion = input_option.getSelectedIndex();
        if (opcion == 0) {
            table_prestarLibros.setDefaultRenderer(Object.class, new RenderTable());
            modelo = new DefaultTableModel() {
                public boolean cellEditable(int row, int column) {
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
            modelo.addColumn("Copias");
            modelo.addColumn("Disponibles");
            modelo.addColumn("Tipo");
            modelo.addColumn("Prestar");

            for (int i = 0; i < ab.booksDB.length; i++) {
                if (ab.booksDB[i] != null) {
                    if (ab.booksDB[i].getTipo() != 3) {
                        Object[] info = new Object[12];
                        info[0] = ab.booksDB[i].getCodeBook();
                        info[1] = ab.booksDB[i].getTitulo();
                        info[2] = ab.booksDB[i].getAutor();
                        info[3] = ab.booksDB[i].getDesc();
                        info[4] = ab.booksDB[i].getYear();

                        String[] _pclave = ab.booksDB[i].getP_clave();
                        if (_pclave != null) {
                            String pclaves = String.join(", ", _pclave);
                            info[5] = pclaves;
                        }

                        info[6] = ab.booksDB[i].getEdicion();

                        String[] _tema = ab.booksDB[i].getTemas();
                        if (_tema != null) {
                            String temas = String.join(" , ", _tema);
                            info[7] = temas;
                        }
                        info[8] = ab.booksDB[i].getCopias();
                        info[9] = ab.booksDB[i].getDisponibles();

                        int _tipo = ab.booksDB[i].getTipo();
                        String tipo = "";
                        if (_tipo == 0) {
                            tipo = "Libro";
                        } else if (_tipo == 1) {
                            tipo = "Revista";
                        } else if (_tipo == 2) {
                            tipo = "Tesis";
                        }
                        info[10] = tipo;
                        JButton btn = new JButton("Prestar");
                        btn.setName("btn" + i);
                        info[11] = btn;
                        modelo.addRow(info);
                    }
                }
            }

            table_prestarLibros.setModel(modelo);
            table_prestarLibros.setRowHeight(35);
            if (!input_search.getText().isEmpty()) {
                input_search.setText("Buscar...");
                input_search.setForeground(Color.gray);
                input_search.setFont(new java.awt.Font("Segoe UI", 2, 14));
                DefaultTableModel modelo = (DefaultTableModel) table_prestarLibros.getModel();
                TableRowSorter<DefaultTableModel> tabla = new TableRowSorter<>(modelo);
                table_prestarLibros.setRowSorter(tabla);
            }

            // OPCION LIBROS
        } else if (opcion == 1) {
            table_prestarLibros.setDefaultRenderer(Object.class, new RenderTable());
            modelo = new DefaultTableModel() {
                public boolean cellEditable(int row, int column) {
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
            modelo.addColumn("Copias");
            modelo.addColumn("Disponibles");
            modelo.addColumn("Tipo");
            modelo.addColumn("Prestar");

            for (int i = 0; i < ab.librosDB.length; i++) {
                if (ab.librosDB[i] != null) {
                    if (ab.librosDB[i].getTipo() != 3) {
                        Object[] info = new Object[12];
                        info[0] = ab.librosDB[i].getCodeBook();
                        info[1] = ab.librosDB[i].getTitulo();
                        info[2] = ab.librosDB[i].getAutor();
                        info[3] = ab.librosDB[i].getDesc();
                        info[4] = ab.librosDB[i].getYear();

                        String[] _pclave = ab.librosDB[i].getP_clave();
                        if (_pclave != null) {
                            String pclaves = String.join(", ", _pclave);
                            info[5] = pclaves;
                        }

                        info[6] = ab.librosDB[i].getEdicion();

                        String[] _tema = ab.librosDB[i].getTemas();
                        if (_tema != null) {
                            String temas = String.join(" , ", _tema);
                            info[7] = temas;
                        }

                        info[8] = ab.librosDB[i].getCopias();
                        info[9] = ab.librosDB[i].getDisponibles();

                        int _tipo = ab.librosDB[i].getTipo();
                        String tipo = "";
                        if (_tipo == 0) {
                            tipo = "Libro";
                        } else if (_tipo == 1) {
                            tipo = "Revista";
                        } else if (_tipo == 2) {
                            tipo = "Tesis";
                        }
                        info[10] = tipo;
                        JButton btn = new JButton("Prestar");
                        btn.setName("btn" + i);
                        info[11] = btn;
                        modelo.addRow(info);
                    }
                }
            }

            table_prestarLibros.setModel(modelo);
            table_prestarLibros.setRowHeight(35);
            if (!input_search.getText().isEmpty()) {
                input_search.setText("Buscar...");
                input_search.setForeground(Color.gray);
                input_search.setFont(new java.awt.Font("Segoe UI", 2, 14));
                DefaultTableModel modelo = (DefaultTableModel) table_prestarLibros.getModel();
                TableRowSorter<DefaultTableModel> tabla = new TableRowSorter<>(modelo);
                table_prestarLibros.setRowSorter(tabla);
            }

            // OPCION REVISTAS
        } else if (opcion == 2) {
            table_prestarLibros.setDefaultRenderer(Object.class, new RenderTable());
            modelo = new DefaultTableModel() {
                public boolean cellEditable(int row, int column) {
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
            modelo.addColumn("Copias");
            modelo.addColumn("Disponibles");
            modelo.addColumn("Tipo");
            modelo.addColumn("Prestar");

            for (int i = 0; i < ab.revistasDB.length; i++) {
                if (ab.revistasDB[i] != null) {
                    if (ab.revistasDB[i].getTipo() != 3) {
                        Object[] info = new Object[12];
                        info[0] = ab.revistasDB[i].getCodeBook();
                        info[1] = ab.revistasDB[i].getTitulo();
                        info[2] = ab.revistasDB[i].getAutor();
                        info[3] = ab.revistasDB[i].getDesc();
                        info[4] = ab.revistasDB[i].getYear();

                        String[] _pclave = ab.revistasDB[i].getP_clave();
                        if (_pclave != null) {
                            String pclaves = String.join(", ", _pclave);
                            info[5] = pclaves;
                        }

                        info[6] = ab.revistasDB[i].getEdicion();

                        String[] _tema = ab.revistasDB[i].getTemas();
                        if (_tema != null) {
                            String temas = String.join(" , ", _tema);
                            info[7] = temas;
                        }

                        info[8] = ab.revistasDB[i].getCopias();
                        info[9] = ab.revistasDB[i].getDisponibles();

                        int _tipo = ab.revistasDB[i].getTipo();
                        String tipo = "";
                        if (_tipo == 0) {
                            tipo = "Libro";
                        } else if (_tipo == 1) {
                            tipo = "Revista";
                        } else if (_tipo == 2) {
                            tipo = "Tesis";
                        }
                        info[10] = tipo;
                        JButton btn = new JButton("Prestar");
                        btn.setName("btn" + i);
                        info[11] = btn;
                        modelo.addRow(info);
                    }
                }
            }

            table_prestarLibros.setModel(modelo);
            table_prestarLibros.setRowHeight(35);
            if (!input_search.getText().isEmpty()) {
                input_search.setText("Buscar...");
                input_search.setForeground(Color.gray);
                input_search.setFont(new java.awt.Font("Segoe UI", 2, 14));
                DefaultTableModel modelo = (DefaultTableModel) table_prestarLibros.getModel();
                TableRowSorter<DefaultTableModel> tabla = new TableRowSorter<>(modelo);
                table_prestarLibros.setRowSorter(tabla);
            }

            // OPCION TESIS
        } else if (opcion == 3) {
            table_prestarLibros.setDefaultRenderer(Object.class, new RenderTable());
            modelo = new DefaultTableModel() {
                public boolean cellEditable(int row, int column) {
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
            modelo.addColumn("Copias");
            modelo.addColumn("Disponibles");
            modelo.addColumn("Tipo");
            modelo.addColumn("Prestar");

            for (int i = 0; i < ab.tesisDB.length; i++) {
                if (ab.tesisDB[i] != null) {
                    if (ab.tesisDB[i].getTipo() != 3) {
                        Object[] info = new Object[12];
                        info[0] = ab.tesisDB[i].getCodeBook();
                        info[1] = ab.tesisDB[i].getTitulo();
                        info[2] = ab.tesisDB[i].getAutor();
                        info[3] = ab.tesisDB[i].getDesc();
                        info[4] = ab.tesisDB[i].getYear();

                        String[] _pclave = ab.tesisDB[i].getP_clave();
                        if (_pclave != null) {
                            String pclaves = String.join(", ", _pclave);
                            info[5] = pclaves;
                        }

                        info[6] = ab.tesisDB[i].getEdicion();

                        String[] _tema = ab.tesisDB[i].getTemas();
                        if (_tema != null) {
                            String temas = String.join(" , ", _tema);
                            info[7] = temas;
                        }

                        info[8] = ab.tesisDB[i].getCopias();
                        info[9] = ab.tesisDB[i].getDisponibles();

                        int _tipo = ab.tesisDB[i].getTipo();
                        String tipo = "";
                        if (_tipo == 0) {
                            tipo = "Libro";
                        } else if (_tipo == 1) {
                            tipo = "Revista";
                        } else if (_tipo == 2) {
                            tipo = "Tesis";
                        }
                        info[10] = tipo;
                        JButton btn = new JButton("Prestar");
                        btn.setName("btn" + i);
                        info[11] = btn;
                        modelo.addRow(info);
                    }
                }
            }

            table_prestarLibros.setModel(modelo);
            table_prestarLibros.setRowHeight(35);
            if (!input_search.getText().isEmpty()) {
                input_search.setText("Buscar...");
                input_search.setForeground(Color.gray);
                input_search.setFont(new java.awt.Font("Segoe UI", 2, 14));
                DefaultTableModel modelo = (DefaultTableModel) table_prestarLibros.getModel();
                TableRowSorter<DefaultTableModel> tabla = new TableRowSorter<>(modelo);
                table_prestarLibros.setRowSorter(tabla);
            }
        }


    }//GEN-LAST:event_input_optionActionPerformed

    private void table_prestarLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_prestarLibrosMouseClicked
        VerPrestamos vp = new VerPrestamos();
        AdminUsers au = new AdminUsers();
        AdminBooks ab = new AdminBooks();

        int column = table_prestarLibros.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / table_prestarLibros.getRowHeight();

        if (row < table_prestarLibros.getRowCount() && row >= 0 && column < table_prestarLibros.getColumnCount() && column >= 0) {
            Object value = table_prestarLibros.getValueAt(row, column);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton btn = (JButton) value;

                int pos = table_prestarLibros.getSelectedRow();
                String codeBook = (String) modelo.getValueAt(pos, 0);

                if (btn.getName().equals(btn.getName())) {

                    System.out.println(btn.getName());

                    String prestado = "Prestado";
                    String devuelto = "Devuelto";
                    String titulo = (String) modelo.getValueAt(pos, 1);
                    String usuario = au.usuariosDB[userLogin].getUser();
                    String _tipo = (String) modelo.getValueAt(pos, 10);
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
                                    for (int p = 0; p < vp.prestamosDB.length; p++) {
                                        if (vp.prestamosDB[p] != null) {
                                            if (vp.prestamosDB[p].getCodeBook().equals(codeBook)) {
                                                if (vp.prestamosDB[p].getUsuario().equals(au.usuariosDB[userLogin].getUser())) {
                                                    if (vp.prestamosDB[p].getEstado().equals(prestado)) {
                                                        JOptionPane.showMessageDialog(null, "No has devuelto este libro", "Prestamos", JOptionPane.WARNING_MESSAGE);
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            for (int p1 = 0; p1 < vp.prestamosDB.length; p1++) {
                                                if (vp.prestamosDB[p1] == null) {
                                                    int n = ab.booksDB[i].getDisponibles();
                                                    int disponibles = n - 1;
                                                    actualizarDB(codeBook, disponibles);
                                                    vp.prestamosDB[p1] = new db_prestamos(codeBook, titulo, usuario, prestado, tipo);
                                                    vp.refresh();
                                                    actualizarTabla();
                                                    JOptionPane.showMessageDialog(null, "El libro ha sido agregado a tu lista de prestamos", "Prestamos", JOptionPane.INFORMATION_MESSAGE);
                                                    break;
                                                }
                                            }
                                            break;
                                        }
                                    }
                                    break;
                                } else {
                                    JOptionPane.showMessageDialog(null, "Ya no hay copias disponibles", "ERROR", JOptionPane.ERROR_MESSAGE);
                                    break;
                                }
                            }
                        }
                    }

                }
            }
        }
    }//GEN-LAST:event_table_prestarLibrosMouseClicked

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
        AdminBooks ab = new AdminBooks();

        table_prestarLibros.setDefaultRenderer(Object.class, new RenderTable());
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
        modelo.addColumn("Copias");
        modelo.addColumn("Disponibles");
        modelo.addColumn("Tipo");
        modelo.addColumn("Prestar");

        for (int i = 0; i < ab.booksDB.length; i++) {
            if (ab.booksDB[i] != null) {
                if (ab.booksDB[i].getTipo() != 3) {
                    Object[] info = new Object[12];
                    info[0] = ab.booksDB[i].getCodeBook();
                    info[1] = ab.booksDB[i].getTitulo();
                    info[2] = ab.booksDB[i].getAutor();
                    info[3] = ab.booksDB[i].getDesc();
                    info[4] = ab.booksDB[i].getYear();

                    String[] _pclave = ab.booksDB[i].getP_clave();
                    if (_pclave != null) {
                        String pclaves = String.join(", ", _pclave);
                        info[5] = pclaves;
                    }

                    info[6] = ab.booksDB[i].getEdicion();

                    String[] _tema = ab.booksDB[i].getTemas();
                    if (_tema != null) {
                        String temas = String.join(" , ", _tema);
                        info[7] = temas;
                    }
                    info[8] = ab.booksDB[i].getCopias();
                    info[9] = ab.booksDB[i].getDisponibles();
                    int _tipo = ab.booksDB[i].getTipo();
                    String tipo = "";
                    if (_tipo == 0) {
                        tipo = "Libro";
                    } else if (_tipo == 1) {
                        tipo = "Revista";
                    } else if (_tipo == 2) {
                        tipo = "Tesis";
                    }
                    info[10] = tipo;
                    JButton btn = new JButton("Prestar");
                    btn.setName("btn" + i);
                    info[11] = btn;
                    modelo.addRow(info);
                }
            }
        }

        table_prestarLibros.setModel(modelo);
        table_prestarLibros.setRowHeight(35);

        if (!input_search.getText().isEmpty()) {
            input_search.setText("Buscar...");
            input_search.setForeground(Color.gray);
            input_search.setFont(new java.awt.Font("Segoe UI", 2, 14));
        }
        input_option.setSelectedIndex(0);

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
            java.util.logging.Logger.getLogger(PrestarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrestarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrestarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrestarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new FlatDarkLaf());
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(PrestarLibro.class.getName()).log(Level.SEVERE, null, ex);
                }
                new PrestarLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ListaLibrosTxt;
    private javax.swing.JPanel background;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_generarReporte;
    private javax.swing.JButton btn_verPrestamos;
    private javax.swing.JLabel icon_book;
    private javax.swing.JComboBox<String> input_option;
    private javax.swing.JTextField input_search;
    private javax.swing.JScrollPane tabla;
    private javax.swing.JTable table_prestarLibros;
    // End of variables declaration//GEN-END:variables

}
