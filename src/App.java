import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        
       
       //test for rumi
       
       
       
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome! You are the manager for the K-pop demon hunters.");
        System.out.println("Who would you like to manage?");
        
        System.out.println("1: Rumi, 2: Zoey, 3: Mira, 4: Jinu");
        int characterChoice = input.nextInt();

        Rumi character = null;

        switch(characterChoice)
        {
            case 1: 
                character = new Rumi();
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

        String name = character.getName();

        System.out.printf("\n1: Feed %s, 2: Schedule a hotel for the band, 3: Fight Demons, 4: Perform", name);
        int actionChoice = input.nextInt();

        switch(actionChoice)
        {
            case 1:
                character.eat();
                System.out.printf("\nYou have fed %s.", name);
                break;

            case 2:
                character.sleep();
                System.out.printf("\nYou have scheduled a hotel for the band.");
                break;

            case 3:
                character.fight();
                System.out.printf("\nYou have fought demons and increased the band's popularity!");
                break;
            case 4:
                character.sing();
                System.out.printf("\nYou have performed and increased the band's popularity!");
                break;
        }



        
    }

}