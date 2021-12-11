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
import model.doanhthunam;

/**
 *
 * @author kien5
 */
public class thongkedaoNam {

    private doanhthunam readFromResultSet(ResultSet rs) throws SQLException {
        doanhthunam model = new doanhthunam();
        model.setNam(rs.getString(1));
        model.setDoanhThu(rs.getFloat(2));
        return model;
    }

    public List<doanhthunam> select(String sql, Object... args) {
        List<doanhthunam> list = new ArrayList<>();
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

    public List<doanhthunam> select() {
        String sql = "SELECT YEAR(ngaylap) ,SUM(TONGTIENTT) AS DOANHTHU\n"
                + "                FROM HoaDon\n"
                + "                GROUP BY YEAR(NGAYLAP)\n"
                + "                ORDER BY YEAR( NGAYLAP) ASC";
        return select(sql);
    }

    public List<doanhthunam> HienNam() {
        String sql = "SELECT YEAR( NGAYLAP) ,SUM(TONGTIENTT) AS DOANHTHU\n"
                + "                FROM HOADON\n"
                + "                GROUP BY YEAR(NGAYLAP)\n"
                + "                ORDER BY YEAR(NGAYLAP) DESC";
        return select(sql);
    }
}
