package oopSxClass;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        // tạo list
        ArrayList<SanPham> ds = new ArrayList<>();
        // khởi tạo các đối tượng sản phẩm
        SanPham sp1 = new SanPham(1, "Samsung", 1000);
        SanPham sp2 = new SanPham(2, "Iphone", 500);
        SanPham sp3 = new SanPham(2, "guong", 800);
        // add sản phẩm vào list
        ds.add(sp1);
        ds.add(sp2);
        ds.add(sp3);
        // xem danh sách sp trong list
        for (SanPham sp : ds) {
            System.out.println(sp);
        }

        // gọi pt sắp xếp
        Collections.sort(ds);
        System.out.println("ds sau sx la: ");
        for (SanPham sp : ds) {
            System.out.println(sp);
        }
    }
}
