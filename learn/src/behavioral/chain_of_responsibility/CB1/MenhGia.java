package behavioral.chain_of_responsibility.CB1;

public class MenhGia extends ATM_TheoMenhGia{
    int soTo;
    int soDu;
    ATM_TheoMenhGia keTiep;

    public MenhGia(int soTo, int soDu, ATM_TheoMenhGia keTiep) {
        this.soTo = soTo;
        this.soDu = soDu;
        this.keTiep = keTiep;
    }

    @Override
    ATM_TheoMenhGia keTiep(ATM_TheoMenhGia k) {
        this.keTiep = k;
        return k;
    }

    @Override
    void rutTien(int soTien) {
        soTo = soTien/menhGiaTien;
        soDu = soTien % menhGiaTien;
        if(soTo>0){
            System.out.printf("co"+ soTo+"menh gia " + menhGiaTien);
        }
        if(soDu>0) {
            keTiep.rutTien(soDu);
        }
    }
}
