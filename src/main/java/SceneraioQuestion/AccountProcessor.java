package SceneraioQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AccountProcessor {

    public static void main(String[] args) {
        // 1. Create a list of customer accounts
        List<CustomerAccount> accounts = new ArrayList<>();
        accounts.add(new CustomerAccount(101, "Alice", 500.0));
        accounts.add(new CustomerAccount(102, "Bob", 1500.0));
        accounts.add(new CustomerAccount(103, "Charlie", 999.0));
        accounts.add(new CustomerAccount(104, "David", 2500.0));
        accounts.add(new CustomerAccount(105, "Eve", 1000.0)); // This will be excluded

        System.out.println("--- Original Account Balances ---");
        accounts.forEach(System.out::println);

        // 2. Java 8 Stream to filter and update
        // The stream pipeline filters accounts and then adds 500 to the balance
        // of the *original* objects in the list.
        List<CustomerAccount> highBalanceAccounts = accounts.stream()
                .filter(account -> account.getBalance() > 1000) // Filter accounts with balance > 1000
                .peek(account -> account.deposit(500))         // Add 500 to the balance of each filtered account
                .collect(Collectors.toList());                 // Collect the results into a new list

        System.out.println("\n--- Accounts with Original Balance > 1000 (after adding 500) ---");
        highBalanceAccounts.forEach(System.out::println);

        System.out.println("\n--- Full Account List After Operation ---");
        // Note that the original list is modified because peek() operates on the original objects.
        accounts.forEach(System.out::println);
    }
}
