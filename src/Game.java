public class Game {
    Player player1 = new Player("x");
    Player player2 = new Player("o");
    Map map = new Map(3,3);
    public void start(){
        map.showMap();
        player1.ChangePoint(1,1);
        map.showMap();
    }
}
