package JavaSyntax;


import java.util.Scanner;

public class FormatingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer a = scanner.nextInt();
        Double b = scanner.nextDouble();
        Double c = scanner.nextDouble();
        String hex = Integer.toHexString(a).toUpperCase();
        String binary = String.format("%10s",Integer.toBinaryString(a)).replace(" ","0");

        System.out.printf("|%-10s|%s|%10.2f|%-10.3f|",hex,binary,b,c);
    }
}