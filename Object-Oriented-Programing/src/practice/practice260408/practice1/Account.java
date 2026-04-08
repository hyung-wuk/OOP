package practice.practice260408.practice1;

public class Account implements Printable {
    int balance;
    public Account(int balance) {
        this.balance = balance;
    }
    @Override
    public void printInfo() {
        System.out.println("일반 계좌 잔액 : " + balance);
    }
}
