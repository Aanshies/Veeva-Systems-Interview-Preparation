/* 4. Display two character variables in alphabetical order. */
public class AlphabetOrder {
    public static void main(String[] args) {
        char c1 = 's', c2 = 'e';
        if (c1 < c2) System.out.println(c1 + "," + c2);
        else System.out.println(c2 + "," + c1);
    }
}