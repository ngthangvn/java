import java.util.Scanner;

public class bai11_giaibaitapjava05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập chiều cao: ");
        double chieucao = sc.nextDouble();
        System.out.println("mời bạn nhập cân nặng: ");
        double cannang = sc.nextDouble();
        // tính BMI: BMI = cannang/(chieucao^2)
        double BMI = cannang/(Math.pow(chieucao,2));
        System.out.println("BMI cần tìm là: "+BMI);
        // kiểm tra điều kiện
        if (BMI < 15) {
            System.out.println("Thân hình quá gầy");
        } else if (BMI >=15 && BMI < 16) {
            System.out.println("Thân hình gầy");
        } else if (BMI >= 16 && BMI < 18.5) {
            System.out.println("Thân hình hơi gầy");
        } else if (BMI >= 18.5 && BMI < 25) {
            System.out.println("Thân hình bình thường");
        } else if (BMI >= 25 && BMI < 30) {
            System.out.println("Thân hình hơi béo");
        } else if (BMI >= 30 && BMI < 35) {
            System.out.println("Thân hình béo");
        } else if (BMI >= 35) {
            System.out.println("Thân hình quá béo");
        } else {
            System.out.println("thân hình không hợp lệ");
        }
    }
}
