package behavioral.chain_of_responsibility.CB1;

public abstract class ChuoiMenhGiaFactory extends ATM_TheoMenhGia{

    public abstract ATM_TheoMenhGia getChuoiTheoMenhGia(int menhGiaTien);

    abstract void rutTien(int soTien, int menhGiaCaoNhat);
}
