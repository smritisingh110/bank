
public class Transaction {

    private String transactionType;
    private double amount;
    private long timestamp;
    
    public Transaction(String transactionType, double amount, long timestamp) {
        this.transactionType = transactionType;
        this.amount = amount;
        this.timestamp = timestamp;
    }

    public String getTransactionType(double amount) {
        return this.transactionType;
    }

    public double getAmount(double amount) {
        return this.amount;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

   
}
