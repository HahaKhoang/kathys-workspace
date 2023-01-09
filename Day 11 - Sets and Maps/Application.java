import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        NumberSetService nss = new NumberSetService();
        Scanner sc = new Scanner(System.in);
        // The while loop allows the menu to repeat, so the user may continuously add numbers
        while(true){
            System.out.println(nss.numbers);
            System.out.println("Add | Check | Remove");
            String choice = sc.nextLine();
            if(choice.equals("Add")){
                // 3 steps on this line 
                // 1) Take in String input
                // 2) Convert it to an int
                // 3) Add it to the set in service class
                nss.addToNumbers(Integer.parseInt(sc.nextLine()));
            } else if (choice.equals("Check")){
                boolean b = nss.checkNumbers(Integer.parseInt(sc.nextLine()));
                if(b){
                    System.out.println("That number exists");
                } else{
                    System.out.println("That number does not exist");
                }
            }else if (choice.equals("Remove")){
                String numberInput = sc.nextLine();
                int number = Integer.parseInt(numberInput);
                nss.removeNumber(number);
            }
        }
    }
}
/**
 * The collections heirarchy
 * Lists: ordered lists of elements, allow duplicates
 * Sets: collections of unique elements - very efficient for this task
 * Queues - kind of a line at a store - first in, first out - EG: a tech support channel
 * Stacks - kind of like a stack of plates - last in, first out - EG: undo/redo buttons (a stack of changes)
 * 
 * Maps are not a collection, because they aren't storing collections of objects, but collections of pairs of objects
 * Maps: unique keys, each of which is mapped to abother value
 */