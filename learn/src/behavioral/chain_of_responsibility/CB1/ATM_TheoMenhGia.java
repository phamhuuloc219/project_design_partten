package behavioral.chain_of_responsibility.CB1;

public abstract class ATM_TheoMenhGia {
    int menhGiaTien;
    abstract ATM_TheoMenhGia keTiep(ATM_TheoMenhGia k);
    abstract void rutTien(int soTien);
}
