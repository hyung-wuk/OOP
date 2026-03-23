package practice260314_3;

import practice260314.Account;
import practice260314_2.SavingAccount;

public class Main {
    public static void main(String[] args) {
        Account a = new Account(1000);
        SavingAccount s = new SavingAccount(2000);

        a.deposit(500);
        s.deposit(500);

        a.showInfo();
        s.showInfo();
    }
}
