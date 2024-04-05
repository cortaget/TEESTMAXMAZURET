public class Race {
    private RaceType raceType;
    private int strenghRace, inteligentRace, agilityRace, defenseRace;

    public void setStats(){
        switch (raceType){
            case DARKELF -> {
                agilityRace = 6;
                inteligentRace = 4;
            }case HUMAN -> {
                strenghRace = 3;
                inteligentRace = 3;
                agilityRace = 4;
            }case ELF -> {
                agilityRace = 4;
                inteligentRace = 6;
            }case DWARF -> {
                strenghRace = 7;
                defenseRace = 3;
            }case TROLL -> strenghRace = 10;
            case ZOMBIE -> inteligentRace = 10;
        }
    }


    public RaceType getRaceType() {
        return raceType;
    }

    public void setRaceType(RaceType raceType) {
        this.raceType = raceType;
    }

    public int getStrenghRace() {
        return strenghRace;
    }

    public void setStrenghRace(int strenghRace) {
        this.strenghRace = strenghRace;
    }

    public int getInteligentRace() {
        return inteligentRace;
    }

    public void setInteligentRace(int inteligentRace) {
        this.inteligentRace = inteligentRace;
    }

    public int getAgilityRace() {
        return agilityRace;
    }

    public void setAgilityRace(int agilityRace) {
        this.agilityRace = agilityRace;
    }

    public int getDefenseRace() {
        return defenseRace;
    }

    public void setDefenseRace(int defenseRace) {
        this.defenseRace = defenseRace;
    }
}
