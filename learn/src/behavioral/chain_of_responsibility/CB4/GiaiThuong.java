package behavioral.chain_of_responsibility.CB4;

import java.util.Arrays;

public class GiaiThuong extends giaiThuongVeSo {
    String[] soTrung;

    private giaiThuongVeSo giaiThuongKeTiep;

    public GiaiThuong(String tenGiai, String[] soTrung) {
        super(tenGiai);
        this.soTrung = soTrung;
    }

    @Override
    public giaiThuongVeSo giaiThuongKeTiep(giaiThuongVeSo keTiep) {
        this.giaiThuongKeTiep = keTiep;
        return keTiep;
    }

    @Override
    public String doVe(String so) {
        for(String soTrung : soTrung) {
            if (soTrung.endsWith(so))
                return "Bộ số: " + soTrung + " đã trúng giải " + tenGiai;
        }
        if (giaiThuongKeTiep==null)
            return "Chúc bạn may mắn lần sau!!";
        return giaiThuongKeTiep.doVe(so);
    }
}
