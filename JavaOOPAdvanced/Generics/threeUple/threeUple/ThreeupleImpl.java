package JavaOOPAdvanced.Generics.threeUple.threeUple;

/**
 * Created by Daniel on 24.3.2017 г..
 */
public class ThreeupleImpl<T> implements Threeuple<T> {

    private T first;
    private T second;
    private T third;

    public ThreeupleImpl(T first, T second, T third) {
        this.setFirst(first);
        this.setSecond(second);
        this.setThird(third);
    }

    @Override
    public T getFirst() {
        return this.first;
    }

    @Override
    public T getSecond() {
        return this.second;
    }

    @Override
    public T getThird() {
        return this.third;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public void setThird(T third) {
        this.third = third;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s -> %s",this.getFirst(),this.getSecond(),this.getThird());
    }
}
