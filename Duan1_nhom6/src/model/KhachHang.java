/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author kien5
 */
public class KhachHang {
    private String Makh;
    private String Tenkh;
   
    private String SDT;
   
    private String DiaChi;
    private boolean TrangThai;
    public KhachHang() {
    }

    public KhachHang(String Makh, String Tenkh, String SDT, String DiaChi, boolean TrangThai) {
        this.Makh = Makh;
        this.Tenkh = Tenkh;
        this.SDT = SDT;
        this.DiaChi = DiaChi;
        this.TrangThai = TrangThai;
    }

    public String getMakh() {
        return Makh;
    }

    public void setMakh(String Makh) {
        this.Makh = Makh;
    }

    public String getTenkh() {
        return Tenkh;
    }

    public void setTenkh(String Tenkh) {
        this.Tenkh = Tenkh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

    
   
    
   
  
    
}
