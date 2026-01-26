/* 1. InsufficientFundsException: Custom exception class with Error Code. 
Build a bank account where withdraw() throws this if balance is low. */
class InsufficientFundsException extends Exception {
    private int errorCode;
    public InsufficientFundsException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
    public int getErrorCode() { return errorCode; }
}

class BankAccount {
    private double balance = 500.0;
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Balance thakkuvaga undhi!", 404);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Balance: " + balance);
    }
}

public class CustomBankException {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        try {
            account.withdraw(1000.0);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage() + " (Code: " + e.getErrorCode() + ")");
        }
    }
}