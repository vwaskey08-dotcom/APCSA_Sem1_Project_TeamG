import java.util.Scanner;

/**
 * App class runs the K-pop Demon Hunter Manager game.
 *
 * The main loop presents a chosen character and allows the player
 * to perform actions until an ending condition is reached.
 */
public class App {

    /**
     * Program entry point. Creates a character, then enters the behavior loop.
     */
    public static void main(String[] args) throws Exception {
        
        // Create Scanner for console input. Use try-with-resources in the future to auto-close.
        Scanner input = new Scanner(System.in);

        //welcome message and character selection
        System.out.println("");
        System.out.println("----------");
        System.out.println("**********");

        System.out.println("Welcome! You are the manager for the K-pop demon hunters.\nWho would you like to manage today?");
        System.out.println("");
        System.out.println("1: Rumi, 2: Zoey, 3: Mira, 4: Jinu");
        int characterChoice = input.nextInt();

        // Create the chosen character instance
        DemonHunter character = create(characterChoice);

        // Main behavior loop: continue while energy and popularity remain between 0 and 100
        while(character.getEnergy() < 100 && character.getEnergy() > 0 && character.getPopularity() < 100 && character.getPopularity() > 0) {
            System.out.println("----------");
            System.out.println("What would you like to do?");
            displayHunterOptions(character.getName());  
            int behaviorChoice = input.nextInt();
            
            behaviorChoices(behaviorChoice, character, characterChoice);


            // Check for endings after each action
            ending(character);
            }

        // Print final summary when the loop finishes
        System.out.println(character.toString());
        System.out.println("----------");

    }

    /**
     * Create the chosen demonhunter based on user input
     * @param choice
     * @return Demonhunter
     */

    public static DemonHunter create(int choice){
        if (choice == 1){
            return new Rumi();
        }
        else if (choice == 2){
            return new Zoey();
        }
        else if (choice == 3){
            return new Mira();
        }
        else if (choice == 4){
            return new Jinu();
        }
        else{
            System.out.println("Invalid choice. Please select a valid character.");
            return null;
        }
    }

    /**
     * Display the options of demonhunter
     * @param String name 
     */
    public static void displayHunterOptions(String name){
        if (name.equals("Rumi")){
            displayRumiOptions();
        }
        else if (name.equals("Zoey")){
            displayZoeyOptions();
        }
        else if (name.equals("Mira")){
            displayMiraOptions();
        }
        else if (name.equals("Jinu")){
            displayJinuOptions();
        }
    }
    
    /**
    * Display Zoey's behaviors
    */
    public static void displayZoeyOptions(){
        System.out.println("Zoey's options:");
        System.out.println("1: Eat");
        System.out.println("2: Sleep");
        System.out.println("3: Fight");
        System.out.println("4: Rap");
        System.out.println("5: Display Stats");
        System.out.println("6: Do nothing");
    }

    /**
     * Display Mira's behaviors
     */
    public static void displayMiraOptions(){
        System.out.println("Mira's options:");
        System.out.println("1: Eat");
        System.out.println("2: Sleep");
        System.out.println("3: Fight");
        System.out.println("4: Dance");
        System.out.println("5: Display Stats");
        System.out.println("6: Do nothing");
    }

    /**
    * Display Jinu's behaviors
    */
    public static void displayJinuOptions(){
        System.out.println("Jinu's options:");
        System.out.println("1: Eat");
        System.out.println("2: Sleep");
        System.out.println("3: Fight");
        System.out.println("4: Dance");
        System.out.println("5: Display Stats");
        System.out.println("6: Do nothing");
    }

    /**
     * Display Rumi's behaviors
     */
    public static void displayRumiOptions(){
        System.out.println("Rumi's options:");
        System.out.println("1: Eat");
        System.out.println("2: Sleep");
        System.out.println("3: Fight");
        System.out.println("4: Sing");
        System.out.println("5: Display Stats");
        System.out.println("6: Do nothing");
    }

    /**
     * the functionality of choosing behaviors
     * 
     * @param int behaviorChoice
     * @param DemonHunter character
     * @param int characterChoice
     */
    public static void behaviorChoices(int behaviorChoice, DemonHunter character, int characterChoice)
    {
        switch(behaviorChoice)
            {
                case 1:
                    character.eat();
                    break;
                case 2:
                    character.sleep();
                    break;
                case 3:
                    character.fight();
                    break;
                case 4:
                    switch (characterChoice) {
                        case 1:
                            Rumi.sing();
                            break;
                        case 2:
                            Zoey.write();
                            break;
                        case 3:
                            Mira.rap();
                            break;
                        case 4:
                            Jinu.dance();
                            break;
                        default:
                            System.out.println("Invalid character choice.");
                            break;
                    }
                    break;
                case 5:
                    // Display the character's current stats
                    System.out.println(character.toString());
                    break;

                case 6:
                    // Do nothing option: slightly reduce energy to simulate time passing
                    character.setEnergy(character.getEnergy() - 10);
                    break;
            }

    }

    /**
     * the randomness feature for the endings 
     */
    public static void ending(DemonHunter character){
         //losing conditions
         if (character.getEnergy() <= 0 || character.getPopularity() <= 0){
            int random_ending = (int)(Math.random() * (3 - 1 + 1) + 1);
            if (random_ending == 1){
                System.out.println(character.getName() + " has died from exhaustion. Game Over.");
                return;
            }
            else if (random_ending == 2){
                System.out.println("You failed to maintain" + character.getName() + "The demons have broken the honmoon. Game Over.");
                return;
            }
            else {
                System.out.println("The demons have taken over with their new hit song 'Hypnotic'. Game over.");
                return;
            }
        }
        //winning conditions
        else if (character.getEnergy() >= 100 || character.getPopularity() >= 100){
            int random_ending = (int)(Math.random() * (3 - 1 + 1) + 1);
            if (random_ending == 1){
                System.out.println("Congratulations! You have successfully managed your K-pop demon hunter to fame and fortune!");
                return;
            }
            else if (random_ending == 2){
                System.out.println("You have defeated the demons and restored peace to the honmoon! Victory is yours!");
                return;
            }
            else {
                System.out.println(character.getName() + " has become the ultimate K-pop demon hunter, loved by all!");
                return;
            }
        }
    }
}
       








