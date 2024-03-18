package behavioral.stratery.cc3_gio_hang;

public class khuyenMaiGiamToiDa implements IKhuyenMai{
    private double giaTriToiDa;

    public khuyenMaiGiamToiDa(double giaTriToiDa) {
        this.giaTriToiDa = giaTriToiDa;
    }

    @Override
    public double tinhTienKhuyenMai(gioHang gh) {
        double tinhTienKhuyenMai = gh.getTongTien() * 0.1;
        return Math.min(tinhTienKhuyenMai,giaTriToiDa);
    }
}
