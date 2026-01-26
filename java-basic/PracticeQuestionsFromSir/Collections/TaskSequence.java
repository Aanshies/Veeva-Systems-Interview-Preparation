/* 5. Shopping List (List): ArrayList that allows duplicates and preserves order. */
import java.util.*;
public class TaskSequence {
    public static void main(String[] args) {
        List<String> tasks = new ArrayList<>();
        tasks.add("Milk");
        tasks.add("Eggs");
        tasks.add("Bread");
        tasks.add("Milk"); // Duplicate allowed
        for (String t : tasks) System.out.println("Task: " + t);
    }
}