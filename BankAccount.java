import java.util.List;

class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;
    List<Transaction> transactionHistory;

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;

    }

    public double getBalance() {
        return this.balance;
    }

    public List<Transaction> getTransactionHistory() {
        return this.transactionHistory;

    }

    public void recordTransaction(String transactionType, double amount) //Records a transaction with the specified type (e.g., deposit, withdrawal) and amount.
    {
        Transaction transaction = new Transaction(transactionType, amount, System.currentTimeMillis());
        transactionHistory.add(transaction);
    }
}
