package Creational.Singleton.A6_data_access;

import java.util.ArrayList;
import java.util.List;

//cài đặt singleton
public class DataAccess {
    private static DataAccess dataAccess;
    public static List<SanPham> ds;
    private DataAccess() {
        ds = new ArrayList<>();
    }
    public static DataAccess getInstance() {
        if (dataAccess == null) {
            dataAccess = new DataAccess();
        }
        return dataAccess;
    }


    public void addSP(SanPham sp) {
        ds.add(sp);
    }
    public void removeSP(String maSp) {
        for (SanPham i : ds) {
            if (i.maSP == maSp) {
                ds.remove(i);
                break;
            }
        }
    }
    public void updateSP(String maSp, String tenSp, int soLuong, float donGia) {
        for (SanPham i : ds) {
            if (i.maSP == maSp) {
                i.tenSP = tenSp;
                i.soLuong = soLuong;
                i.donGia = donGia;
                break;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (SanPham sp : ds) {
            builder.append("Tên sản phẩm: ").append(sp.tenSP)
                    .append(", Mã sản phẩm: ").append(sp.maSP)
                    .append(", Số lượng: ").append(sp.soLuong)
                    .append(", Đơn giá: ").append(sp.donGia).append("\n");
        }
        return builder.toString();
    }
}
