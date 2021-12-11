/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDien;

import Dao.DAOCHATLIEU;
import Dao.Danhmucdao;
import Helper.DialogHelper;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ChatLieu;
import model.DanhMuc;
import model.KhachHang;

/**
 *
 * @author Admin
 */
public class Danhmuc extends javax.swing.JInternalFrame {

    Danhmucdao dmd = new Danhmucdao();
    DAOCHATLIEU DCL = new DAOCHATLIEU();
    int row = -1;
    int index = 0;

    /**
     * Creates new form Danhmuc
     */
    public Danhmuc() {
        initComponents();
        fillTabledanhuc();
        Loadatachatlieu();
        rdconhoadong.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    void fillTabledanhuc() {
        DefaultTableModel model = (DefaultTableModel) tbdanhmuc.getModel();
        model.setRowCount(0);
        List<DanhMuc> list = dmd.selectAll();
        for (DanhMuc x : list) {
            model.addRow(new Object[]{
                x.getMadm(), x.getTendm(), x.isTrangThai() ? "còn hoạt động " : "ngừng hoạt động"

            });

        }

    }

    void insertdanhmuc() {
        DanhMuc dm = getForm();
        try {
            if (txttendanhmuc.getText().trim().equals("")) {
                DialogHelper.alert(this, "Vui lòng không bỏ trông ô danh mục");
                return;
            } else {
                dmd.insertData(dm);
                fillTabledanhuc();
                reset();
                DialogHelper.alert(this, "Thêm danh mục  thành công");
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Thêm danh mục  thất bại!");
            e.printStackTrace();
        }
    }

    void updatedanhmuc() {
        DanhMuc dm = upgetForm();
        try {

            if (txttendanhmuc.getText().trim().equals("")) {
                DialogHelper.alert(this, "Vui lòng không bỏ trống ô tên danh mục");
                return;
            } else {
                dmd.updateData(dm);
                fillTabledanhuc();

                DialogHelper.alert(this, "update mục thành công thành công");
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "update mục thất bại  thất bại!");
            e.printStackTrace();
        }

    }

    DanhMuc getForm() {
        DanhMuc kh = new DanhMuc();

        kh.setTendm(txttendanhmuc.getText());

        kh.setTrangThai(rdhd.isSelected() ? true : false);
        return kh;
    }

    void reset() {
        txtmadanhmuc.setText("");
        txttendanhmuc.setText("");
        rdhd.setSelected(true);
     

    }

    DanhMuc upgetForm() {
        DanhMuc kh = new DanhMuc();
        kh.setMadm(Integer.valueOf(txtmadanhmuc.getText()));
        kh.setTendm(txttendanhmuc.getText());

        kh.setTrangThai(rdhd.isSelected() ? true : false);
        return kh;
    }

    void setForm() {
        txtmadanhmuc.setText(tbdanhmuc.getValueAt(row, 0) + "");
        txttendanhmuc.setText(tbdanhmuc.getValueAt(row, 1) + "");

        if (tbdanhmuc.getValueAt(row, 2).toString().equals(" Còn Hoạt động")) {
            rdhd.setSelected(true);
        } else {
            rdnhd.setSelected(true);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtmadanhmuc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txttendanhmuc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rdhd = new javax.swing.JRadioButton();
        rdnhd = new javax.swing.JRadioButton();
        btnthem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnlamoi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbdanhmuc = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txttencl = new javax.swing.JTextField();
        txtmcl = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        rdconhoadong = new javax.swing.JRadioButton();
        rdngunghd = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbcl = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1210, 900));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Danh Mục");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Mã Danh Mục:");

        txtmadanhmuc.setEditable(false);
        txtmadanhmuc.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Tên Danh Mục: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Trạng Thái:");

        buttonGroup1.add(rdhd);
        rdhd.setSelected(true);
        rdhd.setText("Còn hoạt động");

        buttonGroup1.add(rdnhd);
        rdnhd.setText("Ngừng hoạt động");

        btnthem.setBackground(new java.awt.Color(0, 204, 255));
        btnthem.setText("Thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnsua.setBackground(new java.awt.Color(0, 204, 255));
        btnsua.setText("Sửa ");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnxoa.setBackground(new java.awt.Color(0, 204, 255));
        btnxoa.setText("Xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnlamoi.setBackground(new java.awt.Color(0, 204, 255));
        btnlamoi.setText("Làm Mới");
        btnlamoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlamoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(77, 77, 77)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txttendanhmuc, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rdhd)
                                        .addGap(32, 32, 32)
                                        .addComponent(rdnhd))
                                    .addComponent(txtmadanhmuc, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(420, 420, 420)
                                        .addComponent(btnlamoi))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(656, 656, 656)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnxoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnsua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnthem, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtmadanhmuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnthem)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttendanhmuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnsua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)))
                .addGap(20, 20, 20)
                .addComponent(btnxoa)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rdhd)
                    .addComponent(rdnhd))
                .addGap(4, 4, 4)
                .addComponent(btnlamoi)
                .addContainerGap())
        );

        tbdanhmuc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Danh Mục", "Tên Danh Mục", "Trạng Thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbdanhmuc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbdanhmucMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbdanhmuc);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("DANH MỤC", jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Mã Chất Liệu:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Tên Chất Liệu:");

        txtmcl.setEditable(false);
        txtmcl.setBackground(new java.awt.Color(153, 153, 153));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Trạng Thái:");

        buttonGroup2.add(rdconhoadong);
        rdconhoadong.setText("Còn Hoạt Động");

        buttonGroup2.add(rdngunghd);
        rdngunghd.setText("Ngừng Hoạt Động'");

        jButton1.setBackground(new java.awt.Color(0, 204, 255));
        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 204, 255));
        jButton2.setText("Sửa ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 204, 255));
        jButton3.setText("Xóa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 204, 255));
        jButton4.setText("Làm Mới");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel8)))
                .addGap(71, 71, 71)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(rdconhoadong)
                        .addGap(51, 51, 51)
                        .addComponent(rdngunghd))
                    .addComponent(txtmcl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttencl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(339, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(90, 90, 90))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmcl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttencl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(rdconhoadong)
                            .addComponent(rdngunghd))
                        .addGap(23, 23, 23))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addContainerGap(24, Short.MAX_VALUE))))
        );

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("CHẤT LIỆU");

        tbcl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Chất Liệu", "Tên Chất Liệu", "Trạng Thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbcl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbclMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbcl);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(395, 395, 395)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CHẤT lIỆU", jPanel4);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 895, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 306, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbdanhmucMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbdanhmucMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            row = tbdanhmuc.getSelectedRow();

            setForm();

        }

    }//GEN-LAST:event_tbdanhmucMouseClicked

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        // TODO add your handling code here:
        insertdanhmuc();
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnlamoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlamoiActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnlamoiActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // TODO add your handling code here:
        updatedanhmuc();
    }//GEN-LAST:event_btnsuaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        updatechatlieu();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        lammoi();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        insertcl();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:
        xoadanhmuc();

    }//GEN-LAST:event_btnxoaActionPerformed

    private void tbclMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbclMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            index = tbcl.getSelectedRow();
            txtmcl.setEditable(false);
            setFormcl();

        }
    }//GEN-LAST:event_tbclMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        xoachatlieu();
    }//GEN-LAST:event_jButton3ActionPerformed
    void Loadatachatlieu() {
        DefaultTableModel model = (DefaultTableModel) tbcl.getModel();
        model.setRowCount(0);
        List<ChatLieu> list = DCL.selectAll();
        for (ChatLieu x : list) {
            model.addRow(new Object[]{
                x.getMacl(), x.getTencl(), x.isTrangthai() ? "còn hoạt động " : "ngừng hoạt động"

            });

        }

    }

    ChatLieu getFormcl() {
        ChatLieu cl = new ChatLieu();

        cl.setTencl(txttencl.getText());

        cl.setTrangthai(rdhd.isSelected() ? true : false);
        return cl;
    }

    void setFormcl() {
        txtmcl.setText(tbcl.getValueAt(index, 0) + "");
        txttencl.setText(tbcl.getValueAt(index, 1) + "");

        if (tbcl.getValueAt(index, 2).toString().equals(" Còn Hoạt động")) {
            rdconhoadong.setSelected(true);
        } else {
            rdngunghd.setSelected(true);
        }
    }

    void lammoi() {

        txtmcl.setText("");
        txttencl.setText("");
        rdconhoadong.setSelected(true);
        
    }

    void addcl() {
        ChatLieu cl = getFormcl();
        try {
            if (txtmcl.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "không bỏ trống ô mã chất liệu");

            }
        } catch (Exception e) {
        }

    }

    void insertcl() {
        ChatLieu cl = getFormcl();
        try {

            if (txttencl.getText().trim().equals("")) {
                DialogHelper.alert(this, "Vui lòng không bỏ trông ô chat liêu");
                return;
            } else {
                DCL.insertData(cl);
                Loadatachatlieu();
                lammoi();

                DialogHelper.alert(this, "Thêm chất liệu  thành công thành công");
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Thêm danh chất liệu  bại  thất bại!");
            e.printStackTrace();
        }

    }

    void updatechatlieu() {
        ChatLieu cl = upgetFormcl();
        try {

            if (txtmcl.getText().trim().equals("")) {
                DialogHelper.alert(this, "Vui lòng không bổ trống tên chất liệu");
                return;
            } else {
                DCL.updateData(cl);
                Loadatachatlieu();

                DialogHelper.alert(this, "Update dữ liệu thành công!");
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Update dữ liệu   thất bại!");
            e.printStackTrace();
        }
    }

    ChatLieu upgetFormcl() {
        ChatLieu cl = new ChatLieu();
        cl.setMacl(Integer.parseInt(txtmcl.getText()));

        cl.setTencl(txttencl.getText());

        cl.setTrangthai(rdhd.isSelected() ? true : false);
        return cl;
    }

    void xoadanhmuc() {

        
        try {

            dmd.updatedm(Integer.valueOf(txtmadanhmuc.getText()));
            fillTabledanhuc();
            reset();
            DialogHelper.alert(this, " xóa thành công");

        } catch (Exception e) {
            DialogHelper.alert(this, "xóa  thất bại!");
            e.printStackTrace();
        }

    }

    void xoachatlieu() {
         try {

            DCL.updatecl(Integer.parseInt(txtmcl.getText()));
            Loadatachatlieu();
            lammoi();
            DialogHelper.alert(this, " xóa thành công");

        } catch (Exception e) {
            DialogHelper.alert(this, "xóa  thất bại!");
            e.printStackTrace();
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlamoi;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnxoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rdconhoadong;
    private javax.swing.JRadioButton rdhd;
    private javax.swing.JRadioButton rdngunghd;
    private javax.swing.JRadioButton rdnhd;
    private javax.swing.JTable tbcl;
    private javax.swing.JTable tbdanhmuc;
    private javax.swing.JTextField txtmadanhmuc;
    private javax.swing.JTextField txtmcl;
    private javax.swing.JTextField txttencl;
    private javax.swing.JTextField txttendanhmuc;
    // End of variables declaration//GEN-END:variables
}
