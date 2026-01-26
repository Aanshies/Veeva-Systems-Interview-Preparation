/* 17. Check if a number is Strong number. (Sum of factorial of digits) */
public class StrongCheck {
    public static void main(String[] args) {
        int n = 145, og = n, sum = 0;
        while (n > 0) {
            int d = n % 10, fact = 1;
            for (int i = 1; i <= d; i++) fact *= i;
            sum += fact;
            n /= 10;
        }
        System.out.println(og == sum ? og + " is a Strong number" : og + " is Not a Strong number");
    }
}