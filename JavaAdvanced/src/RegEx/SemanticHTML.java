package RegEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SemanticHTML {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Pattern openDiv = Pattern.compile("(<div).*?(\\s*(?:id|class)(?:\\s*=\\s*\")(\\w+)\")");
        Pattern closeDiv = Pattern.compile("(<\\/div>\\s*<!--\\s*(\\w+)\\s*-->)");

        String line = "";
        while (!"END".equals(line = reader.readLine())){
            Matcher open = openDiv.matcher(line);
            Matcher close = closeDiv.matcher(line);
            while (open.find()){
                line = line.replace(open.group(1), "<" + open.group(3));
                line = line.replace(open.group(2), "");
                line.replaceAll("\\s+>", ">");
                line.replaceAll("\\s+", " ");
            }
            while (close.find()){
                line = line.replace(close.group(1), "</" + close.group(2) + ">");
            }
            System.out.println(line);
        }
    }
}
