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
import model.SPHAM_SUKIEN;

/**
 *
 * @author LENOVO
 */
public class SP_SUKIEN_Dao {
      String Insert = "Insert into SANPHAM_KHUYENMAI ( MaCTSP , MaKM ) values ( ? , ? ) " ;
      
      
      
      
      public void insert(SPHAM_SUKIEN entity) {
        jdbcKien.Update(Insert, entity.getMaKM() );
    }
      
      
    protected List<SP_SUKIEN_Dao> selectBySQL(String sql, Object... args) {
        List<SP_SUKIEN_Dao> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcKien.executeQuery(sql, args);
            while (rs.next()) {
                SPHAM_SUKIEN sk = new SPHAM_SUKIEN();
           
                sk.setMaKM(rs.getString("MaKM"));
             list.add(this);
            }
            rs.getStatement().getConnection().close();
          

        } catch (Exception e) {
            throw new RuntimeException();
        }
          return list;
    }
}
