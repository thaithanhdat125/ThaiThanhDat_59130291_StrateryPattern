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
public class baitap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IThanhToan Online = new ThanhToanOnline();
        IThanhToan COD = new ThanhToanCOD();
    //------------------------------------------------------------------------
    HangHoa cam = new HangHoa("Cam Sành",300000,"Cam sành chất lượng cao");
    HangHoa keo = new HangHoa("Kẹo sữa milkita",300000,"kẹo sữa Milkita được làm từ sữa");
    HangHoa ram = new HangHoa("Ram 4GB", 800000,"Ram 4G DDR3");
    HangHoa dell = new HangHoa("Dell N3559",8000000,"Chất lượng cao laptop");
    //------------------------------------------------------------------------
    GioHang DatBag = new GioHang();//Them Vao Gio Hang
    DatBag.dshanghoa.add(cam);
    DatBag.dshanghoa.add(keo);
    DatBag.dshanghoa.add(ram);
    GioHang LongBag = new GioHang();//Them Vao Gio Hang
    LongBag.dshanghoa.add(cam);
    LongBag.dshanghoa.add(keo);
    LongBag.dshanghoa.add(ram);
    //------------------------------------------------------------------------    
    System.out.println("GIỎ HÀNG CỦA ĐẠT THANH TOÁN ONLINE:\n------------------------------------");
        int s=0;
        for(HangHoa i : DatBag.dshanghoa)
        {
            s=s+i.giaHangHoa;
        }
    DatBag.setThanhToan(Online);// Hinh Thuc Thanh Toan
    for(HangHoa i : DatBag.dshanghoa )
        {
            System.out.println("Tên Hàng Hóa: " + i.tenHangHoa +
                     "\nGiá : " +i.giaHangHoa +
                     "\nMô tả: " +i.moTa +"\n----------");
        }
    System.out.println("TỔNG SỐ TIỀN PHẢI TRẢ:" + DatBag.ThanhToan(s));
    
    //------------------------------------------------------------------------
    System.out.println("\nGIỎ HÀNG CỦA LONG THANH TOÁN COD:\n------------------------------------");
        int x=0;
        for(HangHoa i : LongBag.dshanghoa)
        {
            s=s+i.giaHangHoa;
        }
    LongBag.setThanhToan(COD);// hinh thuc thanh toan
    for(HangHoa i : LongBag.dshanghoa )
        {
            System.out.println("Tên Hàng Hóa: " + i.tenHangHoa +
                     "\nGiá : " +i.giaHangHoa +
                     "\nMô tả: " +i.moTa +"\n----------");
        }
    for(HangHoa i : LongBag.dshanghoa)
        {
            x=x+i.giaHangHoa;
        }
    System.out.println("TỔNG SỐ TIỀN PHẢI TRẢ:" + LongBag.ThanhToan(x));
    }
    
}
