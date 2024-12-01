import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai28_3giaibt29 {
    public static void main(String[] args) {
        /*
         * bài 29:Viết chương trình nhập vào I danh sách list có n phân tử, n do người
         * dùng
         * nhập, sau đó:
         * #1. tạo ra I list mới bình phương các phân từ
         * #2.Xác định bao nhiêu phân tử lớn hơn 50
         */

         Scanner sc = new Scanner(System.in);
         System.out.println("Nhap n: ");
         int n = sc.nextInt();
         List<Integer> I = new ArrayList<>();
         for(int i = 0; i < n; i++){
            System.out.println("I["+i+"] = ");
            int a = sc.nextInt();
            I.add(a);
         }
         System.out.println(I);

         List<Integer> binhPhuong = new ArrayList<>();
         for (int x : I) {
            I.add(x*x);
         }
         System.out.println("Danh sach moi: "+I);

         int count = 0;
         for (int y : binhPhuong) {
            if (y > 50) {
                count++;
            }
         }
        
         System.out.println("Tong so lon hon 50 la: "+count);
    }
}
