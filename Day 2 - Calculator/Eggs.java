import java.util.Scanner;

public class Eggs {
    public static void main(String[] args){
        System.out.println("How many eggs do you have?");
        Scanner sc = new Scanner(System.in);
        int eggs = sc.nextInt();
        int dozen = eggs / 12;
        int remainder = eggs%12;
        System.out.println("You have " + eggs +" eggs, which is " + dozen + " dozen with a remainder of " + remainder);
        }
    }

