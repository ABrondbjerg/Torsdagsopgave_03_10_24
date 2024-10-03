import java.util.ArrayList;

public class Team {
    //1.c
    private String teamName;
    //1.d
    private int rank;
    //1.e
    private ArrayList<String> players;

//1.f
public Team(String teamName){
    this.teamName = teamName;
    this.players = new ArrayList<>();
}
//1.h
public void setRank(int rank){

    this.rank = rank;

}

public void addPlayer(String playerName){

    players.add(playerName);
}

//1.k
public String toString(){

    String result = "Team: " + teamName + " Rang: " + rank;

    if (!players.isEmpty()){
        result += " Players: ";
        for(String player : players){
            result += player + "\n";
        }
    }

    return result;
}


}