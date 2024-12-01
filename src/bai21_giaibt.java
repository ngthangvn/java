import java.util.Scanner;

public class bai21_giaibt {
    public static void main(String[] args) {
        /* Nhập ký tự + - * /
            1. nếu nhập + : Tính a+b và in ra kết quả
            2. nếu nhập - : Tính a-b và in ra kết quả
            3. nếu nhập * : Tính a*b và in ra kết quả
            4. nếu nhập + : Tính a+b và in ra kết quả ( chú ý: kiểm tra mẫu số khác không )
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("nhâp a: ");
        double a = sc.nextDouble();
        System.out.println("nhâp b: ");
        double b = sc.nextDouble();
        System.out.println("mời bn nhập dấu +, _, *, / ");
        String phep = new Scanner(System.in).nextLine();
        switch (phep){
            case "+":
                cong(a, b);
                break;
            case "-":
                tru(a, b);
                break;
            case "*":
                nhân(a, b);
                break;
            case "/":
                chia(a, b);
                break;
            default:
                System.out.println("dấu không hơp lệ");
        }

    }
    // hàm cong
    public static void cong(double a, double b){
        double kpc = a + b;
        System.out.println("a + b = "+kpc);
    }
    // hàm trừ
    public static void tru(double a, double b){
        double kpc = a - b;
        System.out.println("a - b = "+kpc);
    }
    // hàm nhân
    public static void nhân(double a, double b){
        double kpc = a * b;
        System.out.println("a * b = "+kpc);
    }
    // hàm chia
    public static void chia(double a, double b){
        if ( b == 0){
            System.out.println("không chia đc cho 0");
        } else {
            double kpchia = a / b;
            System.out.println("a / b = "+kpchia);
        }
    }

}
