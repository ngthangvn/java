import java.util.Scanner;

public class bai10_giaibt02 {
    public static void main(String[] args) {
        // bài tập 1
        /*Scanner sc = new Scanner(System.in);
        System.out.println(" mời nhập bán kính đường tròn r: ");
        double r = sc.nextDouble();
        double cv = 2 * Math.PI * r;
        double dt = Math.PI * Math.pow(r,2);
        System.out.println("chu vi hình tròn là: "+cv);
        System.out.println("diện tích hình tròn là: "+dt);*/

        // bài tập 2
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập a: ");
        System.out.println("mời nhập b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int p = (a + b) * 2;
        int s = a * b;
        System.out.println("chu vi hình chữ nhật là: "+p);
        System.out.println("diện tích hình chữ nhật là: "+s);
    }
}
