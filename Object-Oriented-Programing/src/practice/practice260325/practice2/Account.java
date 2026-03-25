package practice.practice260325.practice2;

public class Account {
    int balance;
    public Account(int balance) {
        this.balance = balance;
    }
    public void deposit(int money){
        balance += money;
    }
    public void withdraw(int money){
        balance -= money;
    }
    public void showInfo(){
        System.out.println("잔액 : " + balance);
    }
}
