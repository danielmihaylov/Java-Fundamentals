package JavaSyntax;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by Daniel on 23.8.2017 г..
 */
public class EuroTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double quantity = scanner.nextDouble();
        BigDecimal priceInKilo = new BigDecimal(quantity*1.2);
        BigDecimal priceInMarks = new BigDecimal("4210500000000");
        BigDecimal priceInLeva = priceInMarks.multiply(priceInKilo);

        System.out.printf("%.2f marks",priceInLeva);
    }
}
