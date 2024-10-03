import java.util. ArrayList;
public class MainMenu {
    public static void main(String[] args) {

        ArrayList<String> actions = new ArrayList<>();
        actions.add("1) Start game");
        actions.add("2) Resume game");
        actions.add("3) Pause game");
        actions.add("4) End game");
        // System.out.print(actions.get(2)); // expected output: "Pause game"

        GameMenu gamemenu = new GameMenu(actions);


       // gamemenu.displayMenu();
        gamemenu.getAction();

        String userChoice = getAction();
}
public static void doAction(int actions){

    switch(actions) {
  case 1:
    System.out.println("1: Starting the game now");
    break;
  case 2:
    System.out.println("2: Fetching previously saved game data");
    break;
case 3:
    System.out.println("3: Game paused");
    break;
case 4:
    System.out.println("4: Ending game");
    break;
}

}

}