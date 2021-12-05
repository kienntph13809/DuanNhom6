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
import model.taikhoan;

/**
 *
 * @author kien5
 */
public class DangNhap {
    
    public static boolean VaiTro = false;
 
    //code hướng mới
    //đọc 1 nhân viên từ bản ghi
//    public nhanVien readFromResultSet(ResultSet rs) throws SQLException{
//        nhanVien model=new nhanVien();
//        model.setMaNV(rs.getString("MaNV"));
//        model.setMatKhau(rs.getString("MatKhau"));
//        model.setHoTen(rs.getString("HoTen"));
//        model.setVaiTro(rs.getBoolean("VaiTro"));
//        return model;
//    }
    public taikhoan readFromResultSet(ResultSet rs) throws SQLException {
        taikhoan mode = new taikhoan();
        mode.setTentk(rs.getString(1));
        mode.setMatkhau(rs.getString(2));
        mode.setHoten(rs.getString(3));
        mode.setVaitro(rs.getBoolean(4));
        
        System.out.println(mode.isVaitro());

        return mode;
    }
//lấy list danh sách tài khoản
    public List<taikhoan> select(String sql, Object... args) {
        List<taikhoan> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = jdbcKien.executeQuery(sql, args);
                while (rs.next()) {
                    list.add(readFromResultSet(rs));
                }
            } finally {
                rs.getStatement().getConnection().close(); //đóng kết nối từ resultset
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return list;
    }

    /**
     * Truy vấn thực thể theo mã id
     *
     * @param id là mã của bản ghi được truy vấn
     * @return thực thể chứa thông tin của bản ghi
     */
//    public nhanVien findById(String id) {
//        String sql="SELECT * FROM NhanVien WHERE MaNV=?";
//        List<nhanVien> list=select(sql, id);
//        return list.size()>0?list.get(0):null;               
//có thể trả về là null
//    }
    public taikhoan findByTenTaiKhoan(String tenTaiKhoan) {
        String sql = "select * from TaiKhoan\n"
                + "where TenTk = ? ";
        List<taikhoan> list = select(sql, tenTaiKhoan);
        return list.size() > 0 ? list.get(0) : null;
    }
}
