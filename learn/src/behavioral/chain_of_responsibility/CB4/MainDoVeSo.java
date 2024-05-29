package behavioral.chain_of_responsibility.CB4;

public class MainDoVeSo {
    public static void main(String[] args) {
        giaiThuongVeSo giaiDacBiet = new GiaiThuong("Giải Đặc Biệt",new String[]{"210902"} );
        giaiThuongVeSo giaiNhat = new GiaiThuong("Giải Nhất",new String[]{"210102"} );
        giaiThuongVeSo giaiNhi = new GiaiThuong("Giải Nhì",new String[]{"210102"} );
        giaiThuongVeSo giaiBa = new GiaiThuong("Giải Ba",new String[]{"210102"} );
        giaiThuongVeSo giaiTu = new GiaiThuong("Giải Tư",new String[]{"210102"} );
        giaiThuongVeSo giaiNam = new GiaiThuong("Giải Năm",new String[]{"210102"} );
        giaiThuongVeSo giaiSau = new GiaiThuong("Giải Sáu",new String[]{"210102"} );
        giaiThuongVeSo giaiBay = new GiaiThuong("Giải Bảy",new String[]{"210102"} );
        giaiThuongVeSo giaiTam = new GiaiThuong("Giải Tám",new String[]{"210102"} );
        giaiDacBiet
                .giaiThuongKeTiep(giaiNhat)
                .giaiThuongKeTiep(giaiNhi)
                .giaiThuongKeTiep(giaiBa)
                .giaiThuongKeTiep(giaiTu)
                .giaiThuongKeTiep(giaiNam)
                .giaiThuongKeTiep(giaiSau)
                .giaiThuongKeTiep(giaiBay)
                .giaiThuongKeTiep(giaiTam);
        System.out.println(giaiDacBiet.doVe("210102"));
    }
}
