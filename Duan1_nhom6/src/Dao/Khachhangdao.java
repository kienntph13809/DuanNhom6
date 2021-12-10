/*-
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;



import Helper.jdbcKien;
import daovip.khachhangvip;
import java.util.List;
import model.KhachHang;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Admin
 */
public class Khachhangdao implements khachhangvip<KhachHang, String>{
    String insertSQL = "INSERT INTO dbo.KHACHHANG(MAKH,TENKH,SDT,DIACHI,TRANGTHAI)VALUES(?,?,?,?,?)";
    String selectALL_SQL = "SELECT * FROM dbo.KHACHHANG";
    String selectByTimKiem = "SELECT * FROM dbo.KHACHHANG WHERE MAKH LIKE ? OR TENKH LIKE ?";
    String UPDATE_SQL = "UPDATE KHACHHANG SET TENKH = ?,  SDT = ?,DIACHI = ?,TRANGTHAI = ? WHERE MAKH = ?";
   
    
    @Override
    public void insertData(KhachHang entity) {
     
        
        jdbcKien.executeUpdate(insertSQL , entity.getMakh(), entity.getTenkh(), entity.getSDT(),
                 entity.getDiaChi(), entity.isTrangThai());
            
       
        
    }
    

    @Override
    public void updateData(KhachHang entity) {
      jdbcKien.executeUpdate(UPDATE_SQL, entity.getTenkh(),entity.getSDT(),entity.getDiaChi(),entity.isTrangThai(),entity.getMakh());
    }

    @Override
    public void deleteData(String key) {
        
    }

    @Override
    public List<KhachHang> selectAll() {
        return this.selectBySQL(selectALL_SQL);
    }

    @Override
    public KhachHang selectByID(String key) {
       
            return null;
        }
      
    

    @Override
    public List<KhachHang> selectBySQL(String sql, Object... args) {
      List<KhachHang> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcKien.executeQuery(sql, args);
            while (rs.next()) {
                KhachHang entity = new KhachHang();
                entity.setMakh(rs.getString("MAKH"));
                entity.setTenkh(rs.getString("TENKH"));
               
                entity.setSDT(rs.getString("SDT"));
               
                entity.setDiaChi(rs.getString("DIACHI"));
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

    @Override
    public List<KhachHang> selectByTimKiem(String key) {
        return selectBySQL(selectByTimKiem, "%" + key + "%", "%" + key + "%");
    }

    public List<Integer> selectTongKhachHang() {
        String sql = "SELECT COUNT(MAKH) AS TONGKHACHHANG FROM KHACHHANG";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcKien.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    
    
    }
    public Integer getsokhachhang() {
        String sql = "select max(SOKH) from KHACHHANG";
        Integer sokh = 1;
        try {
            ResultSet rs = null;
            try {
                rs = jdbcKien.executeQuery(sql);
                if (rs.next()) {
                    sokh= rs.getInt(1) + 1;
                } else {
                    sokh = 1;
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();

        }
        return sokh;
    }

   
}

