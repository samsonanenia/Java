import java.text.DecimalFormat;

public class Account {
    int account_no;
    String first_name;
    String last_name;
    double balance;

    public Account(int account_no, String first_name, String last_name, double balance) {
        this.account_no = account_no;
        this.first_name = first_name;
        this.last_name = last_name;
        this.balance = balance;
    }

    public int getAccount_no() {
        return account_no;
    }

    public void setAccount_no(int account_no) {
        this.account_no = account_no;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double decimal) {
        this.balance = decimal;
    }

    @Override
    public String toString() {
        return "account{" +
                "account_no=" + account_no +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", decimal=" + balance +
                '}';
    }
}
