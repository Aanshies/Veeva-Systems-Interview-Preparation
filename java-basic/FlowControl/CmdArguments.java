/* 3. Check if program received command line arguments. Print 'No Values' or comma separated values. */
public class CmdArguments {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No values");
        } else {
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i] + (i == args.length - 1 ? "" : ","));
            }
            System.out.println();
        }
    }
}