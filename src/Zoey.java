public class Zoey implements DemonHunter {
    private String weapon;
    private int energy;
    private int popularityLevel;
    private String hairColor;

    //constructor
    public Zoey(String weapon, int energy, int popularityLevel, String hairColor){
        this.weapon = "daggers";
        this.energy = 50;
        this.popularityLevel = 100;
        this.hairColor = "black";
    }

    //violet added a constructor with no parameters to test code in App.java

    public Zoey(){
        this.weapon = "daggers";
        this.energy = 50;
        this.popularityLevel = 100;
        this.hairColor = "black";
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
    //violet added a getter method to test stuff
    public String getName()
    {
        return "Zoey";
    }

    
    // if energy reaches 0, demons win
    public void demonsWin(){
        energy = 0;
        popularityLevel = 0;
        System.out.println("The demons have won! The honmoon is destroyed!");
    }

    // if popularityLevel reaches 500, honmoon is saved
    public void honmoonSaved(){
        popularityLevel = 500;
        System.out.println("The honmoon is saved!");
        // gjhkhkjh
    }
}
