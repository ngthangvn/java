import java.util.Scanner;

public class bai11_6giaibt09 {
    public static void main(String[] args) {
        /* đề bài: viết chương trình nhập vào tháng tỏng năm cho biết tháng đó thuộc quý mấy*/
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập vào tháng trong năm: ");
        int thang = sc.nextInt();
        if (thang == 1 || thang == 2 || thang == 3){
            System.out.println("quý 1");
        } else if (thang == 4 || thang == 5 || thang == 6) {
            System.out.println("quý 2");
        } else if (thang == 7 || thang == 8 || thang == 9) {
            System.out.println("quý 3");
        } else if (thang == 10 || thang == 11 || thang == 12) {
            System.out.println("quý 4");
        } else {
            System.out.println("nhập tào lao :))");
        }
    }
}
