package JavaSyntax;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double kilometres = scanner.nextDouble();
        String dayOrNight = scanner.next();
        Double taxiRate = 0.79;

        if (dayOrNight.equals("night")){
            taxiRate = 0.9;
        }
        if (kilometres<20){
            System.out.printf("%.2f",0.7 + (kilometres*taxiRate));
        }else if(kilometres <100){
            System.out.printf("%.2f",kilometres*0.09);
        }else{
            System.out.printf("%.2f",kilometres *0.06);
        }
    }
}