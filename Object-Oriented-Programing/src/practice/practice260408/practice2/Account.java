package practice.practice260408.practice2;

public class Account {
    int balance;
    Account(int balance) {
        this.balance = balance;
    }
    void showInfo(){
        System.out.println("Account balance : " + balance);
    }
}
