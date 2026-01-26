/* 14. Reverse a given number. Example: 1234 -> 4321 */
public class ReverseNumber {
    public static void main(String[] args) {
        int n = 1234, rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        System.out.println(rev);
    }
}