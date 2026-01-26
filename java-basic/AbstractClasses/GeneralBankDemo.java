/* 1. Abstract class GeneralBank with ICICI and Kotak implementations. */
abstract class GeneralBank {
    abstract double getSavingsInterestRate();
    abstract double getFixedDepositInterestRate();
}
class ICICIBank extends GeneralBank {
    double getSavingsInterestRate() { return 4.0; }
    double getFixedDepositInterestRate() { return 8.5; }
}
class KotMBank extends GeneralBank {
    double getSavingsInterestRate() { return 6.0; }
    double getFixedDepositInterestRate() { return 9.0; }
}
public class GeneralBankDemo {
    public static void main(String[] args) {
        ICICIBank i = new ICICIBank(); KotMBank k = new KotMBank();
        GeneralBank g1 = new ICICIBank(); GeneralBank g2 = new KotMBank();
        System.out.println("ICICI Savings: " + i.getSavingsInterestRate() + "%");
        System.out.println("Kotak Savings: " + k.getSavingsInterestRate() + "%");
    }
}