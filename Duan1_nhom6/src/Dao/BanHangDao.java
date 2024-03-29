/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import static Dao.SanPhamDao.select;
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

    String SPbyDanhMuc = "select SANPHAM.MASP,tensp,soluong,TenCl,dongia,tendm,mota,sanpham.TRANGTHAI\n"
            + "            FROM SANPHAM\n"
            + "                   join dbo.chatlieu on SANPHAM.Macl = chatlieu.Macl\n"
            + "            	join danhmuc on danhmuc.madm = SANPHAM.MADM\n"
            + "				where sanpham.TRANGTHAI = 1 and\n"
            + "            	   TENDM = ?";

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
//
//    public List<Sanpham> selectBySQL(String sql, Object... args) {
//        List<Sanpham> list = new ArrayList<>();
//        try {
//            ResultSet rs = jdbcKien.executeQuery(sql, args);
//            while (rs.next()) {
//                Sanpham model = new Sanpham();
//                model.setMasp(rs.getString(1));
//                model.setTensp(rs.getString(2));
//                model.setSoluong(rs.getInt(3));
//                model.setChatlieu(rs.getString(4));
//                model.setDongia(rs.getFloat(5));
//                model.setTenDm(rs.getString(6));
//                model.setMota(rs.getString(7));
//                model.setTrangthai(rs.getBoolean(8));
//                list.add(model);
//            }
//            rs.getStatement().getConnection().close();
//            return list;
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new RuntimeException(e);
//        }
//    }
    //lấy list danh sách sản phẩm

    public List<Sanpham> selectsanpham(String sql, Object... args) {
        List<Sanpham> sp = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = jdbcKien.executeQuery(sql, args);
                while (rs.next()) {
                    sp.add(readFromResultSet(rs));
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
        return sp;
    }
//truy vấn danh sách sản phẩm

    public List<Sanpham> selectListSanPham() {
        String sql = "select * from sanPham\n"
                + "where TrangThai=1";
        return selectsanpham(sql);
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
        return selectkhachhang(sql, makh);
    }

 

    public Integer getSoHD() {
        String sql = "select max(soHD) from HoaDon";
        Integer soHD = 1;
        try {
            ResultSet rs = null;
            try {
                rs = jdbcKien.executeQuery(sql);
                if (rs.next()) {
                    soHD = rs.getInt(1) + 1;
                } else {
                    soHD = 1;
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();

        }
        return soHD;
    }

    public static List<Sanpham> spBm_SP(String key) {
        String sql = "	select SANPHAM.MASP,tensp,soluong,TenCl,dongia,tendm,mota,sanpham.TRANGTHAI\n"
                + "            FROM SANPHAM\n"
                + "                   join dbo.chatlieu on SANPHAM.Macl = chatlieu.Macl\n"
                + "            	join danhmuc on danhmuc.madm = SANPHAM.MADM\n"
                + "				where sanpham.TRANGTHAI = 1 and\n"
                + "            	   TENDM = ?";
        return select(sql,key);
    }
    }
