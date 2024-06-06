package OnTapCuoiKi.Chain_Of_Responsibility;

public class Main {
    public static void main(String[] args) {
        TienDienBacThang b1 = new BacThongThuong(1800,0,50,"Bac 1");
        TienDienBacThang b2 = new BacThongThuong(2000,50,100,"Bac 2");
        TienDienBacThang b3 = new BacThongThuong(3000,100,150,"Bac 3");
        b1.bacKeTiep(b2).bacKeTiep(b3);
        System.out.printf("Tong: " + b3.tienDien(120));
    }
}
