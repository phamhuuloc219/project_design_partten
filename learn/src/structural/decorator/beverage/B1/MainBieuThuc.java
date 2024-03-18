package structural.decorator.beverage.B1;

public class MainBieuThuc {
    public static void main(String[] args) {
        BieuThucDonGian bieuThucDonGian = new BieuThucDonGian(4);

        BieuThuc tru = new Tru("-",bieuThucDonGian, 2.5f);
        System.out.println("Biểu thức trừ: " + tru);

        BieuThuc cong = new Cong("+", tru, 7.8f);
        System.out.println("Biểu thức cộng: " + cong);

        BieuThuc nhan = new Nhan("*", cong, 3);
        System.out.println("Biểu thức nhân: " + nhan);

        BieuThuc chia = new Chia("/", nhan, 2);
        System.out.println("Biểu thức chia: " + chia);

        //System.out.println("Giá trị của biểu thức chia: " + chia.giaTri());
    }
}