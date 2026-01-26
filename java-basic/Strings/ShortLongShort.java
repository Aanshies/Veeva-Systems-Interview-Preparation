/* 6. Given 2 strings, return short+long+short. Example: hi, hello -> hihellohi */
public class ShortLongShort {
    public static void main(String[] args) {
        String a = "hi", b = "hello";
        if (a.length() < b.length()) System.out.println(a + b + a);
        else System.out.println(b + a + b);
    }
}