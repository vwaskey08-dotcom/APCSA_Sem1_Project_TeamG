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
//a way to win and die (ending) satisfy our random event here potentially 

//kim- if popularity level reaches a certain point you win, if energy level is below a certain point you die, random: random number generator, pick a number, after every while loop add +1 to random int, once it gets to random number do the event
//kim random stuff- int randomEventCounter = 0; (int)(Math.random()*(5-1+1)+1), 


// random events

