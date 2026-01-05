import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Employee name:");
        String name=sc.nextLine();
        System.out.print("Enter the Employee Annual Salary:");
        double annsal=sc.nextDouble();
        System.out.print("Enter the Start year:");
        int startyear=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the Insurance number:");
        String insurance=sc.nextLine();
        System.out.println("Employee Details:");
        Employee e=new Employee(name,annsal,startyear,insurance);
        System.out.print("Name:"+e.getName());
        System.out.print("Annual Salary:"+e.getAnnualSalary());
        System.out.print("Start year:"+e.getStartyear());
        System.out.print("Insurance Number:"+e.getInsurance());
    }
}
