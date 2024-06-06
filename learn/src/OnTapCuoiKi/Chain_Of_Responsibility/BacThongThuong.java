package OnTapCuoiKi.Chain_Of_Responsibility;

public class BacThongThuong extends TienDienBacThang{
    TienDienBacThang bacKeTiep;

    public BacThongThuong(int gia, int min, int max, String tenBac) {
        super(gia, min, max, tenBac);
    }

    @Override
    int tienDien(int soKw) {
        if(soKw<=max){
            int tongTien = (soKw-min)*gia;
            return tongTien;
        }
        else{
            int tongTien = (max-min)*gia;
            return tongTien+ bacKeTiep.tienDien(soKw);
        }
    }

    @Override
    TienDienBacThang bacKeTiep(TienDienBacThang b) {
        return null;
    }
}
