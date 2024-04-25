package behavioral.observer.atm;

public class MainATM {
    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoan t1 = new TaiKhoan("Phạm Hữu Lộc",99999999,atm);
        TaiKhoan t2 = new TaiKhoan("Trần Thị Mỹ Trâm",99999999,atm);
        t1.duaTheVaoATM();
        System.out.printf("\nLần 1: ");
        atm.rutTien(500000);
        System.out.printf("\nLần 2: ");
        atm.rutTien(500000);
        t1.rutTheRaATM();
        System.out.printf("\nLần 3: ");
        atm.rutTien(500000);
        t2.duaTheVaoATM();
        System.out.printf("\nLần 4: ");
        atm.rutTien(500000);
    }
}
