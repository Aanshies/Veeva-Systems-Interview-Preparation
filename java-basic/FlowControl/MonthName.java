/* 9. Print month name based on number argument. */
public class MonthName {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter the month in numbers");
            return;
        }
        int m = Integer.parseInt(args[0]);
        String[] months = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        if (m >= 1 && m <= 12) System.out.println(months[m]);
        else System.out.println("Invalid month");
    }
}