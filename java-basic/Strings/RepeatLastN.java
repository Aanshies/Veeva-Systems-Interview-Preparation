/* 10. Repeat last n characters n times. Example: Wipro, 3 -> propropro */
public class RepeatLastN {
    public static void main(String[] args) {
        String s = "Wipro"; int n = 3;
        String sub = s.substring(s.length() - n);
        for (int i = 0; i < n; i++) System.out.print(sub);
        System.out.println();
    }
}