package practice.practice260406.practice3;

import practice.practice260406.practice2.Account;

public class CheckingAccount extends Account {
    public CheckingAccount(int balance) {
        super(balance);
    }

    @Override
    public void showInfo(){
        System.out.println("CheckingAccount Balance: " + balance);
    }
}
