public class Rumi implements DemonHunter{
    
    private String weapon;
    private int energy;
    private int popularityLevel; //if popularity falls below a certain point than the band breaks up 
    private String hairColor;
    private static int honmoonLevel = 5;
    private String name = "Rumi";

    // public Rumi (String weapon, int energy, int popularityLevel, String hairColor)
    // {
    //     this.weapon = weapon;
    //     this.energy = energy;
    //     this.popularityLevel = popularityLevel;
    //     this.hairColor = hairColor;
    // }

    public Rumi()
    {
        this.weapon = "blank";
        this.energy = 0;
        this.popularityLevel = 0;
        this.hairColor = "blank";
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void eat() {
        energy += 10;
    }

    public void sleep() {
        energy += 20; 
    }

    public void fight(){
        energy -= 15;
    }

    public void sing()
    {
        popularityLevel += 5;
        honmoonLevel += 2;
    }

    public static String honmoonLevel()
    {
        if (honmoonLevel <= 0)
        {
            return "Honmoon has failed, demons have won";
        }
        else if (honmoonLevel >= 10)
        {
            return "Golden honmoon achieve, demons have lost";
        }
        else
        {
            return "Honmoon level is: " + honmoonLevel + ".";
        }
    }


}
