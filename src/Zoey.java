public class Zoey implements DemonHunter {
    private String weapon;
    private int energy;
    private int popularityLevel;
    private String hairColor;
    private String name;

    //constructor
    /** 
     * Constructor for Zoey character
     * @param weapon weapon of character
     * @param energy energy of character
     * @param popularityLevel popularity level of character
     * @param hairColor hair color of character
     */
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

    // Getters
/**
     * Getter for name
     * @return name of character
     */

public String getName()
{
    return name;
}

/**
 * Getter for weapon
 * @return weapon of character
 */
public String getWeapon()
{
    return weapon;
}

/**
 * Getter for energy
 * @return energy of character
 */
public int getEnergy()
{
    return energy;
}

/**
 * Getter for popularity level
 * @return popularity level of character
 */
public int getPopularityLevel()
{
    return popularityLevel;
}

/**
 * Getter for hair color
 * @return hair color of character
 */
public String getHairColor()
{
    return hairColor;
}

// actions
/** 
 * Increases energy by 10 when eating
 */
    public void eat() {
        energy += 10;
    }
/** 
 * Increases energy by 20 when sleeping
 */
    public void sleep() {
        energy += 20; 
    }
/**
 * Increases popularity level by 5 and decreases energy by 10 when writing
 */
    public void write(){
        popularityLevel += 5;
        energy -= 10;
    }
/**
 * Decreases energy by 15 and popularity level by 10 when fighting
 */
    public void fight(){
        energy -= 15;
        popularityLevel -=10;
    }
/**
 * Returns a string representation of the character
 */
    public String toString()
    {
        return "Character: " + name+ "\nWeapon: " + weapon + "\nEnergy: " + energy + "\nPopularity Level: " + popularityLevel + "\nHair Color: " + hairColor;
    }

    
 // if energy reaches 0, demons win
    //public void demonsWin(){
        //energy = 0;
        //popularityLevel = 0;
        //System.out.println("The demons have won! The honmoon is destroyed!");
    //}

    // if popularityLevel reaches 500, honmoon is saved
    //public void honmoonSaved(){
        //popularityLevel = 500;
        //System.out.println("The honmoon is saved!");
        // gjhkhkjh
   // }
}
