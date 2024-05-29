package behavioral.observer.CA4;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    private List<TopicListener> listeners = new ArrayList<>();
    private List<String> TinTuc = new ArrayList<>();
    public void dangKy(TopicListener listener){
        listeners.add(listener);
    }
    public void huyDangKy(TopicListener listener){
        listeners.remove(listener);
    }
    public void themMoi(String tinTuc){
        TinTuc.add(tinTuc);
        notifyTinTuc();
    }
    public void capNhat(int index, String tinTuc){
        TinTuc.set(index,tinTuc);
        notifyTinTuc();
    }
    private void notifyTinTuc() {
        for (TopicListener listener : listeners) {
            listener.listen(TinTuc);
        }
    }
    public interface TopicListener{
        public void listen(List<String> TinTuc);
    }
}
