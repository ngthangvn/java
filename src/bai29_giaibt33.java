import java.util.HashMap;
import java.util.Scanner;

public class bai29_giaibt33 {
    public static void main(String[] args) {
        /*
         * bài 33: viế chương trình sử dụng dict chứa 10 user name và password. chương trình yêu cầu nhập vào username và pass
         * 1.  nếu username không có trong dict, chương trình báo user name không tông tại
         * 2. nếu username đúng mà password sai thì báo: PASSWORD Sai
         * 3. nếu  user, pass đúng thì báo bạn đã đăng nhập thành công
         */

         HashMap<String, String> users = new HashMap<>();
         Scanner sc = new Scanner(System.in);
         users.put("user1", "123456");
         users.put("user2", "1123456");
         users.put("user3", "1223456");
         users.put("user4", "1233456");
         users.put("user5", "1234456");
         users.put("user6", "1234556");
         users.put("user7", "1234566");
         users.put("user8", "1231456");
         users.put("user9", "1234546");
         users.put("user10", "3123456");

         System.out.println("Nhap user name: ");
         String userName = sc.nextLine();
         System.out.println("Nhap mat khau");
         String pass = sc.nextLine();

        //  kiểm tra
        if (!users.containsKey(userName)) {
            // nếu không có key trong hassmap users thì đồng nghĩa là user không tồn tại
            System.out.println("User khong ton tai");
        } else if (!users.get(userName).equals(pass)) {
            // nếu mật khẩu sai
            System.out.println("Pass sai");
        } else{
            System.out.println("dang nhap thanh cong");
        }
    }
}
