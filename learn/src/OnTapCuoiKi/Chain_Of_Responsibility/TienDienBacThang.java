package OnTapCuoiKi.Chain_Of_Responsibility;

public abstract class TienDienBacThang {
    int gia, min, max;
    String tenBac;
    abstract int tienDien(int soKw);
    abstract TienDienBacThang bacKeTiep(TienDienBacThang b);

    public TienDienBacThang(int gia, int min, int max, String tenBac) {
        this.gia = gia;
        this.min = min;
        this.max = max;
        this.tenBac = tenBac;
    }
}
