package ManualStraingProcessing;

import java.util.Scanner;

public class FormatingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int a = Integer.parseInt(input[0]);
        double b = Double.parseDouble(input[1]);
        double c = Double.parseDouble(input[2]);
        String hexadecimal = Integer.toHexString(a);
        String bynary = Integer.toString(a,2).toUpperCase();
        StringBuilder sb = new StringBuilder();
        while (bynary.length()<10){
            bynary = "0" + bynary;
        }
        if (bynary.length() > 10){
            bynary = bynary.substring(0,10);
        }
        if (input.length >0){
            sb.append("|").append(String.format("%-10X",a));
            sb.append("|").append(String.format("%s",bynary));
            sb.append("|").append(String.format("%10.2f",b));
            sb.append("|").append(String.format("%-10.3f",c));
            sb.append("|");
        }
        System.out.println(sb);
    }
}
