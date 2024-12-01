import java.util.Scanner;

public class bai11_giaibaitap04 {
    public static void main(String[] args) {
        /* đề bài: tìm x, y khi biết tổng và hệu của chúng
        case test : Tong = 14, hieu = 4 => x=9, y= 5
        case 2:     Tong = 8, hieu = 5 => x=6.5, y = 1.5
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập vào tổng 2 số: ");
        float tong = sc.nextFloat();
        System.out.println("mời nhập vào hiệu 2 số: ");
        float hieu = sc.nextFloat();
        // tính toán
        float x = (tong + hieu)/2;
        float y = tong - x;
        // kết quả
        System.out.println("x = "+x);
        System.out.println("y = "+y);
    }
}
