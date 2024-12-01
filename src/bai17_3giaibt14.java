import java.util.Scanner;

public class bai17_3giaibt14 {
    public static void main(String[] args) {
        /* bài 14: viết chương trình tính tổng các số lẻ từ 1 đến n, n nhập từ bàn phím
            1. nhập n = 7, bỏ qua cổng tổng với số 3 => in ra kết quả
            2. dùng break
         */
        Scanner sc = new Scanner(System.in);
        System.out.println(" mời nhập n: ");
        int n = sc.nextInt();
        if (n % 2 != 0){
            int tong = 0;
            for (int i = 1; i <= n; i+=2){
                if (i == 3){
                    continue;
                } else {
                    tong += i;
                }
            }
            System.out.println("tong le = "+tong);
        }
    }
}
