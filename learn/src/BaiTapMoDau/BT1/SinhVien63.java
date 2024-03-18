package BaiTapMoDau.BT1;

public class SinhVien63 {
    private String ten;
    private int tuoi;
    private String diaChi;
    private double tienLuong;
    private int tongSoGioLam;

    // Constructor không tham số
    public SinhVien63() {
    }

    // Constructor đầy đủ các tham số
    public SinhVien63(String ten, int tuoi, String diaChi, double tienLuong, int tongSoGioLam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongSoGioLam = tongSoGioLam;
    }

    // Getter và setter cho các thuộc tính
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public int getTongSoGioLam() {
        return tongSoGioLam;
    }

    public void setTongSoGioLam(int tongSoGioLam) {
        this.tongSoGioLam = tongSoGioLam;
    }

    // Phương thức trả về thông tin của nhân viên
    public String getThongTin() {
        return "Tên: " + ten +
                ", Tuổi: " + tuoi +
                ", Địa chỉ: " + diaChi +
                ", Tiền lương: " + tienLuong +
                ", Tổng số giờ làm: " + tongSoGioLam;
    }

    // Phương thức tính toán và trả về số tiền thưởng của nhân viên
    public double tinhThuong() {
        if (tongSoGioLam >= 200) {
            return tienLuong * 0.2;
        } else if (tongSoGioLam >= 100) {
            return tienLuong * 0.1;
        } else {
            return 0;
        }
    }
}