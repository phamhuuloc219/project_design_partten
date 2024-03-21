package behavioral.chain_of_responsibility.F88;

public class MainF88 {
    public static void main(String[] args) {
        NhanVienF88 baoVe = new NhanVien("Thảo","Bảo vệ",10000000);
        NhanVienF88 thuKy = new NhanVien("Kiệt","Thư ký",50000000);
        NhanVienF88 truongPhong = new NhanVien("Anh","Trưởng phòng",20000000);
        NhanVienF88 phoGiamDoc = new NhanVien("Thắng","Phó giám đốc",100000000);
        NhanVienF88 giamDoc = new NhanVien("Lộc","Giám đốc",500000000);

        baoVe.capCaoHon(thuKy)
                .capCaoHon(truongPhong)
                .capCaoHon(phoGiamDoc)
                .capCaoHon(giamDoc);
        System.out.println("Vay tiền 5 triệu: " +baoVe.xuLyKhoanVay(50000000));

    }
}
