/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import javax.swing.JOptionPane;

/**
 *
 * @author kien5
 */
public class DialogHelper {
    
    public static void alert(java.awt.Component parent, String message) {
    JOptionPane.showMessageDialog(parent, message,
    "Hệ Thống Quản lý bán Nội Thất", JOptionPane.INFORMATION_MESSAGE);
 }
    /**
 * Hiển thị thông báo và yêu cầu người dùng xác nhận
 * @param parent là cửa sổ chứa thông báo
 * @param message là câu hỏi yes/no
 * @return là kết quả nhận được true/false
 */
     public static boolean confirm(java.awt.Component parent, String message) {
    int result = JOptionPane.showConfirmDialog(parent, message,
    "Hệ Thống Quản lý bán Nội Thất",
    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    return result == JOptionPane.YES_OPTION;
 }
 /**
 * Hiển thị thông báo yêu cầu nhập dữ liệu
 * @param parent là cửa sổ chứa thông báo
 * @param message là thông báo nhắc nhở nhập
 * @return là kết quả nhận được từ người sử dụng nhập vào
 */
 public static String prompt(java.awt.Component parent, String message) {
    return JOptionPane.showInputDialog(parent, message,
    "Hệ Thống Quản lý bán Nội Thất", JOptionPane.INFORMATION_MESSAGE);
 }
}
