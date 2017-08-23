package SetsAndMaps;

import javax.security.sasl.SaslClient;
import java.lang.reflect.Array;
import java.util.*;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));
        HashSet<String> reqular = new HashSet<>();
        TreeSet<String> vip = new TreeSet<>();
        while (true) {
            String input = scanner.nextLine();
            if ("PARTY".equals(input)) {
                break;
            }
            if (numbers.contains(input.charAt(0))){
                vip.add(input);
            }else{
                reqular.add(input);
            }
        }
        while (true){
            String guestsCome = scanner.nextLine();
            if ("END".equals(guestsCome)){
                break;
            }
            if (numbers.contains(guestsCome.charAt(0))){
                vip.remove(guestsCome);
            }else{
                reqular.remove(guestsCome);
            }
        }
        vip.addAll(reqular);

        System.out.println(vip.size());
        for (String s : vip) {
            System.out.println(s);
        }
    }
}