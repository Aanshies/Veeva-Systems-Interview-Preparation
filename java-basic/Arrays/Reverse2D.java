/* 7. Reverse elements of a given 2*2 array passed via Command Line. */
public class Reverse2D {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Please enter 4 integer numbers");
            return;
        }
        System.out.println("The reverse of the array is:");
        System.out.println(args[3] + " " + args[2]);
        System.out.println(args[1] + " " + args[0]);
    }
}