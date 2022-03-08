package D3r3_k.BibliotecaAdmin.BooksAdmin;

import D3r3_k.Principal.Inicio;
import com.formdev.flatlaf.FlatDarkLaf;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class EditBook extends javax.swing.JFrame {

    public EditBook() {
        initComponents();
        initComponents2();
    }

    private int editCodeBook;
    private int codeBooks;
    private int codeLibro;
    private int codeRevista;
    private int codeTesis;
    private int codeDigital;

    public void editBook(String codeBook) {
        AdminBooks adminBooks = new AdminBooks();

        for (int i = 0; i < adminBooks.booksDB.length; i++) {
            if (adminBooks.booksDB[i] != null) {
                if (adminBooks.booksDB[i].getCodeBook().equals(codeBook)) {
                    editCodeBook = adminBooks.booksDB[i].getTipo();
                    input_type.setSelectedIndex(editCodeBook);
                    codeBooks = i;
                    if (editCodeBook == 0) {
                        DataLibro();
                    } else if (editCodeBook == 1) {
                        DataRevista();
                    } else if (editCodeBook == 2) {
                        DataTesis();
                    } else if (editCodeBook == 3) {
                        DataDigital();
                    }
                    break;
                }
            }

        }
        for (int i = 0; i < adminBooks.librosDB.length; i++) {
            if (adminBooks.librosDB[i] != null) {
                if (adminBooks.librosDB[i].getCodeBook().equals(codeBook)) {
                    codeLibro = i;
                    break;
                }
            }

        }
        for (int i = 0; i < adminBooks.revistasDB.length; i++) {
            if (adminBooks.revistasDB[i] != null) {
                if (adminBooks.revistasDB[i].getCodeBook().equals(codeBook)) {
                    codeRevista = i;
                    break;
                }
            }

        }
        for (int i = 0; i < adminBooks.tesisDB.length; i++) {
            if (adminBooks.tesisDB[i] != null) {
                if (adminBooks.tesisDB[i].getCodeBook().equals(codeBook)) {
                    codeTesis = i;
                    break;
                }
            }

        }
        for (int i = 0; i < adminBooks.digitalesDB.length; i++) {
            if (adminBooks.digitalesDB[i] != null) {
                if (adminBooks.digitalesDB[i].getCodeBook().equals(codeBook)) {
                    codeDigital = i;
                    break;
                }
            }

        }
    }

    public void initComponents2() {
        this.setLocationRelativeTo(null);

        panel_libro.setVisible(false);
        panel_tesis.setVisible(false);
        panel_revista.setVisible(false);
        panel_digital.setVisible(false);
        panel_pclave_desc_temas.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        panel_tipo = new javax.swing.JPanel();
        icon_newBook = new javax.swing.JLabel();
        TipoTxt = new javax.swing.JLabel();
        btn_editBook = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        input_type = new javax.swing.JComboBox<>();
        panel_pclave_desc_temas = new javax.swing.JPanel();
        PalabrasClaveTxtL = new javax.swing.JLabel();
        DescripcionTxtL = new javax.swing.JLabel();
        TemasTxtL = new javax.swing.JLabel();
        CodeBookTxt = new javax.swing.JLabel();
        input_codeBook = new javax.swing.JTextField();
        palabrasClaveL = new javax.swing.JScrollPane();
        inputArea_Pclave = new javax.swing.JTextArea();
        DescripcionL = new javax.swing.JScrollPane();
        inputArea_desc = new javax.swing.JTextArea();
        TemasL = new javax.swing.JScrollPane();
        inputArea_temas = new javax.swing.JTextArea();
        panel_digital = new javax.swing.JPanel();
        LibroDigitalTxt = new javax.swing.JLabel();
        AutorTxtD = new javax.swing.JLabel();
        input_autorD = new javax.swing.JTextField();
        AñoPublicacionTxtD = new javax.swing.JLabel();
        input_yearD = new javax.swing.JTextField();
        TituloTxtD = new javax.swing.JLabel();
        input_tituloD = new javax.swing.JTextField();
        EdicionTxtD = new javax.swing.JLabel();
        input_edicionD = new javax.swing.JTextField();
        TamañoTxtD = new javax.swing.JLabel();
        input_filesizeD = new javax.swing.JTextField();
        input_filesieType = new javax.swing.JComboBox<>();
        panel_libro = new javax.swing.JPanel();
        LibrosTxtL = new javax.swing.JLabel();
        AutorTxtL = new javax.swing.JLabel();
        input_autorL = new javax.swing.JTextField();
        AñoPublicacionTxtL = new javax.swing.JLabel();
        input_yearL = new javax.swing.JTextField();
        ISBNTxtL = new javax.swing.JLabel();
        input_isbnL = new javax.swing.JTextField();
        TituloTxtL = new javax.swing.JLabel();
        input_tituloL = new javax.swing.JTextField();
        EdicionTxtL = new javax.swing.JLabel();
        input_edicionL = new javax.swing.JTextField();
        CopiasTxtL = new javax.swing.JLabel();
        input_copiasL = new javax.swing.JTextField();
        DisponiblesTxtL = new javax.swing.JLabel();
        input_disponiblesL = new javax.swing.JTextField();
        panel_revista = new javax.swing.JPanel();
        RevistasTxtR = new javax.swing.JLabel();
        AutorTxtR = new javax.swing.JLabel();
        input_autorR = new javax.swing.JTextField();
        AñoPublicacionTxtR = new javax.swing.JLabel();
        input_yearR = new javax.swing.JTextField();
        TituloTxtR = new javax.swing.JLabel();
        input_tituloR = new javax.swing.JTextField();
        EdicionTxtR = new javax.swing.JLabel();
        input_edicionR = new javax.swing.JTextField();
        CategoriaTxtR = new javax.swing.JLabel();
        input_categoriaR = new javax.swing.JTextField();
        EjemplaresTxtR1 = new javax.swing.JLabel();
        input_ejemplaresR = new javax.swing.JTextField();
        CopiasTxtR = new javax.swing.JLabel();
        input_copiasR = new javax.swing.JTextField();
        DisponiblesTxtR = new javax.swing.JLabel();
        input_disponiblesR = new javax.swing.JTextField();
        panel_tesis = new javax.swing.JPanel();
        TesisTxtT = new javax.swing.JLabel();
        AutorTxtT = new javax.swing.JLabel();
        input_autorT = new javax.swing.JTextField();
        AñoPublicacionTxtT = new javax.swing.JLabel();
        input_yearT = new javax.swing.JTextField();
        TituloTxtT = new javax.swing.JLabel();
        input_tituloT = new javax.swing.JTextField();
        AreaTxtT = new javax.swing.JLabel();
        input_areaT = new javax.swing.JTextField();
        EdicionTxtT = new javax.swing.JLabel();
        input_edicionT = new javax.swing.JTextField();
        CopiasTxtT = new javax.swing.JLabel();
        input_copiasT = new javax.swing.JTextField();
        DisponiblesTxtT = new javax.swing.JLabel();
        input_disponiblesT = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nuevo Libro");
        setResizable(false);

        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_tipo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon_newBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/book_add.png"))); // NOI18N
        panel_tipo.add(icon_newBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 25, -1, -1));

        TipoTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TipoTxt.setForeground(java.awt.Color.white);
        TipoTxt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TipoTxt.setText("Tipo");
        TipoTxt.setPreferredSize(new java.awt.Dimension(80, 30));
        panel_tipo.add(TipoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        btn_editBook.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_editBook.setForeground(java.awt.Color.white);
        btn_editBook.setText("Editar");
        btn_editBook.setPreferredSize(new java.awt.Dimension(110, 40));
        btn_editBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editBookActionPerformed(evt);
            }
        });
        panel_tipo.add(btn_editBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 30, -1, -1));

        btn_cancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cancel.setForeground(java.awt.Color.white);
        btn_cancel.setText("Cancelar");
        btn_cancel.setPreferredSize(new java.awt.Dimension(110, 40));
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        panel_tipo.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, -1, -1));

        jSeparator1.setPreferredSize(new java.awt.Dimension(1000, 3));
        panel_tipo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 147, -1, -1));

        input_type.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        input_type.setForeground(java.awt.Color.white);
        input_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libro", "Revista", "Tesis", "Digital" }));
        input_type.setEnabled(false);
        input_type.setPreferredSize(new java.awt.Dimension(300, 30));
        input_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_typeActionPerformed(evt);
            }
        });
        panel_tipo.add(input_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 75, -1, -1));

        background.add(panel_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panel_pclave_desc_temas.setPreferredSize(new java.awt.Dimension(550, 550));
        panel_pclave_desc_temas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PalabrasClaveTxtL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PalabrasClaveTxtL.setForeground(java.awt.Color.white);
        PalabrasClaveTxtL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PalabrasClaveTxtL.setText("Palabras clave");
        PalabrasClaveTxtL.setPreferredSize(new java.awt.Dimension(140, 30));
        panel_pclave_desc_temas.add(PalabrasClaveTxtL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        DescripcionTxtL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DescripcionTxtL.setForeground(java.awt.Color.white);
        DescripcionTxtL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        DescripcionTxtL.setText("Descripcion");
        DescripcionTxtL.setPreferredSize(new java.awt.Dimension(140, 30));
        panel_pclave_desc_temas.add(DescripcionTxtL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        TemasTxtL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TemasTxtL.setForeground(java.awt.Color.white);
        TemasTxtL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TemasTxtL.setText("Temas");
        TemasTxtL.setPreferredSize(new java.awt.Dimension(140, 30));
        panel_pclave_desc_temas.add(TemasTxtL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        CodeBookTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CodeBookTxt.setForeground(java.awt.Color.white);
        CodeBookTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CodeBookTxt.setText("CodeBook");
        CodeBookTxt.setPreferredSize(new java.awt.Dimension(140, 30));
        panel_pclave_desc_temas.add(CodeBookTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        input_codeBook.setEditable(false);
        input_codeBook.setForeground(java.awt.Color.white);
        input_codeBook.setFocusable(false);
        input_codeBook.setPreferredSize(new java.awt.Dimension(250, 30));
        input_codeBook.setRequestFocusEnabled(false);
        panel_pclave_desc_temas.add(input_codeBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, -1, -1));

        palabrasClaveL.setPreferredSize(new java.awt.Dimension(250, 100));

        inputArea_Pclave.setColumns(20);
        inputArea_Pclave.setForeground(java.awt.Color.white);
        inputArea_Pclave.setLineWrap(true);
        inputArea_Pclave.setRows(5);
        inputArea_Pclave.setTabSize(0);
        palabrasClaveL.setViewportView(inputArea_Pclave);

        panel_pclave_desc_temas.add(palabrasClaveL, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        DescripcionL.setPreferredSize(new java.awt.Dimension(250, 100));

        inputArea_desc.setColumns(20);
        inputArea_desc.setForeground(java.awt.Color.white);
        inputArea_desc.setLineWrap(true);
        inputArea_desc.setRows(5);
        inputArea_desc.setTabSize(0);
        DescripcionL.setViewportView(inputArea_desc);

        panel_pclave_desc_temas.add(DescripcionL, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        TemasL.setPreferredSize(new java.awt.Dimension(250, 100));

        inputArea_temas.setColumns(20);
        inputArea_temas.setForeground(java.awt.Color.white);
        inputArea_temas.setLineWrap(true);
        inputArea_temas.setRows(5);
        inputArea_temas.setTabSize(0);
        TemasL.setViewportView(inputArea_temas);

        panel_pclave_desc_temas.add(TemasL, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        background.add(panel_pclave_desc_temas, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));

        panel_digital.setPreferredSize(new java.awt.Dimension(450, 550));
        panel_digital.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LibroDigitalTxt.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LibroDigitalTxt.setForeground(java.awt.Color.white);
        LibroDigitalTxt.setText("Libro Digital");
        panel_digital.add(LibroDigitalTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        AutorTxtD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AutorTxtD.setForeground(java.awt.Color.white);
        AutorTxtD.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        AutorTxtD.setText("Autor");
        AutorTxtD.setPreferredSize(new java.awt.Dimension(140, 30));
        panel_digital.add(AutorTxtD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, -1));

        input_autorD.setForeground(java.awt.Color.white);
        input_autorD.setPreferredSize(new java.awt.Dimension(250, 30));
        panel_digital.add(input_autorD, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        AñoPublicacionTxtD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AñoPublicacionTxtD.setForeground(java.awt.Color.white);
        AñoPublicacionTxtD.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        AñoPublicacionTxtD.setText("Año Publicacion");
        AñoPublicacionTxtD.setPreferredSize(new java.awt.Dimension(140, 30));
        panel_digital.add(AñoPublicacionTxtD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));

        input_yearD.setForeground(java.awt.Color.white);
        input_yearD.setPreferredSize(new java.awt.Dimension(250, 30));
        input_yearD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_yearDKeyTyped(evt);
            }
        });
        panel_digital.add(input_yearD, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        TituloTxtD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TituloTxtD.setForeground(java.awt.Color.white);
        TituloTxtD.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TituloTxtD.setText("Titulo");
        TituloTxtD.setPreferredSize(new java.awt.Dimension(140, 30));
        panel_digital.add(TituloTxtD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, -1));

        input_tituloD.setForeground(java.awt.Color.white);
        input_tituloD.setPreferredSize(new java.awt.Dimension(250, 30));
        panel_digital.add(input_tituloD, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        EdicionTxtD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EdicionTxtD.setForeground(java.awt.Color.white);
        EdicionTxtD.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        EdicionTxtD.setText("Edicion");
        EdicionTxtD.setPreferredSize(new java.awt.Dimension(140, 30));
        panel_digital.add(EdicionTxtD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, -1));

        input_edicionD.setForeground(java.awt.Color.white);
        input_edicionD.setPreferredSize(new java.awt.Dimension(250, 30));
        input_edicionD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_edicionDKeyTyped(evt);
            }
        });
        panel_digital.add(input_edicionD, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        TamañoTxtD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TamañoTxtD.setForeground(java.awt.Color.white);
        TamañoTxtD.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TamañoTxtD.setText("Tamaño");
        TamañoTxtD.setPreferredSize(new java.awt.Dimension(140, 30));
        panel_digital.add(TamañoTxtD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, -1, -1));

        input_filesizeD.setForeground(java.awt.Color.white);
        input_filesizeD.setPreferredSize(new java.awt.Dimension(250, 30));
        input_filesizeD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_filesizeDKeyTyped(evt);
            }
        });
        panel_digital.add(input_filesizeD, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 190, -1));

        input_filesieType.setForeground(java.awt.Color.white);
        input_filesieType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MB", "GB" }));
        panel_digital.add(input_filesieType, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 60, 30));

        background.add(panel_digital, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

        panel_libro.setPreferredSize(new java.awt.Dimension(450, 550));
        panel_libro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LibrosTxtL.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LibrosTxtL.setForeground(java.awt.Color.white);
        LibrosTxtL.setText("Libro");
        panel_libro.add(LibrosTxtL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        AutorTxtL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AutorTxtL.setForeground(java.awt.Color.white);
        AutorTxtL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        AutorTxtL.setText("Autor");
        AutorTxtL.setPreferredSize(new java.awt.Dimension(140, 30));
        panel_libro.add(AutorTxtL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, -1));

        input_autorL.setForeground(java.awt.Color.white);
        input_autorL.setPreferredSize(new java.awt.Dimension(250, 30));
        panel_libro.add(input_autorL, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        AñoPublicacionTxtL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AñoPublicacionTxtL.setForeground(java.awt.Color.white);
        AñoPublicacionTxtL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        AñoPublicacionTxtL.setText("Año Publicacion");
        AñoPublicacionTxtL.setPreferredSize(new java.awt.Dimension(140, 30));
        panel_libro.add(AñoPublicacionTxtL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));

        input_yearL.setForeground(java.awt.Color.white);
        input_yearL.setPreferredSize(new java.awt.Dimension(250, 30));
        input_yearL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_yearLKeyTyped(evt);
            }
        });
        panel_libro.add(input_yearL, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        ISBNTxtL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ISBNTxtL.setForeground(java.awt.Color.white);
        ISBNTxtL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ISBNTxtL.setText("ISBN");
        ISBNTxtL.setPreferredSize(new java.awt.Dimension(140, 30));
        panel_libro.add(ISBNTxtL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, -1));

        input_isbnL.setForeground(java.awt.Color.white);
        input_isbnL.setPreferredSize(new java.awt.Dimension(250, 30));
        input_isbnL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_isbnLKeyTyped(evt);
            }
        });
        panel_libro.add(input_isbnL, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        TituloTxtL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TituloTxtL.setForeground(java.awt.Color.white);
        TituloTxtL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TituloTxtL.setText("Titulo");
        TituloTxtL.setPreferredSize(new java.awt.Dimension(140, 30));
        panel_libro.add(TituloTxtL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, -1));

        input_tituloL.setForeground(java.awt.Color.white);
        input_tituloL.setPreferredSize(new java.awt.Dimension(250, 30));
        panel_libro.add(input_tituloL, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        EdicionTxtL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EdicionTxtL.setForeground(java.awt.Color.white);
        EdicionTxtL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        EdicionTxtL.setText("Edicion");
        EdicionTxtL.setPreferredSize(new java.awt.Dimension(140, 30));
        panel_libro.add(EdicionTxtL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, -1, -1));

        input_edicionL.setForeground(java.awt.Color.white);
        input_edicionL.setPreferredSize(new java.awt.Dimension(250, 30));
        input_edicionL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_edicionLKeyTyped(evt);
            }
        });
        panel_libro.add(input_edicionL, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        CopiasTxtL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CopiasTxtL.setForeground(java.awt.Color.white);
        CopiasTxtL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CopiasTxtL.setText("Copias");
        CopiasTxtL.setPreferredSize(new java.awt.Dimension(140, 30));
        panel_libro.add(CopiasTxtL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, -1, -1));

        input_copiasL.setForeground(java.awt.Color.white);
        input_copiasL.setPreferredSize(new java.awt.Dimension(250, 30));
        input_copiasL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_copiasLKeyTyped(evt);
            }
        });
        panel_libro.add(input_copiasL, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        DisponiblesTxtL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DisponiblesTxtL.setForeground(java.awt.Color.white);
        DisponiblesTxtL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        DisponiblesTxtL.setText("Disponibles");
        DisponiblesTxtL.setPreferredSize(new java.awt.Dimension(140, 30));
        panel_libro.add(DisponiblesTxtL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, -1, -1));

        input_disponiblesL.setForeground(java.awt.Color.white);
        input_disponiblesL.setPreferredSize(new java.awt.Dimension(250, 30));
        input_disponiblesL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_disponiblesLKeyTyped(evt);
            }
        });
        panel_libro.add(input_disponiblesL, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, -1));

        background.add(panel_libro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

        panel_revista.setPreferredSize(new java.awt.Dimension(450, 550));
        panel_revista.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RevistasTxtR.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        RevistasTxtR.setForeground(java.awt.Color.white);
        RevistasTxtR.setText("Revista");
        panel_revista.add(RevistasTxtR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        AutorTxtR.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AutorTxtR.setForeground(java.awt.Color.white);
        AutorTxtR.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        AutorTxtR.setText("Autor");
        AutorTxtR.setPreferredSize(new java.awt.Dimension(140, 30));
        panel_revista.add(AutorTxtR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, -1));

        input_autorR.setForeground(java.awt.Color.white);
        input_autorR.setPreferredSize(new java.awt.Dimension(250, 30));
        panel_revista.add(input_autorR, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        AñoPublicacionTxtR.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AñoPublicacionTxtR.setForeground(java.awt.Color.white);
        AñoPublicacionTxtR.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        AñoPublicacionTxtR.setText("Año Publicacion");
        AñoPublicacionTxtR.setPreferredSize(new java.awt.Dimension(140, 30));
        panel_revista.add(AñoPublicacionTxtR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));

        input_yearR.setForeground(java.awt.Color.white);
        input_yearR.setPreferredSize(new java.awt.Dimension(250, 30));
        input_yearR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_yearRKeyTyped(evt);
            }
        });
        panel_revista.add(input_yearR, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        TituloTxtR.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TituloTxtR.setForeground(java.awt.Color.white);
        TituloTxtR.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TituloTxtR.setText("Titulo");
        TituloTxtR.setPreferredSize(new java.awt.Dimension(140, 30));
        panel_revista.add(TituloTxtR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, -1));

        input_tituloR.setForeground(java.awt.Color.white);
        input_tituloR.setPreferredSize(new java.awt.Dimension(250, 30));
        panel_revista.add(input_tituloR, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        EdicionTxtR.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EdicionTxtR.setForeground(java.awt.Color.white);
        EdicionTxtR.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        EdicionTxtR.setText("Edicion");
        EdicionTxtR.setPreferredSize(new java.awt.Dimension(140, 30));
        panel_revista.add(EdicionTxtR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, -1));

        input_edicionR.setForeground(java.awt.Color.white);
        input_edicionR.setPreferredSize(new java.awt.Dimension(250, 30));
        input_edicionR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_edicionRKeyTyped(evt);
            }
        });
        panel_revista.add(input_edicionR, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        CategoriaTxtR.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CategoriaTxtR.setForeground(java.awt.Color.white);
        CategoriaTxtR.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CategoriaTxtR.setText("Categoria");
        CategoriaTxtR.setPreferredSize(new java.awt.Dimension(140, 30));
        panel_revista.add(CategoriaTxtR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, -1, -1));

        input_categoriaR.setForeground(java.awt.Color.white);
        input_categoriaR.setPreferredSize(new java.awt.Dimension(250, 30));
        panel_revista.add(input_categoriaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        EjemplaresTxtR1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EjemplaresTxtR1.setForeground(java.awt.Color.white);
        EjemplaresTxtR1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        EjemplaresTxtR1.setText("Ejemplares");
        EjemplaresTxtR1.setPreferredSize(new java.awt.Dimension(140, 30));
        panel_revista.add(EjemplaresTxtR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, -1, -1));

        input_ejemplaresR.setForeground(java.awt.Color.white);
        input_ejemplaresR.setPreferredSize(new java.awt.Dimension(250, 30));
        input_ejemplaresR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_ejemplaresRKeyTyped(evt);
            }
        });
        panel_revista.add(input_ejemplaresR, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        CopiasTxtR.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CopiasTxtR.setForeground(java.awt.Color.white);
        CopiasTxtR.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CopiasTxtR.setText("Copias");
        CopiasTxtR.setPreferredSize(new java.awt.Dimension(140, 30));
        panel_revista.add(CopiasTxtR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, -1, -1));

        input_copiasR.setForeground(java.awt.Color.white);
        input_copiasR.setPreferredSize(new java.awt.Dimension(250, 30));
        input_copiasR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_copiasRKeyTyped(evt);
            }
        });
        panel_revista.add(input_copiasR, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, -1));

        DisponiblesTxtR.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DisponiblesTxtR.setForeground(java.awt.Color.white);
        DisponiblesTxtR.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        DisponiblesTxtR.setText("Disponibles");
        DisponiblesTxtR.setPreferredSize(new java.awt.Dimension(140, 30));
        panel_revista.add(DisponiblesTxtR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, -1, -1));

        input_disponiblesR.setForeground(java.awt.Color.white);
        input_disponiblesR.setPreferredSize(new java.awt.Dimension(250, 30));
        input_disponiblesR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_disponiblesRKeyTyped(evt);
            }
        });
        panel_revista.add(input_disponiblesR, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, -1, -1));

        background.add(panel_revista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

        panel_tesis.setPreferredSize(new java.awt.Dimension(450, 550));
        panel_tesis.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TesisTxtT.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TesisTxtT.setForeground(java.awt.Color.white);
        TesisTxtT.setText("Tesis");
        panel_tesis.add(TesisTxtT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        AutorTxtT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AutorTxtT.setForeground(java.awt.Color.white);
        AutorTxtT.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        AutorTxtT.setText("Autor");
        AutorTxtT.setPreferredSize(new java.awt.Dimension(140, 30));
        panel_tesis.add(AutorTxtT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, -1));

        input_autorT.setForeground(java.awt.Color.white);
        input_autorT.setPreferredSize(new java.awt.Dimension(250, 30));
        panel_tesis.add(input_autorT, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        AñoPublicacionTxtT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AñoPublicacionTxtT.setForeground(java.awt.Color.white);
        AñoPublicacionTxtT.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        AñoPublicacionTxtT.setText("Año Publicacion");
        AñoPublicacionTxtT.setPreferredSize(new java.awt.Dimension(140, 30));
        panel_tesis.add(AñoPublicacionTxtT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));

        input_yearT.setForeground(java.awt.Color.white);
        input_yearT.setPreferredSize(new java.awt.Dimension(250, 30));
        input_yearT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_yearTKeyTyped(evt);
            }
        });
        panel_tesis.add(input_yearT, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        TituloTxtT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TituloTxtT.setForeground(java.awt.Color.white);
        TituloTxtT.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TituloTxtT.setText("Titulo");
        TituloTxtT.setPreferredSize(new java.awt.Dimension(140, 30));
        panel_tesis.add(TituloTxtT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, -1));

        input_tituloT.setForeground(java.awt.Color.white);
        input_tituloT.setPreferredSize(new java.awt.Dimension(250, 30));
        panel_tesis.add(input_tituloT, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        AreaTxtT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AreaTxtT.setForeground(java.awt.Color.white);
        AreaTxtT.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        AreaTxtT.setText("Area");
        AreaTxtT.setPreferredSize(new java.awt.Dimension(140, 30));
        panel_tesis.add(AreaTxtT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, -1));

        input_areaT.setForeground(java.awt.Color.white);
        input_areaT.setPreferredSize(new java.awt.Dimension(250, 30));
        panel_tesis.add(input_areaT, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        EdicionTxtT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EdicionTxtT.setForeground(java.awt.Color.white);
        EdicionTxtT.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        EdicionTxtT.setText("Edicion");
        EdicionTxtT.setPreferredSize(new java.awt.Dimension(140, 30));
        panel_tesis.add(EdicionTxtT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, -1, -1));

        input_edicionT.setForeground(java.awt.Color.white);
        input_edicionT.setPreferredSize(new java.awt.Dimension(250, 30));
        input_edicionT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_edicionTKeyTyped(evt);
            }
        });
        panel_tesis.add(input_edicionT, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        CopiasTxtT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CopiasTxtT.setForeground(java.awt.Color.white);
        CopiasTxtT.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CopiasTxtT.setText("Copias");
        CopiasTxtT.setPreferredSize(new java.awt.Dimension(140, 30));
        panel_tesis.add(CopiasTxtT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, -1, -1));

        input_copiasT.setForeground(java.awt.Color.white);
        input_copiasT.setPreferredSize(new java.awt.Dimension(250, 30));
        input_copiasT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_copiasTKeyTyped(evt);
            }
        });
        panel_tesis.add(input_copiasT, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        DisponiblesTxtT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DisponiblesTxtT.setForeground(java.awt.Color.white);
        DisponiblesTxtT.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        DisponiblesTxtT.setText("Disponibles");
        DisponiblesTxtT.setPreferredSize(new java.awt.Dimension(140, 30));
        panel_tesis.add(DisponiblesTxtT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, -1, -1));

        input_disponiblesT.setForeground(java.awt.Color.white);
        input_disponiblesT.setPreferredSize(new java.awt.Dimension(250, 30));
        input_disponiblesT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_disponiblesTKeyTyped(evt);
            }
        });
        panel_tesis.add(input_disponiblesT, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, -1));

        background.add(panel_tesis, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

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

    private void btn_editBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editBookActionPerformed
        AdminBooks adminBooks = new AdminBooks();
        int tipo = input_type.getSelectedIndex();
        if (tipo == 0) {
            editLibro();
        } else if (tipo == 1) {
            editRevista();
        } else if (tipo == 2) {
            editTesis();
        } else if (tipo == 3) {
            editDigital();
        }
    }//GEN-LAST:event_btn_editBookActionPerformed

    private void editLibro() {
        AdminBooks adminBooks = new AdminBooks();

        String desc = inputArea_desc.getText();
        String _pclave = inputArea_Pclave.getText();
        String _temas = inputArea_temas.getText();

        String[] pclave = _pclave.split(",");
        String[] tema = _temas.split(",");

        String autor = input_autorL.getText();
        String year = input_yearL.getText();
        String _isbn = input_isbnL.getText();
        long isbn = Long.parseLong(_isbn);
        String titulo = input_tituloL.getText();
        String edicion = input_edicionL.getText();
        String _copias = input_copiasL.getText();
        String _disponibles = input_disponiblesL.getText();

        if (desc.isBlank() || _pclave.isBlank() || _temas.isBlank() || autor.isBlank() || year.isBlank() || _isbn.isBlank() || titulo.isBlank() || edicion.isBlank() || _copias.isBlank() || _disponibles.isBlank()) {
            JOptionPane.showMessageDialog(null, "No puede dejar campos vacios");
        } else {
            int copias = Integer.parseInt(_copias);
            int disponibles = Integer.parseInt(_disponibles);
            // ACTUALIZA LA BASE DE DATOS DE BOOKS
            adminBooks.booksDB[codeBooks].setTitulo(titulo);
            adminBooks.booksDB[codeBooks].setAutor(autor);
            adminBooks.booksDB[codeBooks].setDesc(desc);
            adminBooks.booksDB[codeBooks].setYear(year);
            adminBooks.booksDB[codeBooks].setP_clave(pclave);
            adminBooks.booksDB[codeBooks].setEdicion(edicion);
            adminBooks.booksDB[codeBooks].setCopias(copias);
            adminBooks.booksDB[codeBooks].setDisponibles(disponibles);
            adminBooks.booksDB[codeBooks].setTemas(tema);

            // ACTUALIZA LA BASE DE DATOS DE LIBROS
            adminBooks.librosDB[codeLibro].setAutor(autor);
            adminBooks.librosDB[codeLibro].setYear(year);
            adminBooks.librosDB[codeLibro].setIsbn(isbn);
            adminBooks.librosDB[codeLibro].setTitulo(titulo);
            adminBooks.librosDB[codeLibro].setEdicion(edicion);
            adminBooks.librosDB[codeLibro].setCopias(copias);
            adminBooks.librosDB[codeLibro].setDisponibles(disponibles);
            adminBooks.librosDB[codeLibro].setP_clave(pclave);
            adminBooks.librosDB[codeLibro].setDesc(desc);
            adminBooks.librosDB[codeLibro].setTemas(tema);

            adminBooks.refresh();
            this.dispose();
            adminBooks.setVisible(true);
        }

    }

    private void editRevista() {
        AdminBooks adminBooks = new AdminBooks();

        String desc = inputArea_desc.getText();
        String _pclave = inputArea_Pclave.getText();
        String _temas = inputArea_temas.getText();

        String[] pclave = _pclave.split(",");
        String[] tema = _temas.split(",");

        String autor = input_autorR.getText();
        String year = input_yearR.getText();
        String titulo = input_tituloR.getText();
        String edicion = input_edicionR.getText();
        String categoria = input_categoriaR.getText();
        String ejemplares = input_ejemplaresR.getText();
        String _copias = input_copiasR.getText();
        String _disponibles = input_disponiblesR.getText();

        if (desc.isBlank() || _pclave.isBlank() || _temas.isBlank() || autor.isBlank() || year.isBlank() || categoria.isBlank() || ejemplares.isBlank() || titulo.isBlank() || edicion.isBlank() || _copias.isBlank() || _disponibles.isBlank()) {
            JOptionPane.showMessageDialog(null, "No puede dejar campos vacios");
        } else {
            int copias = Integer.parseInt(_copias);
            int disponibles = Integer.parseInt(_disponibles);
            // ACTUALIZA LA BASE DE DATOS DE BOOKS
            adminBooks.booksDB[codeBooks].setTitulo(titulo);
            adminBooks.booksDB[codeBooks].setAutor(autor);
            adminBooks.booksDB[codeBooks].setDesc(desc);
            adminBooks.booksDB[codeBooks].setYear(year);
            adminBooks.booksDB[codeBooks].setP_clave(pclave);
            adminBooks.booksDB[codeBooks].setEdicion(edicion);
            adminBooks.booksDB[codeBooks].setCopias(copias);
            adminBooks.booksDB[codeBooks].setDisponibles(disponibles);
            adminBooks.booksDB[codeBooks].setTemas(tema);

            // ACTUALIZA LA BASE DE DATOS DE REVISTAS
            adminBooks.revistasDB[codeRevista].setAutor(autor);
            adminBooks.revistasDB[codeRevista].setYear(year);
            adminBooks.revistasDB[codeRevista].setTitulo(titulo);
            adminBooks.revistasDB[codeRevista].setEdicion(edicion);
            adminBooks.revistasDB[codeRevista].setCategoria(categoria);
            adminBooks.revistasDB[codeRevista].setEjemplares(ejemplares);
            adminBooks.revistasDB[codeRevista].setCopias(copias);
            adminBooks.revistasDB[codeRevista].setDisponibles(disponibles);
            adminBooks.revistasDB[codeRevista].setP_clave(pclave);
            adminBooks.revistasDB[codeRevista].setDesc(desc);
            adminBooks.revistasDB[codeRevista].setTemas(tema);

            adminBooks.refresh();
            this.dispose();
            adminBooks.setVisible(true);
        }

    }

    private void editTesis() {
        AdminBooks adminBooks = new AdminBooks();

        String desc = inputArea_desc.getText();
        String _pclave = inputArea_Pclave.getText();
        String _temas = inputArea_temas.getText();

        String[] pclave = _pclave.split(",");
        String[] tema = _temas.split(",");

        String autor = input_autorT.getText();
        String year = input_yearT.getText();
        String titulo = input_tituloT.getText();
        String area = input_areaT.getText();
        String edicion = input_edicionT.getText();
        String _copias = input_copiasT.getText();
        String _disponibles = input_disponiblesT.getText();

        if (desc.isBlank() || _pclave.isBlank() || _temas.isBlank() || autor.isBlank() || year.isBlank() || area.isBlank() || titulo.isBlank() || edicion.isBlank() || _copias.isBlank() || _disponibles.isBlank()) {
            JOptionPane.showMessageDialog(null, "No puede dejar todos los campos vacios");
        } else {
            int copias = Integer.parseInt(_copias);
            int disponibles = Integer.parseInt(_disponibles);

            // ACTUALIZA LA BASE DE DATOS DE BOOKS
            adminBooks.booksDB[codeBooks].setTitulo(titulo);
            adminBooks.booksDB[codeBooks].setAutor(autor);
            adminBooks.booksDB[codeBooks].setDesc(desc);
            adminBooks.booksDB[codeBooks].setYear(year);
            adminBooks.booksDB[codeBooks].setP_clave(pclave);
            adminBooks.booksDB[codeBooks].setEdicion(edicion);
            adminBooks.booksDB[codeBooks].setCopias(copias);
            adminBooks.booksDB[codeBooks].setDisponibles(disponibles);
            adminBooks.booksDB[codeBooks].setTemas(tema);

            // ACTUALIZAR LA BASE DE DATOS DE TESIS
            adminBooks.tesisDB[codeTesis].setAutor(autor);
            adminBooks.tesisDB[codeTesis].setYear(year);
            adminBooks.tesisDB[codeTesis].setTitulo(titulo);
            adminBooks.tesisDB[codeTesis].setArea(area);
            adminBooks.tesisDB[codeTesis].setEdicion(edicion);
            adminBooks.tesisDB[codeTesis].setCopias(copias);
            adminBooks.tesisDB[codeTesis].setDisponibles(disponibles);
            adminBooks.tesisDB[codeTesis].setP_clave(pclave);
            adminBooks.tesisDB[codeTesis].setDesc(desc);
            adminBooks.tesisDB[codeTesis].setTemas(tema);

            adminBooks.refresh();
            this.dispose();
            adminBooks.setVisible(true);
        }
    }

    private void editDigital() {
        AdminBooks adminBooks = new AdminBooks();

        String desc = inputArea_desc.getText();
        String _pclave = inputArea_Pclave.getText();
        String _temas = inputArea_temas.getText();

        String[] pclave = _pclave.split(",");
        String[] tema = _temas.split(",");

        String autor = input_autorD.getText();
        String year = input_yearD.getText();
        String titulo = input_tituloD.getText();
        String edicion = input_edicionD.getText();
        String filesize_ = input_filesizeD.getText();
        char[] filesizeNum_ = filesize_.toCharArray();
        String numFilesize = "";
        for (int i = 0; i < filesizeNum_.length; i++) {
            if (Character.isDigit(filesizeNum_[i])) {
                numFilesize += filesizeNum_[i];
            }
        }
        String filesize2 = (String) input_filesieType.getSelectedItem();

        if (desc.isBlank() || _pclave.isBlank() || _temas.isBlank() || autor.isBlank() || year.isBlank() || filesize_.isBlank() || titulo.isBlank() || edicion.isBlank()) {
            JOptionPane.showMessageDialog(null, "No puede dejar todos los campos vacios");
        } else {
            // ACTUALIZA LA BASE DE DATOS DE BOOKS
            adminBooks.booksDB[codeBooks].setTitulo(titulo);
            adminBooks.booksDB[codeBooks].setAutor(autor);
            adminBooks.booksDB[codeBooks].setDesc(desc);
            adminBooks.booksDB[codeBooks].setYear(year);
            adminBooks.booksDB[codeBooks].setP_clave(pclave);
            adminBooks.booksDB[codeBooks].setEdicion(edicion);
            adminBooks.booksDB[codeBooks].setTemas(tema);

            // ACTUALIZAR LA BASE DE DATOS DE DIGITAL
            adminBooks.digitalesDB[codeDigital].setAutor(autor);
            adminBooks.digitalesDB[codeDigital].setYear(year);
            adminBooks.digitalesDB[codeDigital].setTitulo(titulo);
            adminBooks.digitalesDB[codeDigital].setEdicion(edicion);
            adminBooks.digitalesDB[codeDigital].setFileSize(numFilesize + " " + filesize2);
            adminBooks.digitalesDB[codeDigital].setP_clave(pclave);
            adminBooks.digitalesDB[codeDigital].setDesc(desc);
            adminBooks.digitalesDB[codeDigital].setTemas(tema);

            adminBooks.refresh();
            this.dispose();
            adminBooks.setVisible(true);
        }
    }

    public void DataLibro() {
        AdminBooks adminBooks = new AdminBooks();
        if (adminBooks.librosDB[codeLibro] != null) {
            input_autorL.setText(adminBooks.librosDB[codeLibro].getAutor());
            input_yearL.setText(String.valueOf(adminBooks.librosDB[codeLibro].getYear()));
            input_isbnL.setText(String.valueOf(adminBooks.librosDB[codeLibro].getIsbn()));
            input_tituloL.setText(adminBooks.librosDB[codeLibro].getTitulo());
            input_edicionL.setText(String.valueOf(adminBooks.librosDB[codeLibro].getEdicion()));
            input_copiasL.setText(String.valueOf(adminBooks.librosDB[codeLibro].getCopias()));
            input_disponiblesL.setText(String.valueOf(adminBooks.librosDB[codeLibro].getDisponibles()));

            String[] _pclave = adminBooks.librosDB[codeLibro].getP_clave();
            String pclave = String.join(",", _pclave);
            inputArea_Pclave.setText(pclave);
            inputArea_desc.setText(adminBooks.librosDB[codeLibro].getDesc());
            String[] _temas = adminBooks.librosDB[codeLibro].getTemas();
            String temas = String.join(",", _temas);
            inputArea_temas.setText(temas);
            input_codeBook.setText(adminBooks.booksDB[codeLibro].getCodeBook());
        }
    }

    public void DataRevista() {
        AdminBooks adminBooks = new AdminBooks();
        if (adminBooks.revistasDB[codeRevista] != null) {
            input_autorR.setText(adminBooks.revistasDB[codeRevista].getAutor());
            input_yearR.setText(String.valueOf(adminBooks.revistasDB[codeRevista].getYear()));
            input_tituloR.setText(adminBooks.revistasDB[codeRevista].getTitulo());
            input_edicionR.setText(String.valueOf(adminBooks.revistasDB[codeRevista].getEdicion()));
            input_categoriaR.setText(adminBooks.revistasDB[codeRevista].getCategoria());
            input_ejemplaresR.setText(String.valueOf(adminBooks.revistasDB[codeRevista].getEjemplares()));
            input_copiasR.setText(String.valueOf(adminBooks.revistasDB[codeRevista].getCopias()));
            input_disponiblesR.setText(String.valueOf(adminBooks.revistasDB[codeRevista].getDisponibles()));

            String[] _pclave = adminBooks.revistasDB[codeRevista].getP_clave();
            String pclave = String.join(" ,", _pclave);
            inputArea_Pclave.setText(pclave);
            inputArea_desc.setText(adminBooks.revistasDB[codeRevista].getDesc());
            String[] _temas = adminBooks.revistasDB[codeRevista].getTemas();
            String temas = String.join(" ,", _temas);
            inputArea_temas.setText(temas);
            input_codeBook.setText(adminBooks.revistasDB[codeRevista].getCodeBook());
        }

    }

    public void DataTesis() {
        AdminBooks adminBooks = new AdminBooks();
        if (adminBooks.tesisDB[codeTesis] != null) {
            input_autorT.setText(adminBooks.tesisDB[codeTesis].getAutor());
            input_yearT.setText(String.valueOf(adminBooks.tesisDB[codeTesis].getYear()));
            input_tituloT.setText(adminBooks.tesisDB[codeTesis].getTitulo());
            input_areaT.setText(adminBooks.tesisDB[codeTesis].getArea());
            input_edicionT.setText(String.valueOf(adminBooks.tesisDB[codeTesis].getEdicion()));
            input_copiasT.setText(String.valueOf(adminBooks.tesisDB[codeTesis].getCopias()));
            input_disponiblesT.setText(String.valueOf(adminBooks.tesisDB[codeTesis].getDisponibles()));

            String[] _pclave = adminBooks.tesisDB[codeTesis].getP_clave();
            String pclave = String.join(" ,", _pclave);
            inputArea_Pclave.setText(pclave);
            inputArea_desc.setText(adminBooks.tesisDB[codeTesis].getDesc());
            String[] _temas = adminBooks.tesisDB[codeTesis].getTemas();
            String temas = String.join(" ,", _temas);
            inputArea_temas.setText(temas);
            input_codeBook.setText(adminBooks.tesisDB[codeTesis].getCodeBook());
        }
    }

    public void DataDigital() {
        AdminBooks adminBooks = new AdminBooks();
        if (adminBooks.digitalesDB[codeDigital] != null) {
            input_autorD.setText(adminBooks.digitalesDB[codeDigital].getAutor());
            input_yearD.setText(String.valueOf(adminBooks.digitalesDB[codeDigital].getYear()));
            input_tituloD.setText(adminBooks.digitalesDB[codeDigital].getTitulo());
            input_edicionD.setText(String.valueOf(adminBooks.digitalesDB[codeDigital].getEdicion()));
            String filesize_ = adminBooks.digitalesDB[codeDigital].getFileSize();
            char[] filesizeNum_ = filesize_.toCharArray();
            String numFilesize = "";
            for (int i = 0; i < filesizeNum_.length; i++) {
                if (Character.isDigit(filesizeNum_[i])) {
                    numFilesize += filesizeNum_[i];
                }
            }
            input_filesizeD.setText(numFilesize);
            String[] _pclave = adminBooks.digitalesDB[codeDigital].getP_clave();
            String pclave = String.join(" ,", _pclave);
            inputArea_Pclave.setText(pclave);
            inputArea_desc.setText(adminBooks.digitalesDB[codeDigital].getDesc());
            String[] _temas = adminBooks.digitalesDB[codeDigital].getTemas();
            String temas = String.join(" ,", _temas);
            inputArea_temas.setText(temas);
            input_codeBook.setText(adminBooks.digitalesDB[codeDigital].getCodeBook());
        }
    }


    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        AdminBooks adminBooks = new AdminBooks();
        this.dispose();
        adminBooks.setVisible(true);
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void input_yearLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_yearLKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_input_yearLKeyTyped

    private void input_isbnLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_isbnLKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_input_isbnLKeyTyped

    private void input_edicionLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_edicionLKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_input_edicionLKeyTyped

    private void input_copiasLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_copiasLKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_input_copiasLKeyTyped

    private void input_yearRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_yearRKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_input_yearRKeyTyped

    private void input_edicionRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_edicionRKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_input_edicionRKeyTyped

    private void input_ejemplaresRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_ejemplaresRKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_input_ejemplaresRKeyTyped

    private void input_copiasRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_copiasRKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_input_copiasRKeyTyped

    private void input_yearTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_yearTKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_input_yearTKeyTyped

    private void input_edicionTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_edicionTKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_input_edicionTKeyTyped

    private void input_copiasTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_copiasTKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_input_copiasTKeyTyped

    private void input_yearDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_yearDKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_input_yearDKeyTyped

    private void input_edicionDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_edicionDKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_input_edicionDKeyTyped

    private void input_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_typeActionPerformed
        int typeOption = input_type.getSelectedIndex();
        if (typeOption == 0) {
            panel_libro.setVisible(true);
            panel_pclave_desc_temas.setVisible(true);
            panel_revista.setVisible(false);
            panel_tesis.setVisible(false);
            panel_digital.setVisible(false);
        } else if (typeOption == 1) {
            panel_libro.setVisible(false);

            panel_revista.setVisible(true);
            panel_pclave_desc_temas.setVisible(true);

            panel_tesis.setVisible(false);
            panel_digital.setVisible(false);
        } else if (typeOption == 2) {
            panel_libro.setVisible(false);
            panel_revista.setVisible(false);

            panel_tesis.setVisible(true);
            panel_pclave_desc_temas.setVisible(true);

            panel_digital.setVisible(false);
        } else if (typeOption == 3) {
            panel_libro.setVisible(false);
            panel_revista.setVisible(false);
            panel_tesis.setVisible(false);

            panel_digital.setVisible(true);
            panel_pclave_desc_temas.setVisible(true);
        }
    }//GEN-LAST:event_input_typeActionPerformed

    private void input_disponiblesLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_disponiblesLKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_input_disponiblesLKeyTyped

    private void input_disponiblesRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_disponiblesRKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_input_disponiblesRKeyTyped

    private void input_disponiblesTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_disponiblesTKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_input_disponiblesTKeyTyped

    private void input_filesizeDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_filesizeDKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_input_filesizeDKeyTyped

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
            java.util.logging.Logger.getLogger(EditBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new EditBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AreaTxtT;
    private javax.swing.JLabel AutorTxtD;
    private javax.swing.JLabel AutorTxtL;
    private javax.swing.JLabel AutorTxtR;
    private javax.swing.JLabel AutorTxtT;
    private javax.swing.JLabel AñoPublicacionTxtD;
    private javax.swing.JLabel AñoPublicacionTxtL;
    private javax.swing.JLabel AñoPublicacionTxtR;
    private javax.swing.JLabel AñoPublicacionTxtT;
    private javax.swing.JLabel CategoriaTxtR;
    private javax.swing.JLabel CodeBookTxt;
    private javax.swing.JLabel CopiasTxtL;
    private javax.swing.JLabel CopiasTxtR;
    private javax.swing.JLabel CopiasTxtT;
    private javax.swing.JScrollPane DescripcionL;
    private javax.swing.JLabel DescripcionTxtL;
    private javax.swing.JLabel DisponiblesTxtL;
    private javax.swing.JLabel DisponiblesTxtR;
    private javax.swing.JLabel DisponiblesTxtT;
    private javax.swing.JLabel EdicionTxtD;
    private javax.swing.JLabel EdicionTxtL;
    private javax.swing.JLabel EdicionTxtR;
    private javax.swing.JLabel EdicionTxtT;
    private javax.swing.JLabel EjemplaresTxtR1;
    private javax.swing.JLabel ISBNTxtL;
    private javax.swing.JLabel LibroDigitalTxt;
    private javax.swing.JLabel LibrosTxtL;
    private javax.swing.JLabel PalabrasClaveTxtL;
    private javax.swing.JLabel RevistasTxtR;
    private javax.swing.JLabel TamañoTxtD;
    private javax.swing.JScrollPane TemasL;
    private javax.swing.JLabel TemasTxtL;
    private javax.swing.JLabel TesisTxtT;
    private javax.swing.JLabel TipoTxt;
    private javax.swing.JLabel TituloTxtD;
    private javax.swing.JLabel TituloTxtL;
    private javax.swing.JLabel TituloTxtR;
    private javax.swing.JLabel TituloTxtT;
    private javax.swing.JPanel background;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_editBook;
    private javax.swing.JLabel icon_newBook;
    private javax.swing.JTextArea inputArea_Pclave;
    private javax.swing.JTextArea inputArea_desc;
    private javax.swing.JTextArea inputArea_temas;
    private javax.swing.JTextField input_areaT;
    private javax.swing.JTextField input_autorD;
    private javax.swing.JTextField input_autorL;
    private javax.swing.JTextField input_autorR;
    private javax.swing.JTextField input_autorT;
    private javax.swing.JTextField input_categoriaR;
    private javax.swing.JTextField input_codeBook;
    private javax.swing.JTextField input_copiasL;
    private javax.swing.JTextField input_copiasR;
    private javax.swing.JTextField input_copiasT;
    private javax.swing.JTextField input_disponiblesL;
    private javax.swing.JTextField input_disponiblesR;
    private javax.swing.JTextField input_disponiblesT;
    private javax.swing.JTextField input_edicionD;
    private javax.swing.JTextField input_edicionL;
    private javax.swing.JTextField input_edicionR;
    private javax.swing.JTextField input_edicionT;
    private javax.swing.JTextField input_ejemplaresR;
    private javax.swing.JComboBox<String> input_filesieType;
    private javax.swing.JTextField input_filesizeD;
    private javax.swing.JTextField input_isbnL;
    private javax.swing.JTextField input_tituloD;
    private javax.swing.JTextField input_tituloL;
    private javax.swing.JTextField input_tituloR;
    private javax.swing.JTextField input_tituloT;
    private javax.swing.JComboBox<String> input_type;
    private javax.swing.JTextField input_yearD;
    private javax.swing.JTextField input_yearL;
    private javax.swing.JTextField input_yearR;
    private javax.swing.JTextField input_yearT;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JScrollPane palabrasClaveL;
    private javax.swing.JPanel panel_digital;
    private javax.swing.JPanel panel_libro;
    private javax.swing.JPanel panel_pclave_desc_temas;
    private javax.swing.JPanel panel_revista;
    private javax.swing.JPanel panel_tesis;
    private javax.swing.JPanel panel_tipo;
    // End of variables declaration//GEN-END:variables

}
