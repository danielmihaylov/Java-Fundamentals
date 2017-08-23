package JavaOOPAdvanced.Generics.genericArrayCreator.genericArrayCreator;

public class Main {
    public static void main(String[] args) {
        Integer[] integers =  ArrayCreator.create(Integer.class,5, 1);
        String[] strings = ArrayCreator.create(5,"sa");
        System.out.println(integers.length);
    }
}
