/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

/**
 *
 * @author Admin
 */
public class HangHoa {
    String tenHangHoa;
    int giaHangHoa;
    String moTa;

    public HangHoa(String tenHangHoa, int giaHangHoa, String moTa) {
        this.tenHangHoa = tenHangHoa;
        this.giaHangHoa = giaHangHoa;
        this.moTa = moTa;
    }

    public String getTenHangHoa() {
        return tenHangHoa;
    }

    public void setTenHangHoa(String tenHangHoa) {
        this.tenHangHoa = tenHangHoa;
    }

    public int getGiaHangHoa() {
        return giaHangHoa;
    }

    public void setGiaHangHoa(int giaHangHoa) {
        this.giaHangHoa = giaHangHoa;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
   
}
