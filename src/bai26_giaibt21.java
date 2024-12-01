import java.util.Scanner;

public class bai26_giaibt21 {
    public static void main(String[] args) {
                /*
         * Bài 21:
         * Viết chương trình chuyển tin nhắn sang mật mã theo bảng :
         * const a="abcdefghijklmnopqrstuvwxyz"
         * const b="zxcvbnmasdfghjklqwertyuiop"
         */

        //  tạo bảng mã hóa
        String a = "abcdefghijklmnopqrstuvwxyz";
        String b = "zxcvbnmasdfghjklqwertyuiop";

        // NHẬP tin nhắn cần mã hóa từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap thong tin can ma hoa: ");
        String input = sc.nextLine();
        // biến lưu tin nhắn sau khi đã được mã hóa
        String output = "";
        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            // tìm vị trí của kỹ tự trong biến a
            int index = a.indexOf(c);
            // nếu kỹ tự này không có trong biến a thì không cần mã hóa và thêm nó vào output ngay
            if (index == -1) {
                output += c;
            } else{
                // nếu ký tự có trong biến a thì lấy ra ký tự từ biến b tại vị trí tương ứng và thêm nó vào output
                output += b.charAt(index);
            }
        }

          // in ra kết quả
            System.out.println("Tin nhan sau khi ma hoa la: "+output);
    }
}
