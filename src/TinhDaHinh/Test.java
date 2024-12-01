package TinhDaHinh;

public class Test {
    public static void main(String[] args) {
        NhanSu ns1 = new PhoPhong("Nguyen van a", "2222222", "Ha noi");
        // xuất lương phó phòng
        System.out.println("ns1 dang lam pp");
        System.out.println(ns1.getTen()+" : "+ns1.getCccd());
        System.out.println("luong khi lm pho phong: "+ns1.tinhLuong(21));
        System.out.println();
        // thay đổi chức vụ
        ns1 = new TruongPhong(ns1.getTen(), ns1.getCccd(), ns1.getQue());
        // in luong ns1 khi lm truong p
        System.out.println(("ns1 dang lm truong p"));
        System.out.println(ns1.getTen()+" : "+ns1.getCccd());
        System.out.println("luong khi lm truong phong: "+ns1.tinhLuong(21));
    }

    
}
