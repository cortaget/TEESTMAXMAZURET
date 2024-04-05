import java.util.Scanner;

public class Player {
    protected String name;
    protected int level, strengh, inteligent, agility, defense, exp,point,health;
    protected RaceType race;
    protected ClassType classs;
    Scanner scanner = new Scanner(System.in);





    public Player() {
        this.level = 5;
        this.health = level*10;
        strengh = 0;
        this.inteligent = 0;
        this.agility = 0;
        this.defense = 0;
        this.exp = 0;
        point = 5;
    }



    public void createHero(){
        int support;
        System.out.println("Hello whats your name?");
        System.out.println("(enter your name)");
        name = scanner.nextLine();
        System.out.println("Who are you? You are...");
        System.out.println("1) Warrior");
        System.out.println("2) Wizard");
        System.out.println("3) Ranger");
        support = scanner.nextInt();
        switch (support){
            case 1:
                classs = ClassType.WARRIOR;
                break;
            case 2:
                classs = ClassType.WIZARD;
                break;
            case 3:
                classs = ClassType.RANGER;
                break;
        }
        System.out.println("What is your race? You are...");
        System.out.println("1) HUMAN");
        System.out.println("2) ELF");
        System.out.println("3) DARKELF");
        System.out.println("4) TROLL");
        System.out.println("5) ZOMBIE");
        System.out.println("6) DWARF");
        support = scanner.nextInt();
        switch (support){
            case 1:
                race = RaceType.HUMAN;
                break;
            case 2:
                race = RaceType.ELF;
                break;
            case 3:
                race = RaceType.DARKELF;
                break;
            case 4:
                race = RaceType.TROLL;
                break;
            case 5:
                race = RaceType.ZOMBIE;
                break;
            case 6:
                race = RaceType.DWARF;
                break;
        }


    }

    public void levelTransfotmation(){
        if (level*100<exp){
            exp = exp-(level*100);
            level++;
            point+=3;
            levelUp();
        }
    }

    public void levelUp(){
        if (point >0) {
            int support;
            for (int i = 0; i < point; point--) {
                System.out.println(toString());
                System.out.println("What do you want level up? You have [" + point + "]");
                System.out.println("1) strengh");
                System.out.println("2) inteligent");
                System.out.println("3) agility");
                System.out.println("4) defense");
                System.out.println("5) nothing");
                support = scanner.nextInt();
                switch (support) {
                    case 1:
                        strengh++;
                        break;
                    case 2:
                        inteligent++;
                        break;
                    case 3:
                        agility++;
                        break;
                    case 4:
                        defense++;
                        break;
                }
                if (support == 5) {
                    break;
                }
            }
        }
    }

    public RaceType getRace() {
        return race;
    }

    public void setRace(RaceType race) {
        this.race = race;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getStrengh() {
        return strengh;
    }

    public void setStrengh(int strengh) {
        this.strengh = strengh;
    }

    public int getInteligent() {
        return inteligent;
    }

    public void setInteligent(int inteligent) {
        this.inteligent = inteligent;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", level=" + level +
                ", exp=" + exp +
                ", strengh=" + strengh +
                ", inteligent=" + inteligent +
                ", agility=" + agility +
                ", defense=" + defense +
                ", race=" + race +
                ", classs=" + classs +
                ", point=" + point +
                '}';
    }
}
