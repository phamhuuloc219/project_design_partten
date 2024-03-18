package Creational.Builder.A1_HoaDon;

public class MainHoaDon {
    public static void main(String[] args) {
        HoaDon hoaDon = new HoaDon.Builder()
                .setHeader("HD001", "Lộc", "08/03/2024")
                .addCTHD("Apple Watch", 2, 1000, 0.3)
                .addCTHD("Macbook", 1, 2000, 0.2)
                .build();
        System.out.println(hoaDon.toString());
    }
}
