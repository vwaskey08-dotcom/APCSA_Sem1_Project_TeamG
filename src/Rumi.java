public class Rumi implements DemonHunter{
    
    private String weapon;
    private int energy;
    private int popularityLevel; //if popularity falls below a certain point than the band breaks up 
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



    // Actions

    /**
     * Increases energy by 10
     */
    public void eat() {
        energy += 10;
    }

    /**
     * Increases energy by 20
     */
    public void sleep() {
        energy += 20; 
    }

    /**
     * Decreases energy by 15 
     */
    public void fight(){
        energy -= 15;
        popularityLevel -= 10;
    }

    /**
     * Increases popularity level by 5
     */
    public void sing()
    {
        popularityLevel += 15;
        energy -= 10;
    }

    /**
     * toString method to display character information
     */
    public String toString()
    {
        return "Character: " + name+ "\nWeapon: " + weapon + "\nEnergy: " + energy + "\nPopularity Level: " + popularityLevel + "\nHair Color: " + hairColor;
    }



    // public static String honmoonLevel()
    // {
    //     if (honmoonLevel <= 0)
    //     {
    //         return "Honmoon has failed, demons have won";
    //     }
    //     else if (honmoonLevel >= 10)
    //     {
    //         return "Golden honmoon achieve, demons have lost";
    //     }
    //     else
    //     {
    //         return "Honmoon level is: " + honmoonLevel + ".";
    //     }
    // }



}
