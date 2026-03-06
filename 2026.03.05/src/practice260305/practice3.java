package practice260305;

public class practice3 {
    public static void main(String[] args) {
        Account a1 = new Account();

        a1.deposit(1000);
        a1.withdraw(500);
        a1.showBalance();
    }
}

class Account {
    int balance = 0;

    void deposit(int money){
        balance += money;
    }

    void withdraw(int money){
        balance -= money;
    }

    void showBalance(){
        System.out.println(balance);
    }
}