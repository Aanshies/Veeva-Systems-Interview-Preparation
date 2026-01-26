/* 12. Print the sum of all digits of a given number. Example: 1234 -> 10 */
public class DigitSum {
    public static void main(String[] args) {
        int n = 1234, sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}