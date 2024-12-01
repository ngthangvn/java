import java.util.Calendar;
import java.util.Scanner;

public class bai22_viduvandung {
    public static void main(String[] args) {
        /* viết chương trình nhập vào ngày tháng năm sinh.cho biết số tuổi và in ra màn hình
         */
        int day, month, year;
        // nhập liệu từ bàn phím
        Scanner input = new Scanner(System.in);
        System.out.println("mời nhập ngày: ");
        day = input.nextInt();
        System.out.println("mời nhập tháng: ");
        month = input.nextInt();
        System.out.println("mời nhập năm: ");
        year = input.nextInt();

        // khởi tạo
        Calendar birthday = Calendar.getInstance();
        // nhập ngày tháng theo mong muốn
        birthday.set(year, month = month-1, day);
        //
        int namSinh = birthday.get(Calendar.YEAR);
        int thangSinh = birthday.get(Calendar.MONTH);
        int ngaySinh = birthday.get(Calendar.DAY_OF_MONTH);
        // xuất ngày tháng năm ra màn hình
        System.out.println("ngày tháng năm sinh: "
                            +ngaySinh+"/"
                            +(thangSinh+1)+"/"
                            +namSinh);
        // tính tuổi
        Calendar now = Calendar.getInstance();
        // in ra năm hiện tại
        int nam = now.get(Calendar.YEAR);
        int tuoi = nam - year;
        System.out.println("tuổi của bạn là: "+tuoi);
    }
}
