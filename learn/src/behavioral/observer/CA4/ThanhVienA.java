package behavioral.observer.CA4;

import java.util.List;

public class ThanhVienA implements Topic.TopicListener {
    @Override
    public void listen(List<String> TinTuc) {
        String latestTinTuc = TinTuc.get(TinTuc.size() - 1);
        System.out.println("Thành viên A đã nhận một tin tức mới : " + latestTinTuc);
    }
}
