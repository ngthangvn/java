package TestInterface;

public class KeThuaInterrface implements ViduInterface {

    @Override
    public void thongTin(String ten, String cccd, int namSinh) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'thongTin'");
    }

    @Override
    public double tinhLuong(double luongNgay, double soNgayCong) {
        return luongNgay*soNgayCong;
    }

}
