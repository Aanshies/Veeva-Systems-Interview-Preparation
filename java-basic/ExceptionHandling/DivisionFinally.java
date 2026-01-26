/* 7. Quotient calculator with ArithmeticException and finally block. */
import java.util.Scanner;
public class DivisionFinally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter 2 numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("The quotient of "+a+"/"+b+" = " + (a/b));
        } catch (ArithmeticException e) {
            System.out.println("DivideByZeroException caught");
        } finally {
            System.out.println("Inside finally block");
        }
    }
}