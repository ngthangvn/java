import java.util.Scanner;

public class bai11_giaibaitap06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập vào 1 năm dương lịch");
        int nam = sc.nextInt();
        if ((nam % 4 == 0) && (nam % 100 != 0) || (nam % 400 == 0)){
            System.out.println("năm"+nam+"là năm nhuận");
        } else {
            System.out.println("Năm"+nam+"không phải là năm nhuận");
        }
    }
}
