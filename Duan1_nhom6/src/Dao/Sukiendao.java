/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Helper.Utils;
import Helper.jdbcKien;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.sukien;

/**
 *
 * @author LENOVO
 */
public class Sukiendao {

    public sukien readSuKienFromResultSet(ResultSet rs) throws SQLException {
        sukien mode = new sukien();
//        mode.setMaSuKien(rs.getString(1));
//        mode.setTenSuKien(rs.getString(2));
//        mode.setUuDai(rs.getInt(3));
//        mode.setTgBatDau(rs.getString(4));
//        mode.setTgKetThuc(rs.getString(5));
//        mode.setLoaiSuKien(rs.getBoolean(6));
//        mode.setTrangThai(rs.getBoolean(7));
//        System.out.println(mode);
        mode.setMaSuKien(rs.getString("mask"));
        mode.setTenSuKien(rs.getString("tensk"));
        mode.setUuDai(rs.getInt("uudai"));
        mode.setTgBatDau(rs.getString("Tgbatdau"));
        mode.setTgKetThuc(rs.getString("tgianketthuc"));
        mode.setLoaiSuKien(rs.getBoolean("loaisk"));
        mode.setTrangThai(rs.getBoolean("trangthai"));

        return mode;
    }

    //lấy list danh sách sự kiện
    public List<sukien> selectSuKien(String sql, Object... args) {
        List<sukien> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = jdbcKien.executeQuery(sql, args);
                while (rs.next()) {
                    list.add(readSuKienFromResultSet(rs));
                }
            } finally {
              
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return list;
    }

    //load data to combo
    public void LoadDataToComBo(DefaultComboBoxModel cbx) {
        cbx.removeAllElements();
        String sql = "select * from\n"
                + " SUKIEN where TRANGTHAI =1";
        List<sukien> list = selectSuKien(sql);
        for (int i = 0; i < list.size(); i++) {
            sukien sk = list.get(i);
            cbx.addElement(sk);
        }
    }

    //lấy list sự kiện
    public List<sukien> getlistSuKienBH() {
        String sql = "  select * from SUKIEN";
        List<sukien> listSK = selectSuKien(sql);
        return listSK;
    }

    //load datatoTable
    public void loadDatatoTable(DefaultTableModel mode, boolean trangThai) {

        List<sukien> list = getlistSuKienBH();
        mode.setRowCount(0);
        for (int i = 0; i < list.size(); i++) {
            sukien sk = list.get(i);
            if (sk.isTrangThai() == trangThai) {
                Vector v = new Vector();
                v.add(sk.getMaSuKien());
                v.add(sk.getTenSuKien());
                v.add(sk.getUuDai());
                v.add(sk.getTgBatDau());
                v.add(sk.getTgKetThuc());
                mode.addRow(v);

            }
        }
    }

    public void updateSukienDuc() {
        String sql = "update SUKIEN\n"
                + "set MASK = 0\n"
                + "where datediff(day,GETDATE(),TGKETTHIC) <0 and LoaiSuKien = 1";
        jdbcKien.executeUpdate(sql);
    }

    //tìm sự kiện theo mã
    public sukien findByMaSK(String maSK) {
        String sql = "select * from SUKIEN\n"
                + "where MASK = ?";
        List<sukien> list = selectSuKien(sql, maSK);
        return list.size() > 0 ? list.get(0) : null;
    }

    //tìm sự kiện theo tên (check trùng tên khi sự kiện đang hoạt động)
    public sukien findByTenSK(String tenSK) {
        String sql = "select * from SUKIEN\n"
                + "where TENSK = ? and TRANGTHAI = 1 ";
        List<sukien> list = selectSuKien(sql, tenSK);
        return list.size() > 0 ? list.get(0) : null;
    }

