
import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players;
    private int maxSize;
    
    public Team(String name) {
        this.name = name;
        players = new ArrayList<Player>();
        maxSize = 16;
    }
    
    public void addPlayer(Player player) {
        if (size() < maxSize) {
            System.out.println(size());
            players.add(player);
        }      
    }
    
    public void printPlayers() {
        for (Player player : players) {
            System.out.println(player);
        }
    }
    
    public int goals() {
        int totalGoals = 0;
        for (int i = 0; i < size(); i++) {
            totalGoals += players.get(i).goals();
        }
        return totalGoals;
    }
    
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public int size() {
        return players.size();
    }
    
    public String getName() {
        return name;
    }
}
