/* 2. Calculator class with static power methods. */
class Calculator {
    static double powerInt(int n1, int n2) { return Math.pow(n1, n2); }
    static double powerDouble(double n1, int n2) { return Math.pow(n1, n2); }
}
public class CalculatorPower {
    public static void main(String[] args) {
        System.out.println(Calculator.powerInt(2, 10));
        System.out.println(Calculator.powerDouble(2.5, 2));
    }
}