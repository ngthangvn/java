import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * bai28_5giaibt30
 */
public class bai28_4giaibt30 {

    public static void main(String[] args) {

        /*
         * bài 30:Viết chương trình trả lời kết quả các phép tính 
         * quesf = ("2 + 5 + 7=", "5 * 10 =","sqrt(16) =","12%2 =") 
         */
        Scanner sc = new Scanner(System.in);
        ArrayList<String> quesf = new ArrayList<>(List.of("2 + 5 + 7=", "5 * 10 =","sqrt(16) =","12%2 ="));
        // tạo ArrayList mới
        ArrayList<Float> kq = new ArrayList<>(List.of(14f, 50f, 4f, 6f));
        for (int i = 0; i < quesf.size(); i++) {
            System.out.println(quesf.get(i));
            System.out.println("Nhap ket qua: ");
            Float a = sc.nextFloat();
            // kiểm tra kêt quả
            if (a.equals(kq.get(i))) {
                System.out.println("DCMNL");
            } else {
                System.out.println("Sai loi mat r cac cu, dap an la: "+kq.get(i));
            }
        }
        

    }
}