package structural.composite.B4;

import java.util.ArrayList;
import java.util.List;

public class QLMonHoc extends KeHoachHocTap{
    List<KeHoachHocTap> list = new ArrayList<>();

    public QLMonHoc(String tenMH) {
        super(tenMH);
    }

    @Override
    public int getSoTC() {
        int soTC=0;
        for (KeHoachHocTap keHoacHocTap: list)
            soTC += keHoacHocTap.getSoTC();
        return soTC;
    }

    @Override
    public int getHocPhi() {
        int hocPhi=0;
        for (KeHoachHocTap keHoacHocTap: list)
            hocPhi += keHoacHocTap.getHocPhi();
        return hocPhi;
    }

    @Override
    public String thongTin() {
        return
                "HK: \n" +
                        "\nTổng Số TC=" + getSoTC() +
                        "\nTổng HocPhi=" + getHocPhi() ;
    }

    @Override
    public void add(KeHoachHocTap keHoachHocTap) {
        list.add(keHoachHocTap);
    }

    @Override
    public void remove(KeHoachHocTap keHoachHocTap) {
        list.remove(keHoachHocTap);
    }
}
