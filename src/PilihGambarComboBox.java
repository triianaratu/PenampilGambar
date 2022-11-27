
import java.awt.CardLayout;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class PilihGambarComboBox extends javax.swing.JFrame {

    /**
     * Creates new form PenampilGambar
     */
    public PilihGambarComboBox() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pilihanCMB = new javax.swing.JComboBox<>();
        imagePanel = new javax.swing.JPanel();
        glashflashLB = new javax.swing.JLabel();
        javaeeLB = new javax.swing.JLabel();
        postgresqlLB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Pilih Gambar");
        buttonPanel.add(jLabel1);

        pilihanCMB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Glashfish", "Java EE", "PostgreSQL" }));
        pilihanCMB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                pilihanCMBItemStateChanged(evt);
            }
        });
        buttonPanel.add(pilihanCMB);

        getContentPane().add(buttonPanel, java.awt.BorderLayout.PAGE_START);

        imagePanel.setLayout(new java.awt.CardLayout());

        glashflashLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        glashflashLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/glashfish.jpg"))); // NOI18N
        imagePanel.add(glashflashLB, "0");

        javaeeLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaeeLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaee.jpg"))); // NOI18N
        imagePanel.add(javaeeLB, "1");

        postgresqlLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        postgresqlLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/postgresql.jpg"))); // NOI18N
        imagePanel.add(postgresqlLB, "2");

        getContentPane().add(imagePanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pilihanCMBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pilihanCMBItemStateChanged
        // TODO add your handling code here:
        if(pilihanCMB.getSelectedItem().equals("Glashfish")){
            CardLayout cl = (CardLayout)(imagePanel.getLayout());
            cl.show (imagePanel, "0");
        }else if(pilihanCMB.getSelectedItem().equals("Java EE")) {
            CardLayout cl = (CardLayout) (imagePanel.getLayout());
            cl.show (imagePanel, "1");
        }else if(pilihanCMB.getSelectedItem().equals("PostgreSQL")) {
            CardLayout cl = (CardLayout) (imagePanel.getLayout());
            cl.show (imagePanel, "2");
        }
    }//GEN-LAST:event_pilihanCMBItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilihGambarComboBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JLabel glashflashLB;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel javaeeLB;
    private javax.swing.JComboBox<String> pilihanCMB;
    private javax.swing.JLabel postgresqlLB;
    // End of variables declaration//GEN-END:variables
}
