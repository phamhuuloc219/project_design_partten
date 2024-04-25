package structural.composite.B4;

public class MonHoc extends KeHoachHocTap{
    int soTC,hocPhi;

    public MonHoc(String tenMH, int soTC, int hocPhi) {
        super(tenMH);
        this.soTC = soTC;
        this.hocPhi = hocPhi;
    }

    @Override
    public int getSoTC() {
        return soTC;
    }

    @Override
    public int getHocPhi() {
        return soTC*hocPhi;
    }

    @Override
    public String thongTin() {
        return "Mon "+tenMH+"\t"+
                "So TC: " +soTC+"\t"+
                "Hoc phi: " +hocPhi;
    }

    @Override
    public void add(KeHoachHocTap keHoachHocTap) {

    }

    @Override
    public void remove(KeHoachHocTap keHoachHocTap) {

    }
}
