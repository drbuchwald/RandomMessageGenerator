package randommessagegenerator;

import java.util.*;
/**
 * 
 * @author Dan
 */
public class Startup {

    public static void main(String[] args) {
        RandomMessageGenerator messageGenerator = new RandomMessageGenerator();
        System.out.println("Random message generated: " + messageGenerator.getRandomMessage());
        
        List<String> messageList;
        messageList = messageGenerator.getAllMessages();
        
        System.out.println("\nMessage List size at the start: " 
                + messageList.size());
        
        System.out.println("Starting message list: ");
        for (String newMessageList : messageList) {
            System.out.println(newMessageList);
        }
        
        messageList.add("Don't you ever sleep?");
        
        System.out.println("\nMessage List size after insert: " 
                + messageList.size());
        System.out.println("Added to message List: ");
        
        for (String newMessageList : messageList) {
            System.out.println(newMessageList);
        }
        
        
        messageList.remove(0);
        System.out.println("\nMessage List size after removal: " 
                + messageList.size());
        
        for (String newMessageList : messageList) {
            System.out.println(newMessageList);
        }
        
    }
}
