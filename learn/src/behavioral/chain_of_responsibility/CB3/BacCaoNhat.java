package behavioral.chain_of_responsibility.CB3;

public class BacCaoNhat extends TienDienBacThang{
    TienDienBacThang bacKeTiep;

    public BacCaoNhat(String tenBac, int min, int max, int gia) {
        super(tenBac, min, max, gia);
    }

    @Override
    TienDienBacThang bacKeTiep(TienDienBacThang b) {
        this.bacKeTiep = b;
        return b;
    }

    @Override
    int tienDien(int soKw) {
        return (soKw - min)* gia;
    }
}