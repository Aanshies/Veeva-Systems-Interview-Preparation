/* 4. The Lazy Passer: Understand 'throws' warning chain. */
public class LazyPasser {
    static void methodA() throws ArithmeticException {
        int risky = 10 / 0; // Risky division
    }
    public static void main(String[] args) {
        try {
            methodA(); // Main handles the passed ball
        } catch (ArithmeticException e) {
            System.out.println("Main caught the passed exception!");
        }
    }
}