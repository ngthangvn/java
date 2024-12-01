import java.util.Scanner;

public class bai26_viduvandungstring {
    public static void main(String[] args) {
        /*
            Nhập vào 1 chuỗi từ bàn phím , đếm xem có bao nhiêu ký tự thường
                bao nhiêu in hoa
                bao nhiêu số
                bao nhiêu space
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập 1 chuỗi: ");
        // đọc dữ liệu ra màn hình
        String s = sc.nextLine();
        int t = 0;
        int h = 0;
        int so = 0;
        int space = 0;
        int db = 0;
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (Character.isLowerCase(c)){
                t++;
            } else if (Character.isUpperCase(c)) {
                h++;
            } else if (Character.isDigit(c)) {
                so++;
            } else if (Character.isWhitespace(c)) {
                space++;
            } else if (Character.isLetter(c)) {
                db++;
            }
        }
        System.out.println("số lượng ký tự thương: "+t);
        System.out.println("số lượng ký tự hoa: "+h);
        System.out.println("số lượng ký tự số: "+so);
        System.out.println("số lượng khoảng trắng: "+space);
        System.out.println("số lượng ký tự đặc biệt: "+db);
    }
}
