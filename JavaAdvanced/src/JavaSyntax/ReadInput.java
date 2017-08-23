package JavaSyntax;

import java.util.Scanner;

/**
 * Created by Daniel on 23.8.2017 г..
 */
public class ReadInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.next();
        String word2 = scanner.next();

        Integer num1 = scanner.nextInt();
        Double num2 = scanner.nextDouble();
        Double num3 = scanner.nextDouble();

        String word3 = scanner.next();

        Integer result =(int) (num1+num2+num3);

        System.out.println(word1 + " " + word2 + " " + word3 + " " + result);
    }
}
