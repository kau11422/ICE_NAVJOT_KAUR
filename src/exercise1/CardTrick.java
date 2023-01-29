package exercise1;

import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Scanner a = new Scanner(System.in);

        for (int i = 0; i < hand.length; i++) {
          
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
            
            Card card1 = new Card();
            Card card2 = new Card();
            Card card3 = new Card();
            Card card4 = new Card();
            Card card5 = new Card();
            Card card6 = new Card();
            Card card7  = new Card();
         
            card1.setValue((int)(1+Math.random()*13));
            card1.setSuit(Card.SUITS[(int)(1+Math.random()*3)]);
            card2.setValue((int)(1+Math.random()*13));
            card1.setSuit(Card.SUITS[(int)(1+Math.random()*3)]);
            card3.setValue((int)(1+Math.random()*13));
            card3.setSuit(Card.SUITS[(int)(1+Math.random()*3)]);
            card4.setValue((int)(1+Math.random()*13));
            card4.setSuit(Card.SUITS[(int)(1+Math.random()*3)]);
            card5.setValue((int)(1+Math.random()*13));
            card5.setSuit(Card.SUITS[(int)(1+Math.random()*3)]);
            card6.setValue((int)(1+Math.random()*13));
            card6.setSuit(Card.SUITS[(int)(1+Math.random()*3)]);
            card7.setValue((int)(1+Math.random()*13));
            card7.setSuit(Card.SUITS[(int)(1+Math.random()*3)]);
            
            hand[0]=card1;
            hand[1]=card2;
            hand[2]=card3;
            hand[3]=card4;
            hand[4]=card5;
            hand[5]=card6;
            hand[6]=card7;
        }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
       System.out.println("Enter any card value between 1-13, where 1 is for Ace, 11 is for jack, 12  is for queen and 13 is for king: ");
       int x = a.nextInt();
       System.out.println("You entered: "+x);
       System.out.println("Enter any Card suit, where 1 for Hearts, 2 for Diamonds, 3 is for Spades and 4 is for clubs: ");
       int y = a.nextInt();
       System.out.println("You entered: "+y);
       int[][] cardx = new int[13][4];
     
     System.out.println("The card you picked is: "+x+" "+y);
     
     for (int i = 0; i < hand.length; i++)
       {
        if (hand[i].equals(x)&&hand[i].equals(y)){
        
               System.out.println("Congratulations, you guessed right!");
            
       }
       else{
        System.out.println("Your guess is wrong!!!");
       }
    }


        
    

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    /*private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");*/
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
            }

}
