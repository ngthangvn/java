public class bai26_giaibt19 {
    public static void main(String[] args) {
        /*
         * bài 19:
         * cho:
         * String str1 = "English = 78 Science = 83 Math = 68 History = 65"
         * 1. tính tổng các số trong chuỗi trên
         * 2. tính trung bình cộng
         */

        String str1 = "English = 78 Science = 83 Math = 68 History = 65";
        int sum = 0;
        int count = 0;

        // tách chuỗi thành các phần bằng sử dụng split
        String[] mang = str1.split(" ");
        for (String pt : mang) {
          System.out.println(pt);

          try {
            // chuyển chuỗi sang số nguyên bằng phương thức parseInt() của lớp Inter
            int num = Integer.parseInt(pt);
            sum += num;
            count++;
          }catch(NumberFormatException e){
            // chỉ đơn giản là không làm gì cả
          }
        }

        double tong = sum / count;
        System.out.println("Tong cac so trong chuoi tren la: "+sum);
        System.out.println("TBC cac so trong chuoi la:  "+tong);
    }
}
