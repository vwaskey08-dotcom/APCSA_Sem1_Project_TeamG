/**
 * Rumi class representing a Demon Hunter character
 * Implements the DemonHunter interface
 * 
 * @author Violet Waskey
 * @version 1.0
 */
public class Rumi implements DemonHunter{
    
    ///----------initalize attributes--------------
    private String weapon;
    private int energy;
    private int popularityLevel; 
    private String hairColor;
    private String name;

    /**
     * Constructor for Rumi class
     */
    public Rumi()
    {
        this.weapon = "Saingeom";
        this.energy = 50;
        this.popularityLevel = 50;
        this.hairColor = "Bright Purple";
        this.name = "Rumi";
    }
    
    //--------------getter methods-------------------

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



    //--------------setter methods-------------------

    /**
     * Increases energy by 10
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
     * Increases energy by 20
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
     * Decreases energy by 15 
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
     * Increases popularity level by 5
     */
    public void sing()
    {
        if(popularityLevel >= 90){
            popularityLevel = 100;
        }
        else{
            popularityLevel += 10;
        }
        energy -= 10;
    }

    /**
     * toString method to display character information
     */
    public String toString()
    {
        return "Character: " + name+ "\nWeapon: " + weapon + "\nEnergy: " + energy + "\nPopularity Level: " + popularityLevel + "\nHair Color: " + hairColor;
    }

}
