package practice260324.account;

import practice260324.bank.SavingAccount;

public class Main {
    public static void main(String[] args) {
        Account a = new Account(1000);
        SavingAccount s1 = new SavingAccount(1000);
        a.showInfo();
        s1.showInfo();
    }
}
