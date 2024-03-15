public class Player implements Information{
    private int changePoint;
    public void ChangePoint(int x, int y){
        map[x][y]= changePoint;
    }

    public Player(int changePoint) {
        this.changePoint = changePoint;
    }
}
