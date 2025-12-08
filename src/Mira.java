public class Mira{
    private String weapon;
    private int energy;
    private int popularityLevel;
    private String hairColor;
    public Mira(String miraWeapon, int miraEnergy, int miraPopularityLevel, String miraHairColor){
        weapon = "Gok-do";
        energy = 50;
        popularityLevel = 50;
        hairColor = "Pink";
    }
    public static void eat(){
        if(energy >= 90){
            energy = 100;
        }
        else{
            energy += 10;
        }
    }
    public static void sleep(){
        if(energy >= 90){
            energy = 100;
        }
        else{
            energy += 10;
        }
    }
    public static rap(){
        if(popularityLevel >= 90){
            popularityLevel = 100;
        }
        else{
            popularityLevel += 10;
        }
        energy -= 10;
    }
    public boolean fight(){
        int roll = ((Math.random()*2)+1);
        energy -= 10;
        int roll = (int)((Math.random()*2)+1);
        if(roll == 1){
            popularityLevel += 10;
            return true;
        }
        else{
            popularityLevel -= 10;
            return false;
        }
    }
    public static void demonsWin(){
        final energy;
        final popularityLevel;
    }
    public static void honmoonSaved(){
        final energy;
        final popularityLevel;
    }
}