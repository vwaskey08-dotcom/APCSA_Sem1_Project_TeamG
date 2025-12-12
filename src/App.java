import java.util.Scanner;

public class App {

    //create methods


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
    


    public static void main(String[] args) throws Exception {
        
        
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome! You are the manager for the K-pop demon hunters.");
        System.out.println("Who would you like to manage?");
        
        System.out.println("1: Rumi, 2: Zoey, 3: Mira, 4: Jinu");
        int characterChoice = input.nextInt();

        DemonHunter character = create(characterChoice);

        character.getName();
        
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
        System.out.println("4: Rap");
    }

    //display Mira's behaviors
    public static void displayMiraOptions(){
        System.out.println("Mira's options:");
        System.out.println("1: Eat");
        System.out.println("2: Sleep");
        System.out.println("3: Fight");
        System.out.println("4: Dance");
    }

    //display Jinu's behaviors
    public static void displayJinuOptions(){
        System.out.println("Jinu's options:");
        System.out.println("1: Eat");
        System.out.println("2: Sleep");
        System.out.println("3: Fight");
        System.out.println("4: Dance");
    }



}

//plan 

//create a menu for the user to choose which character to manage - violet

//display the character's behaviors -julia

//while loop - ethan

//a way to win and die (ending) satisfy our random event here potentially - kim

// random events -kim

