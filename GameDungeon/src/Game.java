public class Game {
    Player player1 = new Player();
    Enemy enemy = new Enemy();
    public void Gamestart(){



        player1.createHero();
        player1.levelTransfotmation();
        System.out.println(player1);
    }
}
