// Java program to read data of various types using Scanner class.
import java.util.Scanner;
public class ScannerDemo1{
	public static void main(String[] args)
	{
		// Declare the object and initialize with
		// predefined standard input object
		Scanner sc = new Scanner(System.in);

		// String input
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("Name: "+name);


		// Character input
		System.out.println("What is your gender?");
		char gender = sc.next().charAt(0);
		System.out.println("Gender: "+gender);

		// Numerical data input
		// byte, short and float can be read
		// using similar-named functions.
		System.out.println("How old are you?");
		int age = sc.nextInt();
		System.out.println("Age: "+age);
		System.out.println("What is your phone number?");
		long mobileNo = sc.nextLong();
		System.out.println("Mobile Number: "+mobileNo);
		System.out.println("What's your CGPA?");
		double cgpa = sc.nextDouble();
		System.out.println("CGPA: "+cgpa);

		// Print the values to check if the input was correctly obtained.
		System.out.println("Name: "+name);
		System.out.println("Gender: "+gender);
		System.out.println("Age: "+age);
		System.out.println("Mobile Number: "+mobileNo);
		System.out.println("CGPA: "+cgpa);
	}
}