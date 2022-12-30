import java.util.Scanner;

public class Application {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        PiggybankService bankService = new PiggybankService();
        while(true) {
            String input = sc.nextLine();
            if(input.equals("deposit")){
                // deposit a quarter
                bankService.depositQuarter();
            } else if (input.equals("break")) {
                // break the piggy bank and display the total amount contained
                double finalBalance = bankService.breakPiggybankAndReturnBalance();
                System.out.println(finalBalance);
            }
        }
    }
}

/*
 * Today's concepts:
 * More about OOP, creating service and model classes
 * Writing constructors
 * A little bit about unit testing
 */