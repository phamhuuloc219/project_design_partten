package behavioral.chain_of_responsibility.F88;

public class NhanVien extends NhanVienF88{
    NhanVienF88 capTren;
    public NhanVien(String ten, String chucVu, int hanMucXuLyVay) {
        super(ten, chucVu, hanMucXuLyVay);
    }

    @Override
    public NhanVienF88 capCaoHon(NhanVienF88 nv) {
        capTren = nv;
        return capTren;
    }

    @Override
    public String xuLyKhoanVay(int tienVay) {
        if(tienVay <= hanMucXuLyVay) {
            StringBuilder builder = new StringBuilder();
            builder.append(chucVu)
                    .append(" ")
                    .append(ten)
                    .append(" Xử lý khoản vay: ")
                    .append(tienVay);
            return builder.toString();
        }
        return capTren.xuLyKhoanVay(tienVay);
    }
}
