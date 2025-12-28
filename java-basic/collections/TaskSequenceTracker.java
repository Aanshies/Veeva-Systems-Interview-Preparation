import java.util.ArrayList;
import java.util.List;

class TaskSequenceTracker {
    public static void main(String[] args) {

        List<String> tasks = new ArrayList<>();
        tasks.add("Milk");
        tasks.add("Bread");
        tasks.add("Milk");

        for (String task : tasks) {
            System.out.println(task);
        }
    }
}
