package randommessagegenerator;

import java.util.*;

/**
 * 
 * @author Dan
 */
public class RandomMessageGenerator {

    private List<String> messageList = new ArrayList<>();
    private String message;

    public RandomMessageGenerator() {
        
        messageList.add("Turn the T.V. off and get your work done!");
        messageList.add("Stop slacking off!");
        messageList.add("We need you to get done with school as soon as possible!");
        messageList.add("Don't you want to get a house?");
        
    }

    public final void addNewMessage(String message) {
        Set<String> set = new HashSet<>(messageList);
        messageList.clear();
        for (String string : set) {
            messageList.add(string);
        }
    }

    public final void removeMessage(String message) {
        Set<String> set = new HashSet<>(messageList);
        messageList.clear();
        for (String string : set) {
            messageList.remove(string);
        }
    }


    @Override
    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RandomMessageGenerator other = (RandomMessageGenerator) obj;
        return Objects.equals(this.message, other.message);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.messageList);
        hash = 97 * hash + Objects.hashCode(this.message);
        return hash;
    }

    public final String getRandomMessage() {
        Random random = new Random();
        int randomNumber = random.nextInt(messageList.size());
        String randomMessage = messageList.get(randomNumber);
        return randomMessage;
    }

    public final List getAllMessages() {
        return messageList;
    }
}
