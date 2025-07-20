package SceneraioQuestion;

public class CustomerAccount {
    private int id;
    private String customerName;
    private double balance;

    public CustomerAccount(int id, String customerName, double balance) {
        this.id = id;
        this.customerName = customerName;
        this.balance = balance;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // A method to deposit money, which we will use to add 500
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    @Override
    public String toString() {
        return "CustomerAccount{" +
               "id=" + id +
               ", customerName='" + customerName + '\'' +
               ", balance=" + balance +
               '}';
    }
}
