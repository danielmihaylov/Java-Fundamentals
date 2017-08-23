package SetsAndMaps;

import java.util.*;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        Map<String, List<String>> personalEmail = new LinkedHashMap<>();
        while (!"stop".equals((name = scanner.nextLine()))) {
            String email = scanner.nextLine();
            int dotIndex = email.lastIndexOf('.');
            String domein = email.substring(dotIndex + 1);

            switch (domein.toLowerCase()) {
                case "uk":
                case "us":
                case "com":
                    continue;
            }
            if (!personalEmail.containsKey(name)) {
                personalEmail.put(name, new ArrayList<>());
            }
            personalEmail.get(name).add(email);
        }
        for (Map.Entry<String, List<String>> entry : personalEmail.entrySet()) {
            System.out.printf("%s -> %s%n",entry.getKey(),String.join(", ",entry.getValue()));
        }
    }
}