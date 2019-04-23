
import java.util.ArrayList;


public class Team {
    private String teamName;
    private ArrayList<Player> players = new ArrayList<Player>();
    private int teamMaxSize = 16;
    
    public Team (String name) {
        this.teamName = name;
    }

    public String getName() {
        return teamName;
    }
    
    public void addPlayer (Player player) {
        if (this.players.size() < teamMaxSize) {
            this.players.add(player);
        }
    }

    public void printPlayers() {
        String playersAsString = "";
        for (Player player : this.players) {
            playersAsString += player + "\n";
        }
        System.out.println(playersAsString);
    }
    
    public void setMaxSize (int maxSize) {
        this.teamMaxSize = maxSize;
    }
    
    public int size() {
        return players.size();
    }
    
    public int goals() {
        int totalGoals = 0;
        for (Player player : players) {
            totalGoals += player.goals();
        }
        return totalGoals;
    }
}
