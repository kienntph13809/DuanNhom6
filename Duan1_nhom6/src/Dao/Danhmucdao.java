/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Helper.jdbcKien;
import model.DanhMuc;
import daovip.danhmucvip;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Danhmucdao implements danhmucvip<DanhMuc, String> {

    String insertSQL = "INSERT INTO dbo.DANHMUC(tendm,trangthai)VALUES(?,?)";
    String selectALL_SQL = "SELECT * FROM dbo.DANHMUC WHERE  TRANGTHAI=1  ";
    String selectByTimKiem = "SELECT * FROM dbo.KHACHHANG WHERE MAKH LIKE ? OR TENKH LIKE ?";
    String UPDATE_SQL = "UPDATE DANHMUC SET TENDM = ?,TRANGTHAI=? WHERE MADM = ?";
    String DELETE_SQL = "UPDATE DANHMUC SET trangthai=0\n"
            + "where madm=?";

    @Override
    public void insertData(DanhMuc entity) {
        jdbcKien.executeUpdate(insertSQL, entity.getTendm(), entity.isTrangThai());
    }

    @Override
    public void updateData(DanhMuc entity) {
        jdbcKien.executeUpdate(UPDATE_SQL, entity.getTendm(), entity.isTrangThai(), entity.getMadm());
    }

    @Override
    public void deleteData(String key) {
        
    }
    public void updatedm(int dm) {
        String sql = "update DANHMUC\n"
                + "set TrangThai = 0\n"
                + "where MADM = ?";
        jdbcKien.executeUpdate(sql,dm);
    }

    @Override
    public List<DanhMuc> selectAll() {
        return this.selectBySQL(selectALL_SQL);
    }

    @Override
    public DanhMuc selectByID(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DanhMuc> selectBySQL(String sql, Object... args) {
        List<DanhMuc> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcKien.executeQuery(sql, args);
            while (rs.next()) {
                DanhMuc entity = new DanhMuc();
                entity.setMadm(Integer.parseInt(rs.getString("MADM")));
                entity.setTendm(rs.getString("TENDM"));

                entity.setTrangThai(rs.getBoolean("TRANGTHAI"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public Integer getMadm() {
        String sql = "select max(madm) from DANHMUC";
        Integer madm = 1;
        try {
            ResultSet rs = null;
            try {
                rs = jdbcKien.executeQuery(sql);
                if (rs.next()) {
                    madm = rs.getInt(1) + 1;
                } else {
                    madm = 1;
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();

        }
        return madm;
    }

}
