package practice.practice260327.practice3;

public class Account{
    protected int balance = 0;

    public void deposit(int money){
        if (money > 0){
            balance += money;
        }
    }

    public void showBalance(){
        System.out.println("잔액 : " + balance);
    }
}
