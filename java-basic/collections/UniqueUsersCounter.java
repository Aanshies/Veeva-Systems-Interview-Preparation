import java.util.Set;
import java.util.HashSet;

class UniqueUsersCounter {
    public static void main(String[] args) {

        Set<String> users = new HashSet<>();
        users.add("User1");
        users.add("User2");
        users.add("User1");

        System.out.println("Total unique users: " + users.size());
    }
}
