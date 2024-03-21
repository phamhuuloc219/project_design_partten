package BaiTapMoDau.BT2;
import BaiTapMoDau.BT2.NhanVien;

import java.util.ArrayList;

public class QuanLyNhanVien implements IQuanLy{
    ArrayList<NhanVien> dsNhanVien;

    public QuanLyNhanVien() {
        dsNhanVien = new ArrayList<>();
    }

    @Override
    public void them(NhanVien nv) {
        dsNhanVien.add(nv);
    }

    @Override
    public void inDS() {
        for (NhanVien nv : dsNhanVien) {
            System.out.println(nv.getThongTin());
        }
    }
}
