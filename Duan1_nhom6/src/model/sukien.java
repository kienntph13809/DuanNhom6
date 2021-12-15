/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class sukien {

    private String MaSuKien;
    private String TenSuKien;
    private Date tgBatDau;
    private Date tgKetThuc;
    private Float uudai;
    private boolean trangThai;

    public sukien() {
    }

    public sukien(String MaSuKien, String TenSuKien, Date tgBatDau, Date tgKetThuc, Float uudai, boolean trangThai) {
        this.MaSuKien = MaSuKien;
        this.TenSuKien = TenSuKien;
        this.tgBatDau = tgBatDau;
        this.tgKetThuc = tgKetThuc;
        this.uudai = uudai;
        this.trangThai = trangThai;
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

    public Date getTgBatDau() {
        return tgBatDau;
    }

    public void setTgBatDau(Date tgBatDau) {
        this.tgBatDau = tgBatDau;
    }

    public Date getTgKetThuc() {
        return tgKetThuc;
    }

    public void setTgKetThuc(Date tgKetThuc) {
        this.tgKetThuc = tgKetThuc;
    }

    public Float getUudai() {
        return uudai;
    }

    public void setUudai(Float uudai) {
        this.uudai = uudai;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "sukien{" + "TenSuKien=" + TenSuKien + '}';
    }

}
