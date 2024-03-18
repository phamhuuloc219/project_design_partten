package behavioral.stratery.cc3_gio_hang;

public class thanhToanCOD implements IThanhToan {
    @Override
    public double thanhToan(gioHang gh) {
        if(gh.getTongTien()>=2000000){
            return gh.getTongTien()*0.98;
        }
        return gh.getTongTien();
    }
}
