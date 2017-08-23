package JavaOOPBasic.Encapsulation.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

public class Team {

    private String name;
    private List<Player> players;

    public Team(String name) {
        this.setName(name);
        this.players = new ArrayList<>();
    }

    public boolean addPlayer(Player player){
        return this.players.add(player);
    }

    public boolean removePlayer(String playerName){
        Player player = this.getPlayerByName(playerName);
        if (player == null){
            throw new IllegalArgumentException(String.format("Player %s is not in %s team.",playerName,this.name));
        }
        return this.players.remove(player);
    }

    private double getRating(){
       return this.players.stream().mapToDouble(Player::getSkill)
               .average()
               .orElse(0D);
    }

    @Override
    public String toString() {
        return String.format("%s - %.0f",this.name,this.getRating());
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    private Player getPlayerByName(String name){
       return this.players.stream()
               .filter(p -> p.getName().equals(name))
               .findFirst()
               .orElse(null);
    }
}
