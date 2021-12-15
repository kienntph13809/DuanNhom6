package GiaoDien;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Dao.SanPhamDao;
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
import entity.Helperduc;
import Helper.Auth;
import Helper.DialogHelper;
import java.awt.Color;
import model.HoaDon;
import Helper.checkTu;
import model.Sanpham;
import java.util.Calendar;
import Helper.checkTu;
import java.util.Date;
import model.SPHAM_SUKIEN;
import Dao.SP_SUKIEN_Dao;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class SuKienGiamGia extends javax.swing.JInternalFrame {

    sukien sk = new sukien();
    Sanpham sp = new Sanpham();

    SP_SUKIEN_Dao SP_SKDAO;
    Sukiendao skd = new Sukiendao();
    SanPhamDao spd = new SanPhamDao();
    DefaultTableModel tb_model;
    DefaultComboBoxModel cbb_Model = new DefaultComboBoxModel();
    Connection cn;
    int index = 0;
    int ud = -1;
    List<sukien> lst;
    DefaultTableModel Model_sp;

    /**
     * Creates new form SuKienGiamGia
     */
    public SuKienGiamGia() {
        initComponents();
        txtngaybatdau.setBackground(Color.blue);
        txtngaykt.setBackground(Color.blue);
        txtmask.setEditable(false);
        txtmask.setBackground(Color.gray);
//        txtmask.setEditable(false);

        btsua.setEnabled(false);

        cn = Helperduc.ketnoi("QLNOITHAT_NHOM6");
        if (cn != null) {

        } else {
            JOptionPane.showMessageDialog(this, "kết nối thất bại");
            System.exit(0);
        }
        index = 0;
        tb_model = (DefaultTableModel) TB.getModel();
        LoadTableSK2();
//        DoVaoDanhSachSP2();
        doVaoCbbHTGG();

    }

    public void doVaoCbbHTGG() {
        cbb.removeAllItems();
        cbb.addItem("Sự Kiện Đang Diễn Ra");
        cbb.addItem("Sự Kiện Đã Kết Thúc");
    }

    private void DoVaoDanhSachSP2() {
//        LoaiSP lsp = (LoaiSP) model_cbbLoaiSP.getSelectedItem();
//        System.out.println(lsp.getMaLoaiSP());

        List<Sanpham> list = new ArrayList<>();

//        if( Model_sp.getElementAt(cbbTheLoai.getSelectedIndex() ).toString().equalsIgnoreCase("Tất cả sản phẩm") ) {
//            list = daoSP.selectAll_7(  Double.valueOf(txtMin.getText()) , Double.valueOf(txtMax.getText()) );
//        }else{
//            list = daoSP.selectAll_5( model_cbbLoaiSP.getElementAt(cbbTheLoai.getSelectedIndex() ).toString() , Double.valueOf(txtMin.getText()) , Double.valueOf(txtMax.getText()) );
//        }
        Model_sp.setRowCount(0);
        int sk = 1;

        for (Sanpham x : list) {
            Model_sp.addRow(new Object[]{sk, x.getMasp(), x.getTensp(), x.getSoluong(), x.getDongia(), x.getTrangthai(),
                true});
            sk++;
        }

    }

    void edit() {
        String MASK = (String) TB.getValueAt(index, 0);
        sukien sk = skd.selectById(MASK);
        setForm(sk);

    }

    void setForm(sukien nh) {

        txtmask.setText(nh.getMaSuKien());
        txttensk.setText(nh.getTenSuKien());
        txtngaybatdau.setDate(nh.getTgBatDau());
        txtngaykt.setDate(nh.getTgKetThuc());
        txtgiamgia.setText(nh.getUudai().toString());
        nh.setTrangThai(rdDangdienra.isSelected() ? true : false);

    }

    public void ComBox() {
        List<sukien> lst = skd.selectAll1();

        for (sukien x : lst) {

            cbb_Model.addElement(x.isTrangThai() ? "đang diễn ra" : "đã kết thúc");

        }

    }

    public void Themsukien() {
        if (checkTu.checkNullText(txttensk) && checkTu.checkTrongJdate(txtngaybatdau) && checkTu.checkTrongJdate(txtngaykt)
                && checkTu.checkNullText(txtgiamgia) && checkTu.checkSoDuong(txtgiamgia)) {
            sukien sk = new sukien();
            String mask = "SK0" + skd.getmasp();

            sk.setMaSuKien(mask);
            sk.setTenSuKien(txttensk.getText());
            sk.setTgBatDau(txtngaybatdau.getDate());
            sk.setTgKetThuc(txtngaykt.getDate());
            sk.setUudai(Float.valueOf(txtgiamgia.getText()));
            sk.setTrangThai(rdDangdienra.isSelected() ? true : false);

            skd.insert1(sk);
            System.out.println(sk.getMaSuKien());
//            
//            for (int i = 0; i < tbsp.getRowCount() ;  i++) {
//                if ( tbsp.getValueAt(i, 7).toString().equalsIgnoreCase("true") ) {
//                    SPHAM_SUKIEN km_sp = new SPHAM_SUKIEN();
//               
//                    km_sp.setMaKM( sk.getMaSuKien());
//                    SP_SKDAO.insert(km_sp);
//                }
//            }
            lamMoiLoi();
            LoadTableSK2();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        errma = new javax.swing.JLabel();
        errten = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtmask = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txttensk = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtngaybatdau = new com.toedter.calendar.JDateChooser();
        txtngaykt = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtgiamgia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rdDangdienra = new javax.swing.JRadioButton();
        rdDaKetThuc = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        btlammoi = new javax.swing.JButton();
        btsua = new javax.swing.JButton();
        btthemsk = new javax.swing.JButton();
        btxoa = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        cbb = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TB = new javax.swing.JTable();

        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(176, 228, 246));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("CHƯƠNG TRÌNH GIẢM GIÁ");

        jPanel2.setBackground(new java.awt.Color(176, 228, 246));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(176, 228, 246));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)));

        txtmask.setBackground(new java.awt.Color(176, 228, 246));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Mã Sự Kiện");

        txttensk.setBackground(new java.awt.Color(176, 228, 246));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Tên Sự Kiện");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Ngày Bắt Đầu");

        txtngaybatdau.setBackground(new java.awt.Color(176, 228, 246));
        txtngaybatdau.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        txtngaykt.setBackground(new java.awt.Color(176, 228, 246));
        txtngaykt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Ngày Kết Thúc");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Giảm Giá(%)");

        txtgiamgia.setBackground(new java.awt.Color(176, 228, 246));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Trạng Thái");

        rdDangdienra.setBackground(new java.awt.Color(176, 228, 246));
        buttonGroup1.add(rdDangdienra);
        rdDangdienra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdDangdienra.setSelected(true);
        rdDangdienra.setText("Đang Diễn Ra");

        rdDaKetThuc.setBackground(new java.awt.Color(176, 228, 246));
        buttonGroup1.add(rdDaKetThuc);
        rdDaKetThuc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdDaKetThuc.setText("Đã Dừng Hoạt Động");

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
        btsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsuaActionPerformed(evt);
            }
        });
        jPanel3.add(btsua);

        btthemsk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btthemsk.setText("Thêm Sự Kiện");
        btthemsk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btthemskActionPerformed(evt);
            }
        });
        jPanel3.add(btthemsk);

        btxoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btxoa.setText("Xóa");
        btxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btxoaActionPerformed(evt);
            }
        });
        jPanel3.add(btxoa);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txttensk)
                                .addComponent(txtngaybatdau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(rdDangdienra)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                    .addComponent(rdDaKetThuc))
                                .addComponent(txtmask)
                                .addComponent(txtngaykt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtgiamgia)))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(131, 131, 131)
                            .addComponent(jLabel5))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtmask, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttensk, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel7)
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(txtngaybatdau, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtngaykt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(20, 20, 20)
                .addComponent(txtgiamgia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdDangdienra)
                    .addComponent(rdDaKetThuc))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(176, 228, 246));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm Kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        txtTimKiem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        txtTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtTimKiemMouseReleased(evt);
            }
        });
        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTimKiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTimKiem, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel6.setBackground(new java.awt.Color(176, 228, 246));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Trạng Thái Hoạt Động", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        cbb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        cbb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbItemStateChanged(evt);
            }
        });
        cbb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cbb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cbb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh Sách Sự Kiện", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        TB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        TB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sự Kiện", "Tên Sự Kiện", "Ngày Bắt Đầu", "Ngày Kết Thúc", "Giảm Giá", "Trạng Thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TB.setRowHeight(30);
        TB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TB);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210)
                .addComponent(errten, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errma, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(748, 748, 748))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(errma, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(errten, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(265, 265, 265)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(53, 53, 53))))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btlammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlammoiActionPerformed
        if (DialogHelper.confirm(this, "làm mới các ô text ?")) {
            lamMoiLoi();
        }


    }//GEN-LAST:event_btlammoiActionPerformed
    public void HienThiNguoc() {
        int a = TB.getSelectedRow();
        List<Sanpham> list = spd.selectAll_6(TB.getValueAt(a, 0).toString());
        int sk = 1;
        tb_model.setRowCount(0);

        for (Sanpham x : list) {
            tb_model.addRow(new Object[]{sk, x.getMasp(), x.getTensp(), x.getSoluong(), x.getDongia(), x.getTrangthai(), true});
            sk++;

        }
        cbb_Model.setSelectedItem(tb_model.getValueAt(a, 4).toString());
//        txtTenChuongTrinh.setText( tbDanhSachKM.getValueAt( Index , 1 ).toString() );
//        txtMucGia.setText( tbDanhSachKM.getValueAt( Index , 5 ).toString()  );
//        txtTimeBD.setDate( XDate.toDate( tbDanhSachKM.getValueAt( Index , 2 ).toString()) );
//        txtTimeKT.setDate( XDate.toDate( tbDanhSachKM.getValueAt( Index , 3 ).toString()) );
//        if(  tbDanhSachKM.getValueAt( Index , 6 ).toString().equalsIgnoreCase("Đang hoạt động")  ){
//            rdbHoatDong.setSelected( true);
//        }else{
//            rdbNgung.setSelected(true);
//        }
        showdetail();
    }
    private void TBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBMouseClicked
        if (evt.getClickCount() == 2) {
            index = TB.getSelectedRow();
            showdetail();
            btsua.setEnabled(true);
        }


    }//GEN-LAST:event_TBMouseClicked

    private void btthemskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthemskActionPerformed
        if (DialogHelper.confirm(this, "Bạn muốn thêm sự kiện giảm giá")) {
            Themsukien();
        }

    }//GEN-LAST:event_btthemskActionPerformed
    boolean isValidate() {
        try {
            String dt = "0\\d{9}";
            String em = "\\w+@\\w+(\\.\\w+){1,2}";
            if (txtmask.getText().trim().equals("")) {
                DialogHelper.alert(this, "Mã sự kiện rỗng");
                return true;
            } else if (txttensk.getText().trim().equals("")) {
                DialogHelper.alert(this, "Tên sự kiện rỗng");
                return true;
            } else if (txtngaybatdau.getDate().equals("")) {
                DialogHelper.alert(this, "Ngày bắt đầu rỗng");
                return true;
            } else if (txtngaykt.getDate().equals("")) {
                DialogHelper.alert(this, "Ngày kết thúc rỗng");
                return true;

            } else if (txtmask.getText().length() > 7) {
                DialogHelper.alert(this, "Mã sự kiện tối đa 7 kí tự");
                return true;

            } else {
                XDate.toDate(txtngaybatdau.getDateFormatString());
                return false;
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Vui lòng nhập đúng định dạng ngày sinh dd-MM-yyyy");
            return true;
        }
    }

    boolean isCheckTrung() {
        boolean check = false;
        List<sukien> list = skd.selectAll();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaSuKien().equalsIgnoreCase(txtmask.getText())) {
                DialogHelper.alert(this, "Mã đã tồn tại");
                check = true;
                break;
            }
        }
        return check;

    }


    private void btxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxoaActionPerformed

        if (DialogHelper.confirm(this, "Bạn có muốn xóa không")) {
            int k = TB.getSelectedRow();
            String MaKM = TB.getValueAt(k, 0).toString();
//            List<sukien> listSP = skd.delete(MaKM);
//            for (SanPham x : listSP) {
//                daoSP.Update_4(0, x.getMaCTSP());
//            }
//            daoKM_SP.delete(MaKM);
            skd.delete(MaKM);
            JOptionPane.showMessageDialog(this, "xóa thành công");
            LoadTableSK2();
        }

    }//GEN-LAST:event_btxoaActionPerformed

    private void btsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsuaActionPerformed

        if (DialogHelper.confirm(this, "Bạn có muốn cập nhập không ? ")) {
            sukien km = skd.selectByID(TB.getValueAt(TB.getSelectedRow(), 0).toString());
            km.setTenSuKien(txttensk.getText());
            km.setUudai(Float.valueOf(txtgiamgia.getText()));
            km.setTgBatDau(txtngaybatdau.getDate());
            km.setTgKetThuc(txtngaykt.getDate());
            km.setTrangThai(rdDangdienra.isSelected() ? true : false);
            skd.Update_2(km);
            JOptionPane.showMessageDialog(this, "Cập Nhập Thành Công");
            LoadTableSK2();
            lamMoiLoi();

        }
    }//GEN-LAST:event_btsuaActionPerformed

    private void txtTimKiemMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTimKiemMouseReleased

    }//GEN-LAST:event_txtTimKiemMouseReleased

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        List<sukien> list = skd.selectAll_1(txtTimKiem.getText());
        tb_model.setRowCount(0);

        for (sukien x : list) {
            tb_model.addRow(new Object[]{x.getMaSuKien(), x.getTenSuKien(), x.getTgBatDau(), x.getTgKetThuc(), x.getUudai(),
                x.isTrangThai() ? "Đang hoạt động" : "Đã Kết Thúc"});
        }
    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void cbbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbItemStateChanged
 if( cbb.getSelectedIndex()== 0 ){
          LoadTableSK2();
      
       }else{
     LoadTableSK3();
              
               }
 
    }//GEN-LAST:event_cbbItemStateChanged

    private void cbbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbActionPerformed
