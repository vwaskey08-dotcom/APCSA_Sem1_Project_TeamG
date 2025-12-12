/**
 * Creates a basic Jinu class \
 * Implements the DemonHunter interface
 * @author Julia Lockwood
 * @version 1.0
 */
public class Jinu implements DemonHunter{
    
    //----------initalize attributes--------------
    String weapon;
    int energy;
    int popularityLevel;
    String hairColor;
    String name;
    
    //--------------create constructor---------------
    public Jinu(String weapon, int energy, int popularityLevel, String hairColor){
        this.weapon = weapon;
        this.energy = energy;
        this.popularityLevel = popularityLevel;
        this.hairColor = hairColor;
    }
    
    public Jinu(){
        this.weapon = "white paper fan";
        this.energy = 50;
        this.popularityLevel = 50;
        this.hairColor = "Black";
        this.name = "Jinu";
    }
    
    //violet added a getter method to test stuff

    public String getName()
    {
        return name;
    }


    //---------------initialize methods-------------------

    /**
     * Increases energy by 10
     */
    public void eat(){
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
    public void sleep(){
        if(energy >= 80){
            energy = 100;
        }
        else{
            energy += 20;
        }
    }

    /**
     * Decreases energy by 15 and popularity level by 10
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
     * Increases popularity level by 15 and decrease energy by 10
     */
    public void dance(){
        if(popularityLevel >= 90){
            popularityLevel = 100;
        }
        else{
            popularityLevel += 10;
        }
        energy -= 10;
    }

    /**
     * Returns Jinu's attributes as a string
     * @return String of Jinu's attributes
     */
    public String toString(){
        return ("Jinu's weapon: " + weapon + "\nJinu's energy level: " + energy + "\nJinu's popularity level: " + popularityLevel + "\nJinu's hair color: " + hairColor);
    }

    //---------------initalize getter methods----------------------------

    /**
     * Gets weapon
     * @return weapon
     */
    public String getWeapon(){
        return weapon;
    }

    /**
     * Gets energy
     * @return energy
     */
    public int getEnergy(){
        return energy;
    }

    /**
     * Gets popularity level
     * @return popularity level
     */
    public int getPopularityLevel(){
        return popularityLevel;
    }

    /**
     * Gets hair color
     * @return hair color
     */
    public String getHairColor(){
        return hairColor;
    }

    /**
     * Gets name
     * @return name
     */
    public String getName(){
        return "Jinu";
    }

    //------------------initalize setter methods---------------------------

    /**
     * Sets weapon
     * @param weapon
     */
    public void setWeapon(String weapon){
        this.weapon = weapon;
    }

    /**
     * Sets energy
     * @param energy
     */
    public void setEnergy(int energy){
        this.energy = energy;
    }

    /**
     * Sets popularity level
     * @param popularityLevel
     */
    public void setPopularityLevel(int popularityLevel){
        this.popularityLevel = popularityLevel;
    }

    /**
     * Sets hair color
     * @param hairColor
     */
    public void setHairColor(String hairColor){
        this.hairColor = hairColor;
    }
}
