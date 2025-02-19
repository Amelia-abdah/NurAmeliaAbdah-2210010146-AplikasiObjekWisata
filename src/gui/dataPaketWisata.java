package gui;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import db.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import javax.annotation.processing.SupportedSourceVersion;
//import javax.lang.model.SourceVersion;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class dataPaketWisata extends javax.swing.JFrame {
    private DefaultTableModel model = null;
    private PreparedStatement stat;
    private ResultSet rs;
    koneksi k = new koneksi();
    
    public dataPaketWisata() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        k.getCon();
        refreshTable();
    }
    
    class paket extends dataPaketWisata{
        String kode_paket,nama,harga,detail;
        
        public paket()throws SQLException{
            this.kode_paket = txtKode.getText();
            this.nama = txtNama.getText();
            this.harga = txtHarga.getText();
            this.detail = txtDetail.getText();
        }
    }
    
    public void refreshTable(){
        model = new DefaultTableModel();
        model.addColumn("Kode Paket");
        model.addColumn("Nama");
        model.addColumn("Harga");
        model.addColumn("Detail");
        tblPaket.setModel(model);
        try{
            this.stat = k.getCon().prepareStatement("select * from paket");
            this.rs = this.stat.executeQuery();
            while (rs.next()){
                Object[] data={
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4)
                };
                model.addRow(data);
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    /**
     * Creates new form paket
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPaket = new javax.swing.JTable();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtKode = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        cmbCari = new javax.swing.JComboBox<>();
        btnRefresh = new javax.swing.JButton();
        txtDetail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblPaket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Deskripsi", "Harga", "Kuantitas"
            }
        ));
        jScrollPane1.setViewportView(tblPaket);

        btnSimpan.setBackground(new java.awt.Color(250, 223, 161));
        btnSimpan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(126, 172, 181));
        btnHapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(250, 223, 161));
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEdit.setText("Ubah");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setBackground(new java.awt.Color(0, 51, 51));
        jLabel3.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Input Paket Wisata");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(23, 23, 23))
        );

        txtCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariActionPerformed(evt);
            }
        });

        btnCari.setBackground(new java.awt.Color(126, 172, 181));
        btnCari.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        jLabel1.setText("Kode Paket");

        jLabel2.setText("Nama Paket");

        jLabel6.setText("Detail");

        jLabel7.setText("Harga");

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        txtKode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeActionPerformed(evt);
            }
        });

        txtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaActionPerformed(evt);
            }
        });

        cmbCari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "kode_paket", "nama_paket", "harga", "detail" }));
        cmbCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCariActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(126, 172, 181));
        btnRefresh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        txtDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDetailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnRefresh)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnSimpan)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnHapus)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnEdit)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cmbCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCari))))
                .addGap(24, 24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addComponent(txtDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHapus)
                    .addComponent(btnEdit)
                    .addComponent(btnSimpan)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari)
                    .addComponent(cmbCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRefresh)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        try{
            paket p = new paket();
            this.stat = k.getCon().prepareStatement("insert into paket values(?,?,?,?)");
            this.stat.setString(1, p.kode_paket);
            this.stat.setString(2, p.nama);
            this.stat.setString(3, p.harga);
            this.stat.setString(4, p.detail);
            this.stat.executeUpdate();
            refreshTable();
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try{
            paket p = new paket();
            this.stat = k.getCon().prepareStatement("delete from paket " 
                    + "where kode_paket=?");
            this.stat.setString(1, p.kode_paket);
            this.stat.executeUpdate();
            refreshTable();
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
            txtKode.setText("");
            txtNama.setText("");
            txtHarga.setText("");
            txtDetail.setText("");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try{
            paket p = new paket();
            this.stat = k.getCon().prepareStatement("update paket set nama=?," 
                    + "harga=?,detail=?" 
                    + "where kode_paket=?");
            this.stat.setString(1, p.nama);
            this.stat.setString(2, p.harga);
            this.stat.setString(3, p.detail);
            this.stat.setString(4, p.kode_paket);
            this.stat.executeUpdate();
            refreshTable();
            JOptionPane.showMessageDialog(null, "Data berhasil diubah");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void txtCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariActionPerformed
    
    private void tblPaketMouseClicked(java.awt.event.MouseEvent evt) {                                     
        txtKode.setText(model.getValueAt(tblPaket.getSelectedRow(), 0).toString());
        txtNama.setText(model.getValueAt(tblPaket.getSelectedRow(), 1).toString());
        txtHarga.setText(model.getValueAt(tblPaket.getSelectedRow(), 2).toString());
        txtDetail.setText(model.getValueAt(tblPaket.getSelectedRow(), 3).toString());
    }
    
    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Kode Paket");
        model.addColumn("Nama");
        model.addColumn("Harga");
        model.addColumn("Detail");

        try {
            String sql = "SELECT kode_paket, nama, harga, detail FROM paket WHERE " + 
                    cmbCari.getSelectedItem().toString()
                    + " LIKE '%" + txtCari.getText() + "%'";
            java.sql.Connection conn = (Connection)k.getCon();
            java.sql.Statement stn = conn.createStatement();
            java.sql.ResultSet res = stn.executeQuery(sql);
            
            while(res.next()){
                model.addRow(new Object[]{res.getString(1),
                    res.getString(2), res.getString(3), res.getString(4)});
            }
            tblPaket.setModel(model);
            } catch (SQLException e) {
                System.out.println("Error " + e.getMessage());
        }
    }//GEN-LAST:event_btnCariActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void txtKodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeActionPerformed

    private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaActionPerformed

    private void cmbCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCariActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cmbCariActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Kode Paket");
        model.addColumn("Nama");
        model.addColumn("Harga");
        model.addColumn("Detail");

        try {
            String sql = "SELECT * FROM paket"; // Ganti dengan nama tabel Anda
            java.sql.Connection conn = (Connection)k.getCon();
            java.sql.Statement stn = conn.createStatement();
            java.sql.ResultSet res = stn.executeQuery(sql);

            while (res.next()) {
                model.addRow(new Object[]{
                    res.getString("kode_paket"),
                    res.getString("nama"),
                    res.getString("harga"),
                    res.getString("detail")
                });
            }
            tblPaket.setModel(model); // Set model ke JTable Anda

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void txtDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDetailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDetailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cmbCari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPaket;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtDetail;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables

}
