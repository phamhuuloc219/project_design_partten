package behavioral.chain_of_responsibility.CB3;

public class BacThongThuong extends TienDienBacThang {

    TienDienBacThang bacKeTiep;

    public BacThongThuong(String tenBac, int min, int max, int gia) {
        super(tenBac, min, max, gia);
    }

    @Override
    TienDienBacThang bacKeTiep(TienDienBacThang b) {
        this.bacKeTiep = b;
        return b;
    }

    @Override
    int tienDien(int soKw) {
        StringBuilder builder = new StringBuilder();
        int tongTien;
        if(soKw <= max){
            tongTien=(soKw - min) *gia;
            builder.append(tenBac).append(": ").append(min).append(" --> ").append(max).append(" : ").append(soKw).append("x").append(gia).append(tongTien);
            return tongTien;
        }
        else{
            tongTien = (max - min) *gia;
            builder.append(tenBac).append(": ").append(min).append(" --> ").append(max).append(" : ").append(soKw).append("x").append(gia).append(tongTien);
            return  tongTien +bacKeTiep.tienDien(soKw);
        }
    }
}
