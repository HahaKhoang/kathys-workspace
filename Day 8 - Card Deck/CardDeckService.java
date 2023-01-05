public class CardDeckService {
    
    String[] cards;
    /**
     * A constructor that allows for the instantiation of a CardDeckService with n amount of cards
     * @param n amount of cards
     */

    public CardDeckService(int n){
        // For instance, if n is 10, String[] = new String [10] would create a sequence of 10 Strings in memory
        // Except that the variable n in this case is unknown until the user inputs the value
        cards = new String[n];
    }


    /**
     * Set card number n's name to name
     * @param n
     * @param name
     */
    public void setCardName(int n, String name){
        cards[n] = name;
    } 


    /**
     * Use a for loop to append all of the cards to a string, then return it
     * @return
     */
    public String cardDeckAsString(){
        String buildingString = "";
        // Append every single card to the end of a string, iteratively 
        for(int i = 0; i < cards.length; i++){
            if(cards[i] != null){
                buildingString = buildingString + cards[i] + ", ";
            }
        }
        return buildingString;
    }
}
