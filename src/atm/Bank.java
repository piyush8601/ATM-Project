// package atm;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private static final Map<String, Account> accounts = new HashMap<>();

    static {
        // Creating a sample account for testing
        accounts.put("123456789", new Account("123456789", "1234", 1000.0));
        accounts.put("987654321", new Account("987654321", "5678", 2000.0));
    }

    public static Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }
}

