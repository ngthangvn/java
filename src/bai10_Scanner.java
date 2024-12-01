import java.util.Scanner;

public class bai10_Scanner {
    public static void main(String[] args) {
        /*// khởi tạo 1 đối tượng scanner
        Scanner sc = new Scanner(System.in);

        // cho phép nhập chuỗi
        System.out.println("mời nhập vào mk cấp 1: ");
        String mk1 = sc.nextLine();
        System.out.println("mk cấp 1 là: " +mk1);
        // nhập số nguyên
        System.out.println("mời nhập vào 1 số nguyên: ");
        int a = sc.nextInt();
        System.out.println("a = "+a);
        // nhập số float
        System.out.println("mời nhập vào 1 số thực: ");
        float b = sc.nextFloat();
        System.out.println("b = "+b);*/

        // nhập chuỗi
        System.out.println("mời cụ nhập tên: ");
        String ten = new Scanner(System.in).nextLine();
        System.out.println("tên cụ là: "+ten);

        // nhập chuỗi
        System.out.println("mời cụ nhập giới tính: ");
        String gt1 = new Scanner(System.in).nextLine();
        System.out.println("tên cụ là: "+gt1);

        // nhập float
        System.out.println("mời cụ nhập chiều cao: ");
        float cc = new Scanner(System.in).nextFloat();
        System.out.println("chiều cao của cụ là: "+cc);

        // nhập chuỗi
        System.out.println("mời cụ nhập giới tính 2: ");
        String gt2 = new Scanner(System.in).nextLine();
        System.out.println("tên cụ là: "+gt2);
    }
}
