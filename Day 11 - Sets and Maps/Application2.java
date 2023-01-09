import java.util.Scanner;

public class Application2 {
    public static void main(String[] args){
        DictionaryService ds = new DictionaryService();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println(ds.words);
            System.out.println("Put | Get");
            String choice = sc.nextLine();
            if(choice.equals("Put")){
                String key = sc.nextLine();
                String value = sc.nextLine();
                ds.addWordDefinitionPair(key, value);
            } else if (choice.equals("Get")){
                String key = sc.nextLine();
                System.out.println(ds.retrieveDefinition(key));
            }
        }
    }
}
