/* Write a Program to accept two integers as command line arguments and print the sum of the two numbers. Example: java Sample 10 20 -> The sum of 10 and 20 is 30 */
public class SumArgs {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two numbers.");
            return;
        }
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        System.out.println("The sum of " + n1 + " and " + n2 + " is " + (n1 + n2));
    }
}