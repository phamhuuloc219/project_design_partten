package BaiTapMoDau.BT4;
import java.util.ArrayList;
import java.util.List;

public class QuanLyChuyenXe{
    List<ChuyenXe> list= new ArrayList<>();
    public void Them(ChuyenXe cx){
        for(ChuyenXe c:list){
            if(c.getMaSoChuyen().equals(cx.getMaSoChuyen())){
                return ;
            }
        }
        list.add(cx);
    }
    public void inDS(){
        for(ChuyenXe c:list)
            System.out.println(c.toString());
    }
    public float tinhDoanhThuXeNgoaiThanh(){
        float doanhThu=0;
        for(ChuyenXe c:list)
            if(c instanceof ChuyenXeNgoaiThanh)
                doanhThu+=c.getDoanhThu();
        return doanhThu;
    }
    public float tinhDoanhThuXeNoiThanh(){
        float doanhThu=0;
        for(ChuyenXe c:list)
            if(c instanceof ChuyenXeNoiThanh)
                doanhThu+=c.getDoanhThu();
        return doanhThu;
    }
}
