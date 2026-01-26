/* 3. Count word occurrences and write to output file in alphabetical order. */
import java.io.*;
import java.util.*;
public class FileWordCount {
    public static void main(String[] args) {
        if (args.length < 2) return;
        Map<String, Integer> map = new TreeMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
            String line;
            while ((line = br.readLine()) != -1) {
                String[] words = line.split("\\s+");
                for (String w : words) {
                    map.put(w, map.getOrDefault(w, 0) + 1);
                }
            }
            try (PrintWriter pw = new PrintWriter(new FileWriter(args[1]))) {
                for (Map.Entry<String, Integer> entry : map.entrySet()) {
                    pw.println(entry.getKey() + " : " + entry.getValue());
                }
            }
            System.out.println("Word count complete. Check " + args[1]);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}