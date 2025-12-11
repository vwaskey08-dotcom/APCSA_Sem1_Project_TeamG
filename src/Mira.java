public class Mira implements DemonHunter{
    private static String weapon;
    private static int energy;
    private static int popularityLevel;
    private static String hairColor;
    public Mira(String miraWeapon, int miraEnergy, int miraPopularityLevel, String miraHairColor){
        weapon = "Gok-do";
        energy = 50;
        popularityLevel = 50;
        hairColor = "Pink";
    }
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
    public void getName(){
        System.out.println("Mira");
    }
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
