/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uas_barber;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class form_haircolor extends javax.swing.JFrame {

    Connection cn = koneksi.bukaKoneksi();
    public Statement st;
    public ResultSet rs;

    private void addData() throws SQLException {
        try {
            String sql = "INSERT INTO `order` (`nama`, `email`, `no_hp`, `jam`, `hari`, "
                    + "`barberman`, `jenis_layanan`) VALUES ('" + namaField.getText().toString() + "','" + emailField.getText().toString() + "',"
                    + "'" + hpField.getText().toString() + "','" + boxJam.getSelectedItem().toString() + "',"
                    + "'" + boxHari.getSelectedItem().toString() + "',"
                    + "'" + boxPrice.getSelectedItem().toString() + "','" + boxLayanan.getSelectedItem().toString() + "')";
            st = cn.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    private void reset() {
        namaField.setText("");
        emailField.setText("");
        hpField.setText("");
        boxJam.setSelectedIndex(0);
        boxHari.setSelectedIndex(0);
        boxPrice.setSelectedIndex(0);
        boxLayanan.setSelectedIndex(0);
    }

    /**
     * Creates new form form_haircolor
     */
    public form_haircolor() {
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
        jLabel2 = new javax.swing.JLabel();
        namaField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        hpField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        boxJam = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        boxHari = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        boxPrice = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        boxLayanan = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAMA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        namaField.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(namaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 290, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EMAIL");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        emailField.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 290, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NO HP");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        hpField.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(hpField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 290, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("JAM");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        boxJam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JAM 10.00", "JAM 10.30", "JAM 11.00", "JAM 12.00", "JAM 13.00", "JAM 13.30", "JAM 14.00", "JAM 14.30", "JAM 15.00", "JAM 15.30", "JAM 16.00", "JAM 16.30", "JAM 17.00", "JAM 17.30", "JAM 18.00", "JAM 18.30", "JAM 19.00", "JAM 19.30", "JAM 20.00", "JAM 20.30", "JAM 21.00" }));
        boxJam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxJamActionPerformed(evt);
            }
        });
        jPanel1.add(boxJam, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 100, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("HARI");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        boxHari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SENIN", "SELASA", "RABU", "KAMIS", "JUMAT", "SABTU", " " }));
        jPanel1.add(boxHari, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 100, -1));

        jButton1.setBackground(new java.awt.Color(164, 126, 53));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("BARBERMAN");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        boxPrice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BOY - PRICELIST  Rp 50.000", "BEN - PRICELIST  Rp 75.000", "JAYA - PRICELIST  Rp 100.000" }));
        jPanel1.add(boxPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 220, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("JENIS LAYANAN");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        boxLayanan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BASIC COLOR", "PREMIUM COLOR", " " }));
        jPanel1.add(boxLayanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 220, -1));

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("BUAT PESANAN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 280, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas_barber/img/bgform.jpg"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boxJamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxJamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxJamActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        halaman_haircolor2 hall = new halaman_haircolor2();
        hall.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // TODO add your handling code here:
            addData();
            JOptionPane.showMessageDialog(null, "Terima Kasih Sudah memesan");
            reset();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(form_haircolor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_haircolor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_haircolor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_haircolor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_haircolor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JComboBox<String> boxHari;
    private javax.swing.JComboBox<String> boxJam;
    private javax.swing.JComboBox<String> boxLayanan;
    private javax.swing.JComboBox<String> boxPrice;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField hpField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField namaField;
    // End of variables declaration//GEN-END:variables
}
