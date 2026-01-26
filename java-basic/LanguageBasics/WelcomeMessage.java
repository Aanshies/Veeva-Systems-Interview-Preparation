/* Write a Program to accept a String as a command line argument and print a Welcome message. Example: java Sample John -> Welcome John */
public class WelcomeMessage {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide a name.");
            return;
        }
        System.out.println("Welcome " + args[0]);
    }
}