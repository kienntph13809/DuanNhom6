
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
     private Sanpham readFromResultSet(ResultSet rs) throws SQLException {
        Sanpham model = new Sanpham();
        model.setMasp(rs.getInt("Masp"));
        model.setTensp(rs.getString("TenSP"));
        model.setSoluong(rs.getInt("SoLuong"));
        model.setChatlieu(rs.getString("ChatLieu"));
        model.setMadm(rs.getInt("MaDM"));
        model.setDongia(rs.getFloat("DonGia"));
        model.setAnh(rs.getString("HinhAnh"));
        model.setTrangthai(rs.getInt("TrangThai"));
        model.setMota(rs.getString("MoTa"));

        return model;

    }

    public List<Sanpham> select(String sql, Object... args) {
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

    /**
     * Thêm mới thực thể vào CSDL
     *
     * @param entity là thực thể chứa thông tin bản ghi mới
     */
    public void insert(Sanpham entity) {
        String sql = "INSERT INTO sanpham(tensp,soluong,chatlieu,MaDm,DonGia,anhsp,TrangThai,mota) VALUES (?,?,?,?,?,?,?,?)";
        jdbcKien.executeUpdate(sql,
                entity.getTensp(),
                entity.getSoluong(),
                entity.getChatlieu(),
                entity.getMadm(),
                entity.getDongia(),
                entity.getAnh(),
                entity.getTrangthai(),
                entity.getMota()
        );

    }

    //
    public Sanpham findByMasanpham(Integer maMon) {
        String sql = "select * from sanpham\n"
                + "where TrangThai = 1 and masp = ?";
        List<Sanpham> list = select(sql, maMon);
        return list.size() > 0 ? list.get(0) : null;
    }
//    public TaiKhoanMode findByTenTaiKhoan(String tenTaiKhoan) {
//        String sql = "select * from TaiKhoan\n"
//                + "where TenTaiKhoan = ? and trangThai = 1";
//        List<TaiKhoanMode> list = select(sql, tenTaiKhoan);
//        return list.size() > 0 ? list.get(0) : null;
//    }

}
