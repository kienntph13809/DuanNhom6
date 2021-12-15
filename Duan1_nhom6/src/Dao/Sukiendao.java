package Dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Helper.Utils;
import Helper.jdbcKien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.sukien;

/**
 *
 * @author LENOVO
 */
public class Sukiendao {

    private String INSERT_SQL = "INSERT INTO SUKIEN(MASK,TENSK,TGBATDAU,TGKETTHUC,GIAMGIA,TRANGTHAI) VALUES (? , ?, ?, ?, ?, ?)";
    private String INSERT_SQL1 = "INSERT INTO SUKIEN(MASK) VALUES (?)";
    private String UPDATE_SQL = "UPDATE SUKIEN SET TENSK =? ,UUDAI=? WHERE MASK =?";
    private String DELETE_SQL = "DELETE FROM SUKIEN WHERE MASK =?";
    private String SELECT_ALL_SQL = "SELECT * FROM SUKIEN";
    private String SELECT_BY_ID_SQL = "SELECT * FROM SUKIEN WHERE TRANGTHAI = 1";
    private String SELCT_BYID_SQL = "Select * from SUKIEN where MASK LIKE ?";
    private String Update2 = " Update  SUKIEN set TENSK = ?  , TGBATDAU = ? , TGKETTHUC = ?, GIAMGIA = ? , TRANGTHAI = ? where MASK like ? ";
    private String delete = " delete from SUKIEN where MASK like ? ";
    private String SelectById_2 = "Select * from SUKIEN where TENSK like ? ";
    private String SelectById_3 = "Select * from SUKIEN where TRANGTHAI =1 ";
    private String SelectById_4 = "Select * from SUKIEN where TRANGTHAI =0 ";

    public void insert(sukien x) {
        jdbcKien.executeUpdate(INSERT_SQL1, x.getMaSuKien());
    }

    public void insert1(sukien x) {
        jdbcKien.Update(INSERT_SQL, x.getMaSuKien(), x.getTenSuKien(), x.getTgBatDau(), x.getTgKetThuc(), x.getUudai(), x.isTrangThai());
    }
//    public void update(sukien x) {
//        jdbcKien.executeUpdate(SELCT_BYID_SQL, x.getTenSuKien(), x.getUuDai(), x.getTgBatDau(),
//                x.getTgKetThuc(),x.getMaSuKien());
//    }

    public void delete(String key) {
        jdbcKien.executeUpdate(DELETE_SQL, key);
    }

    public List<sukien> selectAll_1(String k) {
        return selectBySql(SelectById_2, "%" + k + "%");
    }
    public List<sukien> selectAll_2(String k) {
        return selectBySql(SelectById_3, "%" + k + "%");
    }

    public List<sukien> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }
    public List<sukien> selecTT() {
        return this.selectBySql(SelectById_3);
    }
    public List<sukien> selecTT1() {
        return this.selectBySql(SelectById_4);
    }

    public void delete1(String id) {
        jdbcKien.Update(delete, id);
    }

    public List<sukien> selectAll1() {
        return this.selectBySql(SELECT_BY_ID_SQL);
    }

    public void Update_2(sukien entity) {
        jdbcKien.Update(Update2, entity.getTenSuKien(), entity.getTgBatDau(), entity.getTgKetThuc(), entity.getUudai(), entity.isTrangThai(), entity.getMaSuKien());
    }
     public void Update_3(sukien entity) {
        jdbcKien.Update(SelectById_3, entity.getTenSuKien(), entity.getTgBatDau(), entity.getTgKetThuc(), entity.getUudai(), entity.isTrangThai(), entity.getMaSuKien());
    }

    public static int Update(String sql, Object... args) {
        try {
            PreparedStatement stmt = jdbcKien.preparedStatement(sql, args);
            try {
                return stmt.executeUpdate();
            } finally {
                stmt.getConnection().close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    public sukien selectById(String key) {
        List<sukien> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public sukien selectByID(String id) {
        List<sukien> list = selectBySql(SELCT_BYID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    protected List<sukien> selectBySql(String sql, Object... args) {
        List<sukien> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcKien.executeQuery(sql, args);
            while (rs.next()) {
                sukien sk = new sukien();
                sk.setMaSuKien(rs.getString(1));
                sk.setTenSuKien(rs.getString(2));
                sk.setTgBatDau(rs.getDate(3));
                sk.setTgKetThuc(rs.getDate(4));
                sk.setUudai(rs.getFloat(5));
                sk.setTrangThai(rs.getBoolean(6));

                list.add(sk);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public sukien readSuKienFromResultSet(ResultSet rs) throws SQLException {
        sukien mode = new sukien();
        mode.setMaSuKien(rs.getString(1));
        mode.setTenSuKien(rs.getString(2));
        mode.setTgBatDau(rs.getDate(3));
        mode.setTgKetThuc(rs.getDate(4));
        mode.setUudai(rs.getFloat(5));
        mode.setTrangThai(rs.getBoolean(6));
        System.out.println(mode);

        return mode;
    }

    public List<sukien> selectSuKien(String sql, Object... args) {
        List<sukien> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = jdbcKien.executeQuery(sql, args);
                while (rs.next()) {
                    list.add(readSuKienFromResultSet(rs));
                }
            } finally {

            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return list;
    }

    //load data to combo
    public void LoadDataToComBo(DefaultComboBoxModel cbx) {
        cbx.removeAllElements();
        String sql = "select * from\n"
                + " SUKIEN where TRANGTHAI =1";
        List<sukien> list = selectSuKien(sql);
        for (int i = 0; i < list.size(); i++) {
            sukien sk = list.get(i);
            cbx.addElement(sk);
        }
    }

    public Integer getmasp() {
        String sql = "select max(SOSK) from SUKIEN";
        Integer masp = 1;
        try {
            ResultSet rs = null;
            try {
                rs = jdbcKien.executeQuery(sql);
                if (rs.next()) {
                    masp = rs.getInt(1) + 1;
                } else {
                    masp = 1;
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();

        }
        return masp;
    }

    //tìm sự kiện theo mã
    public sukien findByMaSK(String maSK) {
        String sql = "select * from SUKIEN\n"
                + "where MASK = ?";
        List<sukien> list = selectSuKien(sql, maSK);
        return list.size() > 0 ? list.get(0) : null;
    }

    //tìm sự kiện theo tên (check trùng tên khi sự kiện đang hoạt động)
    public sukien findByTenSK(String tenSK) {
        String sql = "select * from SUKIEN\n"
                + "where TENSK = ? and TRANGTHAI = 1 ";
        List<sukien> list = selectSuKien(sql, tenSK);
        return list.size() > 0 ? list.get(0) : null;
    }

    //update sukien
    public void updateSuKien(boolean huy, sukien sk) {
        if (!huy) {
            String sql = "update SUKIEN\n"
                    + "set TENSK = ?,\n"
                    + "	UUDAI = ?,\n"
                    + "	TGKETTHIC = ?,\n"
                    + "	LoaiSuKien = ?\n"
                    + "where MASK = ?";
            jdbcKien.executeUpdate(sql,
                    sk.getTenSuKien(),
                    sk.getUudai(),
                    sk.getTgKetThuc(),
                    sk.getMaSuKien());
        } else {
            String sql = "update SUKIEN\n"
                    + "set TRANGTHAI = 0\n"
                    + "where MASK = ?";
            jdbcKien.executeUpdate(sql, sk.getMaSuKien());
        }
    }

    //tìm sự kiện

    public List<sukien> selecTT1(String toString) {
       return this.selectBySql(SelectById_4);
    }
}
