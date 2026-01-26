/* 5. Write a program to remove the duplicate elements in an array and print the same. */
import java.util.Arrays;
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int n = arr.length;
        if (n == 0 || n == 1) return;
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i+1]) arr[j++] = arr[i];
        }
        arr[j++] = arr[n-1];
        for (int k = 0; k < j; k++) System.out.print(arr[k] + " ");
    }
}