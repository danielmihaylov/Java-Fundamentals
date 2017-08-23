package RegEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernames {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_-]{3,16}$");
        while (!text.equals("END")){
            Matcher matcher = pattern.matcher(text);
            if (matcher.find()){
                System.out.println("valid");
            }else{
                System.out.println("invalid");
            }
            text = br.readLine();
        }
    }
}
