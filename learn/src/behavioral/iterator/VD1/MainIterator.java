package behavioral.iterator.VD1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MainIterator {
    public static void duyetMonhoc(Iterator<Monhoc> iterator) {
        while(iterator.hasNext()){
            Monhoc monhoc = iterator.next();
            System.out.println(monhoc.toString());
        }
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println("Cách 1");
        Iterator iterator = list.iterator();
        while ((iterator.hasNext())){
            System.out.println(iterator.next());
        }
        System.out.println("Cách 2");
        Iterator<Integer> iterator2 = list.iterator();
        iterator2.forEachRemaining(integer ->
                System.out.println(integer));
        List<Monhoc> mhs = new ArrayList<>(Arrays.asList(
                new Monhoc("Thể dục",2),
                new Monhoc("Xắc suất thống kê",3),
                new Monhoc("lập trình",3)
        ));
        duyetMonhoc(mhs.iterator());
    }
}
