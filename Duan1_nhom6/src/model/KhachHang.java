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
    private String makh;
    private String tenkh;
    private String SDT;
    private String DiaChi;
    private Boolean trangThai;

    public KhachHang() {
    }

    public KhachHang(String makh, String tenkh, String SDT, String DiaChi, Boolean trangThai) {
        this.makh = makh;
        this.tenkh = tenkh;
        this.SDT = SDT;
        this.DiaChi = DiaChi;
        this.trangThai = trangThai;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
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

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

  
    
}
