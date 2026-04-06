package practice.practice260406.practice2;

public abstract class Account {
    protected int balance;

    protected Account(int balance) {
        this.balance = balance;
    }
    public void deposit(int money) {
        balance += money;
    }

    protected abstract void showInfo();
}
