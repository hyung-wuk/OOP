package practice.practice260422.practice1;

public class Account {
    int balance;

    Account (int balance){
        this.balance = balance;
    }

    public String toString(){
        return "잔액 : " + balance;
    }
}

class Main{
    public static void main(String[] args) {
        Account account = new Account(1000);
        System.out.println(account);
    }
}
