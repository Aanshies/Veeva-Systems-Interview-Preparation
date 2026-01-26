/* 2. Handle ArrayIndexOutOfBoundsException when accessing user-defined index. */
import java.util.Scanner;
public class ArrayAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter array size:");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter elements:");
            for(int i=0; i<n; i++) arr[i] = sc.nextInt();
            System.out.println("Enter index to access:");
            int idx = sc.nextInt();
            System.out.println("Element at index " + idx + " = " + arr[idx]);
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        }
    }
}