package JavaOOPAdvanced.Generics.genericBox.genericBox;

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

    @Override
    public String toString() {
        return String.format("%s: %s",box.getClass().getName(),box.toString());
    }
}
