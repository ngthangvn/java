public class bai21_hamtrongjava {
    public static void main(String[] args) {
        int kq = cong(1, 2, 3);
        int kq2 = cong(4, 5, 6);
        System.out.println("tổng các số là: "+kq);
        System.out.println("tổng các số là: "+kq2);
        // gọi hàm trả về
        xinChao(  "male");
        xinChao( "femaledhf");
    }

    public static int cong(int x, int y, int z){
        return x + y + z;
    }
    // hàm thủ tục
    public static void xinChao(String gioitinh){
        if (gioitinh.equals("female")){
            System.out.println("xin chao giới tính của bạn là nam");
        } else if (gioitinh.equals("male")) {
            System.out.println("xin chào giới tính của bạn là nữ");
        } else {
            System.out.println("tôi không hiểu bạn nhập cái j");
        }
    }
}
