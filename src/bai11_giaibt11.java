import java.util.Scanner;

public class bai11_giaibt11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bấm số để chọn: ");
        System.out.println("1. tìm theo tên");
        System.out.println("2. tìm theo tác giả");
        System.out.println("3. tìm theo nhà xuất bản");
        System.out.println("4. tìm theo tiêu đề");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("1. tìm theo tên");
                break;
            case 2:
                System.out.println("2. tìm theo tác giả");
                break;
            case 3:
                System.out.println("3. tìm theo nhà xuất bản");
                break;
            case 4:
                System.out.println("4. tìm theo tiêu đề");
                break;
            default:
                return;
        }
    }
}
