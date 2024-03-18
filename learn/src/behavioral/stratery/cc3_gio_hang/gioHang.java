package behavioral.stratery.cc3_gio_hang;

import java.util.ArrayList;
import java.util.List;

public class gioHang {
    private List<matHang> matHangs;
    private IThanhToan thanhToan;
    private IVanChuyen vanChuyen;
    private IKhuyenMai khuyenMai;
    public gioHang(){
        this.matHangs = new ArrayList<>();
    }
    public void themMatHang(matHang matHang){
        matHangs.add(matHang);
    }

    public void setThanhToan(IThanhToan thanhToan) {
        this.thanhToan = thanhToan;
    }

    public void setVanChuyen(IVanChuyen vanChuyen) {
        this.vanChuyen = vanChuyen;
    }

    public void setKhuyenMai(IKhuyenMai khuyenMai) {
        this.khuyenMai = khuyenMai;
    }
    public double getTongTien() {
        double tongTien = 0;
        for (matHang matHang : matHangs) {
            tongTien += matHang.getSoLuong() * matHang.getDonGia();
        }
        return tongTien;
    }

    public List<matHang> getMatHangs() {
        return matHangs;
    }

    public void setMatHangs(List<matHang> matHangs) {
        this.matHangs = matHangs;
    }

    public IThanhToan getThanhToan() {
        return thanhToan;
    }

    public IVanChuyen getVanChuyen() {
        return vanChuyen;
    }

    public IKhuyenMai getKhuyenMai() {
        return khuyenMai;
    }

    public void thanhToan() {
        double tongTien = getTongTien();
        double tienGiamGia = thanhToan.thanhToan(this);
        double phiVanChuyen = vanChuyen.tinhPhiVanChuyen(this);
        double tienKhuyenMai = khuyenMai.tinhTienKhuyenMai(this);
        double tongTienThanhToan = tongTien - tienGiamGia + phiVanChuyen - tienKhuyenMai;

        System.out.println("**Thông tin thanh toán:**");
        System.out.println("Tổng tiền hàng: " + tongTien);
        System.out.println("Tiền giảm giá: " + tienGiamGia);
        System.out.println("Phí vận chuyển: " + phiVanChuyen);
        System.out.println("Tiền khuyến mãi: " + tienKhuyenMai);
        System.out.println("Tổng tiền thanh toán: " + tongTienThanhToan);

        if (vanChuyen instanceof giaoHangNhanh) {
            System.out.println("Thời gian dự kiến nhận hàng: 4 ngày");
        } else if (vanChuyen instanceof NinjaVan) {
            System.out.println("Thời gian dự kiến nhận hàng: 5 ngày");
        }
    }
}
