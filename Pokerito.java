import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's play Pokerito. Type anything when you're ready.");
        scan.nextLine();
        System.out.println("It's like Poker, but a lot simpler.\n");
        System.out.println("\t>> There are two players, you and the computer.");
        System.out.println("\t>> The dealer will give each player one card.");
        System.out.println("\t>> Then, the dealer will draw five cards (the river)");
        System.out.println("\t>> The player with the most river matches wins!");
        System.out.println("\t>> If the matches are equal, everyone's a winner!\n");
        System.out.println(" Ready? Type anything if you are.");
        scan.nextLine();
    
        System.out.println("'Here's your card:'\n");
        String yourCard = randomCard();
        System.out.println(yourCard);
        System.out.println("\n'Here's the computer's card:'\n");
        String compCard = randomCard();
        System.out.println(compCard);
        System.out.println("\n");

        int yourMatches = 0;
        int computerMatches =0;

        System.out.println("Now, the dealer will draw five cards. Press enter to continue.");
        for (int i = 0; i < 5; i++) 
        {
            scan.nextLine();
            System.out.println("\n"+"Card "+(i+1));
            System.out.println("\n");
            String dealerCard = randomCard();
            System.out.println(dealerCard);
            if (yourCard.equals(dealerCard)) 
            {
                yourMatches++;                
            } 
            if(compCard.equals(dealerCard))
            {
                computerMatches++;
            }       
        }

        System.out.println("\n\n");
        System.out.println("Your Matches = "+yourMatches);
        System.out.println("Computer Matches = "+computerMatches);
        if (yourMatches == computerMatches) 
        {
            System.out.println("\n\teveryone wins!.\n");            
        } 
        else if(yourMatches > computerMatches)
        {
            System.out.println("\n\tYou win!.\n");
        }
        else if(computerMatches > yourMatches)
        {
            System.out.println("\n\tThe computer wins!\n");
        }

         scan.close();
    }

    public static String randomCard()
    {
        double randomNumber = Math.random()*13;
        randomNumber+=1;

        switch((int)randomNumber)
        {
            case 1: return      "   _____\n"+
                                "  |A _  |\n"+ 
                                "  | ( ) |\n"+
                                "  |(_'_)|\n"+
                                "  |  |  |\n"+
                                "  |____V|\n";
            case 2: return      "   _____\n"+              
                                "  |2    |\n"+ 
                                "  |  o  |\n"+
                                "  |     |\n"+
                                "  |  o  |\n"+
                                "  |____Z|\n";
            case 3: return      "   _____\n" +
                                "  |3    |\n"+
                                "  | o o |\n"+
                                "  |     |\n"+
                                "  |  o  |\n"+
                                "  |____E|\n";
            case 4: return      "   _____\n" +
                                "  |4    |\n"+
                                "  | o o |\n"+
                                "  |     |\n"+
                                "  | o o |\n"+
                                "  |____h|\n";
            case 5: return      "   _____ \n" +
                                "  |5    |\n" +
                                "  | o o |\n" +
                                "  |  o  |\n" +
                                "  | o o |\n" +
                                "  |____S|\n"; 
            case 6: return      "   _____ \n" +
                                "  |6    |\n" +
                                "  | o o |\n" +
                                "  | o o |\n" +
                                "  | o o |\n" +
                                "  |____6|\n"; 
            case 7: return      "   _____ \n" +
                                "  |7    |\n" +
                                "  | o o |\n" +
                                "  |o o o|\n" +
                                "  | o o |\n" +
                                "  |____7|\n"; 
            case 8: return      "   _____ \n" +
                                "  |8    |\n" +
                                "  |o o o|\n" +
                                "  | o o |\n" +
                                "  |o o o|\n" +
                                "  |____8|\n"; 
            case 9: return      "   _____ \n" +
                                "  |9    |\n" +
                                "  |o o o|\n" +
                                "  |o o o|\n" +
                                "  |o o o|\n" +
                                "  |____9|\n"; 
            case 10: return     "   _____ \n" +
                                "  |10  o|\n" +
                                "  |o o o|\n" +
                                "  |o o o|\n" +
                                "  |o o o|\n" +
                                "  |___10|\n";                   
            case 11: return     "   _____\n" +
                                "  |J  ww|\n"+ 
                                "  | o {)|\n"+ 
                                "  |o o% |\n"+ 
                                "  | | % |\n"+ 
                                "  |__%%[|\n"; 
            case 12: return     "   _____\n" +
                                "  |Q  ww|\n"+ 
                                "  | o {(|\n"+ 
                                "  |o o%%|\n"+ 
                                "  | |%%%|\n"+ 
                                "  |_%%%O|\n"; 
            case 13: return     "   _____\n" +
                                "  |K  WW|\n"+ 
                                "  | o {)|\n"+ 
                                "  |o o%%|\n"+ 
                                "  | |%%%|\n"+ 
                                "  |_%%%>|\n"; 

        }
        return null; 
    }


}
