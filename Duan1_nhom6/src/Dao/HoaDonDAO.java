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
import model.HoaDon;

/**
 *
 * @author kien5
 */
public class HoaDonDAO {

    String INSERT_SQL = "    insert into HOADON(MAHD,MASP,MAKH,TENTK,MASK,NGAYLAP,UUDAI,TONGTIENTT,TRANGTHAI,ghichu) values (?,?,?,?,?,?,?,?,?,?)";
    String SELECT_ALL_SQL = "SELECT *\n"
            + "            FROM HOADON JOIN TAIKHOAN ON HOADON.TENTK = TAIKHOAN.TENTK\n"
            + "            			JOIN KHACHHANG ON KHACHHANG.MAKH = HOADON.MAKH ";
    String SELECT_BY_CHOTT = "  SELECT *\n"
            + "            FROM HOADON JOIN TAIKHOAN ON HOADON.TENTK = TAIKHOAN.TENTK\n"
            + "            			JOIN KHACHHANG ON KHACHHANG.MAKH = HOADON.MAKH \n"
            + "            WHERE hoadon.TRANGTHAI LIKE 1";

    public void insert(HoaDon model) {
        jdbcKien.executeUpdate(INSERT_SQL,model.getMahd(),model.getMasp(),model.getMakh(),model.getTentk(),model.getMask(),model.getNgaylap(),model.getUudai(),model.getTrangThai(),model.getGhichu());
    }

    public List<HoaDon> selectBySQL(String sqlString, Object... args) {
        List<HoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcKien.executeQuery(sqlString, args);
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setMahd(rs.getString("MaHd"));
                hd.setMasp(rs.getString("Masp"));
//                hd.setTensp(rs.getString("TENSP"));
                hd.setMakh(rs.getString("Makh"));
                hd.setTenkh(rs.getString("TENKH"));
                hd.setTentk(rs.getString("TENTK"));
                hd.setHoten(rs.getString("HOTEN"));
                hd.setMask(rs.getInt("MASK"));
                hd.setNgaylap(rs.getDate("NGAYLAP"));
//                hd.setTensk(rs.getString("TENSK"));
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
}
