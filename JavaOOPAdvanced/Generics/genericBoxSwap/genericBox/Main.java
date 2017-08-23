package JavaOOPAdvanced.Generics.genericBoxSwap.genericBox;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Box> boxes = new ArrayList<>();
        Integer n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            Box box = new Box(scanner.nextLine());
            boxes.add(box);
        }
        String[] swap = scanner.nextLine().split(" ");
        Box.swap(boxes,Integer.parseInt(swap[0]),Integer.parseInt(swap[1]));
        for (Box box : boxes) {
            System.out.println(box);
        }
    }
}
