package OOP.Module0.Bai6;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {
    private long accountNumber;
    private String accountName;
    private double balance;
    private final double RATE = 0.035;

    public Account() {
        accountNumber = 999999;
        accountName = "Chua xac dinh";
        balance = 50000;
    }

    public Account(long accountNumber, String accountName, double balance) {
        if (accountNumber > 0) {
            this.accountNumber = accountNumber;
        } else {
            this.accountNumber = 999999;
        }

        if (!accountName.trim().equals("")) {
            this.accountName = accountName;
        } else {
            this.accountName = "Chua xac dinh";
        }

        if (balance >= 50000.0) {
            this.balance = balance;
        } else {
            this.balance = 50000.0;
        }
    }

    public Account(long accountNumber, String accountName) {
        if (accountNumber > 0) {
            this.accountNumber = accountNumber;
        } else {
            this.accountNumber = 999999;
        }

        if (!accountName.trim().equals("")) {
            this.accountName = accountName;
        } else {
            this.accountName = "Chua xac dinh";
        }

        balance = 50000;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if (amount > 0.0) {
            balance += amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw(double amount, double fee) {
        if (amount >= 0.0 && balance >= amount + fee) {
            balance = balance - (amount + fee);
            return true;
        } else {
            return false;
        }
    }

    public void addInterest() {
        balance = balance + balance * RATE;
    }

    public boolean transfer(Account acc2, double amount) {
        if (acc2.balance >= amount && amount > 0.0) {
            balance = balance + amount;
            acc2.balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        Locale local = new Locale("vi", "vn");
        NumberFormat nf = NumberFormat.getCurrencyInstance(local);
        return String.format("%-20d %-30s %20s", accountNumber, accountName, nf.format(balance));
    }
}
