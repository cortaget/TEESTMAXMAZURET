public class Game {
    Player player1 = new Player(1);
    Player player2 = new Player(2);
    Map map = new Map(3,3);
    public void start(){
        map.showMap();
        while (true){
            player1.playerChoose();
            map.showMap();
            player2.playerChoose();
            map.showMap();
        }



    }
}
