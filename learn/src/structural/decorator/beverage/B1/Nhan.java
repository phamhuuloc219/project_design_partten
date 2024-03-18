package structural.decorator.beverage.B1;

public class Nhan extends BieuThucDecorator{
    float toanHang;

    public Nhan(String bieuThuc, BieuThuc bieuthuc, float toanHang) {
        super(bieuThuc, bieuthuc);
        this.toanHang = toanHang;
    }

    @Override
    public String bieuThuc() {
        return bieuthuc.giaTri()+"*"+toanHang;
    }

    @Override
    public float giaTri() {
        return bieuthuc.giaTri()*toanHang;
    }
}