    //update sukien
    public void updateSuKien(boolean huy, sukien sk) {
        if (!huy) {
            String sql = "update SUKIEN\n"
                    + "set TENSK = ?,\n"
                    + "	UUDAI = ?,\n"
                    + "	TGKETTHIC = ?,\n"
                    + "	LoaiSuKien = ?\n"
                    + "where MASK = ?";
            jdbcKien.executeUpdate(sql,
                    sk.getTenSuKien(),
                    sk.getUuDai(),
                    sk.getTgKetThuc(),
                    sk.isLoaiSuKien(),
                    sk.getMaSuKien());
        } else {
            String sql = "update SUKIEN\n"
                    + "set TRANGTHAI = 0\n"
                    + "where MASK = ?";
            jdbcKien.executeUpdate(sql, sk.getMaSuKien());
        }
    }

    //ẩn sự kiện
//    public void anSuKien(sukien sk) {
//        String sql = "update SuKien\n"
//                + "set AnSK = 0\n"
//                + "where MaSuKien = ?";
//        jdbcKien.executeUpdate(sql, sk.getMaSuKien());
//    }
    //insert một sự kiện
    public void insertSuKien(sukien sk, boolean loaiSK) {
        if (loaiSK) {
            String sql = "insert into SUKIEN VALUES(?,?,?,GETDATE(),?,1,1,1)";
            jdbcKien.executeUpdate(sql,
                    sk.getMaSuKien(),
                    sk.getTenSuKien(),
                    sk.getUuDai(),
                    sk.getTgKetThuc());
        } else {
            String sql = "insert into SUKIEN VALUES(?,?,?,GETDATE(),null,0,1,1)";
            jdbcKien.executeUpdate(sql,
                    sk.getMaSuKien(),
                    sk.getTenSuKien(),
                    sk.getUuDai());
        }
    }

    //tìm sự kiện
    public List<sukien> findSuKien(String chuoi) {
        String sql = "select MASK,TENSK,UUDAI,CONVERT(nvarchar,tgBatDau,103),\n"
                + "CONVERT(nvarchar,tgKetThuc,103),LoaiSuKien,TRANGTHAI\n"
                + "from SUKIEN\n"
                + "where TRANGTHAI = 1 	\n"
                + "and ((MASK + TENSK + CONVERT(nvarchar,UUDAI,0) +CONVERT(nvarchar,tgBatDau,103)+CONVERT(nvarchar,tgKetThuc,103)) like ?\n"
                + "or (MASK + TENSK + CONVERT(nvarchar,UUDAI,0) +CONVERT(nvarchar,tgBatDau,103)) like ?)";
        List<sukien> list = selectSuKien(sql, "%" + chuoi + "%", "%" + chuoi + "%");
        return list;
    }

    //load datatoTable sau khi tìm kiếm
    public void loadDataFindToTable(DefaultTableModel mode, boolean trangThai, String chuoi) {
        List<sukien> list = findSuKien(chuoi);
        mode.setRowCount(0);
        for (int i = 0; i < list.size(); i++) {
            sukien sk = list.get(i);
            if (sk.isTrangThai() == trangThai) {
                Vector v = new Vector();
                v.add(sk.getMaSuKien());
                v.add(sk.getTenSuKien());
                v.add(sk.getUuDai());
                v.add(sk.getTgBatDau());
                v.add(sk.getTgKetThuc());
                mode.addRow(v);
            }
        }
    }
    //tính ngày hợp lệ khi thêm

    public boolean checkNgayThem(Date ngayKT) throws SQLException {
        SimpleDateFormat fomater = new SimpleDateFormat("MM/dd/yyyy");
        String ngayKetThuc = fomater.format(ngayKT);
        String sql = "select datediff(day,GETDATE(),?)";
        ResultSet rs = jdbcKien.bexecuteQuery(sql, ngayKetThuc);

        Integer soNgay = null;
        if (rs.next()) {
            soNgay = rs.getInt(1);
        }
        return soNgay < 0 ? false : true;
    }

}
