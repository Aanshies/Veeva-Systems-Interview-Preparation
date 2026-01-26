/* 18. Check if a number is Magical number. */
public class MagicalCheck {
    public static void main(String[] args) {
        int n = 1729, temp = n, sum = 0;
        while (temp > 0) { sum += temp % 10; temp /= 10; }
        int revSum = 0, tempSum = sum;
        while (tempSum > 0) { revSum = revSum * 10 + tempSum % 10; tempSum /= 10; }
        if (sum * revSum == n) System.out.println(n + " is a Magical number");
        else System.out.println(n + " is Not a Magical number");
    }
}