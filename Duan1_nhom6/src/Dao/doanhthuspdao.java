/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.DoanhThuSp;

/**
 *
 * @author kien5
 */
public class doanhthuspdao {

    private DoanhThuSp readFromResultSet(ResultSet rs) throws SQLException {
        DoanhThuSp model = new DoanhThuSp();
        model.setMasp(rs.getString(1));
        model.setTensp(rs.getString(2));
        model.setThang(rs.getString(3));
        model.setDoanhthu(rs.getFloat(4));
        return model;
    }

    public List<DoanhThuSp> select(String sql, Object... args) {
        List<DoanhThuSp> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = Helper.jdbcKien.executeQuery(sql, args);
                while (rs.next()) {
                    list.add(readFromResultSet(rs));
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException();
        }
        return list;
    }

    public List<DoanhThuSp> select() {
        String sql = " select CTHOADON.MASP, TENSP, RIGHT(CONVERT(varchar(50),NGAYLAP,105),7) as Tháng, SUM(TONGTIENTT) AS doanhthu\n"
                + "                FROM SANPHAM JOIN CTHOADON ON SANPHAM.MASP = CTHOADON.MASP\n"
                + "                JOIN HOADON ON HOADON.MAHD = CTHOADON.MAHD\n"
                + "                GROUP BY CTHOADON.MASP, TENSP, SANPHAM.TRANGTHAI, RIGHT(CONVERT(varchar(50),NGAYLAP,105),7)";
        return select(sql);
    }
}
