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
public class Sanpham {
    private String masp;
    private String tensp;
    private String chatlieu;
    private String mota;
    private String anh;
    private int madm;
    private String TenDm;
    private int soluong;
    private Float dongia;
    private Boolean trangthai;
    private int MaCL;

    public Sanpham() {
    }

    public Sanpham(String masp, String tensp, String chatlieu, String mota, String anh, int madm, String TenDm, int soluong, Float dongia, Boolean trangthai, int MaCL) {
        this.masp = masp;
        this.tensp = tensp;
        this.chatlieu = chatlieu;
        this.mota = mota;
        this.anh = anh;
        this.madm = madm;
        this.TenDm = TenDm;
        this.soluong = soluong;
        this.dongia = dongia;
        this.trangthai = trangthai;
        this.MaCL = MaCL;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getChatlieu() {
        return chatlieu;
    }

    public void setChatlieu(String chatlieu) {
        this.chatlieu = chatlieu;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public int getMadm() {
        return madm;
    }

    public void setMadm(int madm) {
        this.madm = madm;
    }

    public String getTenDm() {
        return TenDm;
    }

    public void setTenDm(String TenDm) {
        this.TenDm = TenDm;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public Float getDongia() {
        return dongia;
    }

    public void setDongia(Float dongia) {
        this.dongia = dongia;
    }

    public Boolean getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(Boolean trangthai) {
        this.trangthai = trangthai;
    }

    public int getMaCL() {
        return MaCL;
    }

    public void setMaCL(int MaCL) {
        this.MaCL = MaCL;
    }
 
    
}