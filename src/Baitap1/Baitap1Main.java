/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap1;

/**
 *
 * @author Admin
 */
public class Baitap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       HocSinh hs1 = new HocSinh("Lop1", "Toan", "Nguyễn Văn An", 12, "Nha Trang", "121164163");
       HocSinh hs2 = new HocSinh("Lop2", "Ly", "Trần Thị Bình", 15, "Hồ Chí Minh", "55616120");
       HocSinh hs3 = new HocSinh("Lop3", "Hoa", "Võ trần Long", 20, "Hà Nội", "09054785");
       
       GiaoVien gvcn = new GiaoVien("Toán", "T", "Trần Kim Bảo", 40, "Nha Trang", "484153213");
       GiaoVien gv1 = new GiaoVien("Lý", "L", "Vũ Mộc Nhân", 40, "Nha Trang", "4658798");
       GiaoVien gv2 = new GiaoVien("Hóa", "H", "Nguyễn Thanh Thảo ", 41, "Nha Trang", "151511535");
       
       LopHoc lh = new LopHoc(gvcn);
       lh.themHocSinh(hs1);
       lh.themHocSinh(hs2);
       lh.themHocSinh(hs3);
       
       lh.themGVGD(gv1);
       lh.themGVGD(gv2);
       
       lh.inDSHS();
       lh.inDSGVGD();
    }
    
}