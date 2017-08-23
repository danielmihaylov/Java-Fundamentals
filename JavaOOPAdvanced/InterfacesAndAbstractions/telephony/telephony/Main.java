package JavaOOPAdvanced.InterfacesAndAbstractions.telephony.telephony;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Smartphone smartphone = new Smartphone("Nokia");
        smartphone.call(scanner.nextLine().trim().split("\\s+"));
        smartphone.browse(scanner.nextLine().split("\\s+",Integer.MAX_VALUE));
    }
}
