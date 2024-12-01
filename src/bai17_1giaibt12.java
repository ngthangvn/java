import java.util.Scanner;

public class bai17_1giaibt12 {
    public static void main(String[] args) {
//        bài 12: viết chương trình nhập vào số nguyên n, in ra kết quả n!
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập vào số nguyên: ");
        int n = sc.nextInt();
//        cách 1: dùng for
        /*int gt = 1;
        for (int i = 1; i <= n; i++){
            gt = gt * i;
        }
        System.out.println("n! = "+gt);*/

//        cách 2: dùng while
        int i = 1;
        int gt = 1;
        while (i <= n){
            gt = gt * i;
            i++;
        }
        System.out.println("n! = "+gt);
    }
}
