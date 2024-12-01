import java.util.Scanner;

public class bai17_7giaibt18 {
    public static void main(String[] args) {
        /* bài 18: viết chương trình nhập s nguyên a>0 từ bàn phím
            cho biết đó có phải là số nguyên tố không
            ( số nguyên tố là số > 1, và chỉ chia hết cho 1 và chính nó)
            kết thúc chương trình hỏi người dùng: bạn có muốn tiếp tục sử dụng phần mềm không
            nếu chọn không thì thoát chương trình
         */
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("mời nhập vào 1 số nguyên a > 0: ");
            int a = sc.nextInt();
            // check điều kiện đảm bảo người dùng nhập số nguyên a>0
            while (a<0){
                System.out.println("mời bạn nhập lại: ");
                a = sc.nextInt();
            }
            System.out.println("bạn đã nhập thành công a = "+a);
            // kiểm tra số nguyên tố
            int demuoc = 0;
            for (int i = 1; i <= a; i++){
                if (a % i == 0){
                    demuoc++;
                }
            }
            if (demuoc == 2){
                System.out.println(a+" là số nguyên tố");
            } else {
                System.out.println(a+" không phải số nguyên tố");
            }
            System.out.println("bạn có muốn thoát chương trình không, bấm y để thoát: ");
            String traloi = new Scanner(System.in).nextLine();
            if (traloi.equals("Y") || traloi.equals("y")){
                break;
            }
        }
    }
}
