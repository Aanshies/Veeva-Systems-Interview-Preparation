class SquareRootArithmeticException {

    public static void main(String[] args) {

        int number = -5;

        try {
            if (number < 0) {
                throw new ArithmeticException("No negatives!");
            }

            double result = Math.sqrt(number);
            System.out.println("Square root: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }
    }
}
