package structural.decorator.beverage.B1;

public class Cong extends BieuThucDecorator{
    float toanHang;

    public Cong(String bieuThuc, BieuThuc bieuthuc, float toanHang) {
        super(bieuThuc, bieuthuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return bieuthuc.giaTri()+toanHang;
    }

    @Override
    public String bieuThuc() {
        return bieuthuc.giaTri()+"+"+toanHang;
    }
}
