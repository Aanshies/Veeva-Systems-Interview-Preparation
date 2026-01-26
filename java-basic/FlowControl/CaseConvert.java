/* 7. Convert lowercase to uppercase and vice versa. Format: a->A */
public class CaseConvert {
    public static void main(String[] args) {
        char c = 'a';
        if (Character.isLowerCase(c)) System.out.println(c + "->" + Character.toUpperCase(c));
        else System.out.println(c + "->" + Character.toLowerCase(c));
    }
}