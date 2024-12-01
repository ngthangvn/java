package QuanLyDiem;

public class KhoaVan extends NamHoc2024 {
    public KhoaVan(String ten, int cccd) {
        super(ten, cccd);
    }

    // overriding
    @Override
    public void tinhDTB() {
        System.out.println("Day la pt tinh DTB cua khoa van");
    }
}
