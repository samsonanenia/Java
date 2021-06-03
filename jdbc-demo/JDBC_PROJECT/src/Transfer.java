public class Transfer {
    int transfer_id;
    int from_account;
    int to_account;
    double amount;
    String reason;

    public Transfer(int transfer_id, int from_account, int to_account, double amount, String reason) {
        this.transfer_id = transfer_id;
        this.from_account = from_account;
        this.to_account = to_account;
        this.amount = amount;
        this.reason = reason;
    }

    public int getTransfer_id() {
        return transfer_id;
    }

    public void setTransfer_id(int transfer_id) {
        this.transfer_id = transfer_id;
    }

    public int getFrom_account() {
        return from_account;
    }

    public void setFrom_account(int from_account) {
        this.from_account = from_account;
    }

    public int getTo_account() {
        return to_account;
    }

    public void setTo_account(int to_account) {
        this.to_account = to_account;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Transfer{" +
                "transfer_id=" + transfer_id +
                ", from_account=" + from_account +
                ", to_account=" + to_account +
                ", amount=" + amount +
                ", reason='" + reason + '\'' +
                '}';
    }
}
