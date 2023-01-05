import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws FileNotFoundException{
        TextFileService tfs = new TextFileService();
        Scanner fileNameScanner = new Scanner(System.in);
        System.out.println("Please input file name");
        String filename = fileNameScanner.nextLine();
        String contents = tfs.readStringFromFile(filename);
        System.out.println(contents);
        System.out.println("Thanks for using the file reading app!");
    }
}
