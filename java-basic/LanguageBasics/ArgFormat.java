/* Write a Program that accepts two Strings as command line arguments and generate the output in the required format. Example: Wipro Bangalore -> Wipro Technologies Bangalore */
public class ArgFormat {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two arguments.");
            return;
        }
        System.out.println(args[0] + " Technologies " + args[1]);
    }
}