package practice260324.bank;

import practice260324.account.Account;

public class SavingAccount extends Account {
    public SavingAccount(int balance) {
        super(balance);
    }

    @Override
    public void showInfo() {
        System.out.println("저축 계좌 잔액 : " + balance);
    }

}
