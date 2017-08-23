package SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int value = 0;
        LinkedHashMap<String,Integer> result = new LinkedHashMap<>();
        while (!input.equals("stop")){
            value = Integer.parseInt(scanner.nextLine());
            if (!result.containsKey(input)){
                result.put(input,value);
            }else{
                result.put(input,result.get(input)+ value);

            }
            input = scanner.nextLine();
        }
        for (String s : result.keySet()) {
            System.out.println(s + " -> " + result.get(s));
        }
    }
}