//        if (cbb.getSelectedIndex()==0) {
//            LoadTableSK2();
//            
//        }
//        else{
//            LoadTableSK3();
//        }
//        
    }//GEN-LAST:event_cbbActionPerformed
    public void luumasp() {
        try {

            skd.insert(getForm1());
            DialogHelper.alert(this, "tạo thành công");

        } catch (Exception e) {
            DialogHelper.alert(this, "tạo thất bại");
            e.printStackTrace();
        }

    }
     private void DoVaoDanhSachSP(){
//        LoaiSP lsp = (LoaiSP) model_cbbLoaiSP.getSelectedItem() ;
//        System.out.println(lsp.getMaLoaiSP());
        
        List<sukien> list ; 
        if( cbb_Model.getElementAt( cbb.getSelectedIndex()).toString().equalsIgnoreCase("Sự Kiện Đang Diễn Ra") ){
            list = skd.selecTT();
        }else{
            list = skd.selecTT1(cbb_Model.getElementAt( cbb.getSelectedIndex()).toString());
        }
        tb_model.setRowCount(0);
        int sk = 1 ;
        
        for (sukien x : list) {
            if (x.isTrangThai() == true) {
                tb_model.addRow(new Object[]{sk, x.getMaSuKien(), x.getTenSuKien(), x.getTgBatDau(), x.getTgKetThuc(), x.getUudai(),
                    true});
                sk++;
            }
        }
        
    }

    public boolean check() {
        int d = 0;

//        //check tên
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

//
        return d == 0 ? true : false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TB;
    private javax.swing.JButton btlammoi;
    private javax.swing.JButton btsua;
    private javax.swing.JButton btthemsk;
    private javax.swing.JButton btxoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbb;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdDaKetThuc;
    private javax.swing.JRadioButton rdDangdienra;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtgiamgia;
    private javax.swing.JTextField txtmask;
    private com.toedter.calendar.JDateChooser txtngaybatdau;
    private com.toedter.calendar.JDateChooser txtngaykt;
    private javax.swing.JTextField txttensk;
    // End of variables declaration//GEN-END:variables

    public void lamMoiLoi() {
        txtmask.setText("");
        txttensk.setText("");
        txtgiamgia.setText("");
        txtngaybatdau.setDateFormatString("");
        txtngaykt.setDateFormatString("");
        rdDangdienra.setSelected(true);

    }

//  
    private void showdetail() {

        txtmask.setText(TB.getValueAt(index, 0).toString());
        txttensk.setText(TB.getValueAt(index, 1).toString());
        txtngaybatdau.setDate(XDate.toDate(TB.getValueAt(index, 2).toString()));
        txtngaykt.setDate(XDate.toDate(TB.getValueAt(index, 3).toString()));
        txtgiamgia.setText(TB.getValueAt(index, 4).toString());
        rdDangdienra.setSelected(TB.getValueAt(index, 5).equals("Đang Hoạt Động"));
        rdDaKetThuc.setSelected(TB.getValueAt(index, 5).equals("Đã Kết Thúc"));
        TB.setRowSelectionInterval(index, index);
    }

    void sua() {
        String manh = (String) TB.getValueAt(index, 0);
        sukien nh = skd.selectById(manh);
        setForm(nh);

    }

    sukien getForm1() {
        sukien nh = new sukien();
        String mask = "SK0" + skd.getmasp();
        nh.setMaSuKien(mask);
        txtmask.setText(mask);
        nh.setTenSuKien(txttensk.getText());
        nh.setTgBatDau(txtngaybatdau.getDate());
        nh.setTgKetThuc(txtngaykt.getDate());

        return nh;
    }

    private void LoadTableSK() {
        List<sukien> lst = skd.selectAll();
        tb_model.setRowCount(0);
        for (sukien x : lst) {
            tb_model.addRow(new Object[]{
                x.getMaSuKien(), x.getTenSuKien(), x.getTgBatDau(), x.getTgKetThuc(), x.getUudai(), x.isTrangThai() ? "Đang Diễn Ra" : "Đã Kết Thúc"
            });

        }
    }
    private void LoadTableSK2() {
        List<sukien> lst = skd.selecTT();
       tb_model.setRowCount(0);
        for (sukien x : lst) {
            tb_model.addRow(new Object[]{
                x.getMaSuKien(), x.getTenSuKien(), x.getTgBatDau(), x.getTgKetThuc(), x.getUudai(), x.isTrangThai() ? "Đang Diễn Ra" : "Đã Kết Thúc"
            });

        }
    }
    private void LoadTableSK3() {
        List<sukien> lst = skd.selecTT1();
       tb_model.setRowCount(0);
        for (sukien x : lst) {
            tb_model.addRow(new Object[]{
                x.getMaSuKien(), x.getTenSuKien(), x.getTgBatDau(), x.getTgKetThuc(), x.getUudai(), x.isTrangThai() ? "Đang Diễn Ra" : "Đã Kết Thúc"
            });

        }
    }

//  
}
