import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        //1.g
        //1.i?
    Team team1 = new Team("De Uovervindelige");

     team1.setRank(3);

     Team team2 = new Team ("The Tigers");
     Team team3 = new Team ("The Big Baboons");
     Team team4 = new Team ("The Cringe");
     Team team5 = new Team ("The Boys");
     Team team6 = new Team ("The Rats");

     team2.setRank(2);
     team3.setRank(5);
     team4.setRank(1);
     team5.setRank(4);
     team6.setRank(6);

     System.out.println(team1.toString());
     System.out.println(team2.toString());
     System.out.println(team3.toString());
     System.out.println(team4.toString());
     System.out.println(team5.toString());
     System.out.println(team6.toString());

     team1.addPlayer("Muscle Mark");
     team1.addPlayer("Big Lipped Pete");
     team1.addPlayer("Ronan The Royal");

     System.out.println("After adding the guys: ");
     System.out.println(team1.toString());

    }
}
/*//1.b
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
*/