/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDien;

import Helper.Auth;
import Helper.DialogHelper;
import Helper.Sharehelper;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import javax.swing.JInternalFrame;

/**
 *
 * @author dfg
 */
public class GiaoDienTu_1 extends javax.swing.JFrame {

    Color DefaultColor, ClickerColor;

    /**
     * Creates new form NewJFrame
     */
    public GiaoDienTu_1() {
        initComponents();
        setLocationRelativeTo(null);
        DefaultColor = new Color(176, 228, 246);
        ClickerColor = new Color(102, 255, 204);
        TrangChu.setBackground(DefaultColor);
        SanPham.setBackground(DefaultColor);
        HoaDon.setBackground(DefaultColor);
        TaiKhoan.setBackground(DefaultColor);
        Thoat.setBackground(DefaultColor);
        showLogin();
        lbten.setText(Auth.user.getTentk());
        dongHo();
        ngaythangnam();
    }

    public void showChao() {
        new LoadingTu(this, true).setVisible(true);
    }

    public void showLogin() {
        new DANGNHAP_1(this, true).setVisible(true);
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
//  void dongHo() {
//        javax.swing.Timer t = new javax.swing.Timer(1000, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss aa");
//                Date d = new Date();
//                lblTime.setText(s.format(d));
//            }     
//        });
//        t.start();
//    }

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
                lbtime.setText(s.format(d));
            }
        });
        t.start();
    }

    void ngaythangnam() {
        Calendar c = Calendar.getInstance();
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
        int day = c.get(Calendar.DAY_OF_MONTH);
        int thang = c.get(Calendar.MONTH);
        int nam = c.get(Calendar.YEAR);
        lbnngaythangnam.setText(s.format(d));

    }

    void OpendSanPham() {
        QuanLySanPham qlsp = new QuanLySanPham();
     jDesktopPane1.add(qlsp);
        qlsp.setVisible(true);
    }

    void OpendQLTK() {
        quanlytaikhoan qltk = new quanlytaikhoan();
       jDesktopPane1.add(qltk);
       qltk.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbten = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbtime = new javax.swing.JLabel();
        lbnngaythangnam = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Close = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        TrangChu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SanPham = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        HoaDon = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TaiKhoan = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        sukien = new javax.swing.JPanel();
        lbsk = new javax.swing.JLabel();
        thongke = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Thoat = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(176, 228, 246));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));

        lbten.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbten.setForeground(new java.awt.Color(0, 0, 255));

        user.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        user.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        user.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Desktop\\DuanNhom6\\Duan1_nhom6\\src\\icon\\Unknown person.png")); // NOI18N
        user.setText("USER :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Desktop\\DuanNhom6\\Duan1_nhom6\\src\\icon\\Alarm.png")); // NOI18N
        jLabel3.setText("Time :");

        lbtime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbtime.setForeground(new java.awt.Color(0, 0, 255));

        lbnngaythangnam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbnngaythangnam.setForeground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(user)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbnngaythangnam, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(lbtime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbten, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(lbten, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbtime, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbnngaythangnam, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 130));

        jPanel3.setBackground(new java.awt.Color(176, 228, 246));

        Close.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        Close.setForeground(new java.awt.Color(255, 0, 0));
        Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Close.setText("X");
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("HỆ THỐNG BÁN HÀNG NỘI THẤT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(437, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 976, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(Close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1530, 50));

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

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Trang Chủ");

        javax.swing.GroupLayout TrangChuLayout = new javax.swing.GroupLayout(TrangChu);
        TrangChu.setLayout(TrangChuLayout);
        TrangChuLayout.setHorizontalGroup(
            TrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TrangChuLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        TrangChuLayout.setVerticalGroup(
            TrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
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
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Bán Hàng");

        javax.swing.GroupLayout SanPhamLayout = new javax.swing.GroupLayout(SanPham);
        SanPham.setLayout(SanPhamLayout);
        SanPhamLayout.setHorizontalGroup(
            SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SanPhamLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(112, 112, 112))
        );
        SanPhamLayout.setVerticalGroup(
            SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
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

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sản Phẩm");

        javax.swing.GroupLayout HoaDonLayout = new javax.swing.GroupLayout(HoaDon);
        HoaDon.setLayout(HoaDonLayout);
        HoaDonLayout.setHorizontalGroup(
            HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HoaDonLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        HoaDonLayout.setVerticalGroup(
            HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
        );

        TaiKhoan.setBackground(new java.awt.Color(176, 228, 246));
        TaiKhoan.setPreferredSize(new java.awt.Dimension(340, 88));
        TaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TaiKhoanMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TaiKhoanMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tài Khoản");

        javax.swing.GroupLayout TaiKhoanLayout = new javax.swing.GroupLayout(TaiKhoan);
        TaiKhoan.setLayout(TaiKhoanLayout);
        TaiKhoanLayout.setHorizontalGroup(
            TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TaiKhoanLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        TaiKhoanLayout.setVerticalGroup(
            TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
        );

        sukien.setBackground(new java.awt.Color(176, 228, 246));
        sukien.setPreferredSize(new java.awt.Dimension(100, 88));
        sukien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sukienMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sukienMousePressed(evt);
            }
        });

        lbsk.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbsk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbsk.setText("Sự Kiện");
        lbsk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbskMousePressed(evt);
            }
        });

        javax.swing.GroupLayout sukienLayout = new javax.swing.GroupLayout(sukien);
        sukien.setLayout(sukienLayout);
        sukienLayout.setHorizontalGroup(
            sukienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sukienLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(lbsk, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sukienLayout.setVerticalGroup(
            sukienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbsk, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
        );

        thongke.setBackground(new java.awt.Color(176, 228, 246));
        thongke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thongkeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                thongkeMousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Thống Kê");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });

        javax.swing.GroupLayout thongkeLayout = new javax.swing.GroupLayout(thongke);
        thongke.setLayout(thongkeLayout);
        thongkeLayout.setHorizontalGroup(
            thongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thongkeLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        thongkeLayout.setVerticalGroup(
            thongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
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

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
                .addGap(101, 101, 101)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        ThoatLayout.setVerticalGroup(
            ThoatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThoatLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Thoat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(TaiKhoan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                        .addComponent(sukien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(SanPham, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HoaDon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(thongke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(355, 355, 355))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(TrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sukien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thongke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Thoat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 123, 330, 830));

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Desktop\\DuanNhom6\\Duan1_nhom6\\src\\icon\\02600294606895.5e832b1f06bcf.jpg")); // NOI18N

        jDesktopPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 1228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        jPanel2.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 1200, 900));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        thongke.setBackground(DefaultColor);
        sukien.setBackground(DefaultColor);
    }//GEN-LAST:event_TrangChuMousePressed

    private void SanPhamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SanPhamMousePressed
        // TODO add your handling code here:
        TrangChu.setBackground(DefaultColor);
        SanPham.setBackground(ClickerColor);
        HoaDon.setBackground(DefaultColor);
        TaiKhoan.setBackground(DefaultColor);
        Thoat.setBackground(DefaultColor);
        thongke.setBackground(DefaultColor);
        sukien.setBackground(DefaultColor);
    }//GEN-LAST:event_SanPhamMousePressed

    private void HoaDonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoaDonMousePressed
        // TODO add your handling code here:ư
        TrangChu.setBackground(DefaultColor);
        SanPham.setBackground(DefaultColor);
        HoaDon.setBackground(ClickerColor);
        TaiKhoan.setBackground(DefaultColor);
        Thoat.setBackground(DefaultColor);
        thongke.setBackground(DefaultColor);
        sukien.setBackground(DefaultColor);
    }//GEN-LAST:event_HoaDonMousePressed

    private void TaiKhoanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TaiKhoanMousePressed
        // TODO add your handling code here:
        TrangChu.setBackground(DefaultColor);
        SanPham.setBackground(DefaultColor);
        HoaDon.setBackground(DefaultColor);
        TaiKhoan.setBackground(ClickerColor);
        Thoat.setBackground(DefaultColor);
        thongke.setBackground(DefaultColor);
        sukien.setBackground(DefaultColor);
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
        thongke.setBackground(DefaultColor);
        sukien.setBackground(DefaultColor);

    }//GEN-LAST:event_ThoatMousePressed

    private void ThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThoatMouseClicked

        exit();
    }//GEN-LAST:event_ThoatMouseClicked

    private void sukienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sukienMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_sukienMouseClicked

    private void sukienMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sukienMousePressed
        TrangChu.setBackground(DefaultColor);
        SanPham.setBackground(DefaultColor);
        HoaDon.setBackground(DefaultColor);
        TaiKhoan.setBackground(DefaultColor);
        Thoat.setBackground(DefaultColor);
        thongke.setBackground(DefaultColor);
        sukien.setBackground(ClickerColor);
    }//GEN-LAST:event_sukienMousePressed

    private void thongkeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thongkeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_thongkeMouseClicked

    private void thongkeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thongkeMousePressed
        TrangChu.setBackground(DefaultColor);
        SanPham.setBackground(DefaultColor);
        HoaDon.setBackground(DefaultColor);
        TaiKhoan.setBackground(DefaultColor);
        Thoat.setBackground(DefaultColor);
        thongke.setBackground(ClickerColor);
        sukien.setBackground(DefaultColor);
    }//GEN-LAST:event_thongkeMousePressed

    private void lbskMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbskMousePressed
        TrangChu.setBackground(DefaultColor);
        SanPham.setBackground(DefaultColor);
        HoaDon.setBackground(DefaultColor);
        TaiKhoan.setBackground(DefaultColor);
        Thoat.setBackground(DefaultColor);
        thongke.setBackground(DefaultColor);
        sukien.setBackground(ClickerColor);
    }//GEN-LAST:event_lbskMousePressed

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        TrangChu.setBackground(DefaultColor);
        SanPham.setBackground(DefaultColor);
        HoaDon.setBackground(DefaultColor);
        TaiKhoan.setBackground(DefaultColor);
        Thoat.setBackground(DefaultColor);
        thongke.setBackground(ClickerColor);
        sukien.setBackground(DefaultColor);
    }//GEN-LAST:event_jLabel8MousePressed

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
            java.util.logging.Logger.getLogger(GiaoDienTu_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienTu_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienTu_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienTu_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienTu_1().setVisible(true);
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lbnngaythangnam;
    private javax.swing.JLabel lbsk;
    private javax.swing.JLabel lbten;
    private javax.swing.JLabel lbtime;
    private javax.swing.JPanel sukien;
    private javax.swing.JPanel thongke;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables

    private void openbanhang() {
        Banhang bh = new Banhang();
//        destop.add(bh);
//        bh.setVisible(true);
    }
}
