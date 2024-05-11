package behavioral.observer.CA1;

import java.util.List;

public class Client implements MyStreamListener<List<MonHoc>>{
    MyStream stream;
    public Client (MyStream stream){
        this.stream = stream;
        this.stream.addListener(this);
    }

    @Override
    public void listen(List<MonHoc> monHocs) {
        for(MonHoc monHoc : monHocs){
            System.out.printf(monHoc.toString());
        }
    }
}
