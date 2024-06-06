package OnTapCuoiKi.Observer.CA4;

import java.util.ArrayList;
import java.util.List;

public class Topic implements TopicListener{
    private List<TopicListener> listeners = new ArrayList<>();
    private List<String> TinTuc = new ArrayList<>();
    public void dangKy(TopicListener listener){
        listeners.add(listener);
    }
    public void huyDangKy(TopicListener listener){
        listeners.remove(listener);
    }
    public void themMoi(String tinTuc) {
        TinTuc.add(tinTuc);
        notifyListener();
    }
    public void capNhat(int index, String tinTuc){
        TinTuc.set(index,tinTuc);
        notifyListener();
    }
    public void notifyListener(){
        for(TopicListener listener : listeners){
            listener.listen(TinTuc);
        }
    }

    @Override
    public void listen(List<String> topic){

    }
}
