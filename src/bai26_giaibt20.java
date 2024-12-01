import java.util.Scanner;

public class bai26_giaibt20 {


        public static void main(String[] args) {
                        /*
         * bài 20:
         * viết chương trình kiểm tra tính hợp lệ của mật khẩu: aaaaaaaAAAAA1
         * - Mật khẩu hợp lệ khi có ít nhất 6 ký tự
         * - chứa ít nhất 1 chữ cái (chữ cái thường hoặc hoa đều được)
         * - chứa ít nhất 1 chữ số
         * 
         * 2. cho người dùng nhập vào mật khẩu để login / so sánh, nếu đúng mở cửa, sai
         * quá 5 lần khóa đăng nhập, thoát chương trình
         */

         Scanner sc = new Scanner(System.in);
         String password = "";
        //  1. mời thiết lập mật khẩu và kiểm tra tính hợp lệ
        while (true) {
            // Nhập mật khẩu mới từ người dùng
            System.out.println("Moi thiet lap mat khau");
            System.out.println("Mat khau it nhat 6 ky tu, it nhat mot chu, it nhat 1 so");
            String newPassword = sc.nextLine();
            if (checkMk(newPassword)) {
                password = newPassword;
                System.out.println("Mat khau moi duoc thiet lap");
                break;
            } else{
                System.out.println("Mk khong hop le");
            }
        }

        // * 2. cho người dùng nhập vào mật khẩu để login / so sánh, nếu đúng mở cửa, sai
        // * quá 5 lần khóa đăng nhập, thoát chương trình

        int count = 0;
        String login = "";
        while (true) {
            // Nhập mật khẩu mới từ người dùng
            System.out.println("Moi nhap Mk login");
            login = sc.nextLine();
            // kiểm tra mk có khớp ko
            if (login.equals(password)) {
                System.out.println("Dang nhap thanh cong");
                break;
            } else {
                System.out.println("Mk khong dung, vui long nhap lai con "+(5 - count)+" lan thu");
                count++;
            }

            if (count == 5) {
                System.out.println("Ban da nhap sai 5 lan, dang nhap bi khoa");
                break;
            }
        }

        }

         // hàm kiểm tra tính hợp lệ của mật khẩu

         public static boolean checkMk (String password){
            // Kiểm tra độ dài
            if (password.length() < 6) {
                return false;
            } 
            // kiểm tra xem mật khẩu có chứa ít nhất 1 chữ cái hay không
            boolean hasLeter = false;

            for (char c: password.toCharArray()) {
                if (Character.isLetter(c)) {
                    hasLeter = true;
                    break;
                }
            }

            if (!hasLeter) {
                return false;
            }

            // kiểm tra xem mật khẩu có chứa ít nhất 1 chữ số hay không
            boolean hasNumber = false;
            for (char c:  password.toCharArray()) {
                if (Character.isDigit(c)) {
                    hasNumber = true;
                    break;
                }
            }

            if (!hasNumber) {
                return false;
            }
            // nếu mật khẩu đủ dài, chứa ít nhất 1 chữ cái bà ít nhất 1 chữ số, thì trả về true
            return true;
         }
}


