/* 2. Abstract class Compartment with polymorphic notice() method for rail coaches. */
import java.util.Random;
abstract class Compartment {
    public abstract String notice();
}
class FirstClass extends Compartment { public String notice() { return "First Class: Luxury"; } }
class Ladies extends Compartment { public String notice() { return "Ladies: Reserved for Women"; } }
class General extends Compartment { public String notice() { return "General: Open to all"; } }
class Luggage extends Compartment { public String notice() { return "Luggage: Only for items"; } }

public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] c = new Compartment[10];
        Random r = new Random();
        for(int i=0; i<10; i++) {
            int n = r.nextInt(4) + 1;
            if(n==1) c[i] = new FirstClass();
            else if(n==2) c[i] = new Ladies();
            else if(n==3) c[i] = new General();
            else c[i] = new Luggage();
            System.out.println(c[i].notice());
        }
    }
}