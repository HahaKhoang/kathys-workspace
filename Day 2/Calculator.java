import java.util.Scanner;

public class Calculator {
    /**
     * I want to make a calculator app
     * for the start, I want to be able to multiply and divide numbers
     * @param args
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("input first number:");
        // after getting a bit of text from the user, convert that into a double
        String n1input = sc.nextLine();
        double n1 = Double.parseDouble(n1input);

        System.out.println("input second number");
        String n2input = sc.nextLine();
        double n2 = Double.parseDouble(n2input);

        System.out.println("input 'multiply' or 'divide'");
        String action = sc.nextLine();

        if(action.equals("multiply")){
            double result = multiply(n1, n2);
            System.out.println("result: "+result);
        }else if(action.equals("divide")){
            double result = divide(n1, n2);
            System.out.println("result: "+result);
        }
    }

    public static double multiply(double a, double b){
        return a*b;
    }

    public static double divide(double a, double b){
        return a/b;
    }

    /*
     * Primitive data types:
     * Bytes (very short numbers)
     * Shorts (short numbers)
     * Ints (whole numbers up to about 2 billion)
     * Floats (decimal numbers taht tend to be inaccurate)
     * Doubles (accurate decimal numbers)
     * Booleans (true/false values)
     * Char (single characters)
     */

     /*
      * Today's topics:
      * Methods
      * Method return types
      * Method parameters
      * Primitive types
      * Strings
      */
}
