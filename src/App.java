import java.util.Scanner;

public class App {

    //creates character based on user choice
    public static DemonHunter create(int choice)
    {
        DemonHunter character = null;
        switch(choice)
        {
            case 1:
                character = new Rumi();
                break; 
            case 2:
                character = new Zoey();
                break;
            case 3:
                character = new Mira();
                break;
            case 4:
                character = new Jinu();
                break;
        }
        
        return character;
    }

    public static void randomEvent()
    {
        int rand = (int)Math.random() * (4 + 1);

        switch (rand)
        {
            case 1:
                //tbd
                break;
            case 2:
                //tbd
                break;
            case 3:
                //tbd
                break;
            case 4:
                //tbd
                break;

        }
       
    }
    


    public static void main(String[] args) throws Exception {
        
        
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome! You are the manager for the K-pop demon hunters.");
        System.out.println("Who would you like to manage?");
        
        System.out.println("1: Rumi, 2: Zoey, 3: Mira, 4: Jinu");
        int characterChoice = input.nextInt();

        DemonHunter character = create(characterChoice);

        // System.out.println(character.getName()); testing stuff



    }

}

//plan 

//create a menu for the user to choose which character to manage == done

//display the character's behaviors 

//while loop 
while(character.energy < 100 && character.energy > 0){
    //something
}
//a way to win and die (ending) satisfy our random event here potentially kim
if (character.energy <= 0 || character.popularity <= 0){
    int random_ending = (int)(Math.random() * (3 - 1 + 1) + 1);
    if (random_ending == 1){
        System.out.println(character.name + " has died from exhaustion. Game Over.");
    }
    elif (random_ending == 2){
        System.out.println("You failed to maintain" + character.name + "'s " + "popularity. The demons have broken the honmoon. Game Over.");
    }
    else {
        System.out.println("The demons have taken over with their new hit song 'Hypnotic'. Game over.");
    }
}

if (character.energy >= 100 || character.popularity >= 100){
    int random_ending = (int)(Math.random() * (3 - 1 + 1) + 1);
    if (random_ending == 1){
        System.out.println("Congratulations! You have successfully managed your K-pop demon hunter to fame and fortune!");
    }
    elif (random_ending == 2){
        System.out.println("You have defeated the demons and restored peace to the honmoon! Victory is yours!");
    }
    else {
        System.out.println(character.name + " has become the ultimate K-pop demon hunter, loved by all!");
    }
}
//kim- if popularity level reaches a certain point you win, if energy level is below a certain point you die, random: random number generator, pick a number, after every while loop add +1 to random int, once it gets to random number do the event
//kim random stuff- int randomEventCounter = 0; (int)(Math.random()*(5-1+1)+1), 


// random events

