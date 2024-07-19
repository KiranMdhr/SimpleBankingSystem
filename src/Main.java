//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Account a1 = new Account(101,"Hari Bahadur Shrestha",40000);

Bank b =  new Bank("NationalBankLimited","New Road");

b.viewAccount();
b.addAccount(a1);
b.addAccount(a1);
b.addAccount(a1);
b.viewAccount();
b.removeAccount(101);
        b.viewAccount();
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    }
}