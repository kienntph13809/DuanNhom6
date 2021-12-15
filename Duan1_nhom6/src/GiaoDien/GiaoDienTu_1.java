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
        BanHang.setBackground(DefaultColor);
        SanPham.setBackground(DefaultColor);
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
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Close = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        TrangChu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BanHang = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        SanPham = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TaiKhoan = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        sukien = new javax.swing.JPanel();
        lbsk = new javax.swing.JLabel();
        khachhang = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Thoat = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        HoaDon = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        thongke = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
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
        user.setText("USER :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Time :");

        lbtime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbtime.setForeground(new java.awt.Color(0, 0, 255));

        lbnngaythangnam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbnngaythangnam.setForeground(new java.awt.Color(0, 0, 255));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Ngày :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(user)
                    .addComponent(jLabel3)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbnngaythangnam, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(lbtime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbten, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbten, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbtime, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbnngaythangnam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 110));

        jPanel3.setBackground(new java.awt.Color(176, 228, 246));

        Close.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        Close.setForeground(new java.awt.Color(255, 0, 0));
        Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Close.setText("X");
        Close.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CloseMousePressed(evt);
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
                .addContainerGap(447, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 976, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 50));

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
        jLabel1.setText("Sự Kiện");

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
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        );

        BanHang.setBackground(new java.awt.Color(176, 228, 246));
        BanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BanHangMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BanHangMousePressed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 204, 204));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Bán Hàng");

        javax.swing.GroupLayout BanHangLayout = new javax.swing.GroupLayout(BanHang);
        BanHang.setLayout(BanHangLayout);
        BanHangLayout.setHorizontalGroup(
            BanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BanHangLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(112, 112, 112))
        );
        BanHangLayout.setVerticalGroup(
            BanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
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

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sản Phẩm");

        javax.swing.GroupLayout SanPhamLayout = new javax.swing.GroupLayout(SanPham);
        SanPham.setLayout(SanPhamLayout);
        SanPhamLayout.setHorizontalGroup(
            SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SanPhamLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        SanPhamLayout.setVerticalGroup(
            SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
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
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
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
                .addContainerGap(114, Short.MAX_VALUE))
        );
        sukienLayout.setVerticalGroup(
            sukienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbsk, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        );

        khachhang.setBackground(new java.awt.Color(176, 228, 246));
        khachhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                khachhangMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                khachhangMousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Khách Hàng");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });

        javax.swing.GroupLayout khachhangLayout = new javax.swing.GroupLayout(khachhang);
        khachhang.setLayout(khachhangLayout);
        khachhangLayout.setHorizontalGroup(
            khachhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(khachhangLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        khachhangLayout.setVerticalGroup(
            khachhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
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
                .addGap(111, 111, 111)
                .addComponent(jLabel6)
                .addContainerGap(138, Short.MAX_VALUE))
        );
        ThoatLayout.setVerticalGroup(
            ThoatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        );

        HoaDon.setBackground(new java.awt.Color(176, 228, 246));
        HoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HoaDonMousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Hóa Đơn");

        javax.swing.GroupLayout HoaDonLayout = new javax.swing.GroupLayout(HoaDon);
        HoaDon.setLayout(HoaDonLayout);
        HoaDonLayout.setHorizontalGroup(
            HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HoaDonLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HoaDonLayout.setVerticalGroup(
            HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
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

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setText("Thống Kê");

        javax.swing.GroupLayout thongkeLayout = new javax.swing.GroupLayout(thongke);
        thongke.setLayout(thongkeLayout);
        thongkeLayout.setHorizontalGroup(
            thongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thongkeLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        thongkeLayout.setVerticalGroup(
            thongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sukien, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(BanHang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SanPham, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(TrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Thoat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(thongke, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HoaDon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(khachhang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(459, 459, 459))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(TrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BanHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sukien, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(khachhang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thongke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Thoat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 103, 330, 850));

        jLabel10.setBackground(new java.awt.Color(176, 228, 246));

        jDesktopPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 1190, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        jPanel2.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 1210, 900));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        BanHang.setBackground(DefaultColor);
        SanPham.setBackground(DefaultColor);
        TaiKhoan.setBackground(DefaultColor);
        Thoat.setBackground(DefaultColor);
        khachhang.setBackground(DefaultColor);
        sukien.setBackground(DefaultColor);
        thongke.setBackground(DefaultColor);
        HoaDon.setBackground(DefaultColor);
    }//GEN-LAST:event_TrangChuMousePressed

    private void BanHangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BanHangMousePressed
        // TODO add your handling code here:
        TrangChu.setBackground(DefaultColor);
        BanHang.setBackground(ClickerColor);
        SanPham.setBackground(DefaultColor);
        TaiKhoan.setBackground(DefaultColor);
        Thoat.setBackground(DefaultColor);
        khachhang.setBackground(DefaultColor);
        sukien.setBackground(DefaultColor);
        thongke.setBackground(DefaultColor);
        HoaDon.setBackground(DefaultColor);
    }//GEN-LAST:event_BanHangMousePressed

    private void SanPhamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SanPhamMousePressed
        // TODO add your handling code here:ư
        TrangChu.setBackground(DefaultColor);
        BanHang.setBackground(DefaultColor);
        SanPham.setBackground(ClickerColor);
        TaiKhoan.setBackground(DefaultColor);
        Thoat.setBackground(DefaultColor);
        khachhang.setBackground(DefaultColor);
        sukien.setBackground(DefaultColor);
        thongke.setBackground(DefaultColor);
        HoaDon.setBackground(DefaultColor);
    }//GEN-LAST:event_SanPhamMousePressed

    private void TaiKhoanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TaiKhoanMousePressed
        // TODO add your handling code here:
        TrangChu.setBackground(DefaultColor);
        BanHang.setBackground(DefaultColor);
        SanPham.setBackground(DefaultColor);
        TaiKhoan.setBackground(ClickerColor);
        Thoat.setBackground(DefaultColor);
        khachhang.setBackground(DefaultColor);
        sukien.setBackground(DefaultColor);
        thongke.setBackground(DefaultColor);
        HoaDon.setBackground(DefaultColor);
    }//GEN-LAST:event_TaiKhoanMousePressed

    private void TrangChuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrangChuMouseClicked
        // TODO add your handling code here:
        SuKienGiamGia sk = new SuKienGiamGia();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(sk).setVisible(true);


    }//GEN-LAST:event_TrangChuMouseClicked

    private void BanHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BanHangMouseClicked
        // TODO add your handling code here:
        Banhang bh = new Banhang();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(bh).setVisible(true);
    }//GEN-LAST:event_BanHangMouseClicked

    private void SanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SanPhamMouseClicked
        // TODO add your handling code here:
        QuanLySanPham qlsp = new QuanLySanPham();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(qlsp).setVisible(true);
    }//GEN-LAST:event_SanPhamMouseClicked

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
        BanHang.setBackground(DefaultColor);
        SanPham.setBackground(DefaultColor);
        TaiKhoan.setBackground(DefaultColor);
        Thoat.setBackground(ClickerColor);
        khachhang.setBackground(DefaultColor);
        sukien.setBackground(DefaultColor);
        thongke.setBackground(DefaultColor);
        HoaDon.setBackground(DefaultColor);

    }//GEN-LAST:event_ThoatMousePressed

    private void ThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThoatMouseClicked

        exit();
    }//GEN-LAST:event_ThoatMouseClicked

    private void sukienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sukienMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_sukienMouseClicked

    private void sukienMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sukienMousePressed
        TrangChu.setBackground(DefaultColor);
        BanHang.setBackground(DefaultColor);
        SanPham.setBackground(DefaultColor);
        TaiKhoan.setBackground(DefaultColor);
        Thoat.setBackground(DefaultColor);
        khachhang.setBackground(DefaultColor);
        sukien.setBackground(ClickerColor);
        thongke.setBackground(DefaultColor);
        HoaDon.setBackground(DefaultColor);
    }//GEN-LAST:event_sukienMousePressed

    private void khachhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khachhangMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_khachhangMouseClicked

    private void khachhangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khachhangMousePressed
        TrangChu.setBackground(DefaultColor);
        BanHang.setBackground(DefaultColor);
        SanPham.setBackground(DefaultColor);
        TaiKhoan.setBackground(DefaultColor);
        Thoat.setBackground(DefaultColor);
        khachhang.setBackground(ClickerColor);
        sukien.setBackground(DefaultColor);
        thongke.setBackground(DefaultColor);
        HoaDon.setBackground(DefaultColor);
    }//GEN-LAST:event_khachhangMousePressed

    private void lbskMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbskMousePressed
        TrangChu.setBackground(DefaultColor);
        BanHang.setBackground(DefaultColor);
        SanPham.setBackground(DefaultColor);
        TaiKhoan.setBackground(DefaultColor);
        Thoat.setBackground(DefaultColor);
        khachhang.setBackground(DefaultColor);
        sukien.setBackground(ClickerColor);
    }//GEN-LAST:event_lbskMousePressed

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        TrangChu.setBackground(DefaultColor);
        BanHang.setBackground(DefaultColor);
        SanPham.setBackground(DefaultColor);
        TaiKhoan.setBackground(DefaultColor);
        Thoat.setBackground(DefaultColor);
        khachhang.setBackground(ClickerColor);
        sukien.setBackground(DefaultColor);
    }//GEN-LAST:event_jLabel8MousePressed

    private void CloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMousePressed
        Close.setBackground(ClickerColor.red);
    }//GEN-LAST:event_CloseMousePressed

    private void HoaDonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoaDonMousePressed
        TrangChu.setBackground(DefaultColor);
        BanHang.setBackground(DefaultColor);
        SanPham.setBackground(DefaultColor);
        TaiKhoan.setBackground(DefaultColor);
        Thoat.setBackground(DefaultColor);
        khachhang.setBackground(DefaultColor);
        sukien.setBackground(DefaultColor);
        thongke.setBackground(DefaultColor);
        HoaDon.setBackground(ClickerColor);
    }//GEN-LAST:event_HoaDonMousePressed

    private void thongkeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thongkeMousePressed
        TrangChu.setBackground(DefaultColor);
        BanHang.setBackground(DefaultColor);
        SanPham.setBackground(DefaultColor);
        TaiKhoan.setBackground(DefaultColor);
        Thoat.setBackground(DefaultColor);
        khachhang.setBackground(DefaultColor);
        sukien.setBackground(DefaultColor);
        thongke.setBackground(ClickerColor);
        HoaDon.setBackground(DefaultColor);
    }//GEN-LAST:event_thongkeMousePressed

    private void thongkeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thongkeMouseClicked
        // TODO add your handling code here:
        ThongKe qlsp = new ThongKe();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(qlsp).setVisible(true);
    }//GEN-LAST:event_thongkeMouseClicked

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
    private javax.swing.JPanel BanHang;
    private javax.swing.JLabel Close;
    private javax.swing.JPanel HoaDon;
    private javax.swing.JPanel SanPham;
    private javax.swing.JPanel TaiKhoan;
    private javax.swing.JPanel Thoat;
    private javax.swing.JPanel TrangChu;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel khachhang;
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
