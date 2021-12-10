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
public class DanhMuc {
    private int madm;
    private String tendm;
    private boolean trangThai;

    public DanhMuc() {
    }

    public DanhMuc(int madm, String tendm, boolean trangThai) {
        this.madm = madm;
        this.tendm = tendm;
        this.trangThai = trangThai;
    }

    public int getMadm() {
        return madm;
    }

    public void setMadm(int madm) {
        this.madm = madm;
    }

    public String getTendm() {
        return tendm;
    }

    public void setTendm(String tendm) {
        this.tendm = tendm;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    
            
}
