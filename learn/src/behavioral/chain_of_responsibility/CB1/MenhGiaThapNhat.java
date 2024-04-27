package behavioral.chain_of_responsibility.CB1;

public class MenhGiaThapNhat extends ATM_TheoMenhGia{

    private ChuoiMenhGiaFactory factory;

    public MenhGiaThapNhat(ChuoiMenhGiaFactory factory) {
        this.factory = factory;
    }

    @Override
    public ATM_TheoMenhGia keTiep(ATM_TheoMenhGia k) {
        return k;
    }

    @Override
    public void rutTien(int soTien) {
        factory.rutTien(soTien, menhGiaTien);
    }
}
