package behavioral.stratery.cc1_tinh;

public class context {
    private Tinh tinhToan;

    public context setTinhToan(Tinh tinhToan) {
        this.tinhToan = tinhToan;
        return this;
    }
    public float Tinh(float a,float b){
        return tinhToan.Tinh(a,b);
    }
}
