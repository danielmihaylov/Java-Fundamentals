package SetsAndMaps;

import java.util.HashSet;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> parkingLot = new HashSet<>();
        while (true){
            String input = scanner.nextLine();
            if (input.equals("END")) {
                break;
            }else{
                String[] reminder = input.split(", ");
                if (reminder[0].equals("IN")){
                    parkingLot.add(reminder[1]);
                }else{
                    parkingLot.remove(reminder[1]);
                }
            }
        }
        if (parkingLot.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else{
            for (String s : parkingLot) {
                System.out.println(s);
            }
        }
    }
}