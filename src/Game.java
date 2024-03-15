public class Game {
    Player player1 = new Player(1);
    Player player2 = new Player(2);
    Map map = new Map(3,3);
    public void start(){
        map.showMap();
        player1.ChangePoint(0,1);
        System.out.println();
        map.showMap();
    }
}
