package structural.composite.B4;

public class MainB4 {
    public static void main(String[] args) {
        KeHoachHocTap MTK = new MonHoc("MTK", 5, 100);
        KeHoachHocTap diDong = new MonHoc("\nlap Trinh Di Dong", 3,100);

        KeHoachHocTap Them= new QLMonHoc("Khoa 2021-2025");
        Them.add(MTK);
        Them.add(diDong);
        System.out.println(Them.tenMH+Them.thongTin());
    }
}