public class Zoey {
    private String weapon;
    private int energy;
    private int popularityLevel;
    private String hairColor;

    //constructor
    public Zoey(String weapon, int energy, int popularityLevel, String hairColor){
        this.weapon = weapon;
        this.energy = energy;
        this.popularityLevel = popularityLevel;
        this.hairColor = hairColor;
    }

    public void eat() {
        energy += 10;
    }

    public void sleep() {
        energy += 20; 
    }

    public void write(){
        popularityLevel += 5;
    }

    public void fight(){
        energy -= 15;
    }
    
    // this is too complicated
}
