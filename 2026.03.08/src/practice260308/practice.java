package practice260308;

public class practice {
    public static void main(String[] args) {
        Account3 a = new Account3(1000);
        Account3 b = new Account3(2000);

        a.showbalance();
        b.showbalance();
    }
}

class Account3{
    int balance;
    Account3(int balance){
        this.balance = balance;
    }
    void showbalance(){
        System.out.println("잔액 : " + balance);
    }
}