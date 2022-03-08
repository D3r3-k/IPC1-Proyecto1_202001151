package D3r3_k.BibliotecaAdmin.BooksAdmin;

import D3r3_k.DataBase.db_books;
import D3r3_k.DataBase.db_libros;
import D3r3_k.DataBase.db_revistas;
import D3r3_k.DataBase.db_tesis;
import D3r3_k.Principal.Inicio;
import com.formdev.flatlaf.FlatDarkLaf;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class CargaMasiva extends javax.swing.JFrame {

    public CargaMasiva() {
        initComponents();
        initComponents2();
    }

    private void initComponents2() {
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        btn_cargar = new javax.swing.JButton();
        textarea = new javax.swing.JScrollPane();
        input_areaCarga = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_cargar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Carga masiva");
        setResizable(false);

        background.setPreferredSize(new java.awt.Dimension(800, 400));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_cargar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cargar.setForeground(java.awt.Color.white);
        btn_cargar.setText("Cargar");
        btn_cargar.setPreferredSize(new java.awt.Dimension(100, 30));
        btn_cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargarActionPerformed(evt);
            }
        });
        background.add(btn_cargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, -1, -1));

        textarea.setPreferredSize(new java.awt.Dimension(750, 210));

        input_areaCarga.setColumns(20);
        input_areaCarga.setRows(5);
        textarea.setViewportView(input_areaCarga);

        background.add(textarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Tipo ; Autor ; Año ; ISBN ; Titulo ; Edicion ; pClave ; Descripcion ; Temas ; Copias ; Categorias ; Ejemplares ; Area ; Disponibles ;");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Formato");
        jLabel2.setToolTipText("");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jSeparator1.setMinimumSize(new java.awt.Dimension(800, 3));
        jSeparator1.setPreferredSize(new java.awt.Dimension(800, 3));
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        btn_cargar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cargar1.setForeground(java.awt.Color.white);
        btn_cargar1.setText("Cancelar");
        btn_cargar1.setPreferredSize(new java.awt.Dimension(100, 30));
        btn_cargar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargar1ActionPerformed(evt);
            }
        });
        background.add(btn_cargar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, -1, -1));

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

    private static String generarCodeBook() {
        Random rnm = new Random();
        boolean original = false;
        int code = (int) (rnm.nextDouble() * 9999 + 100);
        String codeBook = "Book" + code;

        while (!original) {
            for (int i = 0; i < AdminBooks.booksDB.length; i++) {
                if (AdminBooks.booksDB[i] == null) {
                    codeBook = "Book" + code;
                    original = true;
                    break;
                } else {
                    code = (int) (rnm.nextDouble() * 9999 + 100);
                }
            }
        }
        return codeBook;
    }

    private void btn_cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargarActionPerformed
        AdminBooks adminBooks = new AdminBooks();

        String carga = input_areaCarga.getText();

        if (carga.isBlank()) {
            JOptionPane.showMessageDialog(null, "El campo esta vacio", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            String _cadenaTexto = input_areaCarga.getText();
            String[] Libros = _cadenaTexto.split("\n");
            for (int i = 0; i < Libros.length; i++) {
                String[] datosLibro = Libros[i].split(";");
                for (int j = 0; j < datosLibro.length; j++) {

                    try {
                        int tipo = Integer.parseInt(datosLibro[0]);
                        String autor = datosLibro[1];
                        String year = datosLibro[2];
                        String _isbn = datosLibro[3];
                        long isbn1= 0;
                        if (_isbn.isBlank()) {
                            isbn1 = 0;
                        }else{
                            isbn1 = Long.parseLong(datosLibro[3]);
                        }
                        
                        String titulo = datosLibro[4];
                        String edicion = datosLibro[5];
                        String _pclave = datosLibro[6];

                        String[] pclave = _pclave.split(",");
                        String desc = datosLibro[7];
                        String _temas = datosLibro[8];
                        String[] temas = _temas.split(",");
                        int copias = Integer.parseInt(datosLibro[9]);
                        
                        String categoria = datosLibro[10];
                        String ejemplares = datosLibro[11];
                        String area = datosLibro[12];
                        int disponibles = Integer.parseInt(datosLibro[13]);

                        int pos = i + 1;

                        if (tipo == 0) {
                            for (int book = 0; book < adminBooks.booksDB.length; book++) {
                                if (adminBooks.booksDB[book] == null) {
                                    // GENERAR CODIGO DEL LIBRO
                                    String codeBook = generarCodeBook();
                                    // AGREGAR BOOK
                                    for (int libro = 0; libro < adminBooks.librosDB.length; libro++) {
                                        if (AdminBooks.librosDB[libro] == null) {
                                            AdminBooks.booksDB[book] = new db_books(codeBook, titulo, autor, desc, year, pclave, edicion, temas, copias, disponibles, tipo);
                                            AdminBooks.librosDB[libro] = new db_libros(codeBook, autor, year, isbn1, titulo, edicion, pclave, desc, temas, copias, disponibles, tipo);
                                            adminBooks.refresh();
                                            break;
                                        }
                                    }
                                    break;
                                }
                            }
                        } else if (tipo == 1) {
                            for (int book = 0; book < adminBooks.booksDB.length; book++) {
                                if (adminBooks.booksDB[book] == null) {
                                    // GENERAR CODIGO DEL LIBRO
                                    String codeBook = generarCodeBook();
                                    // AGREGAR BOOK
                                    for (int revista = 0; revista < adminBooks.revistasDB.length; revista++) {
                                        if (adminBooks.revistasDB[revista] == null) {
                                            AdminBooks.booksDB[book] = new db_books(codeBook, titulo, autor, desc, year, pclave, edicion, temas, copias, disponibles, tipo);
                                            adminBooks.revistasDB[revista] = new db_revistas(codeBook, autor, year, titulo, edicion, desc, categoria, ejemplares, temas, pclave, copias, disponibles, tipo);
                                            adminBooks.refresh();
                                            break;
                                        }
                                    }
                                    break;
                                }
                            }
                        } else if (tipo == 2) {
                            for (int book = 0; book < adminBooks.booksDB.length; book++) {
                                if (AdminBooks.booksDB[book] == null) {
                                    // GENERAR CODIGO DEL LIBRO
                                    String codeBook = generarCodeBook();
                                    // AGREGAR BOOK
                                    for (int tesis = 0; tesis < adminBooks.tesisDB.length; tesis++) {
                                        if (adminBooks.tesisDB[tesis] == null) {
                                            AdminBooks.booksDB[book] = new db_books(codeBook, titulo, autor, desc, year, pclave, edicion, temas, copias, disponibles, tipo);
                                            adminBooks.tesisDB[tesis] = new db_tesis(codeBook, autor, year, titulo, pclave, area, temas, desc, edicion, copias, disponibles, tipo);
                                            adminBooks.refresh();
                                            break;
                                        }
                                    }
                                    break;
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "No se agrego el libro.\nError: El tipo no existe, verifique la lista\n Problema con la linea: " + pos, "Error", JOptionPane.ERROR_MESSAGE);
                        }

                    } catch (Exception e) {
                        int pos = i + 1;
                        if (datosLibro[0].isBlank()) {
                            JOptionPane.showMessageDialog(null, "No se agrego el libro.\nEl tipo no puede estar vacio.\nError en la linea: " + pos, "Error", JOptionPane.ERROR_MESSAGE);
                            break;
                        } else if (datosLibro[9].isBlank() || datosLibro[9] == null) {
                            JOptionPane.showMessageDialog(null, "No se agrego el libro.\nEl numero de copias esta vacio.\nError en la linea: " + pos, "Error", JOptionPane.ERROR_MESSAGE);
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "No se agrego el libro.\nError en la linea: " + pos, "Error", JOptionPane.ERROR_MESSAGE);
                            break;
                        }
                    }

                    break;
                }
            }
            JOptionPane.showMessageDialog(null, "Libros agregados exitosamente.");
            this.dispose();
            adminBooks.setVisible(true);
        }
    }//GEN-LAST:event_btn_cargarActionPerformed

    private void btn_cargar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargar1ActionPerformed
        AdminBooks adminBooks = new AdminBooks();
        this.dispose();
        adminBooks.setVisible(true);
    }//GEN-LAST:event_btn_cargar1ActionPerformed

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
            java.util.logging.Logger.getLogger(CargaMasiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CargaMasiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CargaMasiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CargaMasiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new FlatDarkLaf());
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                }
                new CargaMasiva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btn_cargar;
    private javax.swing.JButton btn_cargar1;
    private javax.swing.JTextArea input_areaCarga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JScrollPane textarea;
    // End of variables declaration//GEN-END:variables

}
