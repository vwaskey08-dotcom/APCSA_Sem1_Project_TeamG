/**
 * Mira class represents a Demon Hunter character with specific attributes and actions.
 * Implements the DemonHunter interface.
 * 
 * @author 
 * @version 1.0
 */

public class Mira implements DemonHunter{
    
    //----------initalize attributes--------------
    private static String weapon;
    private static int energy;
    private static int popularityLevel;
    private static String hairColor;
    
    /**
     * Constructor for Mira class
     */
    public Mira(){
        weapon = "Gok-do";
        energy = 50;
        popularityLevel = 50;
        hairColor = "Pink";
    }

    //---------------initialize methods-------------------
    
    /**
     * Increases energy by 10, up to a maximum of 100
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
     * Increases energy by 10, up to a maximum of 100
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
     * Decreases energy by 10 and randomly increases or decreases popularity level by 10
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
     * Getter for name
     * @return name of character
     */
    public String getName(){
        return "Mira";
    }

    /**
     * Increases popularity level by 10, up to a maximum of 100, and decreases energy by 10
     */
    public static void rap(){
        if(popularityLevel >= 90){
            popularityLevel = 100;
        }
        else{
            popularityLevel += 10;
        }
        energy -= 10;
    }
}