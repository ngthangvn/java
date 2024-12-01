import java.util.Scanner;

public class bai26_giaibt25 {


        public static void main(String[] args) {
                    /*
         * bài 25:
         * viết chương trình kiểm tra 1 chuỗi nhập vào từ bàn phím có phải Panlyndrome (là chuỗi có đảo ngược cũng bằng chính nó, ví dụ madam, radar...)
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao 1 chuoi: ");
        String str = sc.nextLine();
        String chuoiDao = new StringBuilder(str).reverse().toString();
        // so sánh chuỗi với chuỗi đảo ngược để kiểm tra xem có phải là panlyndrome không

        if (str.equalsIgnoreCase(chuoiDao)) {
            System.out.println("Day la chuoi Panlyndrome");
        } else {
            System.out.println("Day 0 phai la chuoi Panlyndrome");
        }

        }
}
