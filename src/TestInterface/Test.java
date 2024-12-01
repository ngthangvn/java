package TestInterface;

public class Test {
    // class dẫn xuất kế thừa từ interrface thì dùng implements
    // interrface kế thừa từ interrface thì dùng extends
    public static void main(String[] args) {
        KeThuaInterrface kt1 = new KeThuaInterrface();
        double kq1 = kt1.tinhLuong(200, 10);
    }
}
