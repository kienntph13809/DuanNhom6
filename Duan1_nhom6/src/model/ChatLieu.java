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
public class ChatLieu {

   
    private int macl;
    private String tencl;
    private int trangthai;

    public ChatLieu() {
    }

    public ChatLieu(int macl, String tencl, int trangthai) {
        this.macl = macl;
        this.tencl = tencl;
        this.trangthai = trangthai;
    }

    public int getMacl() {
        return macl;
    }

    public void setMacl(int macl) {
        this.macl = macl;
    }

    public String getTencl() {
        return tencl;
    }

    public void setTencl(String tencl) {
        this.tencl = tencl;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

   
    @Override
    public String toString() {
        return tencl;
    }
    
}
