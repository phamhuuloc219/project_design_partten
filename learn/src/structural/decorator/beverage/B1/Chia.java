package structural.decorator.beverage.B1;

public class Chia extends BieuThucDecorator{
    float toanHang;

    public Chia(String bieuThuc, BieuThuc bieuthuc, float toanHang) {
        super(bieuThuc, bieuthuc);
        this.toanHang = toanHang;
    }

    @Override
    public String bieuThuc() {
        return bieuthuc.giaTri()+"/"+toanHang;
    }

    @Override
    public float giaTri() {
        return bieuthuc.giaTri()/toanHang;
    }
}
