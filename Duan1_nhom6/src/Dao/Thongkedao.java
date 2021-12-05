/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Helper.jdbcKien;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Thongkedao {

    private List<Object[]> getListOfArray(String sql, String[] cols, Object... args) {
        try {
            List<Object[]> list = new ArrayList<>(); // dánh sach chứa mảng
            ResultSet rs = jdbcKien.executeQuery(sql, args); // gọi đến query và có đc rs.
            while (rs.next()) {
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);  // đọc hết giá trị cảu dòng vaoò mảng
                }
                list.add(vals); // add mảng vào list
            }
            rs.getStatement().getConnection().close(); // đóng kết nối
            return list; // trả về list
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    public List<Object[]> getTableThongKe(int year) {
        String sql = "{CALL sp_ThongKeDoanhThu(?)}";
        String[] cols = {"MASANPHAM", "TENSANPHAM", "SOLUONG", "GIATHAPNHAT", "GIACAONHAT", "DOANHTHU"};
        return this.getListOfArray(sql, cols, year);
    }

    public List<Integer> selectDoanhthu() {
        String sql = "SELECT SUM(TONGTIENTT) FROM HOADON";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcKien.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectSoHoaDon() {
        String sql = "SELECT COUNT(MAHD) FROM HOADON";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcKien.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectTongKH() {
        String sql = "SELECT COUNT(MAKH) FROM KHACHHANG";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcKien.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
