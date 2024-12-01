package Enum;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // kiểm tra thứ tự các giá trị trong enum
        System.out.println(XepLoai.kha.ordinal());
        System.out.println(XepLoai.yeu.ordinal());
        // tạo list danh sách
        ArrayList<Sv> ds = new ArrayList<>();
        // tạo đối tượng sinh viên
        Sv sv1 = new Sv(1, "Nguyen van a", 9.5);
        Sv sv2 = new Sv(2, "Nguyen van b", 7.5);
        Sv sv3 = new Sv(3, "Nguyen van c", 5.5);
        // 
        ds.add(sv1);
        ds.add(sv2);
        ds.add(sv3);
        // duyệt danh sách sinh viên
        for (Sv sinhVien : ds) {
            System.out.println(sinhVien);
        }
    }

}
