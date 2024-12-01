package CongTy;

public class Test {
    public static void main(String[] args) {
        // NhanVien nv1 = new NhanVien("Nguyen Dinh Thang", "Ha noi", 23);
        // double luongnv1 = nv1.TinhLuong();
        // System.out.println("luon nv1 la: "+luongnv1);

        // tạo đối tượng là nv hành chính
        NhanVienHanhChinh hc1 = new NhanVienHanhChinh("Nguyen van a", "Ha nam", 1234456);
        double luonghc1 = hc1.TinhLuong();
        System.out.println("luong hc1 la: "+luonghc1);

        // tạo di ca
        NhanVienDiCa ca1 =new NhanVienDiCa("Nguyen van b", "phuong cach", 123244532);
        double luongCa = ca1.TinhLuong();
        System.out.println("luong ca1 la: "+luongCa);

        NhanVienHanhChinh hc2 =new NhanVienHanhChinh("Nguyen van b", "phuong cach", 123244532, 1);
        double luonghc2 = hc2.TinhLuong();
        System.out.println("luong ca1 la: "+luonghc2);
        System.out.println(hc2.ca);
    }
}
