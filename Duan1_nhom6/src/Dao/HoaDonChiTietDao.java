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
    
     public List<HoaDonChiTiet> selectBySQL(String sqlString, Object... args) {
        List<HoaDonChiTiet> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcKien.executeQuery(sqlString, args);
            while (rs.next()) {
                HoaDonChiTiet hd = new HoaDonChiTiet();
               hd.setMahd(rs.getString("MAHD"));
               hd.setMaSP(rs.getString("MASP"));
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
 
}
