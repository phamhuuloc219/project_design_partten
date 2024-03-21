package behavioral.chain_of_responsibility.F88;

public abstract class NhanVienF88 {
    String ten;
    String chucVu;
    int hanMucXuLyVay;
    public NhanVienF88(String ten, String chucVu, int hanMucXuLyVay) {
        this.ten = ten;
        this.chucVu = chucVu;
        this.hanMucXuLyVay = hanMucXuLyVay;
    }
    public abstract NhanVienF88 capCaoHon(NhanVienF88 nv);
    public abstract String xuLyKhoanVay(int tienVay);


}
