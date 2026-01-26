/* 2. Copy contents from one file to another. */
import java.io.*;
import java.util.Scanner;
public class FileCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input file name:");
        String input = sc.next();
        System.out.println("Enter the output file name:");
        String output = sc.next();
        try (FileReader fr = new FileReader(input); FileWriter fw = new FileWriter(output)) {
            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }
            System.out.println("File is copied.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}