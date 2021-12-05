/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Helper.jdbcKien;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.HoaDon;

/**
 *
 * @author kien5
 */
public class HoaDonDAO {

    String INSERT_SQL = "insert into HOADON(MAHD,TENTK,TONGTIENTT,TRANGTHAI,ghichu) values (?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE HOADON SET TONGTIENTT = ?,TRANGTHAI = ?,GHICHU = ?\n"
            + "WHERE MAHD = ?";
    String SELECT_ALL_SQL = "SELECT *\n"
            + "            FROM HOADON JOIN TAIKHOAN ON HOADON.TENTK = TAIKHOAN.TENTK\n"
            + "            			JOIN KHACHHANG ON KHACHHANG.MAKH = HOADON.MAKH ";
    String SELECT_BY_CHOTT = "    select * from HOADON\n"
            + "	 where TRANGTHAI = 0";
    String SELECT_BY_ID_SQL = "   select *\n"
            + "from HOADON join TAIKHOAN on HOADON.TENTK = TAIKHOAN.TENTK\n"
            + "            join KHACHHANG on HOADON.MAKH = KHACHHANG.MAKH\n"
            + "       where MAHD = ?        ";
    String UPDATE_HD = " update HOADON set MASP = ?,TONGTIENTT= ?\n"
            + "		 where MAHD = ?";

    public void insert(HoaDon model) {
        jdbcKien.executeUpdate(INSERT_SQL, model.getMahd(), model.getTentk() ,model.getTongTien(), model.getTrangThai(), model.getGhichu());
    }

    public List<HoaDon> selectBySQL(String sqlString, Object... args) {
        List<HoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcKien.executeQuery(sqlString, args);
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setMahd(rs.getString("MaHd"));
                hd.setMasp(rs.getString("Masp"));
                hd.setMakh(rs.getString("Makh"));
//                hd.setTenkh(rs.getString("TENKH"));
                hd.setTentk(rs.getString("TENTK"));
//                hd.setHoten(rs.getString("HOTEN"));
                hd.setMask(rs.getInt("MASK"));
                hd.setNgaylap(rs.getDate("NGAYLAP"));
                hd.setUudai(rs.getFloat("UUDAI"));
                hd.setTongTien(rs.getFloat("TONGTIENTT"));
                hd.setTrangThai(rs.getBoolean("TRANGTHAI"));
                hd.setGhichu(rs.getString("ghichu"));

                list.add(hd);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<HoaDon> selectAll() {
        return selectBySQL(SELECT_ALL_SQL);
    }

    public List<HoaDon> selectByHDChoThanhToan() {
        return selectBySQL(SELECT_BY_CHOTT);
    }

    public void update(HoaDon model) {
        jdbcKien.executeUpdate(UPDATE_SQL, model.getTongTien(), model.getTrangThai(), model.getGhichu(),
                model.getMahd());
    }

    public HoaDon selectById(String key) {
        List<HoaDon> list = selectBySQL(SELECT_BY_ID_SQL, "%" + key + "%");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public void updateHD(HoaDon model) {
        jdbcKien.executeUpdate(UPDATE_SQL, model.getMasp(), model.getTongTien(),
                model.getMahd());
    }

    public List<Integer> selectNam() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
