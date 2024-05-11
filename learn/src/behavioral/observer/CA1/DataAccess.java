package behavioral.observer.CA1;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    List<MonHoc> list = new ArrayList<>();
    MyStream<List<MonHoc>> stream;

    public DataAccess(MyStream<List<MonHoc>> stream) {
        this.stream = stream;
    }

    public void addMonHoc(MonHoc monHoc){
        list.add(monHoc);
        stream.addEvent(list);
    }

    public void deleteMonHoc(MonHoc monHoc){
        list.remove(monHoc);
    }
}
