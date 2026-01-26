/* 3. Negative Number Ban: Square root calculator that throws exception for negatives. */
public class NegativeNumberBan {
    public static void checkSquareRoot(double num) {
        if (num < 0) {
            throw new ArithmeticException("No negatives allowed! Screaming!");
        }
        System.out.println("Square root is: " + Math.sqrt(num));
    }
    public static void main(String[] args) {
        try {
            checkSquareRoot(-5);
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}