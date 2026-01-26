/* 5. Custom Exception: InvalidCountryException for non-India users. */
class InvalidCountryException extends Exception {
    public InvalidCountryException(String msg) { super(msg); }
}
public class UserRegistration {
    public void registerUser(String name, String country) throws InvalidCountryException {
        if (!country.equals("India")) 
            throw new InvalidCountryException("User Outside India cannot be registered");
        else 
            System.out.println("User registration done successfully");
    }
    public static void main(String[] args) {
        UserRegistration reg = new UserRegistration();
        try {
            reg.registerUser("Mickey", "US");
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }
    }
}