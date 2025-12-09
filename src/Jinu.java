//create jinu class with demon hunter interface
public class Jinu implements DemonHunter{
    //initalize attributes
    String weapon;
    int energy;
    int popularityLevel;
    String hairColor;
    
    //initialize methods
    public void eat(){
        energy += 10;
    }

    public void sleep(){
        energy += 20;
    }

    public void fight(){
        energy -= 15;
        popularityLevel -= 10;
    }

    public void dance(){
        popularityLevel += 15;
        energy -= 10;
    }

    //create constructor
    public Jinu(){
        this.weapon = "white paper fan";
        this.energy = 50;
        this.popularityLevel = 50;
        this.hairColor = "Black";
    }
}
