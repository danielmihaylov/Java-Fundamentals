package SetsAndMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String ,String> phonebook = new LinkedHashMap<>();
        while (true){
            String[] input = scanner.nextLine().split("-");
            if ("search".equals(input[0])){
                break;
            }
            if (!phonebook.containsKey(input[0])){
                phonebook.put(input[0],input[1]);
            }
        }
        while (true){
            String command = scanner.nextLine();
            if ("stop".equals(command)){
                break;
            }
            if (phonebook.containsKey(command)){
                System.out.printf("%s -> %s\n",command,phonebook.get(command));
            }else{
                System.out.printf("Contact %s does not exist.\n",command);
            }
        }
    }
}