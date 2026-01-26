/* 6. Guest List (Set): HashSet that forbids duplicates and is unordered. */
import java.util.*;
public class UniqueUserFilter {
    public static void main(String[] args) {
        Set<String> users = new HashSet<>();
        users.add("User1");
        users.add("User2");
        users.add("User1"); // Duplicate ignored
        System.out.println("Total unique users: " + users.size());
    }
}