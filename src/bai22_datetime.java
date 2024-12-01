import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class bai22_datetime {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        // lấy ngày tháng năm
        int nam = cal.get(Calendar.YEAR);
        int thang = cal.get(Calendar.MONTH);
        int ngay = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(nam);
        System.out.println(thang+1);
        System.out.println(ngay);
        // set: nhập ngày theo ý muốn
        cal.set(Calendar.YEAR, 2003);
        cal.set(Calendar.MONTH, 8);
        cal.set(Calendar.DAY_OF_MONTH, 20);
        // kiểm tra ngày tháng năm sau thiết lập
        int namSinh = cal.get(Calendar.YEAR);
        int thangSinh = cal.get(Calendar.MONTH);
        int ngaySinh = cal.get(Calendar.DAY_OF_MONTH);
        // xuất
        System.out.println("Ngày Tháng Năm Sinh: "
                            +namSinh+ "/"
                            +thangSinh+ "/"
                            +ngaySinh
        );
        // xuất theo định dạng
        SimpleDateFormat đinDang = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        // tạo 1 đối tượng date để get time trong đối tượng cal
        Date d = cal.getTime();
        String s = đinDang.format(d);
        System.out.println(s);
    }
}
