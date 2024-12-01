public class bai16_for {
    public static void main(String[] args) {
/*        for (int i = 0; i < 10; i++){
            System.out.println("i = "+i);
        }*/

        // tính tổng các số chẵn từ 0->9
        int tong = 0;
        for (int i = 0; i < 10; i++){
            tong += i;
        }
        System.out.println("tong = "+tong);
    }
}
