package JavaOOPAdvanced.IteratorsAndComparators.listIterator.listIterator.interfaces;

public interface ListyIterator<E> {
    boolean move();

    boolean listyHasNext();

    void print();

    int getSize();

    void printAll();
}
