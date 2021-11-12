
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
import model.Sanpham;

/**
 *
 * @author kien5
 */
public class SanPhamDao {



    private static Sanpham readFromResultSet(ResultSet rs) throws SQLException {
        Sanpham model = new Sanpham();
        model.setMasp(rs.getInt("MASP"));
        model.setTensp(rs.getString("TENSP"));
        model.setSoluong(rs.getInt("SOLUONG"));
        model.setChatlieu(rs.getString("CHATLIEU"));
        model.setDongia(rs.getFloat("DONGIA"));
        model.setMadm(rs.getInt("MADM"));
        model.setAnh(rs.getString("ANHSP"));
        model.setMota(rs.getString("MoTa"));
        model.setTrangthai(rs.getBoolean("trangthai"));
        return model;

    }

    public static List<Sanpham> select(String sql, Object... args) {
        List<Sanpham> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = jdbcKien.executeQuery(sql, args);
                while (rs.next()) {
                    list.add(readFromResultSet(rs));
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return list;

    }

    //lấy về list món
    public static List<Sanpham> getListSanPham() {
        String sql = "select * from SanPham\n"
                + "where TrangThai=1";
        return select(sql);

    }

    /**
     * Thêm mới thực thể vào CSDL
     *
     * @param entity là thực thể chứa thông tin bản ghi mới
     */
    public void insert(Sanpham entity) {
        String sql = "INSERT INTO SanPham(TenSP,soluong,chatlieu,dongia,MaDM,AnhSP,mota,TrangThai) VALUES (?,?,?,?,?,?,?,?)";
        jdbcKien.executeUpdate(sql,
                entity.getTensp(),
                entity.getSoluong(),
                entity.getChatlieu(),
                entity.getDongia(),
                entity.getMadm(),
                entity.getAnh(),
                entity.getMota(),
                entity.getTrangthai()
                
        );

    }

    //update món ăn
    public void updatesanPham(Sanpham sp) {
        String sql = "update sanpham\n"
                + "set TenSP = ?,\n"
                + "    soluong = ?,\n"
                + "    chatlieu = ?,\n"
                + "	DonGia = ?,\n"
                + "	anhSP = ?\n"
                + "where Masp = ?";
        jdbcKien.executeUpdate(sql, sp.getTensp(), sp.getSoluong(),sp.getChatlieu(),sp.getDongia(), sp.getAnh(), sp.getMasp());
    }

    //update ẩn món ăn
    public void updateAnSanPham(Sanpham sp) {
        String sql = "update SanPham\n"
                + "set TrangThai = 0\n"
                + "where MaSP = ?";
        jdbcKien.executeUpdate(sql, sp.getMasp());
    }

    //
    public Sanpham findByMaSp(Integer MaSP) {
        String sql = "select * from SanPham\n"
                + "where TrangThai = 1 and MaSP = ?";
        List<Sanpham> list = select(sql, MaSP);
        return list.size() > 0 ? list.get(0) : null;
    }

    //
    public Sanpham findMonByMaDM(Integer maDM) {
        String sql = "select * from SanPham\n"
                + "where TrangThai = 1 and MaDM = ?";
        List<Sanpham> list = select(sql, maDM);
        return list.size() > 0 ? list.get(0) : null;
    }
    //tim để check trùng với tên món

    public Sanpham findMonByTenSP(String TenSP) {
        String sql = "select * from SANPHAM\n"
                + "where TrangThai = 1 and TenMon = ?";
        List<Sanpham> list = select(sql, TenSP);
        return list.size() > 0 ? list.get(0) : null;
    }
//    public TaiKhoanMode findByTenTaiKhoan(String tenTaiKhoan) {
//        String sql = "select * from TaiKhoan\n"
//                + "where TenTaiKhoan = ? and trangThai = 1";
//        List<TaiKhoanMode> list = select(sql, tenTaiKhoan);
//        return list.size() > 0 ? list.get(0) : null;
//    }

}
