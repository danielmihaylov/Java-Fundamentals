package JavaOOPAdvanced.Generics.customListSorted.customListSorted;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        CustomList<String> theList = new CustomListImpl<>();
        while (!"END".equals(line = reader.readLine())) {
            String[] tokens = line.split("\\s+");
            switch (tokens[0]) {
                case "Add":
                    theList.add(tokens[1]);
                    break;
                case "Remove":
                    theList.remove(Integer.parseInt(tokens[1]));
                    break;
                case "Contains":
                    System.out.println(theList.contains(tokens[1]));
                    break;
                case "Swap":
                    theList.swap(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
                    break;
                case "Greater":
                    System.out.println(theList.countGreaterThan(tokens[1]));
                    break;
                case "Max":
                    System.out.println(theList.getMax());
                    break;
                case "Min":
                    System.out.println(theList.getMin());
                    break;
                case "Print":
                    System.out.println(theList);
                    break;
                case "Sort":
                    theList.sort();
                default:
                    break;
            }
        }
    }
}
