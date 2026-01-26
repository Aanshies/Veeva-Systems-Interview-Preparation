/* 3. Patient class to compute BMI. BMI = weight / (height * height). */
class Patient {
    String name; double height, weight;
    Patient(String n, double h, double w) { name = n; height = h; weight = w; }
    double computeBMI() { return weight / (height * height); }
}
public class PatientBMI {
    public static void main(String[] args) {
        Patient p = new Patient("Ammu", 1.6, 50.0);
        System.out.println("BMI of " + p.name + " is: " + p.computeBMI());
    }
}