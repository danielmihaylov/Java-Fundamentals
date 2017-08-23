package ManualStraingProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Palindromes {
    public static void main(String[] args) throws IOException {
        Stack<String> list = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = scanner.nextLine().split(" ");//split(",|.|\\?|!|s+");
        String reversed = "";
        for (String word : input) {
            int length = word.length();
            for (int i = length-1; i >=0 ; i--) {
                reversed = reversed + word.charAt(i);
                if (word.equals(reversed)){
                    list.add(word);
                }
            }
        }
        for (String s : list) {
            System.out.println(s);
        }
        //System.out.println(set.size());
    }
}
