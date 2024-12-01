import java.util.Scanner;

public class bai11_ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập vào đtb: ");
        double dtb = sc.nextDouble();
        // kiểm tra điều kiện
        if (dtb >= 8.0 && dtb <10) {
            System.out.println("bạn xl giỏi");
        } else if (dtb >= 7 && dtb < 8) {
            System.out.println("bạn xl khá");
        } else {
            System.out.println("bạn tạch");
        }
    }
}
