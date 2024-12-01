import java.util.Scanner;

public class bai14_vidu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập vào số nguyên từ 1-99: ");
        int n = sc.nextInt();
        while (n < 1 || n > 99){
            System.out.println("nhập lại");
            n = sc.nextInt();
        }
        System.out.println("bạn đã nhập xong n = "+n);
    }
}
