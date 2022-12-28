import java.util.Scanner;

public class Coffee {
    public static void main(String[] args){
        while(true){

            Scanner sc = new Scanner(System.in);
            // Ask user for their balance
            System.out.println("What's your balance?");
            String balanceInput = sc.nextLine();
            Double balance = Double.parseDouble(balanceInput);
    
            // Ask the user if they want espresso or americano
            System.out.println("What type of coffee do you want?");
            String coffeeInput = sc.nextLine();
    
            // Ask the user how many they want
            System.out.println("How many do you want?");
            String amountInput = sc.nextLine();
            Integer amount = Integer.parseInt(amountInput);
    
            // Coffee price
            Double espressoPrice = 3.99;
            Double americanoPrice = 2.99;
    
            if(amount > 0) {
                // Proceed with coffee purchase attempt?
                boolean isEspresso = coffeeInput.equalsIgnoreCase("espresso");
                boolean isAmericano = coffeeInput.equalsIgnoreCase("americano");
                if(isEspresso && balance >= (espressoPrice * amount)) {
                        System.out.println("Enjoy your espresso");
                }
                if(isAmericano && balance >= (americanoPrice * amount)) {
                        System.out.println("Enjoy your americano");
    
                } 
            } else {
                System.out.println("No coffee -- amount requested is 0 or less");
            }
    
            // If the user inputs 0 or a negative number, produce no output
            // If the user can not afford the number of coffees requested, produce no output
            // The user should get a different message depending on the type of coffee they purchased
        }
    }
}
