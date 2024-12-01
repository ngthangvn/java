public class bai9_toantulogic {
    public static void main(String[] args) {
        /*int i = 15;
        // kiểm tra giá trị i>0 và i<10 không
        // toán tử và &&: cả 2 thằng đúng thì sẽ đúng
        System.out.println(i>0 && i<10);
        // kiểm tra xem i>10 hoặc i<-1
        //toán tử hoặc ||: 1 thằng đúng thì sẽ đùng
        System.out.println(i>10 || i<-1);
        // phép phủ định
        System.out.println(!(i>10 || i<-1));

        //toán tử tiền tố hậu tố
        int x = 100;
        int y = 90;
        int z = 80;
        int t = 70;

        x++; // x=x+1 tăng x lên 1 giá trị
        ++y; // y=y+1 tăng y lên 1 giá trị
        z--; // z=z-1 giảm z xuống 1 giá trị
        --t; // t=t-1 giảm t xuống 1 giá trị
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(t);*/

        int a = 1;
        int b = 2;
        int c = a++ - ++b + 1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
