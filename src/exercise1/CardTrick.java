package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author groenewk
 * @author Kathryn Groenewald, Jun 1 2023 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        //instantiate object of random type
        Random random = new Random(); 
        
        //create hand array
        Card[] hand = new Card[7];
        
        //fill hand array
        for (int i = 0; i < hand.length; i++) {
            hand[i] = new Card();
            hand[i].setValue(random.nextInt(13) + 1);
            hand[i].setSuit(Card.SUITS[random.nextInt(4)]);
        }
        
        for (int i = 0; i < hand.length; i++) {
            System.out.println(hand[i].getSuit());
            System.out.println(hand[i].getValue());
        }

        //user card object
        Card userCard = new Card(); 
        
        //ask the user for Card value 
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter card value (note that Ace = 1, Jack = 11," +
                " Queen = 12, King = 13)"); 
        userCard.setValue(input.nextInt()); 
        
        //ask the user for Card suit
        System.out.println("Enter suit: (Hearts=0, Diamonds=1,Spades=2,Clubs=3)"); 
        userCard.setSuit(Card.SUITS[input.nextInt()]);
        
        //loop through the cards in the array to see if there's a match.
        //if the guess is successful, invoke the printInfo() method below.
        for (int i = 0; i < hand.length; i++) {
            if (userCard.getSuit().equals(hand[i].getSuit())){ 
                if(userCard.getValue() == hand[i].getValue()){ 
                    printInfo(); 
                }
            }
        }      
    }
    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Kathryn Groenewald Jun 1 2023
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Kathryn");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Do a Hackathon");
        System.out.println("-- Get straight A's!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Painting");
        System.out.println("-- Playing with my dog");
        System.out.println("-- Walking");
        System.out.println("-- Cooking ");

        System.out.println();
    }

 }

