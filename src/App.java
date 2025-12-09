import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        
        Rumi rumi;
        Zoey zoey;
        Mira mira;
        Jinu jinu;
       
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome! You are the manager for the K-pop demon hunters.");
        System.out.println("Who would you like to manage?");
        
        System.out.println("1: Rumi, 2: Zoey, 3: Mira, 4: Jinu");
        int characterChoice = input.nextInt();

        switch(characterChoice)
        {
            case 1: 
                rumi = new Rumi();
                break;

            case 2:
                // zoey = new Zoey();
                break;

            case 3:
                // mira = new Mira();
                break;
            
            case 4:
                jinu = new Jinu();
                break;
        }



        public static void characterInfo(int choice)
        {
            switch (choice)
            {
                case 1:
                    System.out.println(rumi.toString());
                    break;

                case 2:
                    System.out.println(zoey.toString());
                    break;

                case 3:
                    System.out.println(mira.toString());
                    break;

                case 4:
                    System.out.println(jinu.toString());
                    break;
            }
        }

        
        // System.out.print(character.toString());

        // String name = character.getName();

        // System.out.printf("\n1: Feed %s, 2: Schedule a hotel for the band, 3: Fight Demons, 4: Perform", name);
        // int actionChoice = input.nextInt();

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

        System.out.print(character.toString());



        
    }

}