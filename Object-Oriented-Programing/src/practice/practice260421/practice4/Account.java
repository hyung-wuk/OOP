package practice.practice260421.practice4;

public class Account {
    private int balance;

    public Account(int balance){
        this.balance = balance;
    }

    public void withdraw(int money) throws BalanceException{
        if(balance<money){
            throw new BalanceException("계좌 잔액이 부족합니다");
        }
        balance = balance - money;
    }

    public void showBalance(){
        System.out.println(balance);
    }
}
