package TruongDaiHoc;
public class SinhVien {
    // thuộc tính (giống với biến)
    // 1 usage
    private String hoTen;
    // 1 usage
    private double diem;

    // 4.1 constructor mặc định
    // khởi tạo các giá trị mặc định
    // ngay khi đối tượng vừa được tạo ra
    // public SinhVien(){
    //     hoTen = "No Name";
    //     diem = 0.0;
    // }

    // cách tạo nhanh
    public SinhVien() {
        hoTen = "No Name";
        diem = 0.0;
    }

    // 4.2 constructor có đối số 
    public SinhVien(String hoTen) {
        this.hoTen = hoTen; /*this. để phân biệt toàn phần với cục bộ */
    }

    public SinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }
    // get, set
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    // phương thức (các hàm)
    // phương thức không có kiểu trả về
    public void hienThiThongTin(){
        System.out.println(hoTen+""+diem);
    }

    // phương thức có kiểu trả về
    public double tinhDTB(double diemToan, double diemVan){
        return (diemToan + diemVan) / 2;
    }
    // pt 2
    public double tinhDTB(double diemToan, double diemVan, double diemAnh){
        return (diemToan + diemVan + diemAnh) / 2;
    }

    // pt4
    public double tinhDTB(double diemToan, double diemVan, double diemAnh, String abc){
        return (diemToan + diemVan + diemAnh) / 2;
    }

    // toString
    @Override
    public String toString() {
        return hoTen + "||" + diem;
    }

    // 11. Support Method và Service Method
    // 11.1 Support Method
    // kiểm tra điểm khi nhập hồ sơ cho sinh viên
    private boolean checkDiem(){
        return this.diem >= 24;
    }

    // 11.2 Service Method

    public void checkHopLeDiem(){
        if (checkDiem()) {
            System.out.println("Diem hop le, tiep tuc nhap thong tin...");
        } else {
            System.out.println("Ban xem lai de thi");
        }
    }

    // parametter list 
    public double tongDiem(double ... arr){
        double tong = 0.0;
        for (double x : arr) {
            tong += x;
        }

        return tong;
    }
}
