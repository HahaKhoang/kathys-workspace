import java.util.Scanner;

public class Interest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Ask the user for initial balance and annual interest rate
        System.out.println("Input balance:");
        String balanceInput = sc.nextLine();

        // Convert the received string into a double
        Double balance = Double.parseDouble(balanceInput);

        System.out.println("Input interest rate:");
        String interestInput = sc.nextLine();
        Double interest = Double.parseDouble(interestInput);

        Double result = calculateBalanceAfterYear(balance, interest);
        // Perform the interest calculation
        // Send that data back to the console
        System.out.println(result);
    }

    /**
     * Add the amount received from itnerest to the original amount
     * @param principal the starting balance
     * @param apy the interest rate
     * @return the final balance after interest
     */

    public static double calculateBalanceAfterYear(double principal, double apy){
        return principal + calculateProfit(principal, apy);
    }

    /**
     * 
     * @param principal
     * @param apy
     * @return the profit gained from principal * apy
     */

    public static double calculateProfit(double principal, double apy){
        return principal * apy;
    }

    /*
     * Whole numbers:
     * byte
     * short
     * int (!)
     * long (sometimes)
     * Decimal numbers:
     * float
     * double (!)
     * Charcters:
     * char (sometimes)
     * True/False:
     * booleans (!)
     */

}
