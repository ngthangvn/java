public class bai17_5giaibt16 {
    public static void main(String[] args) {
        /* bài 16: viết chương trình:
                Tính tổng S = 1!+2!+3!+...+10!
         */
        int m = 1;
        int tong = 0;
        for (int i = 1; i <= 10; i++){
            m *= i;
            tong += m;
        }
        System.out.println("tong s = "+tong);
    }
}
