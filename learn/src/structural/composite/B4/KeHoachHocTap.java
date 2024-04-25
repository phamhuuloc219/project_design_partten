package structural.composite.B4;

public abstract class KeHoachHocTap {
    String tenMH;

    public KeHoachHocTap(String tenMH) {
        this.tenMH = tenMH;
    }

    public abstract int getSoTC();
    public abstract int getHocPhi();
    public abstract String thongTin();
    public abstract void add(KeHoachHocTap keHoachHocTap);
    public abstract void remove(KeHoachHocTap keHoachHocTap);
}