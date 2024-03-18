package Creational.Builder.A1_HoaDon;

public class HoaDonHeader {
    String maHD, ngayBan, tenKH;

    public HoaDonHeader(String maHD, String ngayBan, String tenKH) {
        this.maHD = maHD;
        this.ngayBan = ngayBan;
        this.tenKH = tenKH;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Mã hóa đơn: ").append(maHD)
                .append(", Tên khách hàng: ").append(ngayBan)
                .append(", Ngày bán: ").append(tenKH);
        return builder.toString();
    }
}
