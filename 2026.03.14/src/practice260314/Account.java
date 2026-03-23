package practice260314;

public class Account {
    protected int balance;

    public Account(int balance) {
        this.balance = balance;
    }
    public void deposit(int money) {
        this.balance += money;
    }
    protected void deposit(int money, String message) {
        this.balance += money;
        System.out.println(message + " / " + money + "원");
    }
    protected void deposit(double money){
        this.balance += (int)money;
        System.out.println((int)money + "원 입금 (double)");
    }
    public void showInfo(){
        System.out.println("잔액 : " + this.balance);
    }
}
