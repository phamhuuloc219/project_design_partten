package behavioral.iterator.Mang;

import java.util.List;

public class ArrayCollection63  implements Collection63{
    private  int[] arr ={1,2,3,4,5,6,7,8,9,10};

    public int getItem(int i){
        return arr[i];
    }

    public int count(){
        return arr.length;
    }


    @Override
    public Iterator63 createIterator() {
        return new ArrayIterator63(this);
    }
}
