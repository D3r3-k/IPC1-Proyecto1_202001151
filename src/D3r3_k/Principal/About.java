package D3r3_k.Principal;

import com.formdev.flatlaf.FlatDarkLaf;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class About extends javax.swing.JFrame {

    public About() {
        initComponents();
        initComponents2();
    }

    private void initComponents2(){
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_back2 = new javax.swing.JButton();
        icon = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        textarea_about = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("About");
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_back2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_back2.setForeground(java.awt.Color.white);
        btn_back2.setText("Regresar");
        btn_back2.setPreferredSize(new java.awt.Dimension(100, 30));
        btn_back2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_back2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_back2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LogoUsac.png"))); // NOI18N
        jPanel1.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        scroll.setBorder(null);

        textarea_about.setEditable(false);
        textarea_about.setColumns(20);
        textarea_about.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textarea_about.setLineWrap(true);
        textarea_about.setRows(5);
        textarea_about.setText("Tras la Revolución del 44, diplomáticos ingleses y estadounidenses acusaron a los gobiernos de Juan José Arévalo y Jacobo Árbenz de comunistas, especialmente luego de que éste emitiera el Decreo que expropiaba tierras no cultivadas a particulares. Con apoyo de la Central de Inteligencia de Estados Unidos, Carlos Castillo Armas logró expulsar al gobierno de Árbenz, en un movimiento que se autodenominó la Liberación de 1954. La Universidad de San Carlos, durante el gobierno de Árbenz, fue escenario de un grupo anticomunistas.\n\nEl nuevo gobierno suspendió garantías constitucionales y, en 1956, una gran cantidad de estudiantes manifestó por el retorno a la constitucionalidad. En la esquina de la 11 calle y 6a avenida de la zona 1, se disolvió la manifestación con el uso de las armas, por lo que murieron cinco estudiantes universitarios. En 1962, los estudiantes universitarios volvieron a protestar contra la forma en que se estaba desarrollando el gobierno, en unión con estudiantes del nivel medio, empleados municipales y del Organismo Judicial.\n");
        textarea_about.setWrapStyleWord(true);
        scroll.setViewportView(textarea_about);

        jPanel1.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 600, 380));

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

    private void btn_back2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_back2ActionPerformed
        Inicio i = new Inicio();
        this.dispose();
        i.setVisible(true);
    }//GEN-LAST:event_btn_back2ActionPerformed

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
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new FlatDarkLaf());
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                }
                new About().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back2;
    private javax.swing.JLabel icon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTextArea textarea_about;
    // End of variables declaration//GEN-END:variables

}
