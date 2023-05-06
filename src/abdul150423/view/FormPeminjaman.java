/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package abdul150423.view;
import abdul150423.controller.PengembalianController;
/**
 *
 * @author ASUS
 */
public class FormPeminjaman extends javax.swing.JFrame {

    /**
     * Creates new form FormPeminjaman
     */
    PengembalianController controller;
    public FormPeminjaman() {
        initComponents();
        controller = new PengembalianController(this);
        controller.bersihForm();
        controller.isiCombo();
        controller.tampilData();
        
    }
    
    public javax.swing.JComboBox getCboAnggota(){
        return cboAnggota;
    }
    
    public javax.swing.JComboBox getCboBuku(){
        return cboBuku;
    }
    
    public javax.swing.JTextField getTxtTglpinjam(){
        return txtTglpinjam;
    }
    
    public javax.swing.JTextField getTxtTglkembali(){
        return txtTglkembali;
    }
    
     public javax.swing.JTextField getTxtDikembalikan(){
        return txtDikembalikan;
    }
    
    public javax.swing.JTable getTblPeminjaman(){
        return TblPeminjaman;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtTglpinjam = new javax.swing.JTextField();
        txtTglkembali = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnKembalikan = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblPeminjaman = new javax.swing.JTable();
        cboAnggota = new javax.swing.JComboBox<>();
        cboBuku = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtDikembalikan = new javax.swing.JTextField();
        btnPinjam = new javax.swing.JButton();

        getContentPane().setLayout(null);

        jLabel1.setText("NoBP");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(6, 12, 30, 16);

        txtTglpinjam.setText("jTextField3");
        getContentPane().add(txtTglpinjam);
        txtTglpinjam.setBounds(151, 74, 311, 22);

        txtTglkembali.setText("jTextField4");
        getContentPane().add(txtTglkembali);
        txtTglkembali.setBounds(151, 108, 311, 22);

        jLabel2.setText("Kode Buku");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(6, 46, 57, 16);

        jLabel3.setText("Tgl Peminjaman");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(6, 80, 87, 16);

        jLabel4.setText("Tgl Pengembalian");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(6, 114, 96, 16);

        btnKembalikan.setText("Kembalikan");
        btnKembalikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembalikanActionPerformed(evt);
            }
        });
        getContentPane().add(btnKembalikan);
        btnKembalikan.setBounds(100, 170, 92, 23);

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(200, 170, 72, 23);

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(280, 170, 72, 23);

        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(380, 170, 72, 23);

        TblPeminjaman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NoBP", "Nama", "Kode buku", "Tgl peminjaman", "Tgl kembali", "Tgl dikembalikan", "Terlambat", "Denda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblPeminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblPeminjamanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblPeminjaman);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(6, 207, 452, 220);

        cboAnggota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cboAnggota);
        cboAnggota.setBounds(150, 10, 310, 22);

        cboBuku.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cboBuku);
        cboBuku.setBounds(150, 40, 310, 22);

        jLabel5.setText("TGL Dikembalikan");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 140, 120, 16);

        txtDikembalikan.setText("jTextField1");
        txtDikembalikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDikembalikanActionPerformed(evt);
            }
        });
        getContentPane().add(txtDikembalikan);
        txtDikembalikan.setBounds(150, 140, 310, 22);

        btnPinjam.setText("Pinjam");
        btnPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPinjamActionPerformed(evt);
            }
        });
        getContentPane().add(btnPinjam);
        btnPinjam.setBounds(10, 170, 72, 23);

        setSize(new java.awt.Dimension(482, 678));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnKembalikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembalikanActionPerformed
        // TODO add your handling code here:
        controller.savePengembalian();
        controller.bersihForm();
        controller.tampilData(); 
    }//GEN-LAST:event_btnKembalikanActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        controller.updatePeminjaman();
        controller.bersihForm();
        controller.tampilData(); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        controller.deletePeminjaman();
        controller.bersihForm();
        controller.tampilData(); 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        controller.bersihForm();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void TblPeminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblPeminjamanMouseClicked
        // TODO add your handling code here:
        controller.getPeminjaman();
    }//GEN-LAST:event_TblPeminjamanMouseClicked

    private void txtDikembalikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDikembalikanActionPerformed
        // TODO add your handling code here:
        controller.savePengembalian();
        controller.bersihForm();
        controller.tampilData();
    }//GEN-LAST:event_txtDikembalikanActionPerformed

    private void btnPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPinjamActionPerformed
        // TODO add your handling code here:
        controller.savePeminjaman();
        controller.bersihForm();
        controller.tampilData();
    }//GEN-LAST:event_btnPinjamActionPerformed
    
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
            java.util.logging.Logger.getLogger(FormAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPeminjaman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblPeminjaman;
    private javax.swing.JButton btnKembalikan;
    private javax.swing.JButton btnPinjam;
    private javax.swing.JComboBox<String> cboAnggota;
    private javax.swing.JComboBox<String> cboBuku;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDikembalikan;
    private javax.swing.JTextField txtTglkembali;
    private javax.swing.JTextField txtTglpinjam;
    // End of variables declaration//GEN-END:variables
}