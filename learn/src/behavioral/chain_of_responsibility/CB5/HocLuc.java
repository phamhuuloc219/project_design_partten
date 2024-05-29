package behavioral.chain_of_responsibility.CB5;

public class HocLuc extends XepLoaiHocLuc{
    String xepLoai;
    int max;
    XepLoaiHocLuc hocLucCaoHon;

    public HocLuc(String xepLoai, int max) {
        this.xepLoai = xepLoai;
        this.max = max;
    }

    @Override
    public XepLoaiHocLuc hocLucCaoHon(XepLoaiHocLuc xepLoaiHocLuc) {
        this.hocLucCaoHon = xepLoaiHocLuc;
        return xepLoaiHocLuc;
    }

    @Override
    public String XepLoai(double Diem) {
        if(Diem<=max)
            return xepLoai;
        else
            return hocLucCaoHon.XepLoai(Diem);

    }
}
