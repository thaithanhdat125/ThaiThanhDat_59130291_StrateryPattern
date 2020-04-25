/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author Admin
 */
public class SoSanhTheoTen implements ISoSanh<SinhVien>{

    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        int n= o1.hoTen.compareTo(o2.hoTen);
        if(n>0) return 1;
        if(n==0) return 0;
        if(n<0) return -1;
        return 0;
        }
   
}
