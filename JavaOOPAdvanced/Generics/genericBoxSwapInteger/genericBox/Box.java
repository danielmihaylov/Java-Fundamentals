package JavaOOPAdvanced.Generics.genericBoxSwapInteger.genericBox;

import java.util.Collections;
import java.util.List;

public class Box <T>{
    private T box;

    public Box(T box) {
        this.setBox(box);
    }

    public T getBox() {
        return this.box;
    }

    public void setBox(T box) {
        this.box = box;
    }

    public static <T> void swap(List<T> list,Integer indexA,Integer indexB){
        Collections.swap(list,indexA,indexB);
    }

    @Override
    public String toString() {
        return String.format("%s: %s",box.getClass().getName(),box.toString());
    }
}
