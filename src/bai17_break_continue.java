public class bai17_break_continue {
    public static void main(String[] args) {
        // tính tổng từ 1 - 5 nhưng bỏ qua số 3
        /*int tong = 0;
        for (int i = 0; i < 5; i++){
            if ( i == 3){
                continue;
            } else {
                tong += i;
            }
        }
        System.out.println("tong = "+tong);*/

        int n = 0;
        while (n < 100){
            n++;
            System.out.println("n = "+n);
            if (n == 5){
                break;
            }
        }

    }
}
