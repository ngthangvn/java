import java.util.Scanner;

public class bai27_2mang_mot_chieu_array {
    public static void main(String[] args) {
                /* 
         * ví dụ mảng
         * viết chương trình tạo 1 mảng 1 chiều gồm các phần tử là số nguyên có n phần tử, n do người dùng nhập từ bàn phím
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap do dai cua mang: ");
        int n = sc.nextInt();
        // tạo mảng có n phần tử (cấp phát bộ nhớ cho mảng)
        int[] M = new int[n];
        // nhập dữ liệu cho từng phần tử
        for(int i = 0; i < n; i++){
            System.out.println("M["+i+"]= ");
            M[i] = sc.nextInt();
        }
        
        // xuất mảng
        System.out.println("Mang M: ");
    }
}
