import java.util.Scanner;

public class Player implements Information{
    Scanner scanner = new Scanner(System.in);
    private int x1,y1;
    private int changeP;

    public Player(int changeP) {
        this.changeP = changeP;
    }

    public void changePoint(int x, int y){
        map[x][y]= changeP;
    }

    public void playerChoose(){
        while (true){
            int coardinates;
            coardinates = scanner.nextInt();
            x1 = coardinates;
            coardinates = scanner.nextInt();
            y1 = coardinates;
            if (map[x1][y1]==0){
                changePoint(x1,y1);
                break;
            }else {
                System.out.println("you can't do this!!! Fucking cheater!!!!!REPIT");
            }
        }


    }



    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getChangeP() {
        return changeP;
    }

    public void setChangeP(int changeP) {
        this.changeP = changeP;
    }
}
