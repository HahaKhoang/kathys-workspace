
public class ChatbotService {
    
    String language;
    public String helloMessage(){
        if (language.equals("English")){
            return "Hello";
        } else if (language.equals("Swedish")){
            return "Hej";
        } else if (language.equals("Japanese")){
            return "Konnichiwa";
        }
        return "Language not recognized";
    }

    public String goodbyeMessage(){
        if(language.equals("English")){
            return "Goodbye";
        } else if(language.equals("Swedish")) {
            return "Hej da";
        } else if (language.equals("Japanese")){
            return "Sayonara";
        }
        return "Language not recognized";
    }
}
