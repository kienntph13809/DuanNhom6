/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import java.awt.Image;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;
import model.taikhoan;

/**
 *
 * @author kien5
 */
public class Sharehelper {
     public static final Image APP_ICON;
 public static final ImageIcon APP_ICON_1;
 static{
     // Tải biểu tượng ứng dụng 
     //CÁCH TẢI ẢNH TỪ TRONG PROJECT
     //icon là thư mục con của src
     String file = "/icon/duc.jpg";      //icon là thư mục con của src
     APP_ICON = new ImageIcon(Sharehelper.class.getResource(file)).getImage();
     APP_ICON_1 = new ImageIcon(Sharehelper.class.getResource(file));
 }
    public static boolean  saveLogo(File file){
            
        
        File dir = new File("logos");
        if (!dir.exists()) {
         dir.mkdirs();
        }
           File newFile = new File(dir,file.getName());
        try {
            // copy vào thu mục logos (nếu đã tồn tại)
            Path source = Paths.get(file.getAbsolutePath());
            Path destination = Paths.get(newFile.getAbsolutePath());
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (Exception e) {
            return false;
        }
       
    }
     /** 
         * đọc hình ảnh logis chuyên đề trong thư mục logos theo tên file
         * @param filename là tên file logos
         * @return ImageIcon ảnh đọc được
         */
       public static ImageIcon readLogo(String fileName){
    File path = new File("logos", fileName);
    return new ImageIcon(new ImageIcon(path.getAbsolutePath()).getImage().getScaledInstance(180, 180, Image.SCALE_DEFAULT));
 }
/**
 * Đối tượng này chứa thông tin người sử dụng sau khi đăng nhập
 */
    public static taikhoan USER = null;
    /*
    Kiểm tra xem đăng nhập ngày nào hay chưa
    @return đăng nhập hay chưa
    */
    public static void logoff(){
        Sharehelper.USER = null;
    }
    public static boolean  authenticated(){
     return Sharehelper.USER != null;
    }
}


