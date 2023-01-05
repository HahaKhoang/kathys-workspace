import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/*
 * This class will methods that can read from all sorts of different text files
 */

public class TextFileService {
    
    /**
     * 
     * @param filename a string representing the name (relative path) of a txt file
     * @return the contents of the file represented by filename
     * @throws FileNotFoundException
     */
    public String readStringFromFile(String filename) {
        File textFile = new File(filename);
        Scanner textScanner;
        String text = "";
  
        try {
            textScanner = new Scanner (textFile);
            text = textScanner.nextLine();
        } catch (FileNotFoundException e) {
            System.out.println("We couldn't find that file!");
        } 
      
        return text;
    }
}
