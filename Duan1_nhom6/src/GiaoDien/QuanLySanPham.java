/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDien;

import Dao.ChatLieuDAO;
import Dao.SanPhamDao;
import Dao.TaiKhoanDao;
import Helper.DialogHelper;
import Helper.Sharehelper;
import static java.awt.Color.pink;
import java.io.File;
import java.sql.PreparedStatement;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ChatLieu;
import model.DanhMuc;
import model.Sanpham;
import model.taikhoan;

/**
 *
 * @author dfg
 */
public class QuanLySanPham extends javax.swing.JInternalFrame {

    /**
     * Creates new form QuanLySanPham
     */
    Dao.DanhMuc daoDM = new Dao.DanhMuc();
    SanPhamDao daoSP = new SanPhamDao();
    ChatLieuDAO daocl = new ChatLieuDAO();
    JFileChooser fileChooser = new JFileChooser();
    DefaultTableModel model1;
    int viTri = 0;
    int row = 0;
    int vitriSPCT;
  

    public QuanLySanPham() {
        initComponents();
        loadtable();
        fillcomboboxdanhmuc();
        fillcomboboxChatLieu();

    }

    void fillcomboboxdanhmuc() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) CboDanhMuc.getModel();
        model.removeAllElements();
        try {
            List<DanhMuc> list = daoDM.selectListDanhMuc();
            for (DanhMuc x : list) {
                model.addElement(x);
            }
        } catch (Exception e) {
            //DialogHelper.alert(this, "lõi truy vấn combobox danh Mục");
            System.out.println(e);
        }
    }

    void fillcomboboxChatLieu() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbChatLieu.getModel();
        model.removeAllElements();
        try {
            List<ChatLieu> list = daocl.selectListChatLieu();
            for (ChatLieu x : list) {
                model.addElement(x);
            }
        } catch (Exception e) {
            //DialogHelper.alert(this, "lõi truy vấn combobox Chất Liệu");
            System.out.println(e);
        }
    }

    void loadtable() {
        String a;
        DefaultTableModel model = (DefaultTableModel) tbnSanPham.getModel();
        model.setRowCount(0);

        try {
            List<Sanpham> list = daoSP.getListSanPham();
            for (Sanpham sp : list) {
                if (sp.getTrangthai() == false) {
                    a = "Hết Hàng";

                } else {
                    a = "Còn Hàng";
                }
                Object[] row = {
                    sp.getMasp(),
                    sp.getTensp(),
                    sp.getSoluong(),
                    sp.getChatlieu(),
                    sp.getDongia(),
                    sp.getMota(),
                    sp.getTenDm(),
                    
                    a

                };
                model.addRow(row);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);

        }
    }

    Sanpham getModel() {
        DanhMuc dm = (DanhMuc) CboDanhMuc.getSelectedItem();
        ChatLieu cl = (ChatLieu) cbChatLieu.getSelectedItem();
        Sanpham model = new Sanpham();
        String SoSp = "SP0"+daoSP.getSoSP();
        model.setMasp(SoSp);
        model.setTensp(txtTenSp.getText());
        model.setSoluong(Integer.valueOf(txtSoLuong.getText()));
        model.setMaCL(cl.getMacl());
        model.setDongia(Float.valueOf(txtDonGia1.getText()));
        model.setMadm(dm.getMadm());

        model.setMota(txtMoTa.getText());
        model.setTrangthai(true);
       
        return model;

    }

    void insert() {
        int so;
        Sanpham model = getModel();
        try {
         
            daoSP.insert(model);
            this.loadtable();
            this.clear();
            DialogHelper.alert(this, "Thêm mới thành công!");
        } catch (Exception e) {
//                DialogHelper.alert(this, "Thêm mới thất bại!");
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "Lỗi TS");
        }
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTenSp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDonGia1 = new javax.swing.JTextField();
        cbChatLieu = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        CboDanhMuc = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMoTa = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        rboConHang = new javax.swing.JRadioButton();
        rboHetHang = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbnSanPham = new javax.swing.JTable();
        txtSoLuong = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtMaSp = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(1210, 750));

        jPanel2.setBackground(new java.awt.Color(176, 228, 246));
        jPanel2.setPreferredSize(new java.awt.Dimension(1210, 780));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Tên Sản Phẩm :");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Số Lượng :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Chất Liệu :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Đơn Giá :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Tên Danh Mục :");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Mô Tả :");

        txtMoTa.setColumns(20);
        txtMoTa.setRows(5);
        jScrollPane1.setViewportView(txtMoTa);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Trạng Thái :");

        buttonGroup1.add(rboConHang);
        rboConHang.setText("Còn Hàng");

        buttonGroup1.add(rboHetHang);
        rboHetHang.setText("Hết Hàng");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Tìm Kiếm Sản Phẩm :");

        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });

        tbnSanPham.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbnSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sản Phẩm", "TÊN SẢN PHẨM", "SỐ LƯỢNG", "Chất Liệu", "Đơn Giá", "Mô Tả", "Tên DanhMuc", "Trạng Thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbnSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbnSanPhamMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbnSanPham);

        btnThem.setText("Thêm SP");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa SP");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Làm Mới");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Mã Sản Phẩm :");

        txtMaSp.setEnabled(false);
        txtMaSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaSpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTenSp, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaSp, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDonGia1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(btnThem)
                                                .addGap(70, 70, 70)
                                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CboDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(rboConHang)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(rboHetHang, javax.swing.GroupLayout.Alignment.TRAILING)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(btnXoa))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtMaSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTenSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CboDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoLuong))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDonGia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rboConHang)
                                .addComponent(rboHetHang))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1194, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        if (Check()) {
           return;
        } else {
             insert();
        }
        
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        Update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        txtTenSp.setText("");
        txtDonGia1.setText("");
        txtSoLuong.setText("");
        txtTimKiem.setText("");
        txtMoTa.setText("");
        CboDanhMuc.setSelectedItem(0);
        cbChatLieu.setSelectedItem(0);
        loadtable();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tbnSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbnSanPhamMouseClicked
        // TODO add your handling code here:
        
        //clickTable();
        if (evt.getClickCount() == 2) {
            row = tbnSanPham.getSelectedRow();      
            setForm();
        }
    }//GEN-LAST:event_tbnSanPhamMouseClicked

    private void txtMaSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaSpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaSpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CboDanhMuc;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbChatLieu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rboConHang;
    private javax.swing.JRadioButton rboHetHang;
    private javax.swing.JTable tbnSanPham;
    private javax.swing.JTextField txtDonGia1;
    private javax.swing.JTextField txtMaSp;
    private javax.swing.JTextArea txtMoTa;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenSp;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    private boolean isValidate() {
        try {
            if (txtTenSp.getText().trim().equals("")) {

                return true;
            } else if (txtDonGia1.getText().trim().equals("")) {

                return true;

            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    public void update() {
        Sanpham model = getModel();

        String confirm = new String(txtMaSp.getText());
        if (!confirm.equals(model.getTensp())) {
            txtTenSp.setBackground(pink);
            JOptionPane.showMessageDialog(this, "Cập Nhật Không Thành Công");
        } else {
            try {

                //cập nhật nhân viên theo maNV
                this.loadtable();
                //điền tt mới vào bảng
                JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    Sanpham getFromSP() {
        DanhMuc dm = (DanhMuc) CboDanhMuc.getSelectedItem();
        Sanpham sp = new Sanpham();
        sp.setTensp(txtTenSp.getText());
        sp.setMadm(sp.getMadm());
        return sp;
    }

// void fillToTable() {
//         
//        model1 = (DefaultTableModel) tbnSanPham.getModel();
//        model1.setRowCount(0);
//        try {
//           
//            for (Sanpham x : ) {
//                model1.addRow(new Object[]{
//                    x.getMaSp(), x.getTenSp(), x.getTenDanhMuc(), x.getNhaSX(), x.getNuocSX()
//                });
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    
//    }
//    private void fillTableData() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void clickTable() {
//         txtTenSp.setText(model1.getValueAt(viTri, 0).toString());
//        txtSoLuong.setText(model1.getValueAt(viTri, 1).toString());
//        setSelectedComboboxCL(tbnSanPham.getValueAt(viTri, 3).toString() + " - " + tbnSanPham.getValueAt(viTri, 4).toString(), cbChatLieu);
//        setSelectedComboboxDM(tbnSanPham.getValueAt(viTri, 2).toString(), CboDanhMuc);
//
//    }
//     public void setSelectedComboboxDM(String cbbselected, JComboBox cbb) {
//        for (int i = 0; i < cbb.getItemCount(); i++) {
//            DanhMuc m = (DanhMuc) cbb.getItemAt(i);
//            if (m != null) {
//                if (cbbselected.trim().equals(m.getTendm())) {
//                    cbb.setSelectedItem(m);
//                }
//            }
//        }
//    }
//
//    public void setSelectedComboboxCL(String cbbselected, JComboBox cbb) {
//        for (int i = 0; i < cbb.getItemCount(); i++) {
//            ChatLieu m = (ChatLieu) cbb.getItemAt(i);
//            if (m != null) {
//                 if (cbbselected.trim().equals(m.getTencl())) {
//                    cbb.setSelectedItem(m);
//                }
//            }
//        }
//    }
    void clear() {
        Sanpham model = new Sanpham();
        ChatLieu chatlieu = (ChatLieu) cbChatLieu.getSelectedItem();
        model.setChatlieu(chatlieu.getTencl());

    }

    private void setForm() {
        int index = 0;
        txtMaSp.setText(tbnSanPham.getValueAt(row, 0).toString());
        txtTenSp.setText(tbnSanPham.getValueAt(row, 1).toString());
        txtSoLuong.setText(tbnSanPham.getValueAt(viTri, 2).toString());
       cbChatLieu.setSelectedItem(tbnSanPham.getValueAt(row, 3));
       txtDonGia1.setText(tbnSanPham.getValueAt(row, 4).toString());
       txtMoTa.setText(tbnSanPham.getValueAt(row, 5).toString());
       CboDanhMuc.setSelectedItem(tbnSanPham.getValueAt(row,6));
        if (tbnSanPham.getValueAt(row, 7).toString().equals("Con Hang")) {
            rboConHang.setSelected(true);
        }else{
            rboHetHang.setSelected(true);
        }
       
    }

    private void Update() {
      
    }

    boolean Check() {
       try {
            if (txtTenSp.getText().trim().equals("")) {
                DialogHelper.alert(this, "Tên sản phẩm không được để trống");
                return true;
            } else if (txtDonGia1.getText().trim().equals("")) {
                DialogHelper.alert(this, "Đơn Giá không được để trống");
                return true;
            } 
             else if (txtSoLuong.getText().trim().equals("")) {
                DialogHelper.alert(this, "Số Lượng không được để trống");
                return true;
            }  else if(Double.parseDouble(txtDonGia1.getText())<0){
                DialogHelper.alert(this, "Giá Sản Phẩm Không được <0");
                return true;
            } else if(Integer.parseInt(txtSoLuong.getText())<0){
                DialogHelper.alert(this, "Số Lượng Không Được < 0");
                return true;
            }
            else{
                return false;
            }
        }catch (NumberFormatException e) {
            DialogHelper.alert(this, "Số lượng và giá tiền phải là số");
            return true;
        }  catch (Exception e) {
            e.printStackTrace();
            return true ;
        }
    }
     
    
}
