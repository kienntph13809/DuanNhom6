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
import model.ThongKeThang;

/**
 *
 * @author kien5
 */
public class thongkeThangdao {

    private ThongKeThang readFromResultSet(ResultSet rs) throws SQLException {
        ThongKeThang model = new ThongKeThang();
        model.setThang(rs.getString(1));
        model.setDoanhThu(rs.getFloat(2));
        return model;
    }

    public List<ThongKeThang> select(String sql, Object... args) {
        List<ThongKeThang> list = new ArrayList<>();
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

    public List< ThongKeThang> Thang(String nam) {
        String sql = "SELECT MONTH(NGAYLAP) ,SUM(TONGTIENTT) AS DOANHTHU\n"
                + "                FROM HoaDon\n"
                + "                WHERE YEAR(NGAYLAP) = ?\n"
                + "                GROUP BY MONTH(NGAYLAP)\n"
                + "                ORDER BY MONTH(NGAYLAP) ASC";
        return select(sql, nam);
    }
}
