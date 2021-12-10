/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Helper.jdbcKien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import model.ChatLieu;

/**
 *
 * @author kien5
 */
public class ChatLieuDAO {
     public ChatLieu readChatLieuFromResultSet(ResultSet rs) throws SQLException {
         ChatLieu mode = new ChatLieu();
        mode.setMacl(rs.getInt(1));
        mode.setTencl(rs.getString(2));
        mode.setTrangthai(rs.getBoolean(3));

        return mode;
    }
    //lấy list danh sách chất liệu

    public List<ChatLieu> selectChatLieu(String sql, Object... args) {
        List<ChatLieu> chatlieu = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = jdbcKien.executeQuery(sql, args);
                while (rs.next()) {
                    chatlieu.add(readChatLieuFromResultSet(rs));

                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
        return chatlieu;
    }

    //truy vấn danh sách chất liệu
    public List<ChatLieu> selectListChatLieu() {
        String sql = "select * from ChatLieu\n"
                + "where TrangThai   = 1";
        return selectChatLieu(sql);
    }

    //load chất liệu vào combo
    public void LoadDataToComChatLieu(DefaultComboBoxModel cbx) {
        cbx.removeAllElements();
        ChatLieu CL = new ChatLieu();
        CL.setTencl("Tất cả các sản phẩm");
        cbx.addElement(CL);
        List<ChatLieu> ChatLieu = selectListChatLieu();
        for (int i = 0; i < ChatLieu.size(); i++) {
            ChatLieu cl = ChatLieu.get(i);
            cbx.addElement(cl);
        }
    }
    //load chất liệu vào combo2
    public void LoadDataToComBoChatLieu2(DefaultComboBoxModel cbx) {
        cbx.removeAllElements();

        List<ChatLieu> ChatLieu = selectListChatLieu();
        for (int i = 0; i < ChatLieu.size(); i++) {
            ChatLieu
                    cl = ChatLieu.get(i);
            cbx.addElement(cl);
        }
    }

    //thêm chất liệu
    public void insertChatLieu(String Tencl) {
        String sql = "insert into ChatLieu values(?,1)";
        jdbcKien.executeUpdate(sql, Tencl);
    }

    //truy vấn danh sách chất liệu theo tên check trùng tên
    public ChatLieu selectListChatLieuTrungTen(String tenChatLieu) {
        String sql = "select * from ChatLieu\n"
                + "where TrangThai = 1 and TenCl = ?";
        List<ChatLieu> cl = selectChatLieu(sql, tenChatLieu);

        return cl.size() > 0 ? cl.get(0) : null;
    }

    //update chất liệu về không hoạt động
    public void updateChatLieuVeSp(Integer maDM) {
        String sql = "update ChatLieu\n"
                + "set TrangThai = 0\n"
                + "where MaCl = ?";
        jdbcKien.executeUpdate(sql, maDM);
    }
}
