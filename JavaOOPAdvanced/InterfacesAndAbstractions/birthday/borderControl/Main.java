package JavaOOPAdvanced.InterfacesAndAbstractions.birthday.borderControl;

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
            if (tokens.length == 3){
                if (tokens[0].equals("Robot")){
                    //Robot robot = new Robot(tokens[1],tokens[2]);
                    //if (!id.contains(robot.getId())){
                       // id.add(robot.getId());
                   // }
                        continue;
                }else if(tokens[0].equals("Pet")){
                    Pet pet = new Pet(tokens[1],tokens[2]);
                    if (!id.contains(pet.getBirthdate())){
                        id.add(pet.getBirthdate());
                    }
                }

            }
            if (tokens.length == 5){
                Citizen citizen = new Citizen(tokens[1],Integer.parseInt(tokens[2]),tokens[3],tokens[4]);
                if (!id.contains(citizen.getBirthdate())){
                    id.add(citizen.getBirthdate());
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

