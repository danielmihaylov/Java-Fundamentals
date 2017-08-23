package JavaOOPAdvanced.Generics.customListSorted.customListSorted;

import java.util.List;

public interface CustomList<T extends Comparable<T>> {
    void add(T element);
    T remove(int index);
    boolean contains(T element);
    void swap(int fromIndex, int toIndex);
    int countGreaterThan(T element);

    T getMax();
    T getMin();
    void sort();
}
