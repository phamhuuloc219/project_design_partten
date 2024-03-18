package structural.decorator.beverage.B1;

public class BieuThucDecorator extends BieuThuc{
    BieuThuc bieuthuc;

    public BieuThucDecorator(String bieuThuc, BieuThuc bieuthuc) {
        super(bieuThuc);
        this.bieuthuc = bieuthuc;
    }

    @Override
    public String bieuThuc() {
        return null;
    }

    @Override
    public float giaTri() {
        return bieuthuc.giaTri();
    }

    public BieuThucDecorator(String bieuThuc) {
        super(bieuThuc);
    }
}
