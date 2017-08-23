package JavaOOPBasic.Encapsulation.Lab;

import javax.swing.*;
import javax.swing.Box;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double length = Double.parseDouble(scanner.nextLine());
        Double width = Double.parseDouble(scanner.nextLine());
        Double height = Double.parseDouble(scanner.nextLine());

        Double surfaceArea = (2*length*width) + (2*length*height) + (2*width*height);
        Double leteralSurfaceArea = (2*length*height) + (2*width*height);
        Double volume = length*width*height;

        javax.swing.Box box = new javax.swing.Box(length,width,height);
        Class boxClass = Box.class;
        Field[] fields = boxClass.getDeclaredFields();
        System.out.println(Arrays.asList(fields)
                .stream()
                .filter(f -> Modifier.isPrivate(f.getModifiers())).count());

        System.out.printf("Surface Area - %.2f%n",surfaceArea);
        System.out.printf("Leteral Surface Area - %.2f%n",leteralSurfaceArea);
        System.out.printf("Volume - %.2f%n",volume);


    }
}
