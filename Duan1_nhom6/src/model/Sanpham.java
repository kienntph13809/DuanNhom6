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
    private int masp;
    private String tensp;
    private String chatlieu;
    private String mota;
    private String anh;
    private int madm;
    private int soluong;
    private Float dongia;
    private Boolean trangthai;

    public Sanpham() {
    }

    public Sanpham(int masp, String tensp, String chatlieu, String mota, String anh, int madm, int soluong, Float dongia, Boolean trangthai) {
        this.masp = masp;
        this.tensp = tensp;
        this.chatlieu = chatlieu;
        this.mota = mota;
        this.anh = anh;
        this.madm = madm;
        this.soluong = soluong;
        this.dongia = dongia;
        this.trangthai = trangthai;
    }

    public int getMasp() {
        return masp;
    }

    public void setMasp(int masp) {
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



   
}
