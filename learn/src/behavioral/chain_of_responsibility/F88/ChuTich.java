package behavioral.chain_of_responsibility.F88;

public class ChuTich extends NhanVienF88{

    public ChuTich(String ten, String chucVu, int hanMucXuLyVay) {
        super(ten, chucVu, hanMucXuLyVay);
    }

    @Override
    public NhanVienF88 capCaoHon(NhanVienF88 nv) {
        return null;
    }

    @Override
    public String xuLyKhoanVay(int tienVay) {
        if(tienVay<=hanMucXuLyVay)
            return "Chủ tịch chịu trách nhiệm cho vay!!";
        else
            return "Không cho vay đâuu bạn ơiii, bạn trông thiếu uy tín quá";
    }
}
