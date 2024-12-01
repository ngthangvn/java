public class bai17_6giaibt17 {
    public static void main(String[] args) {
        /* bài 17:
            Số hoàn hảo là số: Tổng các ước thực của nó bằng chính nó
            ví dụ: 6 = 1+2+3
            Tìm tất cả những số hoàn thiện trong phạm vi 1 -> 1000
         */
        /*int n = 6;
        int tong = 0;
        for (int i = 1; i < n; i++){
            if (n % i == 0){
                tong += i;
            }
        }
        if (tong == n){
            System.out.println(n+" là số hoàn hảo");
        } else {
            System.out.println(n+" không phải s hoàn hảo");
        }*/

        for (int n = 1; n < 1000; n++){
            int tong = 0;
            for (int i = 1; i < n; i++){
                if (n % i == 0){
                    tong += i;
                }
            }
            if (tong == n){
                System.out.print(n+" ");
            }
        }
    }
}
