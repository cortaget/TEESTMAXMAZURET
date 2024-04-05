import java.util.Random;

public class Enemy extends Player implements Data{

    Random random = new Random();





    public Enemy() {
        name = nameGenerator();
        this.level = info[1]+random.nextInt(2)-1;
        this.health = level*10;
        strengh = level +random.nextInt(5)-1;
        this.inteligent = level +random.nextInt(5)-1;
        this.agility = level +random.nextInt(5)-1;
        this.defense = level +random.nextInt(5)-1;
        this.exp = level * random.nextInt(50);
        point = 5;
    }

    public String nameGenerator(){
        int support = random.nextInt(5);
        switch (support){
            case 0:
                name = String.valueOf(MonsterName.SLIME);
                break;
            case 1:
                name = String.valueOf(MonsterName.GOBLIN);
                break;
            case 2:
                name = String.valueOf(MonsterName.WOLF);
                break;
            case 3:
                name = String.valueOf(MonsterName.VIMPARE);
                break;
            case 4:
                name = String.valueOf(MonsterName.TROLL);
                break;
        }
        return name;
    }


    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

}
