package OnTapCuoiKi.Chain_Of_Responsibility;

public class BacCaoNhat extends TienDienBacThang{
    TienDienBacThang bacKeTiep;

    public BacCaoNhat(int gia, int min, int max, String tenBac, TienDienBacThang bacKeTiep) {
        super(gia, min, max, tenBac);
        this.bacKeTiep = bacKeTiep;
    }

    @Override
    int tienDien(int soKw) {
        return (soKw-min)*gia;
    }

    @Override
    TienDienBacThang bacKeTiep(TienDienBacThang b) {
        this.bacKeTiep = b;
        return b;
    }
}
