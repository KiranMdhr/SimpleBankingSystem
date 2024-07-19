import java.util.HashMap;
import java.util.SortedMap;

public class Bank implements  Functionalities {
    private String bankName;
    private String bankAddress;
    HashMap<Integer, Account> accounts;


    public Bank(String bankName, String bankAddress) {
        this.bankName = bankName;
        this.bankAddress = bankAddress;
        accounts = new HashMap<>();
    }

    public void addAccount(Account account) {
        accounts.put(account.getAccountNo(), account);
    }
    public void removeAccount(){

    }
    public void viewAccount() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts available to show");
        } else {
            for (Account a : accounts.values()) {

                System.out.println("All the Account in the bank are:");
                System.out.println(a);
            }
        }
    }


    public void removeAccount(int accountNum) {
        if (accounts.containsKey(accountNum)) {
            accounts.remove(accountNum);
            System.out.println("Account " + accountNum + " has been removed.");
        } else {
            System.out.println("Account number " + accountNum + " not found.");
        }
    }

    publi


}
