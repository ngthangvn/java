import java.util.Scanner;

public class bai26_giaibt23 {
    public static void main(String[] args) {

        /*
         * Bài 23:
         * Viết chương trình tách số và chữ từ chuỗi nhập vào thành 2 chuỗi :
         * ví dụ nhập vào : abc123 sẽ tách và in ra thành 2 chuỗi abc và 123
         */

         Scanner sc = new Scanner(System.in);
         System.out.println("Moi nhap vao chuoi: ");
         String input = sc.nextLine();

        //  tách chuỗi thành 2 chuỗi: chuỗi ký tự và chuỗi số
        StringBuilder chuoi = new StringBuilder();
        StringBuilder so = new StringBuilder();
        // duyệt chuõi
        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);

            if (Character.isDigit(c)) {
                so.append(c);
            }else{
                chuoi.append(c);
            }
        }

        // in kết quả
        System.out.println("Chuoi ky tu: "+chuoi);
        System.out.println("Chuoi so: "+so);
    }
}
