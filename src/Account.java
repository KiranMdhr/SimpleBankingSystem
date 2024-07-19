public class Account {
    private int accountNo;
    private String accountName;
    private double accountBalance;

    public Account(int accountNo, String accountName, double accountBalance) {
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String toString() {
        return ("Your Account No is" + accountNo + "Your Account Name is" + accountName + "Your currentBalance is" + accountBalance);

    }


    public void addBalance() {

    }


}
