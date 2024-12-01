import java.util.Scanner;

public class bai25_char {
    public static void main(String[] args) {
        // khai báo
        char ch = 'a'; // khởi tạo
        char ch1 = 66; // khởi tạo
        System.out.println(ch1);
        /*char ch2; // khai báo
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào bàn phím 1 ký tự: ");
        String input = sc.nextLine();
        char ch3 = input.charAt(0);
        System.out.println("Ký tự vừa nhập là: "+ch3);*/
        // so sánh
        // 2 ký tự giống nhau thì sẽ trả về 0
        System.out.println(Character.compare('b', 'b'));
        System.out.println(Character.compare('A', 'b'));
        System.out.println(Character.compare('a', 'A'));

        char ch4 = '1';
        char ch5 = 'a';
        char ch6 = 'A';
        char ch7 = ' ';
        // kiểm tra xem có phải là số hay không
        System.out.println(Character.isDigit(ch6));
        // kiểm tra xem có phải là ký tự hay không
        System.out.println(Character.isLetter(ch5));
        // kiểm tra xem có phải là chữ viết thường hay không
        System.out.println(Character.isLowerCase(ch5));
        // kiểm tra xem có phải là chữ viết hoa hay không
        System.out.println(Character.isUpperCase(ch6));
        // kiểm tra xem có phải là khoảng trắng hay không
        System.out.println(Character.isWhitespace(ch7));
    }
}
