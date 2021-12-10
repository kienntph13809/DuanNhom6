/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Helper.jdbcKien;
import daovip.chatlieuvip;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.ChatLieu;

/**
 *
 * @author Admin
 */
public class DAOCHATLIEU implements  chatlieuvip<ChatLieu, String>{
      String insertSQL = "INSERT INTO dbo.CHATLIEU(TENCL,TRANGTHAI)VALUES(?,?)";
    String selectALL_SQL = "SELECT * FROM dbo.CHATLIEU WHERE TRANGTHAI=1";
    
    String UPDATE_SQL = "UPDATE CHATLIEU SET TENCL = ?, TRANGTHAI=? WHERE MACL = ?";
    String DELETE_SQL="UPDATE CHATLIEU SET trangthai=0\n" +
"where madm=?";

    @Override
    public void insertData(ChatLieu entity) {
         jdbcKien.executeUpdate(insertSQL, entity.getTencl(),entity.isTrangthai() );
    }

    @Override
    public void updateData(ChatLieu entity) {
          jdbcKien.executeUpdate(UPDATE_SQL, entity.getTencl(),entity.isTrangthai(),entity.getMacl());
    }

    @Override
    public void deleteData(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public void updatecl(int cl) {
        String sql = "update CHATLIEU\n"
                + "set TrangThai = 0\n"
                + "where MACL = ?";
        jdbcKien.executeUpdate(sql, cl);
    }

    @Override
    public List<ChatLieu> selectAll() {
     return this.selectBySQL(selectALL_SQL);
    
    }

    @Override
    public ChatLieu selectByID(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ChatLieu> selectBySQL(String sql, Object... args) {
         List<ChatLieu> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcKien.executeQuery(sql, args);
            while (rs.next()) {
                ChatLieu entity = new ChatLieu();
                entity.setMacl(Integer.parseInt(rs.getString("MACL")));
                entity.setTencl(rs.getString("TENCL"));
               
               
               
             
                entity.setTrangthai(rs.getBoolean("TRANGTHAI"));
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
