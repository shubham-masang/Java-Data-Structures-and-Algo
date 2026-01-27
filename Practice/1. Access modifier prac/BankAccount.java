
class BankAcc {

    private String accountHolderName;
    private double balance;

    public BankAcc(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        } else {
            System.err.println("amount less than zero, cannot be deposited");
        }
    }

    public Double getBalance() {
        return balance;
    }

}

public class BankAccount {

    public static void main(String[] args) {
        BankAcc a1 = new BankAcc("Shubham", 1000);
        System.out.println(a1.getBalance());
        a1.deposit(500);
        System.out.println(a1.getBalance());
        a1.deposit(-2000);
        System.out.println(a1.getBalance());
    }
}
