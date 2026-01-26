/* 4. Find the largest 2 numbers and the smallest 2 numbers in the given array. */
import java.util.Arrays;
public class LargestSmallest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 2, 15};
        Arrays.sort(arr);
        System.out.println("Smallest: " + arr[0] + ", " + arr[1]);
        System.out.println("Largest: " + arr[arr.length-1] + ", " + arr[arr.length-2]);
    }
}