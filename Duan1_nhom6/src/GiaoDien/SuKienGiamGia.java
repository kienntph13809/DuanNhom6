/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDien;

import Dao.Sukiendao;
import Helper.XDate;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import model.sukien;
import Helper.jdbcKien;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Helperduc;

/**
 *
 * @author LENOVO
 */
public class SuKienGiamGia extends javax.swing.JInternalFrame {

    Sukiendao skd = new Sukiendao();
    DefaultTableModel tb_model;
    DefaultComboBoxModel cbb_Model = new DefaultComboBoxModel();
    Connection cn;
    int index = 0;
    int ud = -1;
    List<sukien> lst;

    /**
     * Creates new form SuKienGiamGia
     */
    public SuKienGiamGia() {
        initComponents();
//        init();
        cn = Helperduc.ketnoi("QLNOITHAT_NHOM6");
        if (cn != null) {
//            JOptionPane.showMessageDialog(this, "kết nối thành công");
        } else {
            JOptionPane.showMessageDialog(this, "kết nối thất bại");
            System.exit(0);
        }
        index = 0;
        tb_model = (DefaultTableModel) TB.getModel();
        loadtable();
        cbb_Model = (DefaultComboBoxModel) CBB.getModel();
//        LoadComBoBox();

    }

//    void init() {
//        lamMoiLoi();
//        model = (DefaultTableModel) TB.getModel();
//        //set radio ngày kết thúc
//        if (cothan.isSelected()) {
//            pnngay.setVisible(true);
//        } else {
//            pnngay.setVisible(false);
//        }
//        //set nut xóa sự kiện
//        if (CBB.getSelectedIndex() == 1) {
//            btxoa.setEnabled(true);
//        } else {
//            btxoa.setEnabled(false);
//        }
//        //
//        skd.loadDatatoTable(model, true);
//
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CBB = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TB = new javax.swing.JTable();
        btxoa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtmask = new javax.swing.JTextField();
        txttensk = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        uudai = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        cothan = new javax.swing.JRadioButton();
        vohan = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        check = new javax.swing.JCheckBox();
        errma = new javax.swing.JLabel();
        errten = new javax.swing.JLabel();
        pnngay = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        ngayketthuc = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btlammoi = new javax.swing.JButton();
        btsua = new javax.swing.JButton();
        btthemsk = new javax.swing.JButton();
        bttimkiem = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtngaybatdau = new javax.swing.JTextField();

        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(176, 228, 246));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("CHƯƠNG TRÌNH GIẢM GIÁ");

        CBB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CBB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ĐANG DIỄN RA", "SỰ  KIỆN ĐÃ KẾT THÚC" }));
        CBB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBBItemStateChanged(evt);
            }
        });
        CBB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBBActionPerformed(evt);
            }
        });

        TB.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        TB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Sự Kiện", "Tên Sự Kiện", "ƯU ĐÃI", "NGÀY BẮT ĐẦU", "NGÀY KẾT THÚC"
            }
        ));
        TB.setRowHeight(30);
        TB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TB);

        btxoa.setText("XÓA");
        btxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btxoaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Mã Sự Kiện");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Tên Sự Kiện");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Ưu Đãi");

        uudai.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        uudai.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                uudaiStateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Loại Sự Kiện");

        buttonGroup1.add(cothan);
        cothan.setSelected(true);
        cothan.setText("Có Thời Hạn");

        buttonGroup1.add(vohan);
        vohan.setText("Vô Hạn");

        jPanel2.setBackground(new java.awt.Color(176, 228, 246));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        check.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        check.setSelected(true);
        check.setText("Tự Hủy Sự Kiện");

        pnngay.setBackground(new java.awt.Color(176, 228, 246));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Ngày Kết Thúc");

        javax.swing.GroupLayout pnngayLayout = new javax.swing.GroupLayout(pnngay);
        pnngay.setLayout(pnngayLayout);
        pnngayLayout.setHorizontalGroup(
            pnngayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnngayLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ngayketthuc, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnngayLayout.setVerticalGroup(
            pnngayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnngayLayout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(pnngayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ngayketthuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.setBackground(new java.awt.Color(176, 228, 246));
        jPanel3.setLayout(new java.awt.GridLayout(2, 2, 25, 25));

        btlammoi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btlammoi.setText("Làm Mới");
        btlammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlammoiActionPerformed(evt);
            }
        });
        jPanel3.add(btlammoi);

        btsua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btsua.setText("Sửa");
        jPanel3.add(btsua);

        btthemsk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btthemsk.setText("Thêm Sự Kiện");
        btthemsk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btthemskActionPerformed(evt);
            }
        });
        jPanel3.add(btthemsk);

        bttimkiem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bttimkiem.setText("Tìm Kiếm");
        jPanel3.add(bttimkiem);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Ngày Bắt Đầu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CBB, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(300, 300, 300)
                                .addComponent(btxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(check)))
                            .addComponent(pnngay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(errma, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(errten, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(uudai, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(28, 28, 28)
                                            .addComponent(cothan)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(vohan, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5)
                                            .addGap(80, 80, 80))))
                                .addComponent(txttensk, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtmask, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtngaybatdau)))))
                    .addComponent(jLabel1))
                .addGap(66, 66, 66))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CBB, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(errma, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtmask, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(errten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txttensk, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uudai, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cothan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vohan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtngaybatdau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnngay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(check)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btlammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlammoiActionPerformed
        btsua.setEnabled(false);
        btthemsk.setEnabled(true);
        lamMoi();
    }//GEN-LAST:event_btlammoiActionPerformed

    private void TBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBMouseClicked
        int index = TB.getSelectedRow();

        txtmask.setText(TB.getValueAt(index, 0).toString());
        txttensk.setText(TB.getValueAt(index, 1).toString());
        uudai.setToolTipText(TB.getValueAt(index, 2).toString());
        txtngaybatdau.setText(TB.getValueAt(index, 3).toString());
        ngayketthuc.setText(TB.getValueAt(index, 4).toString());
        btsua.setEnabled(true);


    }//GEN-LAST:event_TBMouseClicked

    private void CBBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBBItemStateChanged
        if (CBB.getSelectedIndex() == 1) {
            btxoa.setEnabled(true);
            loadtable();
            btsua.setEnabled(false);
        } else {
            btxoa.setEnabled(false);
            loadtable();
            btsua.setEnabled(true);
        }

    }//GEN-LAST:event_CBBItemStateChanged

    private void btthemskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthemskActionPerformed
        try {
            String sql = " insert into SUKIEN(MASK,TENSK,UUDAI,TGKETTHIC)values(?,?,?,GETDATE)";

            PreparedStatement pre = cn.prepareStatement(sql);
            pre.setString(1,txtmask.getText());
            pre.setString(2,txttensk.getText());
            pre.setString(3,uudai.getValue().toString());
//            pre.setString(4,txtngaybatdau.getText());
            pre.setString(4,ngayketthuc.getText());
//            String lsk = "";
//             if (cothan.isSelected()) {
//                lsk = "1";
//            } else {
//                lsk = "0";
//            }
//            pre.setString(6, lsk);
            pre.executeUpdate();
            JOptionPane.showMessageDialog(this, "Thêm Thành công");
            showdetail();
            
           
        } catch (SQLException ex) {
            ex.printStackTrace();
           
        }

    }//GEN-LAST:event_btthemskActionPerformed

    private void uudaiStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_uudaiStateChanged
        try {
            Integer udai = (Integer) uudai.getValue();
            if (udai < 0) {
                JOptionPane.showMessageDialog(this, "Ưu đãi phải >=0");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "chọn lại ưu đãi");

        }

    }//GEN-LAST:event_uudaiStateChanged
    void xoa() {
        try {
            String sql = " delete from SUKIEN where MASK =?";
            PreparedStatement pre = cn.prepareStatement(sql);
            pre.setString(1, txtmask.getText());
            pre.setString(2, txttensk.getText());
            pre.setString(3, String.valueOf(uudai).toString());
            pre.setString(4, String.valueOf(uudai).toString());
            pre.setString(5, String.valueOf(uudai).toString());
            pre.close();

            loadtable();
            txtmask.setText("");
            txttensk.setText("");
        } catch (Exception e) {

        }

    }
    private void btxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxoaActionPerformed
        int chon = JOptionPane.showConfirmDialog(this, "Bạn muốn Hủy Sự Kiện", "xác nhận", JOptionPane.YES_NO_OPTION);

        if (CBB.getSelectedIndex() == 1) {
            btxoa.setEnabled(true);
            loadtable();
        } else {
            btxoa.setEnabled(false);
            xoa();
        }


    }//GEN-LAST:event_btxoaActionPerformed

    private void CBBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBBActionPerformed

    public boolean check() {
        int d = 0;
        lamMoiLoi();
        //check mã
        if (txtmask.getText().length() == 0) {
            errma.setText("Trống mã");
            ++d;
        } else {
            sukien sk = skd.findByMaSK(txtmask.getText());
            if (sk != null) {
                errma.setText("Mã trùng");
                ++d;
            } else {
                errma.setText("");
            }
        }
        //check tên
        if (txttensk.getText().length() == 0) {
            errma.setText("Trống tên");
            ++d;
        } else {
            sukien sk = skd.findByTenSK(txttensk.getText());
            if (sk != null) {
                errten.setText("Trùng tên sự kiện");
                ++d;
            } else {
                errten.setText("");
            }
        }
        //check giá trị ưu đãi
        try {
            Integer udai = (Integer) uudai.getValue();
            if (udai < 0) {
                JOptionPane.showMessageDialog(this, "Ưu đãi phải >=0");
                ++d;
                uudai.setValue(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "chọn lại ưu đãi");
            ++d;
        }

        if (cothan.isSelected()) {
            try {
                if (!skd.checkNgayThem(XDate.getDate())) {
                    JOptionPane.showMessageDialog(this, "Ngày kết thúc sự kiện phải lớn hơn bằng ngày hiện tại");
                    ++d;
                };
            } catch (Exception e) {
            }
        }
        return d == 0 ? true : false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBB;
    private javax.swing.JTable TB;
    private javax.swing.JButton btlammoi;
    private javax.swing.JButton btsua;
    private javax.swing.JButton btthemsk;
    private javax.swing.JButton bttimkiem;
    private javax.swing.JButton btxoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox check;
    private javax.swing.JRadioButton cothan;
    private javax.swing.JLabel errma;
    private javax.swing.JLabel errten;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField ngayketthuc;
    private javax.swing.JPanel pnngay;
    private javax.swing.JTextField txtmask;
    private javax.swing.JTextField txtngaybatdau;
    private javax.swing.JTextField txttensk;
    private javax.swing.JSpinner uudai;
    private javax.swing.JRadioButton vohan;
    // End of variables declaration//GEN-END:variables

    private void lamMoi() {
        txtmask.setEnabled(true);
        txtmask.setText(null);
        txttensk.setText(null);
        uudai.setValue(0);
        cothan.setSelected(true);
        check.setSelected(false);
        lamMoiLoi();
    }

    public void lamMoiLoi() {
        errma.setText("");
        errten.setText("");
    }

//    private void LoadComBoBox() {
//               try {
//         
//            String sql ="select * from SUKIEN";
//            PreparedStatement pre =cn.prepareStatement(sql);
//            //thi hành
//            ResultSet rs = pre.executeQuery();
//            //duyệt rs đổ vào combobox
//            while (rs.next()) {                
//                String mask = rs.getString(1);
//                String tensk = rs.getString(2);
//                 String uudai = rs.getString(3);
//                String ngaybd = rs.getString(4);
//                String ngaykt = rs.getString(5);
//                String lsk = rs.getString(6);
//               cbb_Model.addElement(new sukien(mask, tensk, uudai, ngaybd, ngaykt, lsk));
//            }
//            rs.close();
//            pre.close();
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "lỗi combobox");
//        }
//    }
    private void showdetail() {
        txtmask.setText(TB.getValueAt(index, 0).toString());
        txttensk.setText(TB.getValueAt(index, 1).toString());
        uudai.setValue(TB.getValueAt(index, 3).toString());
        String nbt = (String) TB.getValueAt(index, 4);
        String nkt = (String) TB.getValueAt(index, 5);
        String lsk = (String) TB.getValueAt(index, 6);
        TB.setRowSelectionInterval(index, index);
    }

    private void loadtable() {
        try {

            String sql = " select MASK,TENSK,UUDAI,TGBATDAU,TGKETTHIC,TRANGTHAI\n"
                    + " from SUKIEN";
            Statement stm = cn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            tb_model.setRowCount(0);
            while (rs.next()) {
                String mask = rs.getString(1);
                String tensk = rs.getString(2);
                String uudai = rs.getString(3);
                String ngaybd = rs.getString(4);
                String ngaykt = rs.getString(5);
                String lsk = rs.getString(6);
                tb_model.addRow(new Object[]{
                    mask, tensk, uudai, ngaybd, ngaykt, lsk
                });
            }
            rs.close();
            stm.close();
        } catch (Exception e) {
        }
    }

}
