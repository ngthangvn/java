package QuanLyDiem;

public class KhoaToan extends NamHoc2024 {
    public KhoaToan(String ten, int cccd) {
        super(ten, cccd);
    }

    // overriding
    @Override
    public void tinhDTB() {
        System.out.println("Day la pt tinh DTB cua khoa toan");
    }
}

