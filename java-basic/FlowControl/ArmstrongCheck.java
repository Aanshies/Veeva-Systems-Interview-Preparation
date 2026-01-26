/* 16. Check if a number is Armstrong number. */
public class ArmstrongCheck {
    public static void main(String[] args) {
        int n = 153, og = n, sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += (d * d * d);
            n /= 10;
        }
        System.out.println(og == sum ? og + " is an Armstrong number" : og + " is Not an Armstrong number");
    }
}