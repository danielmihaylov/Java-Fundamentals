package JavaOOPAdvanced.InterfacesAndAbstractions.borderControl.borderControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> id = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while (!"End".equals(line = reader.readLine())) {
            String[] tokens = line.split("\\s+");
            if (tokens.length == 2){
                Robot robot = new Robot(tokens[0],tokens[1]);
                if (!id.contains(robot.getId())){
                    id.add(robot.getId());
                }
            }
            if (tokens.length == 3){
                Citizen citizen = new Citizen(tokens[0],Integer.parseInt(tokens[1]),tokens[2]);
                if (!id.contains(citizen.getId())){
                    id.add(citizen.getId());
                }
            }
        }
        String end = reader.readLine();
        for (String s : id) {
            if (s.endsWith(end)){
                System.out.println(s);
            }
        }
    }
}

