/* 5. Print 'Alphabet', 'Digit', or 'Special Character' based on variable value. */
public class CharIdentify {
    public static void main(String[] args) {
        char c = '*';
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) System.out.println("Alphabet");
        else if (c >= '0' && c <= '9') System.out.println("Digit");
        else System.out.println("Special Character");
    }
}