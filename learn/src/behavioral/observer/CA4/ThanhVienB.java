package behavioral.observer.CA4;

import java.util.List;

public class ThanhVienB implements Topic.TopicListener {
    private List<String> TinTuc;

    public ThanhVienB(List<String> tinTuc) {
        this.TinTuc = tinTuc;
    }

    @Override
    public void listen(List<String> tinTuc) {
        this.TinTuc = tinTuc;
        System.out.println("Thành viên B nhận được danh sách tin tức mới:");
        for (int i = 0; i < TinTuc.size(); i++) {
            System.out.println((i+1) + ". " + TinTuc.get(i));
        }
    }
}
