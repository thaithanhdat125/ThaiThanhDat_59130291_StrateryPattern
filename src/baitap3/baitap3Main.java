/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

import java.text.ParseException;
import java.text.SimpleDateFormat;


/**
 *
 * @author Admin
 */
public class baitap3Main {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        // TODO code application logic 
        QLSV qlsv = new QLSV();
        SinhVien ngoi = new SinhVien("Nguyễn Văn A",format.parse("23-10-1999"),9);
        SinhVien Khiem = new SinhVien("Nguyễn Văn C",format.parse("23-10-1999"), (float) 9.1);
        SinhVien Phuc = new SinhVien("Nguyễn Văn B",format.parse("23-10-1999"), (float) 8.9);
        qlsv.dsSinhVien.add(ngoi);
        qlsv.dsSinhVien.add(Khiem);
        qlsv.dsSinhVien.add(Phuc);
        qlsv.setSoSanh(new SoSanhTheoTen());
        qlsv.sapXep();     
        qlsv.inDS();
        //----------------------------------------------
        System.out.println("\n");
        QLSV qlsv1 = new QLSV();
        qlsv1.dsSinhVien.add(ngoi);
        qlsv1.dsSinhVien.add(Khiem);
        qlsv1.dsSinhVien.add(Phuc);
        qlsv1.setSoSanh(new SoSanhTheoDiem());
        qlsv1.sapXep();     
        qlsv1.inDS();
    }
    
}
