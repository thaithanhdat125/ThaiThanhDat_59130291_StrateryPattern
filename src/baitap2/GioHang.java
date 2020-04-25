/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class GioHang {
    IThanhToan thanhToan;
    ArrayList<HangHoa> dshanghoa = new ArrayList<>();

    public GioHang() {
    }

    public IThanhToan getThanhToan() {
        return thanhToan;
    }

    public void setThanhToan(IThanhToan thanhToan) {
        this.thanhToan = thanhToan;
    }
    public double ThanhToan(int tienhang)
    {
        return thanhToan.thanhtoan(tienhang);
    }
}
