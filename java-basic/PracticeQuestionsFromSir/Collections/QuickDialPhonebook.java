/* 7. Quick-Dial Phonebook (Map): HashMap storing Name (Key) and Number (Value). */
import java.util.*;
public class QuickDialPhonebook {
    public static void main(String[] args) {
        Map<String, String> phonebook = new HashMap<>();
        phonebook.put("Mom", "9876543210");
        phonebook.put("Dad", "9123456789");
        phonebook.put("Ammu", "8888888888");
        phonebook.put("Mom", "9000000000"); // Updates value for existing key

        System.out.println("Mom's Number: " + phonebook.get("Mom"));
        if (phonebook.containsKey("Dad")) System.out.println("Dad is in contacts.");
        
        for (Map.Entry<String, String> contact : phonebook.entrySet()) {
            System.out.println(contact.getKey() + ": " + contact.getValue());
        }
    }
}