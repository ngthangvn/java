import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class bai28_1collection_arrayList_HashMap {
    public static void main(String[] args) {
        // 1.khai báo list
        ArrayList<Integer> lst = new ArrayList<>();
        // 2. khai báo với số lượng pt ban đầu
        ArrayList<Integer> lst2 = new ArrayList<>(5);
        // 3. khởi tạo list với các phần tử ban đầu
        ArrayList<Integer> lst3 = new ArrayList<>(List.of(1,2,3,4,5,6)); 

        // xuất list
        System.out.println(lst);
        System.out.println(lst2);
        System.out.println(lst3);

        // 2. add thêm phần tử
        ArrayList<Integer> lst4 = new ArrayList<>();
        // add pt 
        lst4.add(5);
        lst4.add(9);
        lst4.add(6);
        System.out.println("lst4 moi add la: ");
        System.out.println(lst4);
        // add(index, element) vào vị trí chỉ định
        lst4.add(2, 77);
        System.out.println("lst4 moi add 77 la: ");
        System.out.println(lst4);

        // 2.2 size: trả về số pt của list
        System.out.println("So pt cua lst4 la: "+lst4.size());

        // 2.3 get(int index): trả về giá trị list tại vị trí index
        System.out.println(lst4.get(3));

        // 2.4 remove (index)
        lst4.remove(2);
        System.out.println("lst4 sau xoa gia tri tai vi tri index 2 la: ");
        System.out.println(lst4);

        // 2.5 remove(1 phần tử đc chỉ định)
        ArrayList<Integer> lst5 = new ArrayList<>(List.of(1,2,3,4,5,6)); 
        System.out.println("lst5: "+lst5);
        lst5.remove(Integer.valueOf(2));
        System.out.println("lst5 sau khi xoa: "+lst5);

        // 2.6 set(index, element): thay đổi thông tin
        ArrayList<Integer> lst6 = new ArrayList<>(List.of(1,2,3,4,5,6));
        System.out.println("lst6: "+lst6);
        lst6.set(3, 99);
        System.out.println("lst6: sau doi "+lst6);

        // 2.7 contains() kiểm tra collection có chứa phần tử nào đó hay không
        ArrayList<Integer> lst7 = new ArrayList<>(List.of(1,2,3,4,5,6));
        boolean ktra = lst7.contains(4);
        System.out.println(ktra);

        // 2.8 collection.sort(List): sx tăng dần
        ArrayList<Integer> lst8 = new ArrayList<>(List.of(19,2,30,4,59,6));
        Collections.sort(lst8);
        System.out.println(lst8);

        // 2.9 indexOf(): tìm vị trí đầu tiên của element trong list
        // nếu 0 tồn tại trả về -1
        ArrayList<Integer> lst9 = new ArrayList<>(List.of(19,2,30,4,59,6));
        System.out.println(lst9.indexOf(2));

        // 3. duyệt list
        // 3.1 cách 1
        ArrayList<Integer> lst10 = new ArrayList<>(List.of(19,2,30,4,59,6));
        System.out.println("lst10 dùng for");
        for (int vl : lst10) {
            System.out.println(lst10);
        }

        // 3.2 cách 2 khi cần sử dụng đến các chỉ số index
        ArrayList<Integer> lst11 = new ArrayList<>(List.of(19,2,30,4,59,6));
        for(int i = 0; i < lst11.size(); i++){
            int vl = lst11.get(i);
            System.out.println(vl);
        }
    }
}
