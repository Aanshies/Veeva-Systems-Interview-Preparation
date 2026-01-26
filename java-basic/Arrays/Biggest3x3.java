/* 8. Find the biggest number in a 3*3 array from 9 command line arguments. */
public class Biggest3x3 {
    public static void main(String[] args) {
        if (args.length != 9) {
            System.out.println("Please enter 9 integer numbers");
            return;
        }
        int max = Integer.parseInt(args[0]);
        for (String s : args) {
            int val = Integer.parseInt(s);
            if (val > max) max = val;
        }
        System.out.println("The biggest number is " + max);
    }
}