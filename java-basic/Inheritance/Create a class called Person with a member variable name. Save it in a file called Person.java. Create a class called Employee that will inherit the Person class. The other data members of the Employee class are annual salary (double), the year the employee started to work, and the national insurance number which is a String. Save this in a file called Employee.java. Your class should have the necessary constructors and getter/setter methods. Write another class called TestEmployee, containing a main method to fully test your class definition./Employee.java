public class Employee extends Person {
    private double annualsalary;
    private int startyear;
    private String insurance;
    Employee(String name,double annualsalary,int startyear,String insurance){
        super(name);
        this.annualsalary=annualsalary;
        this.startyear=startyear;
        this.insurance=insurance;
    }
    public double getAnnualSalary(){
        return annualsalary;
    }
    public void setAnnualSalary(double annualsalary){
        this.annualsalary=annualsalary;
    }
    public int getStartyear(){
        return startyear;
    }
    public void setStartyear(int startyear){
        this.startyear=startyear;
    }
    public String getInsurance(){
        return insurance;
    }
    public void setInsurance(String insurance){
        this.insurance=insurance;
    }
}
