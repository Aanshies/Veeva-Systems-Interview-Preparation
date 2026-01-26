/* 1. Write a program to initialize an integer array and print the sum and average of the array. */
public class ArraySumAvg {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i : numbers) sum += i;
        double avg = (double) sum / numbers.length;
        System.out.println("Sum: " + sum + ", Average: " + avg);
    }
}