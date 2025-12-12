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





    }

}

//plan 

//create a menu for the user to choose which character to manage == done

//display the character's behaviors 

//while loop 

//a way to win and die (ending) satisfy our random event here potentially 

//kim- if popularity level reaches a certain point you win, if energy level is below a certain point you die, random: random number generator, pick a number, after every while loop add +1 to random int, once it gets to random number do the event
//kim random stuff- int randomEventCounter = 0; (int)(Math.random()*(5-1+1)+1), 


// random events

