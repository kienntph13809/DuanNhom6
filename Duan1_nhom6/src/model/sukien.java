/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author LENOVO
 */
public class sukien {

    private String MaSuKien;
    private String TenSuKien;
    private float UuDai;
    private String tgBatDau;
    private String tgKetThuc;
    private boolean loaiSuKien;
    private boolean trangThai;
    private String masp;

    public sukien() {
    }

    public sukien(String MaSuKien, String TenSuKien, float UuDai, String tgBatDau, String tgKetThuc, boolean loaiSuKien, boolean trangThai, String masp) {
        this.MaSuKien = MaSuKien;
        this.TenSuKien = TenSuKien;
        this.UuDai = UuDai;
        this.tgBatDau = tgBatDau;
        this.tgKetThuc = tgKetThuc;
        this.loaiSuKien = loaiSuKien;
        this.trangThai = trangThai;
        this.masp = masp;
    }

    public String getMaSuKien() {
        return MaSuKien;
    }

    public void setMaSuKien(String MaSuKien) {
        this.MaSuKien = MaSuKien;
    }

    public String getTenSuKien() {
        return TenSuKien;
    }

    public void setTenSuKien(String TenSuKien) {
        this.TenSuKien = TenSuKien;
    }

    public float getUuDai() {
        return UuDai;
    }

    public void setUuDai(float UuDai) {
        this.UuDai = UuDai;
    }

    public String getTgBatDau() {
        return tgBatDau;
    }

    public void setTgBatDau(String tgBatDau) {
        this.tgBatDau = tgBatDau;
    }

    public String getTgKetThuc() {
        return tgKetThuc;
    }

    public void setTgKetThuc(String tgKetThuc) {
        this.tgKetThuc = tgKetThuc;
    }

    public boolean isLoaiSuKien() {
        return loaiSuKien;
    }

    public void setLoaiSuKien(boolean loaiSuKien) {
        this.loaiSuKien = loaiSuKien;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

   
    @Override
    public String toString() {
        return "sukien{" + "TenSuKien=" + TenSuKien + '}';
    }
    

}
