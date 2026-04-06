package practice.practice260406.practice3;

import practice.practice260406.practice2.Account;

public class SavingAccount extends Account {
    SavingAccount(int balance) {
        super(balance);
    }

    @Override
    public void showInfo(){
        System.out.println("SavingAccount : " + balance);
    } //오버라이딩 시 접근제어자는 같거나 더 넓게만 가능 좁게는 안됨.
}
