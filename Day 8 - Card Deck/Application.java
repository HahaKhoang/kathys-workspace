import java.util.Scanner;

public class Application {

    /*
     * String[] args is a Java feature taht we're not planning on using at the moment - 
     * If we are running a Java program from the command line, we can give it additional variables
     * that can be accessed by the main method - these are passed in via args
     */

     /**
      * 1: Ask user for the size of the deck
      * 2: Have the user type in the "name" for every single card in that deck
      * 3: Print out all cards of that deck
      * @param args
      */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the deck:");
        String deckLengthInput = sc.nextLine();
        int deckLength = Integer.parseInt(deckLengthInput);
        CardDeckService cardDeckService = new CardDeckService(deckLength);
        // We want to repeat a pattern for 'deckLength' times
        // We want to ask the user for the name of the card,
        // And we want to set a card in the deck to that name
        // We will start counting from 0
        for (int i = 0; i < deckLength; i++){
            String cardName = sc.nextLine();
            cardDeckService.setCardName(i, cardName);
            String currentCards = cardDeckService.cardDeckAsString();
            System.out.println(currentCards);
        }

    }
    
}
