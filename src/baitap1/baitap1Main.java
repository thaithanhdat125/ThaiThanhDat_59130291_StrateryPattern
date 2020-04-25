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
public class baitap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //-----------------------------------------------------
    Context toanCong = new Context();
    toanCong.setTinhToan(new Cong());
    System.out.println("75 + 12 = "+toanCong.tinh(75,12));
    //------------------------------------------------------
    Context toanTru = new Context();
    toanTru.setTinhToan(new Tru());
    System.out.println("54 - 87 = "+toanTru.tinh(54,87));
     
    
    }
    
    
}
