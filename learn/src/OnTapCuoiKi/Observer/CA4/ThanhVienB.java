package OnTapCuoiKi.Observer.CA4;

import java.util.ArrayList;
import java.util.List;

public class ThanhVienB implements TopicListener{
    List<String> TinTuc = new ArrayList<>();

    public ThanhVienB(List<String> tinTuc) {
        this.TinTuc = tinTuc;
    }

    @Override
    public void listen(List<String> topic) {
        this.TinTuc = topic;
        System.out.printf("Thanh vien B nhan mot danh sach tin tuc");
        for(int i=0; i< TinTuc.size(); i++) {
            System.out.printf((i+1)+"."+TinTuc.get(i));
        }
    }
}
