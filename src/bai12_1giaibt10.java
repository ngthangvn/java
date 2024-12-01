import java.util.Scanner;

public class bai12_1giaibt10 {
    public static void main(String[] args) {
        // đề bài: dùng toán tử 3 ngôi viết kết quả xếp loại học sinh
        /* giỏi: nếu điểm >8
            khá: nếu điểm <8 && điểm >=6.5
            tb: nếu điểm <6.5 && điểm >=5
            yếu: nếu điểm < 5
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("mời cụ nhập vào đtb: ");
        double dtb = sc.nextDouble();
        String traloi = (dtb >= 8) ? "giỏi":
                ((dtb < 8 && dtb >= 6.5) ? "khá":
                        (dtb < 6.5 && dtb >= 5) ? "TB":"yếu");
        System.out.println("bạn thuộc loại: "+traloi);
    }
}
