/* 1. Check if a given String is Palindrome or not. */
public class PalindromeString {
    public static void main(String[] args) {
        String s = "madam";
        String rev = new StringBuilder(s).reverse().toString();
        System.out.println(s.equalsIgnoreCase(rev) ? "Palindrome" : "Not a Palindrome");
    }
}