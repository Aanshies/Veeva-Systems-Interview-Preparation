/* 11. Print prime numbers between 10 and 99. */
public class PrimeRange {
    public static void main(String[] args) {
        for (int i = 10; i <= 99; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) { isPrime = false; break; }
            }
            if (isPrime) System.out.print(i + " ");
        }
    }
}