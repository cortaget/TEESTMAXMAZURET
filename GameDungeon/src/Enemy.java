import java.util.Random;

public class Enemy extends Player implements Data{

    Random random = new Random();





    public Enemy() {
        name = nameGenerator();
        this.level = info[1]+1+random.nextInt(2)-1;
        this.health = level*10;
        strengh = level +random.nextInt(5)-1;
        this.inteligent = level +random.nextInt(5)-1;
        this.agility = level +random.nextInt(5)-1;
        this.defense = level +random.nextInt(5)-1;
        this.exp = (level+1) * (strengh+inteligent+agility+defense);
        classs = classGenerator();
        race = raceGenerator();
    }

    public String nameGenerator(){
        int support = random.nextInt(5);
        switch (support){
            case 0:
                name = String.valueOf(EnemyName.SLIME);
                break;
            case 1:
                name = String.valueOf(EnemyName.GOBLIN);
                break;
            case 2:
                name = String.valueOf(EnemyName.WOLF);
                break;
            case 3:
                name = String.valueOf(EnemyName.VAMPIRE);
                break;
            case 4:
                name = String.valueOf(EnemyName.TROLL);
                break;
        }
        return name;
    }

    public ClassType classGenerator(){
        int support = random.nextInt(2);
        switch (support){
            case 0:
                classs = ClassType.WARRIOR;
                break;
            case 1:
                classs = ClassType.WIZARD;
                break;
            case 2:
                classs = ClassType.RANGER;
                break;
        }
        return classs;
    }
    public RaceType raceGenerator(){
        int support = random.nextInt(2);
        switch (support){
            case 0:
                race = RaceType.HUMAN;
                break;
            case 1:
                race = RaceType.DWARF;
                break;
            case 2:
                race = RaceType.DARKELF;
                break;
            case 3:
                race = RaceType.ELF;
                break;
            case 4:
                race = RaceType.TROLL;
                break;
            case 5:
                race = RaceType.ZOMBIE;
                break;
        }
        return race;
    }





    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", strengh=" + strengh +
                ", inteligent=" + inteligent +
                ", agility=" + agility +
                ", defense=" + defense +
                ", exp=" + exp +
                ", health=" + health +
                ", race=" + race +
                ", classs=" + classs +
                '}';
    }
}
