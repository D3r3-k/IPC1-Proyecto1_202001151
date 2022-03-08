package D3r3_k.BibliotecaAdmin.BooksAdmin;

import D3r3_k.BibliotecaAdmin.DashAdmin;
import D3r3_k.DataBase.db_books;
import D3r3_k.DataBase.db_digitales;
import D3r3_k.DataBase.db_libros;
import D3r3_k.DataBase.db_revistas;
import D3r3_k.DataBase.db_tesis;
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

public class AdminBooks extends javax.swing.JFrame {

    DefaultTableModel modelo;

    // ARREGLOS DE LIBROS
    public static db_books[] booksDB = new db_books[2];
    public static db_libros[] librosDB = new db_libros[2];
    public static db_revistas[] revistasDB = new db_revistas[2];
    public static db_tesis[] tesisDB = new db_tesis[2];
    public static db_digitales[] digitalesDB = new db_digitales[2];

    //REDIMENSIONAR ARREGLOS 
    // -----===== REDIMENSIONAR LISTA DE BOOKS =====-----
    public static db_books[] redimBooks(db_books[] arreglo) {
        db_books[] temp = new db_books[booksDB.length + 1];
        for (int i = 0; i < booksDB.length; i++) {
            temp[i] = arreglo[i];
        }
        return temp;
    }

