public class Class {
    private ClassType classType;
    private int strenghClass, inteligentClass, agilityClass;

    public void setStats(){
        switch (classType){
            case WARRIOR -> strenghClass = 3;
            case WIZARD -> inteligentClass = 3;
            case RANGER -> agilityClass = 3;
        }
    }

    public ClassType getClassType() {
        return classType;
    }

    public void setClassType(ClassType classType) {
        this.classType = classType;
    }

    public int getStrenghClass() {
        return strenghClass;
    }

    public void setStrenghClass(int strenghClass) {
        this.strenghClass = strenghClass;
    }

    public int getInteligentClass() {
        return inteligentClass;
    }

    public void setInteligentClass(int inteligentClass) {
        this.inteligentClass = inteligentClass;
    }

    public int getAgilityClass() {
        return agilityClass;
    }

    public void setAgilityClass(int agilityClass) {
        this.agilityClass = agilityClass;
    }
}
