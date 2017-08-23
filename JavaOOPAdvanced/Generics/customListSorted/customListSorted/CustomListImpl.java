package JavaOOPAdvanced.Generics.customListSorted.customListSorted;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomListImpl<T extends Comparable<T>> implements CustomList<T> {

    private List<T> items;

    public CustomListImpl() {
        this.items = new ArrayList<T>();
    }

    @Override
    public void add(T element) {
        this.items.add(element);
    }

    @Override
    public T remove(int index) {
        return this.items.remove(index);
    }

    @Override
    public boolean contains(T element) {
        return this.items.contains(element);
    }

    @Override
    public void swap(int fromIndex, int toIndex) {
        T firstElement = this.items.get(fromIndex);
        T secondElement = this.items.get(toIndex);
        this.items.set(fromIndex,secondElement);
        this.items.set(toIndex,firstElement);
    }

    @Override
    public int countGreaterThan(T element) {
        return (int) this.items.stream()
                .filter(el -> el.compareTo(element) >0).count();
    }

    @Override
    public T getMax() {
        T currentElement = this.items.get(0);
        for (T item : items) {
            if (item.compareTo(currentElement)>0){
                currentElement = item;
            }
        }
        return currentElement;
    }

    @Override
    public T getMin() {
        T currentElement = this.items.get(0);
        for (T item : items) {
            if (item.compareTo(currentElement)<0){
                currentElement = item;
            }
        }
        return currentElement;
    }


    @Override
    public void sort() {
        Collections.sort(items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T item : items) {
            sb.append(item).append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}
