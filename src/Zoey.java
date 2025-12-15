/**
 * Zoey class represents a Demon Hunter character with specific attributes and actions.
 * Implements the DemonHunter interface.
 * 
 * @author
 * @version 1.0
 */
public class Zoey implements DemonHunter {
    private String weapon;
    private static int energy;
    private static int popularityLevel;
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
    

    

    public Zoey(){
        this.weapon = "daggers";
        Zoey.energy = 50;
        Zoey.popularityLevel = 100;
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
        if(energy >= 90){
            energy = 100;
        }
        else{
            energy += 10;
        }
    }
/** 
 * Increases energy by 20 when sleeping
 */
    public void sleep() {
        if(energy >= 80){
            energy = 100;
        }
        else{
            energy += 20;
        }
    }

    public static void write(){
        if(popularityLevel >= 90){
            popularityLevel = 100;
        }
        else{
            popularityLevel += 10;
        }
        energy -= 10;
    }
/**
 * Decreases energy by 15 and popularity level by 10 when fighting
 */
    public void fight(){
        energy -= 10;
        int roll = (int)((Math.random()*2)+1);
        if(roll == 1){
            popularityLevel += 10;
        }
        else{
            popularityLevel -= 10;
        }
    }
/**
 * Returns a string representation of the character
 */
    public String toString()
    {
        return "Character: " + name+ "\nWeapon: " + weapon + "\nEnergy: " + energy + "\nPopularity Level: " + popularityLevel + "\nHair Color: " + hairColor;
    }


    /**
     * Getter for popularity    
     */
    public int getPopularity() {
        return popularityLevel;
    }
}
