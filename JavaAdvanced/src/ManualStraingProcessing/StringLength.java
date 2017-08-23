package ManualStraingProcessing;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder(input);
        String s = "*";
        if (sb.length() >= 20){
            System.out.println(input.substring(0,20));
        }else if(sb.length() == 20){
            System.out.println(input);
        }else {
            sb.append(new String(new char[20-input.length()]).replace("\0",s));
            System.out.println(sb);
        }
    }
}
