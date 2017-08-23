package JavaOOPBasic.Encapsulation.HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Main {
    private static final Map<String,Team> TEAMS = new HashMap<>(3);
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = "";

        while (!"END".equals(line = reader.readLine())){
            String[] commandTokens = line.split(";");
            String command = commandTokens[0];
            String [] commandArgs = Stream.of(commandTokens).skip(1).toArray(String[]::new);
           try{
               switch (command){
                   case "Team":
                       createNewTeam(commandArgs);
                       break;
                   case "Add":
                       addNewPlayer(commandArgs);
                       break;
                   case "Remove":
                       removePlayerFromTeam(commandArgs);
                       break;
                   case "Rating":
                       getTeamRating(commandArgs);
                       break;
               }
           }catch (IllegalArgumentException e){
               System.out.println(e.getMessage());
           }

        }
    }

    private static void getTeamRating(String[] commandArgs) {
        Team team = getTeamByName(commandArgs[0]);
        System.out.println(team);
    }

    private static void removePlayerFromTeam(String[] commandArgs) {
        Team team = getTeamByName(commandArgs[0]);
        team.removePlayer(commandArgs[1]);
    }

    private static void addNewPlayer(String[] commandArgs) {
        //String teamName = commandArgs[0];

        Team team = getTeamByName(commandArgs[0]);
        String playerName = commandArgs[1];
        Double skill2 = Double.parseDouble(commandArgs[2]);
        Double skill3 = Double.parseDouble(commandArgs[3]);
        Double skill4 = Double.parseDouble(commandArgs[4]);
        Double skill5 = Double.parseDouble(commandArgs[5]);
        Double skill6 = Double.parseDouble(commandArgs[6]);
        Player player = new Player(playerName,skill2,skill3,skill4,skill5,skill6);
        team.addPlayer(player);
    }

    private static void createNewTeam(String[] commandArgs) {
        String teamName = commandArgs[0];
        TEAMS.putIfAbsent(teamName,new Team(teamName));
    }

    private static Team getTeamByName(String teamName){
        Team team = TEAMS.getOrDefault(teamName,null);

        if (team == null){
            throw new IllegalArgumentException("Team " + teamName + " does not exist.");
        }
        return team;
    }
}
