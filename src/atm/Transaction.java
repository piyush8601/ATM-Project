// package atm;

import java.time.LocalDateTime;

public class Transaction {
    private String type;
    private double amount;
    private double balanceAfterTransaction;
    private LocalDateTime timestamp;

    public Transaction(String type, double amount, double balanceAfterTransaction) {
        this.type = type;
        this.amount = amount;
        this.balanceAfterTransaction = balanceAfterTransaction;
        this.timestamp = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return String.format("%s | %s | Amount: %.2f | Balance After: %.2f",timestamp, type, amount, balanceAfterTransaction);
    }
}

