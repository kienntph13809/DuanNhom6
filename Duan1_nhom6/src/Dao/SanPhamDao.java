
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
        model.setMasp(rs.getString(1));
        model.setTensp(rs.getString(2));
        model.setSoluong(rs.getInt(3));
        model.setChatlieu(rs.getString(4));
        model.setDongia(rs.getFloat(5));
        model.setTenDm(rs.getString(6));
        model.setMota(rs.getString(7));
        model.setTrangthai(rs.getBoolean(8));
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
        String sql = "select MASP,TENSP,SOLUONG,TenCl,DONGIA,tendm,MOTA,SANPHAM.TRANGTHAI from SANPHAM join chatlieu on SANPHAM.Macl = chatlieu.Macl join danhmuc on SANPHAM.MADM = danhmuc.madm\n"
                + "where SANPHAM.TRANGTHAI = 1";
        return select(sql);

    }

    public static List<Sanpham> getListSanPhamjoinDanhMuc() {
        String sql = "select SANPHAM.MASP,TENSP,dongia,soluong,chatlieu,tendm\n"
                + "from SANPHAM join danhmuc on SANPHAM.MADM = danhmuc.madm\n"
                + "where sanpham.TRANGTHAI = 1";
        return select(sql);

    }

    /**
     * Thêm mới thực thể vào CSDL
     *
     * @param entity là thực thể chứa thông tin bản ghi mới
     */
    public void insert(Sanpham entity) {
        String sql = "insert into SANPHAM (MASP,TENSP,SOLUONG,Macl,DONGIA,MADM,MOTA,TRANGTHAI) values (?,?,?,?,?,?,?,?)";
        jdbcKien.executeUpdate(sql,
                entity.getMasp(),
                entity.getTensp(),
                entity.getSoluong(),
                entity.getMaCL(),
                entity.getDongia(),
                entity.getMadm(),
                entity.getMota(),
                entity.getTrangthai()
        );

    }

    public void updatesanPham(Sanpham sp) {
        String sql = "update sanpham\n"
                + "set TenSP = ?,\n"
                + "    soluong = ?,\n"
                + "    chatlieu = ?,\n"
                + "	DonGia = ?,\n"
                + "where Masp = ?";
        jdbcKien.executeUpdate(sql, sp.getTensp(), sp.getSoluong(), sp.getChatlieu(), sp.getDongia(), sp.getMasp());
    }

    //update ẩn món ăn
    public void updateAnSanPham(Sanpham sp) {
        String sql = "update SanPham\n"
                + "set TrangThai = 0\n"
                + "where MaSP = ?";
        jdbcKien.executeUpdate(sql, sp.getMasp());
    }

    //
    public Sanpham findByMaSp(String MaSP) {
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

    public Sanpham findByMaSp_sp(String MaSP) {
        String sql = "select * from SanPham\n"
                + "where MaSP = ?";
        List<Sanpham> list = select(sql, MaSP);
        return list.size() > 0 ? list.get(0) : null;
    }

    public void updateBanHang(Sanpham entity) {
        String sql = "UPDATE SANPHAM SET SOLUONG = ? WHERE MAsp = ?";
        jdbcKien.executeUpdate(sql, entity.getSoluong(), entity.getMasp());
    }

    public Integer getSoSP() {
        String sql = "select max(soSP) from SANPHAM ";
        Integer soSP = 1;
        try {
            ResultSet rs = null;
            try {
                rs = jdbcKien.executeQuery(sql);
                if (rs.next()) {
                    soSP = rs.getInt(1) + 1;
                } else {
                    soSP = 1;
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();

        }
        return soSP;
    }

 
    
}
