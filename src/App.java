import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome! You are the manager for the K-pop demon hunters.");
        System.out.println("Who would you like to manage?");
        
        System.out.println("1: Rumi, 2: Zoey, 3: Mira, 4: Jinu");
        int characterChoice = input.nextInt();

        switch(characterChoice)
        {
            case 1: 
                Rumi character = new Rumi();
                break;

            case 2:
                //Zoey character = new Zoey();
                break;

            case 3:
                // Mira character = new Mira();
                break;
            
            case 4:
                //Jinu character = new Jinu();
                break;

        }

        
    }

}