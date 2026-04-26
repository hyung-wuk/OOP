package practice.practice260427.practice3;

public class Account {
    int balance;

    Account(int balance) {
        this.balance = balance;
    }
}

class Main {
    static void change(Account acc){
        acc.balance = 999;
    }
    public static void main(String[] args) {
        Account a = new Account(1000);

        change(a);

        System.out.println("a.balance : "+a.balance);
    }
}
//메서드로 객체전달
