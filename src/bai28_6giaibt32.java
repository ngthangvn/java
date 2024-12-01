import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class bai28_6giaibt32 {
    public static void main(String[] args) {
        /*
         * bài 32: Cho list lst={1,9,3,14,5,27,8}
         * Viết chương trình in số lớn thứ 2 và số nhỏ thứ 2 trong list
         * # 2: in ra Vị  tri index số đó
         * dap an::
         * # Số lớn thứ 2: 3
         * #SỐ nhỏ thứ 2: 8
         * #vị tri index cua sé lớn thứ 2: 1
         * #Vị  trí index của số nhỏ thứ 2: 3
         */
        ArrayList<Integer> lst = new ArrayList<>(List.of(1,9,3,14,5,27,8));
        // tạo ra 1 list mới giá trị giống với lst
        List<Integer> copy = new ArrayList<>(lst);
        // in thử list copy
        System.out.println(copy);
        // sắp xếp list copy theo thứ tự tăng dần
        Collections.sort(copy);
        System.out.println("cop sau sx la: "+copy);
        // in ra số lớn thứ 2 và số nhỏ thứ 2 trong list
        int soLonThu2 = copy.get(copy.size() - 2);
        int soNhoThu2 = copy.get(copy.get(1));
        System.out.println("So lon thu 2 la: "+soLonThu2);
        System.out.println("So nho thu 2 la: "+soNhoThu2);
        // tìm vị trí index vị trí số lớn thứ 2 và số nhỏ thứ 2
        System.out.println("Vi tri index cua so lon thu 2 la: "+lst.indexOf(soLonThu2));
        System.out.println("Vi tri index cua so nho thu 2 la: "+lst.indexOf(soNhoThu2));
    }
}
