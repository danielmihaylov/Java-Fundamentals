package RegEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelCount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        Pattern pattern = Pattern.compile("[EUIOAYyeuioa]");
        Matcher matcher = pattern.matcher(text);
        int counter = 0;
        while (matcher.find()){
            counter++;
        }
        System.out.println("Vowels: " + counter);
    }
}
