import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class bai28_2giaibt28 {
    public static void main(String[] args) {
        /*
         * bài 28: Viết chương trình tạo ra Ì list có n phân tử, n nhập từ bàn phím
         * Các phân tử là số ngẫu nhiên từ (1,100)
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai: ");
        int n = sc.nextInt();
        Random rd = new Random();
        ArrayList<Integer> pt = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int nn = rd.nextInt(1, 101);
            pt.add(nn);
        }

        System.out.println(pt);

    }
}
