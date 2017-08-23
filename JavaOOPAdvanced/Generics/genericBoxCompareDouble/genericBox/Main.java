package JavaOOPAdvanced.Generics.genericBoxCompareDouble.genericBox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Double> boxes = new ArrayList<>();

        int lines = Integer.valueOf(reader.readLine());
        for (int i = 0; i < lines; i++) {
            //Box<Double> box = new Box<>(Double.parseDouble(reader.readLine()));
            boxes.add(Double.parseDouble(reader.readLine()));
        }

        Double boxToCompare = Double.parseDouble(reader.readLine());

        System.out.println(countGreater(boxes,boxToCompare));

    }

    public static <T> void SwapElements(List<T> type, int firstIndex, int secondIndex) {
        type.add(type.get(firstIndex));
        type.set(firstIndex, type.get(secondIndex));
        type.set(secondIndex, type.get(type.size() - 1));
        type.remove(type.size() - 1);
    }

    public static <T extends Comparable<T>> int countGreater(List<T> list, T element) {
        int counter= 0;
        for (int i = 0; i < list.size(); i++) {
            if (element.compareTo(list.get(i)) < 0) {
                counter++;
            }
        }
        return counter;
    }

}
