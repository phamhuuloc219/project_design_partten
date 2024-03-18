package BaiTapMoDau.BT4;

public class ChuyenXe {
    String maSoChuyen,taiXe,soXe;
    float doanhThu;

    public ChuyenXe(String maSoChuyen, String taiXe, String soXe, float doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.taiXe = taiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    @Override
    public String toString() {
        return "Mã số chuyến: " +maSoChuyen+"\n"+
                "Tài xế: "+taiXe+"\n"+
                "Số xe: "+soXe+"\n"+
                "Doanh thu: "+doanhThu+"\n";
    }

    public String getMaSoChuyen() {
        return maSoChuyen;
    }

    public String getTaiXe() {
        return taiXe;
    }

    public String getSoXe() {
        return soXe;
    }

    public float getDoanhThu() {
        return doanhThu;
    }

    public void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public void setTaiXe(String taiXe) {
        this.taiXe = taiXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public void setDoanhThu(float doanhThu) {
        this.doanhThu = doanhThu;
    }
}
