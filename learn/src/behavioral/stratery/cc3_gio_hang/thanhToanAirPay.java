package behavioral.stratery.cc3_gio_hang;

public class thanhToanAirPay implements IThanhToan{
    @Override
    public double thanhToan(gioHang gh) {
        if(gh.getTongTien()>=1000000){
            return gh.getTongTien()*0.97;
        }
        return gh.getTongTien();
    }
}
