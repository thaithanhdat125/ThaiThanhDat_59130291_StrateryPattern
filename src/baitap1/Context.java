/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author Admin
 */
public class Context {
       ITinh tinh;
    public ITinh getTinh() {
        return tinh;
    }

    public void setTinhToan(ITinh tinhToan) {
        this.tinh = tinhToan;
    }
    public float tinh(float a,float b)
    {
        return tinh.Tinh(a, b);
    }
    
    
}
