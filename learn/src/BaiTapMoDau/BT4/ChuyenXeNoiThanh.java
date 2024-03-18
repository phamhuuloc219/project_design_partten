package BaiTapMoDau.BT4;

public class ChuyenXeNoiThanh extends ChuyenXe{
    int soTuyen,soKM;

    public ChuyenXeNoiThanh(String maSoChuyen, String taiXe, String soXe, float doanhThu, int soTuyen, int soKM) {
        super(maSoChuyen, taiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKM = soKM;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Số tuyến: " + soTuyen+"\n"+
                "Số km: " + soKM+"\n";
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoKM() {
        return soKM;
    }

    public void setSoKM(int soKM) {
        this.soKM = soKM;
    }
}
