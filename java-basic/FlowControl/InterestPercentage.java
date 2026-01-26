/* 6. Print interest percentage based on Gender and Age from command line arguments. */
public class InterestPercentage {
    public static void main(String[] args) {
        if (args.length < 2) return;
        String gender = args[0];
        int age = Integer.parseInt(args[1]);
        if (gender.equalsIgnoreCase("Female")) {
            if (age >= 1 && age <= 58) System.out.println("8.2%");
            else if (age >= 59 && age <= 100) System.out.println("9.2%");
        } else {
            if (age >= 1 && age <= 58) System.out.println("8.4%");
            else if (age >= 59 && age <= 100) System.out.println("10.5%");
        }
    }
}