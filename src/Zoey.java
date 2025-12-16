/**
 * Zoey class represents a Demon Hunter character with specific attributes and actions.
 * Implements the DemonHunter interface.
 * 
 * @author Ethan
 * @version 1.0
 */
public class Zoey implements DemonHunter {
    private String weapon;
    private static int energy;
    private static int popularityLevel;
    private String hairColor;
    private String name;
    

    /**
     * Default constructor initializing Zoey's starting attributes.
     */
    public Zoey(){
        this.weapon = "daggers";
        Zoey.energy = 50;
        Zoey.popularityLevel = 50;
        this.hairColor = "black";
        this.name = "Zoey";
    }

    // Getters
    /**
     * Getter for the character's name.
     * @return name of character
     */
    public String getName()
    {
        return name;
    }

    /**
     * Getter for the character's weapon.
     * @return weapon of character
     */
    public String getWeapon()
    {
        return weapon;
    }

    /**
     * Getter for the character's energy level.
     * @return energy of character (0-100)
     */
    public int getEnergy()
    {
        return energy;
    }

    /**
     * Getter for the character's popularity level.
     * @return popularity level of character (0-100)
     */
    public int getPopularityLevel()
    {
        return popularityLevel;
    }

    /**
     * Getter for the character's hair color.
     * @return hair color of character
     */
    public String getHairColor()
    {
        return hairColor;
    }

// actions
    /** 
     * Eat action: Increases energy by 10 (cap at 100).
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
     * Sleep action: Increases energy by 20 (cap at 100).
     */
    public void sleep() {
        if(energy >= 80){
            energy = 100;
        }
        else{
            energy += 20;
        }
    }

    /**
     * Write action: increases popularity (cap at 100) and reduces energy.
     */
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
     * Fight action: decreases energy and randomly affects popularity.
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
     * Returns a string representation of the character's current state.
     * @return formatted character information
     */
    public String toString()
    {
        return "Character: " + name+ "\nWeapon: " + weapon + "\nEnergy: " + energy + "\nPopularity Level: " + popularityLevel + "\nHair Color: " + hairColor;
    }

    public void setEnergy(int energy)
    {
        Zoey.energy = energy;
    }

    /**
     * Getter for popularity (implements DemonHunter.getPopularity).
     * @return current popularity level
     */
    public int getPopularity() {
        return popularityLevel;
    }
}
