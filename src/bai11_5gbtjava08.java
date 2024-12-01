import java.util.Scanner;

public class bai11_5gbtjava08 {
    public static void main(String[] args) {
        /* đề bài: viết chương trình giải phương trình bậc 2*/
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập a: ");
        int a = sc.nextInt();
        System.out.println("nhập b: ");
        int b = sc.nextInt();
        System.out.println("nhập c: ");
        int c = sc.nextInt();
        // tính denta
        double delta = Math.pow(b,2) - (4*a*c);
        if (delta < 0){
            System.out.println("phương trình vô nghiệm");
        } else if (delta == 0){
            double x = -b / (2*a);
            System.out.println("phương trình có nghiệm kép"+x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("x1 = "+x1);
            System.out.println("x2 = "+x2);
        }
    }
}
