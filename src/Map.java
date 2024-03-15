public class Map implements Information{
    private int x,y;

    public Map(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Map{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void showMap(){

        for (int i = 0;i< y;i++){
            for (int l = 0;l< x;l++){
                System.out.print(" "+map[l][i]+" ");
            }
            System.out.println();
        }
    }

}
