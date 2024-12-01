import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class bai28_5giaibt31 {
    public static void main(String[] args) {
        /*
         * bài 31: Viet chương trình nhập vào 1 list có n phần tử ngẫu nhiên,
         * các phân tử là số nguyên , n nhập từ bàn phím
         * #1 in ra cé bao nhiêu số nhỏ hơn 80,
         * #2 và in ra vị trí index các số đó
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        Random rd = new Random();
        ArrayList<Integer> ce = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int a = rd.nextInt(101);
            ce.add(a);
        }
        System.out.println(ce);
        int count = 0;
        String vi = " ";
        for(int i = 0; i < ce.size(); i++){
            if (ce.get(i) < 80) {
                count++;
                vi += i;
            }
        }
        System.out.println("So nho hon 80 la: "+count);
        System.out.println("Vi tri index: "+vi);
    }
}
