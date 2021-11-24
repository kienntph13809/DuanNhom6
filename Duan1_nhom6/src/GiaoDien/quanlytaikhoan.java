/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDien;

import Dao.TaiKhoanDao;
import Helper.checkTu;
import static java.awt.Color.pink;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.taikhoan;
import static sun.net.www.MimeTable.loadTable;

/**
 *
 * @author Admin
 */
public class quanlytaikhoan extends javax.swing.JInternalFrame {

    /**
     * Creates new form quanlytaikhoan
     */
    TaiKhoanDao tkdaotu = new TaiKhoanDao();
    DefaultTableModel model;
    int index = 0;
    List<model.taikhoan> listTaiKhoan = new ArrayList<>();

    public quanlytaikhoan() {
        initComponents();
        loadTable();
    }

    public taikhoan getModel() {
        taikhoan model = new taikhoan();
        model.setTentk(txttaikhoan.getText());
        model.setHoten(txtHoTen.getText());
        model.setMatkhau(new String(txtatkhau.getPassword()));  
        if (rdQuanly.isSelected()) {
            model.setVaitro(true);
        }
        if (rdNhanVien.isSelected()) {
            model.setVaitro(false);
        }
        model.setTrangthai("1");
        return model;
    }

    public taikhoan getModel1() {
        taikhoan model = new taikhoan();
        model.setTentk(txttaikhoan.getText());
        model.setHoten(txtHoTen.getText());
        model.setMatkhau(new String(txtatkhau.getPassword()));
          if (rdQuanly.isSelected()) {
            model.setVaitro(true);
        }
        if (rdNhanVien.isSelected()) {
            model.setVaitro(false);
        }
         if (rdVoHieuHoa.isSelected()) {
            model.setTrangthai("0");
        } else {
            model.setTrangthai("1");
        }
        return model;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTaiKhoan = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txttaikhoan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtatkhau = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        rdQuanly = new javax.swing.JRadioButton();
        rdNhanVien = new javax.swing.JRadioButton();
        btnAdd = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        rdVoHieuHoa = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setPreferredSize(new java.awt.Dimension(1210, 750));

        jPanel2.setBackground(new java.awt.Color(176, 228, 246));
        jPanel2.setPreferredSize(new java.awt.Dimension(1150, 660));

        tbTaiKhoan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tài Khoản", "Họ Tên", "Mật Khẩu", "Vai Trò"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTaiKhoanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbTaiKhoan);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Tài  Khoản:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Mật Khẩu:");

