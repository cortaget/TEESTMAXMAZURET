public class Player implements Information{
    private String changePoint;
    public void ChangePoint(int x, int y){
        map[x][y]= changePoint;
    }

    public Player(String changePoint) {
        this.changePoint = changePoint;
    }
}
