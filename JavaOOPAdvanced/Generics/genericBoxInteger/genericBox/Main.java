package JavaOOPAdvanced.Generics.genericBoxInteger.genericBox;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Box> boxes = new ArrayList<>();
        Integer n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            Box box = new Box(Integer.parseInt(scanner.nextLine()));
            boxes.add(box);
        }
        for (Box box : boxes) {
            System.out.println(box);
        }
    }
}