        txtatkhau.setText("jPasswordField1");
        txtatkhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtatkhauActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Vai Trò");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Edit_32x32.png"))); // NOI18N
        jButton1.setText("Sửa thông tin User");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Tìm Kiếm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Delete_32x32.png"))); // NOI18N
        jButton3.setText("Xóa Thông tin User");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        buttonGroup2.add(rdQuanly);
        rdQuanly.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rdQuanly.setSelected(true);
        rdQuanly.setText("Quản Lý");

        buttonGroup2.add(rdNhanVien);
        rdNhanVien.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rdNhanVien.setText("Nhân Viên");

        btnAdd.setText("Thêm Tài Khoản");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Họ Tên");

        rdVoHieuHoa.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rdVoHieuHoa.setText("Vô Hiệu Hóa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rdQuanly)
                                        .addGap(28, 28, 28)
                                        .addComponent(rdNhanVien))
                                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(rdVoHieuHoa)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtHoTen, txtatkhau, txttaikhoan});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txttaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdQuanly)
                            .addComponent(rdNhanVien))))
                .addGap(62, 62, 62)
                .addComponent(rdVoHieuHoa)
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2, jButton3});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtHoTen, txtatkhau, txttaikhoan});

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\dfg\\Pictures\\ảnh đm\\QLTK.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 344, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 646, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.update();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if (checkTu.checkNullText(txttaikhoan) && checkTu.checkNullPass(txtatkhau) && checkMa()) {
            if (doiMatKhau()) {
                insert();
            }

        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void tbTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTaiKhoanMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            this.index = tbTaiKhoan.getSelectedRow();//lấy vị trí dòng được chọn
            if (this.index >= 0) {

                showDetail(index);

            }
        }
    }//GEN-LAST:event_tbTaiKhoanMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String a;
        String timkiem = JOptionPane.showInputDialog(this, "Tìm kiếm tài khoản");

        DefaultTableModel model = (DefaultTableModel) tbTaiKhoan.getModel();
        model.setRowCount(0);
        try {
            int i = 1;
            List<taikhoan> hd1 = TaiKhoanDao.TimKiemMa(timkiem);
            for (taikhoan hd : hd1) {
                if (hd.isVaitro()== false) {
                    a = "Nhân Viên";

                } else {
                    a = "Quản lí";
                }
                Object[] row = {
                    i++,
                    hd.getTentk(),
                    hd.getHoten(),
                    hd.getMatkhau(),
                    a
                };

                model.addRow(row);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtatkhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtatkhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtatkhauActionPerformed

    public void loadTable() {
        String a;
        DefaultTableModel model = (DefaultTableModel) tbTaiKhoan.getModel();
        model.setRowCount(0);
        try {
            int i = 1;
            List<taikhoan> tkd = TaiKhoanDao.HienThi();
            for (taikhoan tk : tkd) {
               if (tk.isVaitro()== false) {
                    a = "Nhân Viên";

                } else {
                    a = "Quản lí";
                }
                Object[] row = {
                    i++,
                    tk.getTentk(),
                    tk.getHoten(),
                    tk.getMatkhau(),
                    a
                };

                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

//    public void loadTable1() {
//        String a;
//        DefaultTableModel model = (DefaultTableModel) tbTaiKhoan.getModel();
//        model.setRowCount(0);
//        try {
//            int i = 1;
//            List<taikhoan> tkd = TaiKhoanDao.HienThi1();
//            for (taikhoan tk : tkd) {
//                if (tk.isVaitro() == false) {
//                    a = "Nhân Viên";
//                } else {
//                    a = "Quản lý";
//                }
//                Object[] row = {
//                    i++,
//                    tk.getTentk(),
//                    tk.getHoten(),
//                    tk.getMatkhau(),
//                    a};
//
//                model.addRow(row);
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, e);
//        }
//    }

    public void insert() {
        taikhoan model = getModel();
        try {
            TaiKhoanDao.insert(model);
            JOptionPane.showMessageDialog(this, "Thêm thành công");
            this.loadTable();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Thêm thất bại");
        }
    }

    public void update() {
        taikhoan model = getModel();
        String confirm = new String(txtatkhau.getPassword());
        if (!confirm.equals(model.getMatkhau())) {
            txtatkhau.setBackground(pink);
            JOptionPane.showMessageDialog(this, "Xác nhận mật khẩu không đúng!");
        } else {
            try {
                TaiKhoanDao.update(model);     //cập nhật nhân viên theo maNV
                this.loadTable();//điền tt mới vào bảng
                JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void New() {
        this.txttaikhoan.setText("");
        this.txtatkhau.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdNhanVien;
    private javax.swing.JRadioButton rdQuanly;
    private javax.swing.JCheckBox rdVoHieuHoa;
    private javax.swing.JTable tbTaiKhoan;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JPasswordField txtatkhau;
    private javax.swing.JTextField txttaikhoan;
    // End of variables declaration//GEN-END:variables

    private void showDetail(int row) {
        txttaikhoan.setText(tbTaiKhoan.getValueAt(row, 1).toString());
        txtHoTen.setText(tbTaiKhoan.getValueAt(row, 2).toString());
        txtatkhau.setText(tbTaiKhoan.getValueAt(row, 3).toString());
        if (tbTaiKhoan.getValueAt(row, 4).equals("Quản lí")) {
            rdQuanly.setSelected(true);
        }
        if (tbTaiKhoan.getValueAt(row, 4).equals("Nhân Viên")) {
            rdNhanVien.setSelected(true);
        }

    }

    public boolean doiMatKhau() {
        taikhoan model = getModel();
        String confirm = new String(txtatkhau.getPassword());
        if (!confirm.equals(model.getMatkhau())) {
            txtatkhau.setBackground(pink);
            JOptionPane.showMessageDialog(this, "Xác nhận mật khẩu không đúng!");
            return false;
        } else {
            return true;
        }

    }

    public boolean checkMa() {
        String tenTaiKhoan = txttaikhoan.getText();
        try {
            taikhoan tk = tkdaotu.checkTrungMa(tenTaiKhoan);
            if (tk != null) {
                JOptionPane.showMessageDialog(this, "Đã trùng tên đăng nhập");
                return false;
            }
            if (tk == null) {
                System.out.println("Thêm thành công2");
                return true;
            }

        } catch (Exception e) {
        }
        return true;

    }

    public void delete() {
        int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa?", "HỎi xóa", JOptionPane.YES_NO_OPTION);
        if (hoi != JOptionPane.YES_OPTION) {
            return;
        }
        String tendn = txttaikhoan.getText();
        try {
            tkdaotu.delete(tendn);   //xóa nhân viên theo maNV
            this.loadTable();//điền tt mới vào bảng
            //  this.clear();       //xóa trắng form và chỉnh lại status
            JOptionPane.showMessageDialog(this, "Xóa thành công!");
        } catch (Exception e) {
        }

    }
}
