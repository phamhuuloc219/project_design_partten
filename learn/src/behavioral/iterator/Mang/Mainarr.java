package behavioral.iterator.Mang;

import behavioral.iterator.Mang.ArrayCollection63;
import behavioral.iterator.Mang.Iterator63;

public class Mainarr {
    public static void main(String[] args) {
            ArrayCollection63 array = new ArrayCollection63();
            Iterator63 iterator = array.createIterator();
            while (!iterator.isDone()){
                System.out.println(iterator.next());
            }
    }
}
