/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Helper.Utils;
import Helper.jdbcKien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.taikhoan;

/**
 *
 * @author kien5
 */
public class TaiKhoanDao {
     static Connection con = Utils.myConnection();

    public taikhoan readFromResultSet(ResultSet rs) throws SQLException {
        taikhoan model = new taikhoan();
        model.setTentk(rs.getString(1));
        model.setHoten(rs.getString(2));
        model.setMatkhau(rs.getString(3));
        model.setVaitro(rs.getBoolean(4));
        model.setTrangthai(rs.getBoolean(5));       
        return model;
    }

    public synchronized static List<taikhoan> HienThi() {
        List<taikhoan> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM TAIKHOAN\n" +
                   "where TRANGTHAI = 1";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                taikhoan tk = new taikhoan();
                tk.setTentk(rs.getString(1));
                tk.setMatkhau(rs.getString(2));
                tk.setHoten(rs.getString(3));
                tk.setVaitro(rs.getBoolean(4));
                tk.setTrangthai(rs.getBoolean(5));

                list.add(tk);
            }
        } catch (Exception e) {
            System.out.println(e);

        }

        return list;

    }

//    public synchronized static List<taikhoan> HienThi1() {
//        List<taikhoan> list = new ArrayList<>();
//        try {
//            String sql = "select tentaikk,matkhau,hoten,email,vaitro from taikhoan\n"
//                    + "where trangthai= 0";
//            Statement st = con.createStatement();
//            ResultSet rs = st.executeQuery(sql);
//            while (rs.next()) {
//                taikhoan hd = new taikhoan();
//                hd.setTentk(rs.getString(1));
//                hd.setMatkhau(rs.getString(2));
//                hd.setHoten(rs.getString(3));
//                hd.setVaitro(rs.getBoolean(4));
//                hd.setTrangthai(rs.getBoolean(5));
//
//                list.add(hd);
//            }
//        } catch (Exception e) {
//
//        }
//
//        return list;
//
//    }

    //thực hiện truy vấn lấy về 1 tập ResultSet rồi điền tập ResultSet đó vào 1 List
    public List<taikhoan> select(String sql, Object... args) {
        List<taikhoan> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = jdbcKien.executeQuery(sql, args);
                while (rs.next()) {
                    list.add(readFromResultSet(rs));
                }
            } finally {
                rs.getStatement().getConnection().close();      //đóng kết nối từ resultSet
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException();
        }
        return list;
    }

    /**
     * Thêm mới thực thể vào CSDL
     *
     * @param entity là thực thể chứa thông tin bản ghi mới
     */
    public static void insert(taikhoan entity) {
        String sql = "INSERT INTO TAIKHOAN VALUES (?, ?, ?, ?, ?)";
        jdbcKien.executeUpdate(sql,
                entity.getTentk(),
                entity.getMatkhau(),
                entity.getHoten(),
                entity.isVaitro(),
                
                entity.isTrangthai()
        
        );
               
        
        
    }

    public static void update(taikhoan entity) {
        String sql = "UPDATE TAIKHOAN SET MatKhau=?, HoTen=?, VaiTro=? ,trangthai=? WHERE TENTk=?";
        jdbcKien.executeUpdate(sql,
                entity.getMatkhau(),
                entity.getHoten(),
                entity.isVaitro(),
                entity.isTrangthai(),
                entity.getTentk());
    }

    public synchronized static List<taikhoan> TimKiemMa(String ma) {
        List<taikhoan> list = new ArrayList<>();
        try {
            String sql = "select * from taikhoan\n"
                    + "where (tentk + hoten ) like ?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, "%" + ma + "%");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                taikhoan tk = new taikhoan();
                tk.setTentk(rs.getString(1));
                tk.setHoten(rs.getString(2));
                tk.setMatkhau(rs.getString(3));
                tk.setVaitro(rs.getBoolean(4));
                tk.setTrangthai(rs.getBoolean(5));

                list.add(tk);

            }
        } catch (Exception e) {

        }
        return list;
    }

    public  taikhoan checkTrungMa(String tenTaiKhoan) {
        String sql = "select * from taikhoan \n"
                + "where tentk = ?";
        List<taikhoan> list = select(sql, tenTaiKhoan);
        return list.size() > 0 ? list.get(0) : null;
    }
    public void delete(String tenTaiKhoan) {
        String sql = "UPDATE taikhoan\n"
                + "SET an = 0\n"
                + "where tentk = ?";
        jdbcKien.executeUpdate(sql, tenTaiKhoan);
    }
  
}
