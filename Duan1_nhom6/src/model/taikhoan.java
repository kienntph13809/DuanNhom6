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
public class taikhoan {
    private String tentk;
    private String matkhau;
    private String hoten;
    private boolean vaitro =  false ;
    private boolean trangthai;

    public taikhoan() {
    }

    public taikhoan(String tentk, String matkhau, String hoten, boolean vaitro, boolean trangthai) {
        this.tentk = tentk;
        this.matkhau = matkhau;
        this.hoten = hoten;
        this.vaitro = vaitro;
        this.trangthai = trangthai;
    }

    public String getTentk() {
        return tentk;
    }

    public void setTentk(String tentk) {
        this.tentk = tentk;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public boolean isVaitro() {
        return vaitro;
    }

    public void setVaitro(boolean vaitro) {
        this.vaitro = vaitro;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }
    
    
}
