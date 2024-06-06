package OnTapCuoiKi.Observer.CA4;

import java.util.List;

public class ThanhVienA implements TopicListener{
    @Override
    public void listen(List<String> topic) {
        String lastestTopic = topic.get(topic.size() - 1);
        System.out.printf("Thanh vien A nhan thong bao moi: "+ lastestTopic+"\n");
    }
}
