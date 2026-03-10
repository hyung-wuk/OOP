package practice260308;

public class practice2 {
    public static void main(String[] args) {
        Account4 a1=new Account4(1000);

        a1.deposit(500);
        a1.withdraw(200);
        a1.showbalance();
    }
}

class Account4{
    int balance;
    Account4(int balance){
        this.balance = balance;
    }

    void deposit(int money){
        balance += money;
    }

    void withdraw(int money){
        balance -= money;
    }

    void showbalance(){
        System.out.println("잔액 : " + balance);
    }
}