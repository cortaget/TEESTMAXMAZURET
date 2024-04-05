public class Game {
    Player player1 = new Player();
    Enemy enemy = new Enemy();
    Enemy enemy1 = new Enemy();
    Enemy enemy2 = new Enemy();
    Enemy enemy3 = new Enemy();
    Enemy enemy4 = new Enemy();
    Enemy enemy5 = new Enemy();
    Enemy enemy6 = new Enemy();
    public void Gamestart(){
        System.out.println(enemy);
        System.out.println(enemy1);
        System.out.println(enemy2);
        System.out.println(enemy3);
        System.out.println(enemy4);
        System.out.println(enemy5);
        System.out.println(enemy6);



        player1.createHero();
        player1.levelTransfotmation();
        System.out.println(player1);
    }
}
