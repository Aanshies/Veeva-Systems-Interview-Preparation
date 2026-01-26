/* 2. Functional Interface with Lambda expressions for Addition and Multiplication. */
interface Test {
    int myFunction(int a, int b, int c);
}
public class LambdaTest {
    public static void main(String[] args) {
        Test t1 = (a, b, c) -> a + b + c;
        Test t2 = (a, b, c) -> a * b * c;
        System.out.println("Sum: " + t1.myFunction(10, 20, 30));
        System.out.println("Product: " + t2.myFunction(10, 20, 30));
    }
}