package RegEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceExtractor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String keyWord = br.readLine();
        String input = br.readLine();
        Pattern pattern = Pattern.compile("[A-Z][\\w\\W]*?\\sis\\s[\\w\\W]*?[.!?]");

        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            if (matcher.group().contains(keyWord)){
                System.out.println(matcher.group());
            }

        }
    }
}
