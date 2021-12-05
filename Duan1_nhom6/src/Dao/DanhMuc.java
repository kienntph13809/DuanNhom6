/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Helper.jdbcKien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author kien5
 */
public class DanhMuc {
    
    public model.DanhMuc readDanhMucFromResultSet(ResultSet rs) throws SQLException {
        model.DanhMuc mode = new model.DanhMuc();
        mode.setMadm(rs.getInt(1));
        mode.setTendm(rs.getString(2));
        mode.setTrangThai(rs.getInt(3));

        return mode;
    }
    //lấy list danh sách danh mục

    public List<model.DanhMuc> selectDanhMuc(String sql, Object... args) {
        List<model.DanhMuc> danhMuc = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = jdbcKien.executeQuery(sql, args);
                while (rs.next()) {
                    danhMuc.add(readDanhMucFromResultSet(rs));

                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
        return danhMuc;
    }

    //truy vấn danh sách danh mục
    public List<model.DanhMuc> selectListDanhMuc() {
        String sql = "select * from DanhMuc\n"
                + "where TrangThai   = 1";
        return selectDanhMuc(sql);
    }

    //load danh mục vào combo
    public void LoadDataToComBoDanhMuc(DefaultComboBoxModel cbx) {
        cbx.removeAllElements();
        model.DanhMuc DMT = new model.DanhMuc();
        DMT.setTendm("Tất cả các sản phẩm");
        cbx.addElement(DMT);
        List<model.DanhMuc> danhMuc = selectListDanhMuc();
        for (int i = 0; i < danhMuc.size(); i++) {
            model.DanhMuc dm = danhMuc.get(i);
            cbx.addElement(dm);
        }
    }
    //load danh mục vào combo2
    public void LoadDataToComBoDanhMuc2(DefaultComboBoxModel cbx) {
        cbx.removeAllElements();
//        DanhMuc DMT = new DanhMuc();
//        DMT.setTenDanhMuc("Tất cả các món");
//        cbx.addElement(DMT);
        List<model.DanhMuc> danhMuc = selectListDanhMuc();
        for (int i = 0; i < danhMuc.size(); i++) {
            model.DanhMuc dm = danhMuc.get(i);
            cbx.addElement(dm);
        }
    }

    //thêm danh mục
    public void insertDanhMuc(String tenDM) {
        String sql = "insert into DanhMuc values(?,1)";
        jdbcKien.executeUpdate(sql, tenDM);
    }

    //truy vấn danh sách danh mục theo tên check trùng tên
    public model.DanhMuc selectListDanhMucTrungTen(String tenDanhMuc) {
        String sql = "select * from DanhMuc\n"
                + "where TrangThai = 1 and TenDM = ?";
        List<model.DanhMuc> dm = selectDanhMuc(sql, tenDanhMuc);
        return dm.size() > 0 ? dm.get(0) : null;
    }

    //update danh mục về không hoạt động
    public void updateDoanhMucVeSp(Integer maDM) {
        String sql = "update DanhMuc\n"
                + "set TrangThai = 0\n"
                + "where MaDM = ?";
        jdbcKien.executeUpdate(sql, maDM);
    }
}
