public class bai6_epkieudulieu {
    public static void main(String[] args) {
        int a=5;
        int b=10;
        double kp = (double) a/b; // int --> double
        System.out.println(kp);

        //ép kiểu hẹp
        int c=128;
        byte d = (byte) c;
        System.out.println(c);
        System.out.println(d);

        int e=15;
        byte f = (byte) e;
        System.out.println(e); //ép từ kiểu int-->byte
        System.out.println(f);
    }
}
