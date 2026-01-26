/* 3. Online Library application with LibraryUser interface and role-based registration/request. */
interface LibraryUser {
    void registerAccount();
    void requestBook();
}
class KidUser implements LibraryUser {
    int age; String bookType;
    KidUser(int age, String bookType) { this.age = age; this.bookType = bookType; }
    public void registerAccount() {
        if(age < 12) System.out.println("Successfully registered under a Kids Account");
        else System.out.println("Sorry, Age must be less than 12 to register as a kid");
    }
    public void requestBook() {
        if(bookType.equals("Kids")) System.out.println("Book Issued successfully, return in 10 days");
        else System.out.println("Oops, you are allowed to take only kids books");
    }
}
class AdultUser implements LibraryUser {
    int age; String bookType;
    AdultUser(int age, String bookType) { this.age = age; this.bookType = bookType; }
    public void registerAccount() {
        if(age > 12) System.out.println("Successfully registered under an Adult Account");
        else System.out.println("Sorry, Age must be greater than 12 to register as an adult");
    }
    public void requestBook() {
        if(bookType.equals("Fiction")) System.out.println("Book Issued successfully, return in 7 days");
        else System.out.println("Oops, you are allowed to take only adult Fiction books");
    }
}
public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUser k = new KidUser(10, "Kids"); k.registerAccount(); k.requestBook();
        AdultUser a = new AdultUser(25, "Fiction"); a.registerAccount(); a.requestBook();
    }
}