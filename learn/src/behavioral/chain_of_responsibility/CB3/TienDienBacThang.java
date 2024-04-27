package behavioral.chain_of_responsibility.CB3;

public abstract class TienDienBacThang {
    String tenBac;
    int min, max, gia;
    abstract TienDienBacThang bacKeTiep(TienDienBacThang b);
    abstract int tienDien(int soKw);

    public TienDienBacThang(String tenBac, int min, int max, int gia) {
        this.tenBac = tenBac;
        this.min = min;
        this.max = max;
        this.gia = gia;
    }
}
