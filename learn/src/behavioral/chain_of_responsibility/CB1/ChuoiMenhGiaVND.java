package behavioral.chain_of_responsibility.CB1;

public abstract class ChuoiMenhGiaVND extends ChuoiMenhGiaFactory{
    ATM_TheoMenhGia m500;
    ATM_TheoMenhGia m200;
    ATM_TheoMenhGia m100;
    ATM_TheoMenhGia m50;
    ATM_TheoMenhGia m0;
    ATM_TheoMenhGia m10;
    ATM_TheoMenhGia m5;
    ATM_TheoMenhGia m2;
    ATM_TheoMenhGia m1;
    @Override
    public ATM_TheoMenhGia getChuoiTheoMenhGia(int menhGiaTien) {
        return null;
    }

    @Override
    public void rutTien(int soTien, int menhGiaCaoNhat) {
    }
}
