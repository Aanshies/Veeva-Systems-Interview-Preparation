import java.util.Map;
import java.util.HashMap;

class MiniContactManager {
    public static void main(String[] args) {

        Map<String, String> contacts = new HashMap<>();

        contacts.put("Alice", "1234567890");
        contacts.put("Bob", "0987654321");
        contacts.put("Charlie", "5556667777");

        // Duplicate key updates value
        contacts.put("Alice", "1112223333");

        // Retrieve
        System.out.println("Alice Contact: " + contacts.get("Alice"));

        // Check
        if (contacts.containsKey("Bob")) {
            System.out.println("Bob exists in contacts");
        }

        // Delete
        contacts.remove("Charlie");

        // Loop through phonebook
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
