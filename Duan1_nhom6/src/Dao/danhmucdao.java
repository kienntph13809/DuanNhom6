/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Helper.jdbcKien;

import daovip.danhmucvip;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.DanhMuc;

/**
 *
 * @author Admin
 */
public class danhmucdao implements danhmucvip<DanhMuc, String>{
      String insertSQL = "INSERT INTO dbo.DANHMUC(MADM,TENDM,TRANGTHAI)VALUES(?,?,?)";
    String selectALL_SQL = "SELECT * FROM dbo.DANHMUC";
    
    String UPDATE_SQL = "UPDATE DANHMUC SET TENDM = ?, TRANGTHAI = ? WHERE MADM = ?";
    String delete_SQL = "DELETE FROM dbo.DANHMUC WHERE MADM = ?";

    @Override
    public void insertData(DanhMuc entity) {
        jdbcKien.excuteUpdate(insertSQL, entity.getMadm(),entity.getTendm(), entity.isTrangThai());
    }

    @Override
    public void updateData(DanhMuc entity) {
       jdbcKien.executeUpdate(UPDATE_SQL, entity.getTendm(),entity.isTrangThai(),entity.getMadm());
    }

    @Override
    public void deleteData(String key) {
          jdbcKien.excuteUpdate(delete_SQL, key);
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
                entity.setMadm(rs.getInt("MADM"));
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
    
    
}
