import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

public class Application {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input language 1");
        String language1 = sc.nextLine();
        System.out.println("Input language 2");
        String language2 = sc.nextLine();

        ChatbotService chatService1 = new ChatbotService();
        chatService1.language = language1;
        String result1 = chatService1.helloMessage();
        System.out.println(result1);

        ChatbotService chatService2 = new ChatbotService();
        chatService2.language = language2;
        String result2 = chatService2.helloMessage();
        System.out.println(result2);
    }

    /*
     * Key takeaways:
     * We're able to define a new 'custom datatype' called a class (and Java makes everything a class basically)
     * We're able to create new instances of that custom datatype known as objects
     * The class, which functions as a template or blueprint for objects, can have different variables (which we call fields)
     *      as well as methods (behaviors), and the behavior of those methods could change depending on the object's own invidiual fields
     * The process of creating a new object is known as instantiation 
     * OOP is good but it's tricky to figure out
     */
}
