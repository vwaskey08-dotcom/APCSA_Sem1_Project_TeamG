public class Zoey implements DemonHunter {
    
    private String weapon;
    private int energy;
    private int popularityLevel;
    private String hairColor;
    private String name;

    //constructor
    public Zoey(){
        this.weapon = "daggers";
        this.energy = 50;
        this.popularityLevel = 100;
        this.hairColor = "black";
        this.name = "Zoey";
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
    public void eat() {
        energy += 10;
    }

    public void sleep() {
        energy += 20; 
    }

    public void write(){
        popularityLevel += 5;
        energy -= 10;
    }

    public void fight(){
        energy -= 15;
        popularityLevel -=10;
    }

    public String toString()
    {
        return "Character: " + name+ "\nWeapon: " + weapon + "\nEnergy: " + energy + "\nPopularity Level: " + popularityLevel + "\nHair Color: " + hairColor;
    }


}
