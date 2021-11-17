/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDien;

import Helper.DialogHelper;
import Helper.Sharehelper;
import com.sun.org.apache.xalan.internal.xsltc.dom.AbsoluteIterator;
import java.awt.Color;
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

    Color DefaultColor, ClickerColor;

    /**
     * Creates new form NewJFrame
     */
    public GiaoDienTu() {
        initComponents();
        setLocationRelativeTo(null);
        DefaultColor = new Color(176,228,246);
        ClickerColor = new Color(102, 255, 204);
        TrangChu.setBackground(DefaultColor);
        SanPham.setBackground(DefaultColor);
        HoaDon.setBackground(DefaultColor);
        TaiKhoan.setBackground(DefaultColor);
        Thoat.setBackground(DefaultColor);

    }

    public void showChao() {
        new LoadingTu(this, true).setVisible(true);
    }

    public void openLogin() {
//<<<<<<< HEAD
//        for (JInternalFrame frmChild : destop.getAllFrames()) {
//            frmChild.dispose();
//        }
//        new loginTu(this, true).setVisible(true);
//=======
//        for (JInternalFrame frmChild : destop.getAllFrames()) {
//            frmChild.dispose();
//        }
//        new DANGNHAP(this, true).setVisible(true);
//
//>>>>>>> origin/master
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
                // lbdongho.setText(s.format(d));
            }
        });
        t.start();
    }

    void OpendSanPham() {
        QuanLySanPham qlsp = new QuanLySanPham();
//       destop.add(qlsp);
//        qlsp.setVisible(true);
    }

    void OpendQLTK() {
        quanlytaikhoan qltk = new quanlytaikhoan();
//       destop.add(qltk);
//       qltk.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        TrangChu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SanPham = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        HoaDon = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TaiKhoan = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Thoat = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(176, 228, 246));

        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1043, Short.MAX_VALUE)
                .addComponent(Close)
                .addGap(39, 39, 39))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(Close)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1470, 130));

        jPanel6.setBackground(new java.awt.Color(176, 228, 246));

        TrangChu.setBackground(new java.awt.Color(176, 228, 246));
        TrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TrangChuMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TrangChuMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Trang Chủ");

        javax.swing.GroupLayout TrangChuLayout = new javax.swing.GroupLayout(TrangChu);
        TrangChu.setLayout(TrangChuLayout);
        TrangChuLayout.setHorizontalGroup(
            TrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TrangChuLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        TrangChuLayout.setVerticalGroup(
            TrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        SanPham.setBackground(new java.awt.Color(176, 228, 246));
        SanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SanPhamMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SanPhamMousePressed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 204, 204));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Bán Hàng");

        javax.swing.GroupLayout SanPhamLayout = new javax.swing.GroupLayout(SanPham);
        SanPham.setLayout(SanPhamLayout);
        SanPhamLayout.setHorizontalGroup(
            SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SanPhamLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel4)
                .addContainerGap(177, Short.MAX_VALUE))
        );
        SanPhamLayout.setVerticalGroup(
            SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        HoaDon.setBackground(new java.awt.Color(176, 228, 246));
        HoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HoaDonMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HoaDonMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Sản Phẩm");

        javax.swing.GroupLayout HoaDonLayout = new javax.swing.GroupLayout(HoaDon);
        HoaDon.setLayout(HoaDonLayout);
        HoaDonLayout.setHorizontalGroup(
            HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HoaDonLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        HoaDonLayout.setVerticalGroup(
            HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        TaiKhoan.setBackground(new java.awt.Color(176, 228, 246));
        TaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TaiKhoanMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TaiKhoanMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Tài Khoản");

        javax.swing.GroupLayout TaiKhoanLayout = new javax.swing.GroupLayout(TaiKhoan);
        TaiKhoan.setLayout(TaiKhoanLayout);
        TaiKhoanLayout.setHorizontalGroup(
            TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TaiKhoanLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel5)
                .addContainerGap(172, Short.MAX_VALUE))
        );
        TaiKhoanLayout.setVerticalGroup(
            TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Thoat.setBackground(new java.awt.Color(176, 228, 246));
        Thoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ThoatMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ThoatMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("   Thoát");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });

        javax.swing.GroupLayout ThoatLayout = new javax.swing.GroupLayout(Thoat);
        Thoat.setLayout(ThoatLayout);
        ThoatLayout.setHorizontalGroup(
            ThoatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThoatLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        ThoatLayout.setVerticalGroup(
            ThoatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(SanPham, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Thoat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {HoaDon, SanPham, TaiKhoan, Thoat, TrangChu});

        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(HoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Thoat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {HoaDon, SanPham, TaiKhoan, Thoat, TrangChu});

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 123, 320, 660));

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        jPanel2.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 123, 1150, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_CloseMouseClicked

    private void TrangChuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrangChuMousePressed
        // TODO add your handling code here:

        TrangChu.setBackground(ClickerColor);
        SanPham.setBackground(DefaultColor);
        HoaDon.setBackground(DefaultColor);
        TaiKhoan.setBackground(DefaultColor);
        Thoat.setBackground(DefaultColor);
    }//GEN-LAST:event_TrangChuMousePressed

    private void SanPhamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SanPhamMousePressed
        // TODO add your handling code here:
        TrangChu.setBackground(DefaultColor);
        SanPham.setBackground(ClickerColor);
        HoaDon.setBackground(DefaultColor);
        TaiKhoan.setBackground(DefaultColor);
        Thoat.setBackground(DefaultColor);
    }//GEN-LAST:event_SanPhamMousePressed

    private void HoaDonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoaDonMousePressed
        // TODO add your handling code here:ư
         TrangChu.setBackground(DefaultColor);
        SanPham.setBackground(DefaultColor);
        HoaDon.setBackground(ClickerColor);
        TaiKhoan.setBackground(DefaultColor);
        Thoat.setBackground(DefaultColor);
    }//GEN-LAST:event_HoaDonMousePressed

    private void TaiKhoanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TaiKhoanMousePressed
        // TODO add your handling code here:
        TrangChu.setBackground(DefaultColor);
        SanPham.setBackground(DefaultColor);
        HoaDon.setBackground(DefaultColor);
        TaiKhoan.setBackground(ClickerColor);
        Thoat.setBackground(DefaultColor);
    }//GEN-LAST:event_TaiKhoanMousePressed

    private void TrangChuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrangChuMouseClicked
        // TODO add your handling code here:
        
        jDesktopPane1.removeAll();
       
        
        
    }//GEN-LAST:event_TrangChuMouseClicked

    private void SanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SanPhamMouseClicked
        // TODO add your handling code here:
        Banhang bh = new Banhang();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(bh).setVisible(true);
    }//GEN-LAST:event_SanPhamMouseClicked

    private void HoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoaDonMouseClicked
        // TODO add your handling code here:
        QuanLySanPham qlsp = new QuanLySanPham();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(qlsp).setVisible(true);
    }//GEN-LAST:event_HoaDonMouseClicked

    private void TaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TaiKhoanMouseClicked
        // TODO add your handling code here:
        quanlytaikhoan qltk = new quanlytaikhoan();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(qltk).setVisible(true);
    }//GEN-LAST:event_TaiKhoanMouseClicked

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel6MousePressed

    private void ThoatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThoatMousePressed
        // TODO add your handling code here:
         TrangChu.setBackground(DefaultColor);
        SanPham.setBackground(DefaultColor);
        HoaDon.setBackground(DefaultColor);
        TaiKhoan.setBackground(DefaultColor);
        Thoat.setBackground(ClickerColor);
    }//GEN-LAST:event_ThoatMousePressed

    private void ThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThoatMouseClicked
        // TODO add your handling code here:
        //DialogHelper.confirm(this,"bạn muốn thoát");
           exit();
    }//GEN-LAST:event_ThoatMouseClicked

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
    private javax.swing.JLabel Close;
    private javax.swing.JPanel HoaDon;
    private javax.swing.JPanel SanPham;
    private javax.swing.JPanel TaiKhoan;
    private javax.swing.JPanel Thoat;
    private javax.swing.JPanel TrangChu;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables

    private void openbanhang() {
        Banhang bh = new Banhang();
//        destop.add(bh);
//        bh.setVisible(true);
    }
}
