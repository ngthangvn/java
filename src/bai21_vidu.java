import java.util.Scanner;

public class bai21_vidu {
    public static void main(String[] args) {
        /* viết chương trình giai ptb2 dùng hàm:
            1. Tìm nghiệm của ptb2 vơi: a = 1, b = 2, c = 3
            1. Tìm nghiệm của ptb2 vơi: a = 1, b = 2, c = 1
            1. Tìm nghiệm của ptb2 vơi: a = 1, b = 2, c = -3
         */
        String kq = GiaiPTB2(1, 2, 3);
        String kq2 = GiaiPTB2(1, 2, 1);
        String kq3 = GiaiPTB2(1, 2, -3);
        System.out.println(kq);
        System.out.println(kq2);
        System.out.println(kq3);

        // nâng cao: cho người dùng nhập vào từ bàn phím a, b, c
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập a: ");
        double a = sc.nextDouble();
        System.out.println("mời nhập b: ");
        double b = sc.nextDouble();
        System.out.println("mời nhập c: ");
        double c = sc.nextDouble();
        String p = GiaiPTB2(a, b, c);
        System.out.println(p);
    }
    // hàm giải ptb2
    public static String GiaiPTB2(double a,double b,double c){
        if (a == 0){
            // nếu a = 0 thì pt trở thành ptbn bx + c = 0
            if (b == 0 && c == 0){
                return "PT vô sô NO";
            } else if (b == 0 && c != 0) {
                return "PT vô NO";
            } else {
                return "PT bậc nhất co No"+(-c/b);
            }
        } else {
            double delta = (b*b) - (4*a*c);
            if (delta > 0){
                double x1 = (-b + Math.sqrt(delta)) / (2*a);
                double x2 = (-b - Math.sqrt(delta)) / (2*a);
                return "PT có 2 NO phân biệt: "+" x1 = "+x1+" x2 = "+x2;
            } else if (delta == 0) {
                double x = -b/(2*a);
                return "PT có NO kép: x = "+x;
            } else {
                return "PT vô NO";
            }
        }
    }
}
