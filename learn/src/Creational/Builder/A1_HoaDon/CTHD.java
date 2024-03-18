package Creational.Builder.A1_HoaDon;

public class CTHD {
    String sanPham;
    int soLuong;
    double donGia, chietKhau;

    public CTHD(String sanPham, int soLuong, double donGia, double chietKhau) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Tên sản phẩm: ").append(sanPham)
                .append(", Số lượng: ").append(soLuong)
                .append(", Đơn giá: ").append(donGia)
                .append(", Chiết khấu: ").append(chietKhau);
        return builder.toString();
    }
}
