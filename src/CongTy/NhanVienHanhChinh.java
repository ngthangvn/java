package CongTy;

public class NhanVienHanhChinh extends NhanVien {
    protected int ca;
    public NhanVienHanhChinh(String ten, String que, int cccd) {
        super(ten, que, cccd);
    }

    public NhanVienHanhChinh(String ten, String que, int cccd, int ca) {
        super(ten, que, cccd);
        this.ca = ca;
    }

    

    @Override
    public double TinhLuong() {
        return luongConBan;
    }
}
