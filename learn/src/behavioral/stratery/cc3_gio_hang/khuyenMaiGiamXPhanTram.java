package behavioral.stratery.cc3_gio_hang;

public class khuyenMaiGiamXPhanTram implements IKhuyenMai{
    private int phanTramGiam;

    public khuyenMaiGiamXPhanTram(int phanTramGiam) {
        this.phanTramGiam = phanTramGiam;
    }

    @Override
    public double tinhTienKhuyenMai(gioHang gh) {
        return gh.getTongTien() * phanTramGiam / 100;
    }
}
