public class TransactionForStatement {
    private String timestamp;
    private Integer amount;
    private Integer balance;

    public TransactionForStatement(String timestamp, Integer amount, Integer balance) {
        this.timestamp = timestamp;
        this.amount = amount;
        this.balance = balance;
    }

    public String getTimestamp() {
        return timestamp;
    }
    public Integer getAmount() {
        return amount;
    }
    public Integer getBalance() {
        return balance;
    }
}
