import java.util.Scanner;

public class bai17_2giaibt13 {
    public static void main(String[] args) {
        /* bài 13: viêết chương trình nhập số a từ bàn phím
            nếu a  chẵn thì tính tổng các số chẵn từ 0 đến a
            nếu a lẻ thì in ra dòng chữ "tôi không tính tổng số lẻ, bye bye" và thoát chương trình
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập số a: ");
        int a = sc.nextInt();
        if (a % 2 == 0){
            int tong = 0;
            for (int i = 0; i <= a; i+=2){
                tong += i;
            }
            System.out.println("tong = "+tong);
        } else {
            System.out.println("tôi không tính số lẻ bye bye !");
        }
    }
}
