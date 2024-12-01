import java.util.Scanner;

public class bai12_toantu3ngoi {
    public static void main(String[] args) {
        // nhập vào bàn phím 1 số, kiểm tra chẵn lẻ
        Scanner sc = new Scanner(System.in);
        System.out.println("mời cụ nhập vào 1 số nguyên n: ");
        int n = sc.nextInt();
        String traloi = (n%2==0) ? "chẵn" : "lẻ";
        System.out.println("số "+n+" là số "+traloi);
    }
}
