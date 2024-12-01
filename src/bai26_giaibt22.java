public class bai26_giaibt22 {
    public static void main(String[] args) {

        /*
         * Bài 22:
         * const a = "tôi chăm học tôi chịu khó tôi đẹp zai";
         * Đếm từ tôi trong string a trên ?
         */

        String a = "tôi chăm học tôi chịu khó tôi đẹp trai";
        // khởi tạo biến đếm từ tôi
        int count = 0;
        // tách chuỗi
        String[] word = a.split(" ");
        // duyệt mảng
        for (String str : word) {
            if (str.equals("tôi")) {
                count++;
            }
        }

        // in ra kết quả
        System.out.println("So luong tu toi la: " + count);
    }
}
