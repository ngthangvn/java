import java.util.Arrays;

public class bai27_1mang {

    public static void main(String[] args) {
        // 1. khai báo mảng:
        String[] mangStr;
        Float[] mangFl;
        Double[] mangDb;

        // 2. khởi tạo mảng kèm theo kích thước
        String[] mangStr2 = new String[12];
        int[] mangNguyen2 = new int[7];

        // 3. khởi tạo mảng kèm theo giá trị ban đầu
        String[] mangStr3 = new String[] { "chi pheo", "thi no", "ong giao" };
        int[] mangNguyen3 = new int[] { 1, 2, 3, 4, 5, 6 };

        // truy xuất phần tử của mảng dựa theo index
        System.out.println(mangStr3[2]);
        System.out.println(mangStr3[2]);
        // test
        System.out.println(mangStr2[0]);
        System.out.println(mangStr2[1]);
        // test2
        mangStr = new String[]{"hello", "buy"};
        System.out.println(mangStr[0]);

        // length
        System.out.println(mangNguyen3.length);

        // 6. Duyệt mảng dùng for
        // c1
        int[] mang4 = new int[]{1,2,3,4,5,6,7};
        for (int pt : mang4) {
            System.out.println(pt);
        }

        System.out.println("------------");

        // c2 
        for(int i = 0; i < mang4.length; i++){
            System.out.println(mang4[i]);
        }

        String[] mang5 = new String[]{"chi pheo", "thi no", "ong giao"};
        for(int i = 0; i < mang5.length; i++){
            System.out.println(mang5[i]);
        }

        mang5[0] = "mama";
        System.out.println("mang sau khi thay doi");
        for(int i = 0; i < mang5.length; i++){
            System.out.println(mang5[i]);
        }

        // update toàn bộ danh sách
        int[] mang7 = new int[]{1,2,3,4,5,6,7};
        for(int i = 0; i < mang7.length; i++){
            mang7[i] += 2;
        }

        // duyệt mảng
        for(int i = 0; i < mang7.length; i++){
            System.out.println(mang7[i]);
        }

        // sx tăng dần
        int[] mang8 = {4,8,1,30,20,19};
        Arrays.sort(mang8);
        System.out.println("Mang sau khi xap xep: ");
        System.out.println(Arrays.toString(mang8));

        // 10. đảo ngược mảng
        int[] mang9 = {4,8,1,30,20,19};
        for(int i = 0, j = mang9.length-1; i<j; i++, j--){
            int temp = mang9[i];
            mang9[i] = mang9[j];
            mang9[j] = temp;
        }

        // xuất mảng
        System.out.println("Mang sau dao nguoc lai: ");
        System.out.println(Arrays.toString(mang9));

        // 11. gán mảng truy xuất cùng vùng nhớ
        int[] mang10 = {4,8,1,30,20,19};
        int[] mang11 = mang10;
        mang10[0] = 100;
        System.out.println(Arrays.toString(mang10));
        System.out.println(Arrays.toString(mang11));

        // 12. clone
        int[] mang12 = {4,8,1,30,20,19};
        int[] mang13 = mang12.clone();
        mang12[0] = 100;
        System.out.println(Arrays.toString(mang12));
        System.out.println(Arrays.toString(mang13));
    }
}
