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
import model.HoaDonChiTiet;

/**
 *
 * @author kien5
 */
public class HoaDonChiTietDao {

    String SELECT_ALL = "select *\n"
            + "from CTHOADON join SANPHAM on CTHOADON.MASP = SANPHAM.MASP";
    String SELECT_BY_ID_SQL = "select *\n"
            + "from CTHOADON join SANPHAM on CTHOADON.MASP = SANPHAM.MASP\n"
            + "       where MAHD = ?";
    String INSERT_SQL = "  insert into CTHOADON(MAHD,MASP,SOLUONG,DONGIA,THANHTIEN,TRANGTHAI) values(?,?,?,?,?,?)";
    String DELETE_SQL = "delete from CTHOADON where MAHD = ?";
    String THONGKESPTHEOTHANG_SQL = "	select CTHOADON.MASP, TENSP, SANPHAM.TRANGTHAI, RIGHT(CONVERT(varchar(20),NGAYLAP,105),7), SUM(THANHTIEN) AS DOANHTHU\n"
            + "                FROM SANPHAM JOIN CTHOADON ON SANPHAM.MASP = CTHOADON.MASP\n"
            + "                JOIN HOADON ON HOADON.MAHD = CTHOADON.MAHD\n"
            + "                GROUP BY CTHOADON.MASP, TENSP, SANPHAM.TRANGTHAI, RIGHT(CONVERT(varchar(20),NGAYLAP,105),7)";

    public List<HoaDonChiTiet> selectBySQL(String sqlString, Object... args) {
        List<HoaDonChiTiet> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcKien.executeQuery(sqlString, args);
            while (rs.next()) {
                HoaDonChiTiet hd = new HoaDonChiTiet();
                hd.setMahd(rs.getString("MAHD"));
                hd.setMaSP(rs.getString("MASP"));
                hd.setTensp(rs.getString("TenSp"));
                hd.setSoluong(rs.getInt("SOLUONG"));
                hd.setDongia(rs.getFloat("DONGIA"));
                hd.setThanhtien(rs.getFloat("THANHTIEN"));
                hd.setTrangthai(rs.getBoolean("TRANGTHAI"));
                list.add(hd);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }

    public List<HoaDonChiTiet> selectById(String key) {
        return selectBySQL(SELECT_BY_ID_SQL, key);
    }

    public void insert(HoaDonChiTiet model) {
        jdbcKien.executeUpdate(INSERT_SQL, model.getMahd(), model.getMaSP(), model.getSoluong(), model.getDongia(), model.getThanhtien(), model.getTrangthai());
    }

    public void delete(String key) {
        jdbcKien.executeUpdate(DELETE_SQL, key);
    }

    public List<HoaDonChiTiet> selectAll() {
        return selectBySQL(SELECT_ALL);
    }
     public List<HoaDonChiTiet> selectTHONGKE() {
        return selectBySQL(THONGKESPTHEOTHANG_SQL
        );
    }
}
