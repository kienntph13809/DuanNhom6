/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDien;

import Helper.DialogHelper;
import Helper.Sharehelper;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import javax.swing.JInternalFrame;

/**
 *
 * @author dfg
 */
public class GiaoDienTu extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public GiaoDienTu() {
        initComponents();
        setLocationRelativeTo(null);
//        showChao();
//        openLogin();
        dongHo();

    }

    public void showChao() {
        new LoadingTu(this, true).setVisible(true);
    }

    public void openLogin() {
        for (JInternalFrame frmChild : destop.getAllFrames()) {
            frmChild.dispose();
        }
        new loginTu(this, true).setVisible(true);
    }

    void exit() {
        if (DialogHelper.confirm(this, "Bạn thực sự muốn kết thúc?")) {
            System.exit(0);
        }
    }
     void dongHo() {
        javax.swing.Timer t = new javax.swing.Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss aa");
                Date d = new Date();
                lbdongho.setText(s.format(d));
            }     
        });
        t.start();
    }
   void OpendSanPham(){
        QuanLySanPham qlsp = new QuanLySanPham();
       destop.add(qlsp);
        qlsp.setVisible(true);
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        destop = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbdongho = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MnHeThong = new javax.swing.JMenu();
        QLKH = new javax.swing.JMenuItem();
        SuKien = new javax.swing.JMenuItem();
        QLTK = new javax.swing.JMenuItem();
        Dangxuat = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        TrangChu = new javax.swing.JMenu();
        mnBanHang = new javax.swing.JMenu();
        mnSanPham = new javax.swing.JMenu();
        ChiTietHoaDon = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        destop.setBackground(new java.awt.Color(255, 153, 102));

        javax.swing.GroupLayout destopLayout = new javax.swing.GroupLayout(destop);
        destop.setLayout(destopLayout);
        destopLayout.setHorizontalGroup(
            destopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        destopLayout.setVerticalGroup(
            destopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 856, Short.MAX_VALUE)
        );

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Hệ Thống Bán Hàng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 813, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbdongho, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lbdongho, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MnHeThong.setText("Hệ Thống");

        QLKH.setText("Quản Lý khách hàng");
        MnHeThong.add(QLKH);

        SuKien.setText("Sự Kiện");
        MnHeThong.add(SuKien);

        QLTK.setText("Quản Lý tài khoản");
        MnHeThong.add(QLTK);

        Dangxuat.setText("Đăng xuất");
        Dangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DangxuatActionPerformed(evt);
            }
        });
        MnHeThong.add(Dangxuat);

        Exit.setText("Thoát");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        MnHeThong.add(Exit);

        jMenuBar1.add(MnHeThong);

        TrangChu.setText("Trang Chủ");
        TrangChu.setMargin(new java.awt.Insets(0, 4, 0, 4));
        jMenuBar1.add(TrangChu);

        mnBanHang.setText("Bán Hàng");
        mnBanHang.setMargin(new java.awt.Insets(0, 4, 0, 4));
        mnBanHang.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                mnBanHangStateChanged(evt);
            }
        });
        mnBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnBanHangMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnBanHang);

        mnSanPham.setText("Sản Phẩm");
        mnSanPham.setMargin(new java.awt.Insets(0, 4, 0, 4));
        mnSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnSanPhamMouseClicked(evt);
            }
        });
        mnSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSanPhamActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnSanPham);

        ChiTietHoaDon.setText("Hóa Đơn");
        ChiTietHoaDon.setMargin(new java.awt.Insets(0, 4, 0, 4));

        jMenuItem4.setText("Chi Tiết Hóa Đơn");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        ChiTietHoaDon.add(jMenuItem4);

        jMenuBar1.add(ChiTietHoaDon);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(destop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(destop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DangxuatActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_DangxuatActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        exit();
    }//GEN-LAST:event_ExitActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void mnBanHangStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_mnBanHangStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_mnBanHangStateChanged

    private void mnSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSanPhamActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_mnSanPhamActionPerformed

    private void mnBanHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnBanHangMouseClicked
        // TODO add your handling code here:
        openbanhang();
    }//GEN-LAST:event_mnBanHangMouseClicked

    private void mnSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnSanPhamMouseClicked
        // TODO add your handling code here:
      OpendSanPham();

    }//GEN-LAST:event_mnSanPhamMouseClicked

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
            java.util.logging.Logger.getLogger(GiaoDienTu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienTu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienTu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienTu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienTu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ChiTietHoaDon;
    private javax.swing.JMenuItem Dangxuat;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenu MnHeThong;
    private javax.swing.JMenuItem QLKH;
    private javax.swing.JMenuItem QLTK;
    private javax.swing.JMenuItem SuKien;
    private javax.swing.JMenu TrangChu;
    private javax.swing.JDesktopPane destop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbdongho;
    private javax.swing.JMenu mnBanHang;
    private javax.swing.JMenu mnSanPham;
    // End of variables declaration//GEN-END:variables

    private void openbanhang() {
        Banhang bh = new Banhang();
        destop.add(bh);
        bh.setVisible(true);
    }
}
