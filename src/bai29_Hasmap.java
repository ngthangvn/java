import java.util.HashMap;

public class bai29_Hasmap {
    public static void main(String[] args) {
        // 1. khai báo
        HashMap<Integer, String> map = new HashMap<>();
        HashMap<Integer, Float> map1 = new HashMap<>();

        // 2. Thêm các phần tử vào hasmap
        map.put(1, "App");
        map.put(2, "hhh");
        map.put(3, "cherry");

        // 3. lấy giá trị của một phần từ
        String value = map.get(1);
        String value1 = map.get(2);
        String value2 = map.get(3);
        System.out.println(value);
        System.out.println(value1);
        System.out.println(value2);

        // 4. xóa phần tử khỏi hashmap
        map.remove(2);
        System.out.println(map.get(2));

        // 5. kiểm tra xem một phần tử có tồn tại trong map hay không
        boolean check = map.containsKey(3);
        System.out.println(check);

        // 6. kiểm tra xem môt giá trị có tồn tại trong map hay không
        boolean checn = map.containsValue("hghei");
        System.out.println(checn);

        // 7. kiểm tra xem hashmap có rỗng hay không
        boolean bien = map.isEmpty();
        System.out.println(bien);

        // 8. lấy số lượng phần tử trong hashmap
        int soLuongPt = map.size();
        System.out.println(soLuongPt);

        System.out.println("------------------");
        // 9. duyệt hashmap
        for (Integer x : map.keySet()) {
            System.out.println(map.get(x));
        }
    }
}
