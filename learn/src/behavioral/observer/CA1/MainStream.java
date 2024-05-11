package behavioral.observer.CA1;

import java.util.List;

public class MainStream {
    public static void main(String[] args) {
        MyStream<List<MonHoc>> stream = new MyStream<>();
        DataAccess dataAccess = new DataAccess(stream);
        Client client = new Client(stream);
        System.out.printf("Lan 1");
        dataAccess.addMonHoc(new MonHoc("01"," The duc", 1));
        System.out.printf("\nLan 2");
        dataAccess.addMonHoc(new MonHoc("02"," Sinh hoc", 1));
    }
}
