package TinhDaHinh;

public class PhoPhong extends NhanSu {

    public PhoPhong(String ten, String cccd, String que){
        super(ten, cccd, que);
    }

    public PhoPhong(){
        
    }

    @Override
    public double tinhLuong(int ngayCong) {
        return 40*ngayCong;
        // 50$ 1 ngày công
    }

}
