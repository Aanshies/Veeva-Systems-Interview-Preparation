class InsufficientFundsException extends Exception {

    private int errorCode;

    public InsufficientFundsException(String message, int errorCode) {
        super(message);          
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}

class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(
                "Withdrawal failed: Insufficient balance",
                1001
            );
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(500);

        try {
            account.withdraw(800);
        } catch (InsufficientFundsException e) {
            System.out.println("Error Message: " + e.getMessage());
            System.out.println("Error Code: " + e.getErrorCode());
        }

        System.out.println("Final Balance: " + account.getBalance());
    }
}
