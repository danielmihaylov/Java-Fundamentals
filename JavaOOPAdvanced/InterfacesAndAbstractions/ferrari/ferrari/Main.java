package JavaOOPAdvanced.InterfacesAndAbstractions.ferrari.ferrari;

import java.lang.instrument.IllegalClassFormatException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalClassFormatException {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String ferrariName = Ferrari.class.getSimpleName();
        String carInterface = Car.class.getSimpleName();
        Ferrari ferrari = new Ferrari("488-Spider","Brakes!","Zadu6avam sA!",name);
        boolean isCreated = Car.class.isInterface();
        if (!isCreated) {
            throw new IllegalClassFormatException("No interface created!");
        }else{
            System.out.printf("%s/%s/%s/%s",ferrari.getModel()
                    ,ferrari.getBrakes()
                    ,ferrari.pushTheGasPedal()
                    ,name);
        }
    }
}
