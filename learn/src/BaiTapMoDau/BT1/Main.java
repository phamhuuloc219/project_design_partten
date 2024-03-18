package BaiTapMoDau.BT1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SinhVien63 sinhVien1 = new SinhVien63("Pham Huu Loc",20,"Khanh Hoa",5000,220);
        SinhVien63 sinhVien2 = new SinhVien63("Tu Cong Thang",21,"Khanh Hoa",5000,220);
        // In thông tin của nhân viên ra màn hình
        System.out.println("Thông tin nhân viên 1: " + sinhVien1.getThongTin());
        System.out.println("Tiền thưởng nhân viên 1: " + sinhVien1.tinhThuong());

        System.out.println("Thông tin nhân viên 2: " + sinhVien2.getThongTin());
        System.out.println("Tiền thưởng nhân viên 2: " + sinhVien2.tinhThuong());
    }
}
