package practice260324.account;

public class Account {
    protected int balance;

    public Account(int balance) {
        this.balance = balance;
    }
    public void showInfo() {
        System.out.println("balance = " + balance);
    }
}
