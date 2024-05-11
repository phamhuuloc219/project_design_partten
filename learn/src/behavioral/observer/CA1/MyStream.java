package behavioral.observer.CA1;

import java.util.ArrayList;
import java.util.List;

public class MyStream <T>{
    List<T> t = new ArrayList<>();
    List<MyStreamListener<T>> listeners = new ArrayList<MyStreamListener<T>>();
    public void addEvent(T t) {
        for (MyStreamListener<T> l :listeners){
            l.listen(t);
        }
    }
    public void addListener(MyStreamListener listener) {
        listeners.add(listener);
    }

}
