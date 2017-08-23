package JavaOOPAdvanced.Generics.threeUple.threeUple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Threeuple> threeuples = new ArrayList<>();
        threeuples.add(getFirstThreeuple(reader));
        threeuples.add(getSecondThreeuple(reader));
        threeuples.add(getThirdThreeuple(reader));


        for (Threeuple threeuple1 : threeuples) {
            System.out.println(threeuple1);
        }
    }

    private static Threeuple getThirdThreeuple(BufferedReader reader) throws IOException {
        String[] line = reader.readLine().split("\\s+");
        String name = line[0];
        Double accBalance = Double.valueOf(line[1]);
        String bankName = line[2];

        return new ThreeupleImpl<>(name, accBalance, bankName);
    }

    private static Threeuple getSecondThreeuple(BufferedReader reader) throws IOException {
        String[] line = reader.readLine().split("\\s+");
        String name = line[0];
        Integer beerLtrs = Integer.valueOf(line[1]);
        boolean drankOrNot = line[2].equals("drunk");

        return new ThreeupleImpl<>(name, beerLtrs, drankOrNot);
    }

    private static Threeuple getFirstThreeuple(BufferedReader reader) throws IOException {
        String[] line = reader.readLine().split("\\s+");
        String name = line[0] + " " + line[1];
        String adress = line[2];
        String town = line[3];

        return new ThreeupleImpl<>(name, adress, town);
    }

}
