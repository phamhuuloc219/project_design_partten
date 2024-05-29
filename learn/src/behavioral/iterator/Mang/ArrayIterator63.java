package behavioral.iterator.Mang;

import behavioral.iterator.Mang.Iterator63;

public class ArrayIterator63 implements Iterator63 {

    ArrayCollection63 arrayCollection63;
    int index = -1;
    public ArrayIterator63(ArrayCollection63 arrayCollection63) {
        this.arrayCollection63 = arrayCollection63;
    }

    @Override
    public Object first() {
        if(!isDone()){
            index = 0;
            arrayCollection63.getItem(++index);
        }
        return null;
    }

    @Override
    public Object next() {
        if(!isDone()){
            return arrayCollection63.getItem(index);
        }
        return null;
    }

    @Override
    public Object current() {
        if(!isDone()){
            return arrayCollection63.getItem(index);
        }
        return null;
    }

    @Override
    public boolean isDone() {
        return false;
    }
}
