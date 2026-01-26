import test_package.Foundation;

public class AccessTest {
    public static void main(String[] args) {
        Foundation f = new Foundation();
        // System.out.println(f.var1); // Compile Error: private
        // System.out.println(f.var2); // Compile Error: default (different package)
        // System.out.println(f.var3); // Compile Error: protected (not a subclass)
        System.out.println("Only public var4 is accessible: " + f.var4);
    }
}