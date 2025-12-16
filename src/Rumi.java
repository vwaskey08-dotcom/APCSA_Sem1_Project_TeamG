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
    private static int energy;
        private static int popularityLevel; 
        private String hairColor;
        private String name;
    
        /**
         * Constructor for Rumi class. Initializes default attributes.
         */
        public Rumi()
        {
            this.weapon = "Saingeom";
            Rumi.energy = 50;
            Rumi.popularityLevel = 50;
            this.hairColor = "Bright Purple";
            this.name = "Rumi";
        }
        
        //--------------getter methods-------------------
    
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
     * Getter for the character's energy.
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
        public int getPopularity()
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
    
    
    
        //--------------action methods-------------------

        /**
         * Eat action: increases energy by 10 (cap at 100).
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
         * Sleep action: increases energy by 20 (cap at 100).
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
         * Fight action: decreases energy and randomly adjusts popularity.
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
         * Sing action: increases popularity (cap at 100) and reduces energy.
         */
        public static void sing()
        {
            if(popularityLevel >= 90){
                popularityLevel = 100;
            }
            else{
                popularityLevel += 10;
            }
            energy -= 10;
    }

    public void setEnergy(int energy)
    {
        Rumi.energy = energy;
    }

    /**
     * Returns a human-readable summary of Rumi's attributes.
     * @return formatted character information
     */
    public String toString()
    {
        return "Character: " + name+ "\nWeapon: " + weapon + "\nEnergy: " + energy + "\nPopularity Level: " + popularityLevel + "\nHair Color: " + hairColor;
    }

}
