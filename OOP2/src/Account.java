public class Account {
    private String firstName;
    private String lastName;
    private long accountNo;
    private double balance;

    public static long accountNoIncrement = 1000;

    public Account(String firstName, String lastName, double balance ){
        this.firstName =firstName;
        this.lastName = lastName;
        accountNoIncrement++;
        this.accountNo = accountNoIncrement + 1;
        this.balance =balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accountNo=" + accountNo +
                ", balance=" + balance +
                '}';
    }

    public void debit(double withdraw){
        if(balance < withdraw){
            System.out.println("Insufficient balance");
        }else {
            balance = balance - withdraw;
            System.out.println("Your current balance is: " + balance);
        }
    }
    public void credit(double deposit){
        balance = balance + deposit;
    }


}
