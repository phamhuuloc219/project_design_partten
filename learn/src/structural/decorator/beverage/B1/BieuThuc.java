package structural.decorator.beverage.B1;

public abstract class BieuThuc {
    String bieuThuc;

    public BieuThuc() {

    }

    public abstract float giaTri();
    public abstract String bieuThuc();
    public BieuThuc(String bieuThuc) {
        this.bieuThuc = bieuThuc;
    }

    @Override
    public String toString() {
        return bieuThuc()+"="+giaTri();
    }
}
