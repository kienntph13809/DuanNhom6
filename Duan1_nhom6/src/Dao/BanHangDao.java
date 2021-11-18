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
import model.KhachHang;
import model.Sanpham;

/**
 *
 * @author kien5
 */
public class BanHangDao {
   
    private static Sanpham readFromResultSet(ResultSet rs) throws SQLException {
        Sanpham model = new Sanpham();
        model.setMasp(rs.getInt("MASP"));
        model.setTensp(rs.getString("TENSP"));
        model.setSoluong(rs.getInt("SOLUONG"));
        model.setChatlieu(rs.getInt("ChatLieu"));
        model.setDongia(rs.getFloat("DONGIA"));
        model.setMadm(rs.getInt("MADM"));
        model.setAnh(rs.getString("ANHSP"));
        model.setMota(rs.getString("MoTa"));
        model.setTrangthai(rs.getBoolean("trangthai"));
        return model;

    }
    //lấy list danh sách sản phẩm

    public List<Sanpham> selectMonAn(String sql, Object... args) {
        List<Sanpham> monAn = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = jdbcKien.executeQuery(sql, args);
                while (rs.next()) {
                    monAn.add(readFromResultSet(rs));
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
        return monAn;
    }
//truy vấn danh sách sản phẩm
    
    public List<Sanpham> selectListSanPham() {
        String sql = "select * from sanPham\n"
                + "where TrangThai=1";
        return selectMonAn(sql);
    }
     public KhachHang readComBokhachhangFromResultSet(ResultSet rs) throws SQLException {
        KhachHang mode = new KhachHang();
        mode.setMakh(rs.getString(1));
        mode.setTenkh(rs.getString(2));
        mode.setSDT(rs.getString(3));
        mode.setDiaChi(rs.getString(4));
        mode.setTrangThai(rs.getBoolean(5));

        return mode;
    }  
         //lấy list danh sách khách hàng

     public List<KhachHang> selectkhachhang(String sql, Object... args) {
        List<KhachHang> khuVuc = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = jdbcKien.executeQuery(sql, args);
                while (rs.next()) {
                    khuVuc.add(readComBokhachhangFromResultSet(rs));
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
        return khuVuc;
    }
     //truy vấn danh sách khu vưc
    public List<KhachHang> selectListKhachhang() {
        String sql = "select * from KhachHang\n"
                + "where TrangThaiHD = 1";
        return selectkhachhang(sql);
    }
      public List<KhachHang> FindbyKhachHang(String makh) {
        String sql = "select * from KhachHang\n"
                + "where makh = ? and TrangThai = 1";
        return selectkhachhang(sql,makh);
    }
    
}
