/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDien;

/**
 *
 * @author Admin
 */
public class Banhang extends javax.swing.JInternalFrame {

    /**
     * Creates new form Banhang
     */
    public Banhang() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbbdanhsachsp = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtsoluong = new javax.swing.JTextField();
        lbnhanvienbh = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txttenkh = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtmakh = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbnbanhang = new javax.swing.JTable();
        lbtongtien = new javax.swing.JLabel();
        btnxoasp = new javax.swing.JButton();
        btnthanhtoan = new javax.swing.JButton();
        btnthemvaogiohang = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel1.setText("Bán Hàng");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Danh sách sản phẩm");

        cbbdanhsachsp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mời bạn chọn", " " }));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Số lượng");

        lbnhanvienbh.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbnhanvienbh.setText("Nhân viên bán hàng: ................");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Mã khách hàng");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Tên khách hàng");

        tbnbanhang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SẢN PHẨM", "TÊN SẢN PHẨM", "SỐ LƯỢNG", "ĐƠN GIÁ"
            }
        ));
        jScrollPane1.setViewportView(tbnbanhang);

        lbtongtien.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbtongtien.setText("Tổng tiền : ..............................");

        btnxoasp.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnxoasp.setText("Xóa sản phẩm");

        btnthanhtoan.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnthanhtoan.setText("Thanh Toán");

        btnthemvaogiohang.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnthemvaogiohang.setText("Thêm vào giỏ hàng");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lbnhanvienbh, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3))
                                .addComponent(txtsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(txtmakh, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(60, 60, 60)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(txttenkh, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(cbbdanhsachsp, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnthemvaogiohang)
                        .addGap(27, 27, 27))))
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbtongtien)
                .addGap(138, 138, 138)
                .addComponent(btnxoasp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btnthanhtoan)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbdanhsachsp, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnthemvaogiohang))
                .addGap(44, 44, 44)
                .addComponent(lbnhanvienbh)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttenkh, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmakh, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbtongtien)
                    .addComponent(btnxoasp)
                    .addComponent(btnthanhtoan))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnthanhtoan;
    private javax.swing.JButton btnthemvaogiohang;
    private javax.swing.JButton btnxoasp;
    private javax.swing.JComboBox<String> cbbdanhsachsp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbnhanvienbh;
    private javax.swing.JLabel lbtongtien;
    private javax.swing.JTable tbnbanhang;
    private javax.swing.JTextField txtmakh;
    private javax.swing.JTextField txtsoluong;
    private javax.swing.JTextField txttenkh;
    // End of variables declaration//GEN-END:variables
}