    public static boolean capacidadBooks(db_books[] arreglo) {
        boolean capacidades = false;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == null) {
                capacidades = true;
                break;
            }
        }
        return capacidades;
    }

    // -----===== REDIMENSIONAR LISTA DE LIBROS =====-----
    public static db_libros[] redimLibros(db_libros[] arreglo) {
        db_libros[] temp = new db_libros[librosDB.length + 1];
        for (int i = 0; i < librosDB.length; i++) {
            temp[i] = arreglo[i];
        }
        return temp;
    }

    public static boolean capacidadLibros(db_libros[] arreglo) {
        boolean capacidades = false;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == null) {
                capacidades = true;
                break;
            }
        }
        return capacidades;
    }
    // -----===== REDIMENSIONAR LISTA DE REVISTAS =====-----

    public static db_revistas[] redimRevistas(db_revistas[] arreglo) {
        db_revistas[] temp = new db_revistas[revistasDB.length + 1];
        for (int i = 0; i < revistasDB.length; i++) {
            temp[i] = arreglo[i];
        }
        return temp;
    }

    public static boolean capacidadRevistas(db_revistas[] arreglo) {
        boolean capacidades = false;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == null) {
                capacidades = true;
                break;
            }
        }
        return capacidades;
    }

    // -----===== REDIMENSIONAR LISTA DE REVISTAS =====-----
    public static db_tesis[] redimTesis(db_tesis[] arreglo) {
        db_tesis[] temp = new db_tesis[tesisDB.length + 1];
        for (int i = 0; i < tesisDB.length; i++) {
            temp[i] = arreglo[i];
        }
        return temp;
    }

    public static boolean capacidadTesis(db_tesis[] arreglo) {
        boolean capacidades = false;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == null) {
                capacidades = true;
                break;
            }
        }
        return capacidades;
    }

    // -----===== REDIMENSIONAR LISTA DE REVISTAS =====-----
    public static db_digitales[] redimDigitales(db_digitales[] arreglo) {
        db_digitales[] temp = new db_digitales[digitalesDB.length + 1];
        for (int i = 0; i < digitalesDB.length; i++) {
            temp[i] = arreglo[i];
        }
        return temp;
    }

    public static boolean capacidadDigitales(db_digitales[] arreglo) {
        boolean capacidades = false;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == null) {
                capacidades = true;
                break;
            }
        }
        return capacidades;
    }

    public AdminBooks() {
        initComponents();
        initComponents2();
    }

    // -----===== FUNCIONES =====-----
    public void refresh() {
        initComponents2();
        if (!capacidadBooks(booksDB)) {
            booksDB = redimBooks(booksDB);
        }
        if (!capacidadLibros(librosDB)) {
            librosDB = redimLibros(librosDB);
        }
        if (!capacidadRevistas(revistasDB)) {
            revistasDB = redimRevistas(revistasDB);
        }
        if (!capacidadTesis(tesisDB)) {
            tesisDB = redimTesis(tesisDB);
        }
        if (!capacidadDigitales(digitalesDB)) {
            digitalesDB = redimDigitales(digitalesDB);
        }

        return;
    }

    private void initComponents2() {

        this.setLocationRelativeTo(null);
        modelo = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        modelo.addColumn("codeBook");
        modelo.addColumn("Titulo");
        modelo.addColumn("Autor");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Año");
        modelo.addColumn("Palabras Clave");
        modelo.addColumn("Edicion");
        modelo.addColumn("Tema");
        modelo.addColumn("Copias");
        modelo.addColumn("Disponibles");
        modelo.addColumn("Tipo");

        for (int i = 0; i < booksDB.length; i++) {
            if (booksDB[i] != null) {
                Object[] listaLibros = new Object[11];
                listaLibros[0] = booksDB[i].getCodeBook();
                listaLibros[1] = booksDB[i].getTitulo();
                listaLibros[2] = booksDB[i].getAutor();
                listaLibros[3] = booksDB[i].getDesc();
                listaLibros[4] = booksDB[i].getYear();

                String[] _pclave = booksDB[i].getP_clave();
                if (_pclave != null) {
                    String pclaves = String.join(", ", _pclave);
                    listaLibros[5] = pclaves;
                }

                listaLibros[6] = booksDB[i].getEdicion();

                String[] _tema = booksDB[i].getTemas();
                if (_tema != null) {
                    String temas = String.join(" , ", _tema);
                    listaLibros[7] = temas;
                }

                listaLibros[8] = booksDB[i].getCopias();
                listaLibros[9] = booksDB[i].getDisponibles();

                listaLibros[10] = booksDB[i].getTipo();
                modelo.addRow(listaLibros);
            }
        }
        table_books.setModel(modelo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        btn_back = new javax.swing.JButton();
        icon_book = new javax.swing.JLabel();
        ListaLibrosTxt = new javax.swing.JLabel();
        tabla = new javax.swing.JScrollPane();
        table_books = new javax.swing.JTable();
        input_search = new javax.swing.JTextField();
        btn_editBook = new javax.swing.JButton();
        btn_addBook = new javax.swing.JButton();
        btn_addMasiveBooks = new javax.swing.JButton();
        btn_deleteBook = new javax.swing.JButton();
        input_option = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador de libros");
        setPreferredSize(new java.awt.Dimension(1205, 715));
        setResizable(false);
        setSize(new java.awt.Dimension(1205, 715));

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

        icon_book.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/book.png"))); // NOI18N
        background.add(icon_book, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        ListaLibrosTxt.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ListaLibrosTxt.setForeground(java.awt.Color.white);
        ListaLibrosTxt.setText("Lista de Libros");
        ListaLibrosTxt.setPreferredSize(new java.awt.Dimension(170, 30));
        background.add(ListaLibrosTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        tabla.setPreferredSize(new java.awt.Dimension(1150, 460));

        table_books.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table_books.getTableHeader().setReorderingAllowed(false);
        tabla.setViewportView(table_books);

        background.add(tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

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

        btn_editBook.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_editBook.setForeground(java.awt.Color.white);
        btn_editBook.setText("Editar");
        btn_editBook.setPreferredSize(new java.awt.Dimension(100, 40));
        btn_editBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editBookActionPerformed(evt);
            }
        });
        background.add(btn_editBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 150, -1, -1));

        btn_addBook.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_addBook.setForeground(java.awt.Color.white);
        btn_addBook.setText("Carga Individual");
        btn_addBook.setPreferredSize(new java.awt.Dimension(150, 40));
        btn_addBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addBookActionPerformed(evt);
            }
        });
        background.add(btn_addBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 50, -1, -1));

        btn_addMasiveBooks.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_addMasiveBooks.setForeground(java.awt.Color.white);
        btn_addMasiveBooks.setText("Carga Masiva");
        btn_addMasiveBooks.setPreferredSize(new java.awt.Dimension(150, 40));
        btn_addMasiveBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addMasiveBooksActionPerformed(evt);
            }
        });
        background.add(btn_addMasiveBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 100, -1, -1));

        btn_deleteBook.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_deleteBook.setForeground(java.awt.Color.white);
        btn_deleteBook.setText("Borrar");
        btn_deleteBook.setPreferredSize(new java.awt.Dimension(100, 40));
        btn_deleteBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteBookActionPerformed(evt);
            }
        });
        background.add(btn_deleteBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 150, -1, -1));

        input_option.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todo", "Libros", "Revistas", "Tesis", "Digitales" }));
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
            .addGap(0, 1200, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void input_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_searchKeyReleased
        DefaultTableModel modelo = (DefaultTableModel) table_books.getModel();
        TableRowSorter<DefaultTableModel> tabla = new TableRowSorter<>(modelo);
        table_books.setRowSorter(tabla);
        tabla.setRowFilter(RowFilter.regexFilter(input_search.getText().trim()));
    }//GEN-LAST:event_input_searchKeyReleased

    private void input_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_searchActionPerformed
        if (input_search.getText().equals("Buscar...")) {
            input_search.setText("");
            input_search.setForeground(Color.white);
        }
    }//GEN-LAST:event_input_searchActionPerformed

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

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        DashAdmin dashAdmin = new DashAdmin();
        this.dispose();
        dashAdmin.setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_addBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addBookActionPerformed
        NewBook newBook = new NewBook();
        this.dispose();
        newBook.setVisible(true);
    }//GEN-LAST:event_btn_addBookActionPerformed

    private void btn_addMasiveBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addMasiveBooksActionPerformed
        CargaMasiva cargaMasiva = new CargaMasiva();
        this.dispose();
        cargaMasiva.setVisible(true);
    }//GEN-LAST:event_btn_addMasiveBooksActionPerformed

    private void input_optionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_optionActionPerformed
        int optionTable = input_option.getSelectedIndex();
        if (optionTable == 0) {
            modelo = new DefaultTableModel() {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            modelo.addColumn("codeBook");
            modelo.addColumn("Titulo");
            modelo.addColumn("Autor");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Año");
            modelo.addColumn("Palabras Clave");
            modelo.addColumn("Edicion");
            modelo.addColumn("Tema");
            modelo.addColumn("Copias");
            modelo.addColumn("Disponibles");
            modelo.addColumn("Tipo");

            for (int i = 0; i < booksDB.length; i++) {
                if (booksDB[i] != null) {
                    Object[] listaLibros = new Object[11];
                    listaLibros[0] = booksDB[i].getCodeBook();
                    listaLibros[1] = booksDB[i].getTitulo();
                    listaLibros[2] = booksDB[i].getAutor();
                    listaLibros[3] = booksDB[i].getDesc();
                    listaLibros[4] = booksDB[i].getYear();

                    String[] _pclave = booksDB[i].getP_clave();
                    if (_pclave != null) {
                        String pclaves = String.join(", ", _pclave);
                        listaLibros[5] = pclaves;
                    }

                    listaLibros[6] = booksDB[i].getEdicion();

                    String[] _tema = booksDB[i].getTemas();
                    if (_tema != null) {
                        String temas = String.join(" , ", _tema);
                        listaLibros[7] = temas;
                    }

                    listaLibros[8] = booksDB[i].getCopias();
                    listaLibros[9] = booksDB[i].getDisponibles();

                    listaLibros[10] = booksDB[i].getTipo();
                    modelo.addRow(listaLibros);
                }
            }
            table_books.setModel(modelo);
            if (!input_search.getText().isEmpty()) {
                input_search.setText("Buscar...");
                input_search.setForeground(Color.gray);
                input_search.setFont(new java.awt.Font("Segoe UI", 2, 14));
                DefaultTableModel modelo = (DefaultTableModel) table_books.getModel();
                TableRowSorter<DefaultTableModel> tabla = new TableRowSorter<>(modelo);
                table_books.setRowSorter(tabla);
            }
        } else if (optionTable == 1) {
            modelo = new DefaultTableModel() {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            
            modelo.addColumn("codeBook");
            modelo.addColumn("Autor");
            modelo.addColumn("Año");
            modelo.addColumn("ISBN");
            modelo.addColumn("Titulo");
            modelo.addColumn("Edicion");
            modelo.addColumn("Palabras Clave");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Temas");
            modelo.addColumn("Copias");
            modelo.addColumn("Disponibles");
            modelo.addColumn("Tipo");

            for (int i = 0; i < librosDB.length; i++) {
                if (librosDB[i] != null) {
                    Object[] listaLibros = new Object[12];
                    listaLibros[0] = librosDB[i].getCodeBook();
                    listaLibros[1] = librosDB[i].getAutor();
                    listaLibros[2] = librosDB[i].getYear();
                    listaLibros[3] = librosDB[i].getIsbn();
                    listaLibros[4] = librosDB[i].getTitulo();
                    listaLibros[5] = librosDB[i].getEdicion();

                    String[] _pclave = librosDB[i].getP_clave();
                    if (_pclave != null) {
                        String pclaves = String.join(", ", _pclave);
                        listaLibros[6] = pclaves;
                    }
                    listaLibros[7] = librosDB[i].getDesc();

                    String[] _tema = librosDB[i].getTemas();
                    if (_tema != null) {
                        String temas = String.join(" , ", _tema);
                        listaLibros[8] = temas;
                    }
                    listaLibros[9] = librosDB[i].getCopias();
                    listaLibros[10] = librosDB[i].getDisponibles();
                    listaLibros[11] = librosDB[i].getTipo();

                    modelo.addRow(listaLibros);
                }
            }
            table_books.setModel(modelo);
            if (!input_search.getText().isEmpty()) {
                input_search.setText("Buscar...");
                input_search.setForeground(Color.gray);
                input_search.setFont(new java.awt.Font("Segoe UI", 2, 14));
                DefaultTableModel modelo = (DefaultTableModel) table_books.getModel();
                TableRowSorter<DefaultTableModel> tabla = new TableRowSorter<>(modelo);
                table_books.setRowSorter(tabla);
            }
        } else if (optionTable == 2) {
            modelo = new DefaultTableModel() {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

            modelo.addColumn("codeBook");
            modelo.addColumn("Autor");
            modelo.addColumn("Año");
            modelo.addColumn("Titulo");
            modelo.addColumn("Edicion");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Categoria");
            modelo.addColumn("Ejemplares");
            modelo.addColumn("Temas");
            modelo.addColumn("Palabras Clave");
            modelo.addColumn("Copias");
            modelo.addColumn("Disponibles");
            modelo.addColumn("Tipo");

            for (int i = 0; i < revistasDB.length; i++) {
                if (revistasDB[i] != null) {

                    Object[] listaLibros = new Object[13];
                    listaLibros[0] = revistasDB[i].getCodeBook();
                    listaLibros[1] = revistasDB[i].getAutor();
                    listaLibros[2] = revistasDB[i].getYear();
                    listaLibros[3] = revistasDB[i].getTitulo();
                    listaLibros[4] = revistasDB[i].getEdicion();
                    listaLibros[5] = revistasDB[i].getDesc();
                    listaLibros[6] = revistasDB[i].getCategoria();
                    listaLibros[7] = revistasDB[i].getEjemplares();

                    String[] _tema = revistasDB[i].getTemas();
                    if (_tema != null) {
                        String temas = String.join(" , ", _tema);
                        listaLibros[8] = temas;
                    }

                    String[] _pclave = revistasDB[i].getP_clave();
                    if (_pclave != null) {
                        String pclaves = String.join(", ", _pclave);
                        listaLibros[9] = pclaves;
                    }
                    listaLibros[10] = revistasDB[i].getCopias();
                    listaLibros[11] = revistasDB[i].getDisponibles();
                    listaLibros[12] = revistasDB[i].getTipo();

                    modelo.addRow(listaLibros);
                }
            }
            table_books.setModel(modelo);
            if (!input_search.getText().isEmpty()) {
                input_search.setText("Buscar...");
                input_search.setForeground(Color.gray);
                input_search.setFont(new java.awt.Font("Segoe UI", 2, 14));
                DefaultTableModel modelo = (DefaultTableModel) table_books.getModel();
                TableRowSorter<DefaultTableModel> tabla = new TableRowSorter<>(modelo);
                table_books.setRowSorter(tabla);
            }
        } else if (optionTable == 3) {
            modelo = new DefaultTableModel() {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

            modelo.addColumn("codeBook");
            modelo.addColumn("Autor");
            modelo.addColumn("Año");
            modelo.addColumn("Titulo");
            modelo.addColumn("Palabras Clave");
            modelo.addColumn("Area");
            modelo.addColumn("Temas");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Edicion");
            modelo.addColumn("Copias");
            modelo.addColumn("Disponibilidad");
            modelo.addColumn("Tipo");

            for (int i = 0; i < tesisDB.length; i++) {
                if (tesisDB[i] != null) {
                    Object[] listaLibros = new Object[12];
                    listaLibros[0] = tesisDB[i].getCodeBook();
                    listaLibros[1] = tesisDB[i].getAutor();
                    listaLibros[2] = tesisDB[i].getYear();
                    listaLibros[3] = tesisDB[i].getTitulo();

                    String[] _pclave = tesisDB[i].getP_clave();
                    if (_pclave != null) {
                        String pclaves = String.join(", ", _pclave);
                        listaLibros[4] = pclaves;
                    }
                    listaLibros[5] = tesisDB[i].getArea();

                    String[] _tema = tesisDB[i].getTemas();
                    if (_tema != null) {
                        String temas = String.join(" , ", _tema);
                        listaLibros[6] = temas;
                    }
                    listaLibros[7] = tesisDB[i].getDesc();
                    listaLibros[8] = tesisDB[i].getEdicion();
                    listaLibros[9] = tesisDB[i].getCopias();
                    listaLibros[10] = tesisDB[i].getDisponibles();
                    listaLibros[11] = tesisDB[i].getTipo();

                    modelo.addRow(listaLibros);
                }
            }
            table_books.setModel(modelo);
            if (!input_search.getText().isEmpty()) {
                input_search.setText("Buscar...");
                input_search.setForeground(Color.gray);
                input_search.setFont(new java.awt.Font("Segoe UI", 2, 14));
                DefaultTableModel modelo = (DefaultTableModel) table_books.getModel();
                TableRowSorter<DefaultTableModel> tabla = new TableRowSorter<>(modelo);
                table_books.setRowSorter(tabla);
            }
        } else if (optionTable == 4) {
            modelo = new DefaultTableModel() {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

            modelo.addColumn("codeBook");
            modelo.addColumn("Autor");
            modelo.addColumn("Año");
            modelo.addColumn("Titulo");
            modelo.addColumn("Edicion");
            modelo.addColumn("Palabras Clave");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Temas");
            modelo.addColumn("Tamaño");
            modelo.addColumn("Tipo");

            for (int i = 0; i < digitalesDB.length; i++) {
                if (digitalesDB[i] != null) {
                    Object[] listaLibros = new Object[10];
                    listaLibros[0] = digitalesDB[i].getCodeBook();
                    listaLibros[1] = digitalesDB[i].getAutor();
                    listaLibros[2] = digitalesDB[i].getYear();
                    listaLibros[3] = digitalesDB[i].getTitulo();
                    listaLibros[4] = digitalesDB[i].getEdicion();

                    String[] _pclave = digitalesDB[i].getP_clave();
                    if (_pclave != null) {
                        String pclaves = String.join(", ", _pclave);
                        listaLibros[5] = pclaves;
                    }
                    listaLibros[6] = digitalesDB[i].getDesc();

                    String[] _tema = digitalesDB[i].getTemas();
                    if (_tema != null) {
                        String temas = String.join(" , ", _tema);
                        listaLibros[7] = temas;
                    }
                    listaLibros[8] = digitalesDB[i].getFileSize();
                    listaLibros[9] = digitalesDB[i].getTipo();

                    modelo.addRow(listaLibros);
                }
            }
            table_books.setModel(modelo);
            if (!input_search.getText().isEmpty()) {
                input_search.setText("Buscar...");
                input_search.setForeground(Color.gray);
                input_search.setFont(new java.awt.Font("Segoe UI", 2, 14));
                DefaultTableModel modelo = (DefaultTableModel) table_books.getModel();
                TableRowSorter<DefaultTableModel> tabla = new TableRowSorter<>(modelo);
                table_books.setRowSorter(tabla);
            }
        }
    }//GEN-LAST:event_input_optionActionPerformed

    private void btn_editBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editBookActionPerformed
        EditBook editBook = new EditBook();
        int fila = table_books.getSelectedRow();

        if (fila >= 0) {
            String codeBook = (String) modelo.getValueAt(fila, 0);
            editBook.editBook(codeBook);
            this.dispose();
            editBook.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un libro");
        }
    }//GEN-LAST:event_btn_editBookActionPerformed

    private void btn_deleteBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteBookActionPerformed
        int fila = table_books.getSelectedRow();

        if (fila >= 0) {
            String dato = (String) modelo.getValueAt(fila, 0);

            for (int i = 0; i < booksDB.length; i++) {
                if (booksDB[i] != null) {
                    if (booksDB[i].getCodeBook() == dato) {
                        borrarBook(booksDB, i);
                        input_option.setSelectedIndex(0);
                        break;
                    }
                }
            }
            for (int i = 0; i < librosDB.length; i++) {
                if (librosDB[i] != null) {
                    if (librosDB[i].getCodeBook() == dato) {
                        borrarLibros(librosDB, i);
                        input_option.setSelectedIndex(0);
                        break;
                    }
                }
            }
            for (int i = 0; i < revistasDB.length; i++) {
                if (revistasDB[i] != null) {
                    if (revistasDB[i].getCodeBook() == dato) {
                        borrarRevistas(revistasDB, i);
                        input_option.setSelectedIndex(0);
                        break;
                    }
                }
            }
            for (int i = 0; i < tesisDB.length; i++) {
                if (tesisDB[i] != null) {
                    if (tesisDB[i].getCodeBook() == dato) {
                        borrarTesis(tesisDB, i);
                        input_option.setSelectedIndex(0);
                        break;
                    }
                }
            }
            for (int i = 0; i < digitalesDB.length; i++) {
                if (digitalesDB[i] != null) {
                    if (digitalesDB[i].getCodeBook() == dato) {
                        borrarDigitales(digitalesDB, i);
                        input_option.setSelectedIndex(0);
                        break;
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un libro");
        }
    }//GEN-LAST:event_btn_deleteBookActionPerformed

    private void borrarBook(db_books[] arr, int index) {
        db_books[] temp = new db_books[booksDB.length - 1];
        int restantes = booksDB.length - (index + 1);
        System.arraycopy(arr, 0, temp, 0, index);
        System.arraycopy(arr, index + 1, temp, index, restantes);
        booksDB = null;
        booksDB = temp;
        refresh();
    }

    private void borrarLibros(db_libros[] arr, int index) {
        db_libros[] temp = new db_libros[librosDB.length - 1];
        int restantes = librosDB.length - (index + 1);
        System.arraycopy(arr, 0, temp, 0, index);
        System.arraycopy(arr, index + 1, temp, index, restantes);
        librosDB = null;
        librosDB = temp;
        refresh();
    }

    private void borrarRevistas(db_revistas[] arr, int index) {
        db_revistas[] temp = new db_revistas[revistasDB.length - 1];
        int restantes = revistasDB.length - (index + 1);
        System.arraycopy(arr, 0, temp, 0, index);
        System.arraycopy(arr, index + 1, temp, index, restantes);
        revistasDB = null;
        revistasDB = temp;
        refresh();
    }

    private void borrarTesis(db_tesis[] arr, int index) {
        db_tesis[] temp = new db_tesis[tesisDB.length - 1];
        int restantes = tesisDB.length - (index + 1);
        System.arraycopy(arr, 0, temp, 0, index);
        System.arraycopy(arr, index + 1, temp, index, restantes);
        tesisDB = null;
        tesisDB = temp;
        refresh();
    }

    private void borrarDigitales(db_digitales[] arr, int index) {
        db_digitales[] temp = new db_digitales[digitalesDB.length - 1];
        int restantes = digitalesDB.length - (index + 1);
        System.arraycopy(arr, 0, temp, 0, index);
        System.arraycopy(arr, index + 1, temp, index, restantes);
        digitalesDB = null;
        digitalesDB = temp;
        refresh();
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
            java.util.logging.Logger.getLogger(AdminBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new FlatDarkLaf());
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                }
                new AdminBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ListaLibrosTxt;
    private javax.swing.JPanel background;
    private javax.swing.JButton btn_addBook;
    private javax.swing.JButton btn_addMasiveBooks;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_deleteBook;
    private javax.swing.JButton btn_editBook;
    private javax.swing.JLabel icon_book;
    private javax.swing.JComboBox<String> input_option;
    private javax.swing.JTextField input_search;
    private javax.swing.JScrollPane tabla;
    private javax.swing.JTable table_books;
    // End of variables declaration//GEN-END:variables

}
