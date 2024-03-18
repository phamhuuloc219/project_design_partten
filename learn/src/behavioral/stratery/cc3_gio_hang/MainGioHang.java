package behavioral.stratery.cc3_gio_hang;

public class MainGioHang {
    public static void main(String[] args) {
        gioHang gh = new gioHang();
        gh.themMatHang(new matHang("Laptop",1,21000000));
        gh.themMatHang(new matHang("IP 15 Pro Max",1,31000000));
        gh.themMatHang(new matHang("Samsung S24 Ultra",1,18000000));
        gh.themMatHang(new matHang("Đào",1,3000000));
        gh.themMatHang(new matHang("Mai",1,2000000));
        gh.themMatHang(new matHang("Áo thun",1,200000));
        gh.themMatHang(new matHang("Áo sơ mi",1,400000));
        gh.themMatHang(new matHang("Quần Jean",1,500000));


        gh.setThanhToan(new thanhToanAirPay());
        gh.setVanChuyen(new NinjaVan());
        gh.setKhuyenMai(new khuyenMaiGiamXPhanTram(30));

        gh.thanhToan();

    }
}
