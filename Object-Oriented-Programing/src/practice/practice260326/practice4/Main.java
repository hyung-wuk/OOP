package practice.practice260326.practice4;

public class Main {
    public static void main(String[] args) {
        Account a = new Account();

        //a.balance = 5000; //에러 발생
        a.showBalance();
    }
}

class Account{
    private int balance = 1000;

    public void showBalance(){
        System.out.println(balance);
    }
}