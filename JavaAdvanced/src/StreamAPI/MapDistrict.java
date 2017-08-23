package StreamAPI;

import java.util.*;

public class MapDistrict {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String,List<Integer>> cities = new HashMap<>();
        String[] tokens = scanner.nextLine().split(" ");
        int limit = Integer.parseInt(scanner.nextLine());
        for (String token : tokens) {
            String[] cityArgs = token.split(":");
            String cityName = cityArgs[0];
            int population = Integer.parseInt(cityArgs[1]);

            cities.putIfAbsent(cityName, new ArrayList<>());
            cities.get(cityName).add(population);

        }
        cities.entrySet().stream()
                .filter(x -> x.getValue().stream().mapToInt(Integer::valueOf).sum() > limit)
                .sorted((e1,e2) -> Integer.compare(
                        e2.getValue().stream().mapToInt(Integer::valueOf).sum(),
                        e1.getValue().stream().mapToInt(Integer::valueOf).sum())
                        )
                .forEach(e -> {
                    System.out.printf("%s: ",e.getKey());
                    e.getValue().stream()
                            .sorted((n1,n2)-> Integer.compare(n2,n1))
                            .limit(5)
                            .forEach(d-> System.out.print(d + " "));
                    System.out.println();
                });
    }
}
