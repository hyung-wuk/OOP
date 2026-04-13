package practice.practice260409.practice5;

public class Account implements Printable {
    int balance;
    Account(int balance) {
        this.balance = balance;
    }

    @Override
    public void printInfo(){
        System.out.println("일반 계좌 잔액 : " + balance);
    }
}
