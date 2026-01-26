/* 15. Check if a number is palindrome. */
public class PalindromeCheck {
    public static void main(String[] args) {
        int n = 1111, og = n, rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        System.out.println(og == rev ? "Palindrome" : "Not a palindrome");
    }
}