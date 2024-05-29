package behavioral.chain_of_responsibility.CB4;

public class GiaiTam extends giaiThuongVeSo {
    String soTrung;

    public GiaiTam(String tenGiai, String soTrung) {
        super(tenGiai);
        this.soTrung = soTrung;
    }

    @Override
    public giaiThuongVeSo giaiThuongKeTiep(giaiThuongVeSo keTiep) {
        return null;
    }

    @Override
    public String doVe(String so) {
        if (so.endsWith(soTrung))
            return "Bạn đã trúng giải " + tenGiai;
        else
            return  "Bạn không trúng giải thưởng nào!!";
    }
}
