/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QLSV {
    ISoSanh<SinhVien> soSanh;
    ArrayList<SinhVien> dsSinhVien = new ArrayList<>();

    public QLSV() {
    }

    public ISoSanh<SinhVien> getSoSanh() {
        return soSanh;
    }

    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }

    public ArrayList<SinhVien> getDsSinhVien() {
        return dsSinhVien;
    }

    public void setDsSinhVien(ArrayList<SinhVien> dsSinhVien) {
        this.dsSinhVien = dsSinhVien;
    }
    public void sapXep()
    {
        dsSinhVien.sort((arg0, arg1) -> {
            return soSanh.soSanh(arg0, arg1);
        });
    }
    public void inDS()
    {
        for(SinhVien i : dsSinhVien)
        {
            System.out.println("Họ và Tên: " +i.hoTen+
                     "\nNgày Sinh: "+i.ngaySinh+
                     "\nĐiểm TB: " + i.diemTB);
        }
    }
    
}
