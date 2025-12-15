import java.util.Scanner;
/**
 * 'App' class to run the K-pop Demon Hunter Manager game
 */
public class App {

    /**
     * Create a DemonHunter character based on user choice
     * @param choice
     * @return DemonHunter
     */

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

    /**
     * Generate a random event for the game
     */
    
    public static void randomEvent()
    {
        int rand = (int)Math.random() * (4) + 1;

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
        
        //creating scanner object
        Scanner input = new Scanner(System.in);

        //welcome message and character selection
        System.out.println("Welcome! You are the manager for the K-pop demon hunters.\n Who would you like to manage today?");
        System.out.println("1: Rumi, 2: Zoey, 3: Mira, 4: Jinu");
        int characterChoice = input.nextInt();

        //create character based on user choice
        DemonHunter character = create(characterChoice);


        // System.out.println(character.getName()); testing stuff
     
        //loop for choosing options
        while(character.getEnergy() < 100 && character.getEnergy() > 0 && character.getPopularity() < 100 && character.getPopularity() > 0){
            System.out.println("----------");
            System.out.println("What would you like to do?");
            displayHunterOptions(character.getName());
            int behaviorChoice = input.nextInt();
            if(behaviorChoice == 1){
                character.eat();
            }
            else if(behaviorChoice == 2){
                character.sleep();
            }
            else if(behaviorChoice == 3){
                character.fight();
            }
            else if(behaviorChoice == 4){
                if(characterChoice == 1){
                    Rumi.sing();
                }
                else if(characterChoice == 2){
                    Zoey.write();
                }
                else if(characterChoice == 3){
                    Mira.rap();
                }
                else if(characterChoice == 4){
                    Jinu.dance();
                }
            }
            else{
                System.out.println("Thanks for playing!");
            }
            System.out.println(character.toString());
            System.out.println("----------");
        }
        //losing conditions
        if (character.getEnergy() <= 0 || character.getPopularity() <= 0){
            int random_ending = (int)(Math.random() * (3 - 1 + 1) + 1);
            if (random_ending == 1){
                System.out.println(character.getName() + " has died from exhaustion. Game Over.");
            }
            else if (random_ending == 2){
                System.out.println("You failed to maintain" + character.getName() + "'s " + "popularity. The demons have broken the honmoon. Game Over.");
            }
            else {
                System.out.println("The demons have taken over with their new hit song 'Hypnotic'. Game over.");
            }
        }
        //winning conditions
        if (character.getEnergy() >= 100 || character.getPopularity() >= 100){
            int random_ending = (int)(Math.random() * (3 - 1 + 1) + 1);
            if (random_ending == 1){
                System.out.println("Congratulations! You have successfully managed your K-pop demon hunter to fame and fortune!");
            }
            else if (random_ending == 2){
                System.out.println("You have defeated the demons and restored peace to the honmoon! Victory is yours!");
            }
            else {
                System.out.println(character.getName() + " has become the ultimate K-pop demon hunter, loved by all!");
            }
        }
        System.out.println("Thanks for playing!");
        return;
    }
    

    //display the character's behaviors, choosing between each character's choices 
    public static void displayHunterOptions (String characterType){
        switch (characterType.toLowerCase()) {
            case "rumi":
                displayRumiOptions();
                break;
            case "zoey":
                displayZoeyOptions();
                break;
            case "mira":
                displayMiraOptions();
                break;
            case "jinu":
                displayJinuOptions();
                break;
            default:
                break;
        }
    }

    //display Rumi's behaviors
    public static void displayRumiOptions(){
        System.out.println("Rumi's options:");
        System.out.println("1: Eat");
        System.out.println("2: Sleep");
        System.out.println("3: Fight");
        System.out.println("4: Sing");
    }

    //display Zoey's behaviors
    public static void displayZoeyOptions(){
        System.out.println("Zoey's options:");
        System.out.println("1: Eat");
        System.out.println("2: Sleep");
        System.out.println("3: Fight");
        System.out.println("4: Write");
    }

    //display Mira's behaviors
    public static void displayMiraOptions(){
        System.out.println("Mira's options:");
        System.out.println("1: Eat");
        System.out.println("2: Sleep");
        System.out.println("3: Fight");
        System.out.println("4: Rap");
    }

    //display Jinu's behaviors
    public static void displayJinuOptions(){
        System.out.println("Jinu's options:");
        System.out.println("1: Eat");
        System.out.println("2: Sleep");
        System.out.println("3: Fight");
        System.out.println("4: Dance");
    }










// kim random ending
if (character.energy <= 0 || character.popularity <= 0){
    int random_ending = (int)(Math.random() * (3 - 1 + 1) + 1);
    if (random_ending == 1){
        System.out.println(character.getName() + " has died from exhaustion. Game Over.");
    }
    else if (random_ending == 2){
        System.out.println("You failed to maintain" + character.getName() + "'s " + "popularity. The demons have broken the honmoon. Game Over.");
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
    else if (random_ending == 2){
        System.out.println("You have defeated the demons and restored peace to the honmoon! Victory is yours!");
    }
    else {
        System.out.println(character.getName() + " has become the ultimate K-pop demon hunter, loved by all!");
    }
}
}

//plan 

//create a menu for the user to choose which character to manage - violet
//create a menu for the user to choose which character to manage == done

//display the character's behaviors -julia

//while loop 
//while(character.energy < 100 && character.energy > 0){
    //something
//}
//a way to win and die (ending) satisfy our random event here potentially kim == draft done


//if (character.energy <= 0 || character.popularity <= 0){
    //int random_ending = (int)(Math.random() * (3 - 1 + 1) + 1);
    //if (random_ending == 1){
        //System.out.println(character.name + " has died from exhaustion. Game Over.");
    //}
    //elif (random_ending == 2){
        //System.out.println("You failed to maintain" + character.name + "'s " + "popularity. The demons have broken the honmoon. Game Over.");
    //}
    //else {
        //System.out.println("The demons have taken over with their new hit song 'Hypnotic'. Game over.");
    //}
//}

//if (character.energy >= 100 || character.popularity >= 100){
    //int random_ending = (int)(Math.random() * (3 - 1 + 1) + 1);
    //if (random_ending == 1){
        //System.out.println("Congratulations! You have successfully managed your K-pop demon hunter to fame and fortune!");
    //}
    //elif (random_ending == 2){
        //System.out.println("You have defeated the demons and restored peace to the honmoon! Victory is yours!");
    //}
    //else {
        //System.out.println(character.name + " has become the ultimate K-pop demon hunter, loved by all!");
    //}
//}

// random events

