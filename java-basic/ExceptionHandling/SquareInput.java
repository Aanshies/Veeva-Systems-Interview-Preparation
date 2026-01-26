/* 1. Parse string to integer, handle NumberFormatException, print square. */
import java.util.Scanner;
public class SquareInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        try {
            int n = Integer.parseInt(sc.next());
            System.out.println("The square value is " + (n * n));
        } catch (NumberFormatException e) {
            System.out.println("Entered input is not a valid format for an integer.");
        } finally {
            System.out.println("The work has been done successfully");
        }
    }
}