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
    private int trangThai;

    public DanhMuc() {
    }

    public DanhMuc(int madm, String tendm, int trangThai) {
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

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return tendm;
    }
    
            
}
