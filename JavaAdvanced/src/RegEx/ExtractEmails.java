package RegEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Pattern pattern = Pattern.compile("\\b(?<!\\S)[a-z][a-z0-9\\.\\-_]+[a-z0-9]*@[a-z][a-z\\-]+\\.[a-z][a-z\\.]+[a-z]?\\b");
        while (!"end".equals(input)){
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()){
                System.out.println(matcher.group());
            }
            input = br.readLine();
        }
    }
}
