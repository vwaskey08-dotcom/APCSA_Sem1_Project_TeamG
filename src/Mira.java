//create Mira class
public class Mira{
    
    //initialize attributes
    private String weapon;
    private int energy;
    private int popularityLevel;
    private String hairColor;
    
    //create constructor
    public Mira(String miraWeapon, int miraEnergy, int miraPopularityLevel, String miraHairColor){
        weapon = miraWeapon;
        energy = miraEnergy;
        popularityLevel = miraPopularityLevel;
        hairColor = miraHairColor;
    }
    
    //initialize methods
    public void eat(){
        if(energy >= 90){
            energy = 100;
        }
        else{
            energy += 10;
        }
    }
    public void sleep(){
        if(energy >= 90){
            energy = 100;
        }
        else{
            energy += 10;
        }
    }
    public void rap(){
        if(popularityLevel >= 90){
            popularityLevel = 100;
        }
        else{
            popularityLevel += 10;
        }
        energy -= 10
    }
    public boolean fight(){
        energy -= 10
        int roll = ((Math.random()*2)+1);
        if(roll == 1){
            popularityLevel += 10
            return true;
        }
        else{
            popularityLevel -= 10
            return false;
        }
    }
    public static demonsWin(){
        final energy;
        final popularityLevel;
    }
    public static honmoonSaved(){
        final energy;
        final popularityLevel;
    }
}