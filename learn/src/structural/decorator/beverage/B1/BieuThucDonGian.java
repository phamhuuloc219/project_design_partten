package structural.decorator.beverage.B1;

public class BieuThucDonGian extends BieuThuc{

    float toanHang;
    public BieuThucDonGian(float toanHang) {
        super();
        this.toanHang = toanHang;
    }



    @Override
    public float giaTri() {
        return this.toanHang;
    }

    @Override
    public String bieuThuc() {
        return String.valueOf(this.toanHang);
    }
}
