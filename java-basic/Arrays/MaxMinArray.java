/* 2. Write a program to initialize an integer array and find the maximum and minimum value of the array. */
public class MaxMinArray {
    public static void main(String[] args) {
        int[] arr = {10, 2, 54, 1, 67};
        int max = arr[0], min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("Max: " + max + ", Min: " + min);
    }
}