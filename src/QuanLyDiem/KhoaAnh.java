package QuanLyDiem;

public class KhoaAnh extends NamHoc2024 {
    public KhoaAnh(String ten, int cccd) {
        super(ten, cccd);
    }

    // overriding
    @Override
    public void tinhDTB() {
        System.out.println("Day la pt tinh DTB cua khoa Anh");
    }
}
