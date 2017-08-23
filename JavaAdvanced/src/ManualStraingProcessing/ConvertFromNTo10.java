package ManualStraingProcessing;

import java.awt.image.SinglePixelPackedSampleModel;
import java.math.BigInteger;
import java.util.Scanner;

public class ConvertFromNTo10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        StringBuilder baseN = new StringBuilder(input[0]);
        BigInteger base10 = new BigInteger(input[1]);
        String n ="";
        while (base10.compareTo(new BigInteger("0"))>0){
            BigInteger reminder = base10.divideAndRemainder(new BigInteger(input+""))[1];
            BigInteger divide = base10.divideAndRemainder(new BigInteger(input+""))[0];
            baseN.insert(0,reminder);
            base10 =divide;
        }
        System.out.println(baseN);
    }
}
