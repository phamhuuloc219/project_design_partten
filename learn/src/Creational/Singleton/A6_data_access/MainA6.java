package Creational.Singleton.A6_data_access;

public class MainA6 {
    public static void main(String[] args) {
        DataAccess UI1 = DataAccess.getInstance();
        DataAccess UI2 = DataAccess.getInstance();
        DataAccess UI3 = DataAccess.getInstance();
        UI3.addSP(new SanPham("01", "sach", 1, 10000));
        UI2.addSP(new SanPham("02", "quần", 10, 200000));
        UI1.removeSP("01");

        UI ui1 = new UI();
        UI ui2 = new UI();
        ui1.them(new SanPham("01", "quần", 10, 200000), "t1");
        ui2.them(new SanPham("02", "áo", 10, 200000), "t1");
        ui2.them(new SanPham("03", "giày", 10, 200000), "t2");
        System.out.println(UI3.toString());

    }
}
