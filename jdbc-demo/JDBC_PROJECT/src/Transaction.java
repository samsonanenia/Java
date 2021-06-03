public class Transaction {
    int transaction_id;
    String transaction_type;
    double amount;
    int account_no;

    public Transaction(int transaction_id, String transaction_type, double amount, int account_no) {
        this.transaction_id = transaction_id;
        this.transaction_type = transaction_type;
        this.amount = amount;
        this.account_no = account_no;
    }

    public int getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getTransaction() {
        return transaction_type;
    }

    public void setTransaction_type(String transaction) {
        this.transaction_type = transaction;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getAccount_no() {
        return account_no;
    }

    public void setAccount_no(int account_no) {
        this.account_no = account_no;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transaction_id=" + transaction_id +
                ", transaction='" + transaction_type + '\'' +
                ", amount=" + amount +
                ", account_no=" + account_no +
                '}';
    }
}
