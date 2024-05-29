package behavioral.chain_of_responsibility.CB5;

public class MainXepLoai {
    public static void main(String[] args) {
        XepLoaiHocLuc kem = new HocLuc("Kém",5 );
        XepLoaiHocLuc trungBinh = new HocLuc("Trung bình",7 );
        XepLoaiHocLuc kha = new HocLuc("Khá",8 );
        XepLoaiHocLuc gioi = new HocLuc("Giỏi",9 );
        XepLoaiHocLuc xuatSac = new HocLuc("Xuất sắc",10 );
        kem.hocLucCaoHon(trungBinh)
                .hocLucCaoHon(kha)
                .hocLucCaoHon(gioi)
                .hocLucCaoHon(xuatSac);
        System.out.println(kem.XepLoai(6));
    }
}
