/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Martin Hara
 */
public class modul2soal1 extends javax.swing.JFrame {

    /**
     * Creates new form modul2soal1
     */
    public modul2soal1() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtjml = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txttarif = new javax.swing.JTextField();
        btnbruto = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtbruto = new javax.swing.JTextField();
        btnbersih = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtbersih = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PENGHITUNGAN GAJI KARYAWAN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PT. Citra Kurnia Sentosa");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Jl. Raya Telang,PO BOX 02 Kecamatan Kamal, Bangkalan Jawa Timur 69162");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telepon: 031-3011146. Fax: 031-3011506");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Jumlah Jam Kerja 1Minggu :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));
        jPanel2.add(txtjml, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 220, -1));

        jLabel6.setText("Tarif Per-Jam                         :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 20));

        txttarif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttarifActionPerformed(evt);
            }
        });
        jPanel2.add(txttarif, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 220, -1));

        btnbruto.setBackground(new java.awt.Color(0, 102, 102));
        btnbruto.setForeground(new java.awt.Color(255, 255, 255));
        btnbruto.setText("Hitung Gaji Bruto");
        btnbruto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbrutoActionPerformed(evt);
            }
        });
        jPanel2.add(btnbruto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel7.setText("Gaji Bruto                              :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 20));
        jPanel2.add(txtbruto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 220, -1));

        btnbersih.setBackground(new java.awt.Color(0, 102, 102));
        btnbersih.setForeground(new java.awt.Color(255, 255, 255));
        btnbersih.setText("Hitung Gaji Bersih");
        btnbersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbersihActionPerformed(evt);
            }
        });
        jPanel2.add(btnbersih, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel8.setText("Gaji Bersih                             :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 20));
        jPanel2.add(txtbersih, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 220, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 420, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txttarifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttarifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttarifActionPerformed
 private double gaji = 0.0; // Deklarasikan variabel gaji di luar metode agar bisa diakses di seluruh kelas
    
    private void btnbrutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbrutoActionPerformed
        // TODO add your handling code here:
        
    String fjml = txtjml.getText();
    int int_fjml = Integer.parseInt(fjml);
    String ftarif = txttarif.getText();
    int int_ftarif = Integer.parseInt(ftarif);
    if (int_fjml > 40) {
        int jamLembur = int_fjml - 40;
        double tarifPerJamLembur = int_ftarif * 1.5;
        gaji = (40 * int_ftarif) + (jamLembur * tarifPerJamLembur);
        txtbruto.setText(String.valueOf(gaji));
    } else {
        gaji = int_fjml * int_ftarif;
        txtbruto.setText(String.valueOf(gaji));
    }

    }//GEN-LAST:event_btnbrutoActionPerformed
    private void btnbersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbersihActionPerformed
        // TODO add your handling code here:
          double gaji_bersih = gaji-(gaji * 0.1) ;
    txtbersih.setText(String.valueOf(gaji_bersih));
    }//GEN-LAST:event_btnbersihActionPerformed

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
            java.util.logging.Logger.getLogger(modul2soal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modul2soal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modul2soal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modul2soal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modul2soal1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbersih;
    private javax.swing.JButton btnbruto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtbersih;
    private javax.swing.JTextField txtbruto;
    private javax.swing.JTextField txtjml;
    private javax.swing.JTextField txttarif;
    // End of variables declaration//GEN-END:variables
}
