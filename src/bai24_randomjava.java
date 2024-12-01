import java.util.Random;

public class bai24_randomjava {
    public static void main(String[] args) {
        // khởi tạo 1 đối tượng ngẫu nhiên
        Random rd = new Random();
        // 1. lấy ngẫu nhiên 1 số nguyên
        int soNguyen = rd.nextInt(-51, 50); // chạy từ -50 đến 50
        System.out.println(soNguyen);

        // 2. chạy ngẫu nhiên số thực
        double soThuc = rd.nextDouble(-100, 100);
        System.out.println(soThuc);

        double soPhay = rd.nextDouble(100);
        System.out.println(soPhay);
    }
}
