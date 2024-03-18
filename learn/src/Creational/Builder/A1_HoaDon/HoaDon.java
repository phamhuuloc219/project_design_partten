package Creational.Builder.A1_HoaDon;

import java.util.ArrayList;

public class HoaDon {
    HoaDonHeader header;
    ArrayList<CTHD> cthd;
    public HoaDon(Builder builder) {
        this.header = builder.header;
        this.cthd = builder.cthd;
    }
    public static class Builder{
        HoaDonHeader header;
        ArrayList<CTHD> cthd = new ArrayList<>();
        public HoaDon build(){
            return new HoaDon(this);
        }
        public Builder setHeader(String maHD, String tenKH, String ngayBan){
            header = new HoaDonHeader(maHD, tenKH, ngayBan);
            return this;
        }
        public Builder addCTHD(String sanPham, int soLuong, double donGia, double chietKhau){
            cthd.add(new CTHD(sanPham, soLuong, donGia, chietKhau));
            return this;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(header.toString())
                .append("\n Chi tiết hóa đơn: ");
        for(var c : cthd)
            builder.append("\n\t").append(c.toString());
        return builder.toString();
    }
}
