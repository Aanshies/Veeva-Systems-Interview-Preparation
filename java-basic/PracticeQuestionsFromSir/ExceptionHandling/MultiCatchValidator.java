/* 2. Smart Form: Multi-Catch Validator. 
Validate age (18+), email (@), and phone (numeric) in a single try block. */
import java.util.Scanner;
public class MultiCatchValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Age: ");
            int age = Integer.parseInt(sc.next());
            if (age < 18) throw new ArithmeticException("Age must be 18+");

            System.out.print("Enter Email: ");
            String email = sc.next();
            if (!email.contains("@")) throw new Exception("Invalid Email");
        } catch (NumberFormatException e) {
            System.out.println("Phone/Age numeric ga undali!");
        } catch (ArithmeticException e) {
            System.out.println("Logic Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Error: " + e.getMessage());
        }
    }
}