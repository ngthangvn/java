package TinhDaHinh;

public abstract class NhanSu {
    // phương thức tính lương
    private String ten;
    private String cccd;
    private String que;
    public abstract double tinhLuong(int ngayCong);
    public NhanSu(String ten, String cccd, String que) {
        this.ten = ten;
        this.cccd = cccd;
        this.que = que;
    }
    public String getTen() {
        return ten;
    }
    public String getCccd() {
        return cccd;
    }
    public String getQue() {
        return que;
    }
    public NhanSu() {
    }

    
    
}
