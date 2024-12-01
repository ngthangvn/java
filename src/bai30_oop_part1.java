import CongTy.NhanVienHanhChinh;
import TruongDaiHoc.SinhVien;

public class bai30_oop_part1 {
    public static void main(String[] args) {
        // khởi tạo đối tượng thuốc class sinh viên
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();
        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
        SinhVien sv3 = new SinhVien("Thoa");
        sv3.hienThiThongTin();
        SinhVien sv4 = new SinhVien("Thoa", 3.5);
        sv4.hienThiThongTin();
        System.out.println(sv4.getHoTen());
        System.out.println(sv4.getDiem());
        // thay đổi tên của sinh viên 4
        sv4.setHoTen("Linh");
        sv4.setDiem(25);
        sv4.hienThiThongTin();
        // 9. test phương thức có kiểu trả về
        double dtb4 = sv4.tinhDTB(7.5, 3.5);
        System.out.println(dtb4);

        // test phương thức toString
        System.out.println(sv4.toString());

        sv4.checkHopLeDiem();
        // 12. over loading
        double testD1 = sv4.tinhDTB(2, 6, 8);
        System.out.println(testD1);
        double testD2 = sv4.tinhDTB(7.5, 8.0);
        System.out.println(testD2);

        double kq = sv4.tongDiem(1,2,3,4,5,6);
        double kq2 = sv4.tongDiem(1,2,3,4,5,6,7,8,9);
        System.out.println(kq);
        System.out.println(kq2);
    }
}
