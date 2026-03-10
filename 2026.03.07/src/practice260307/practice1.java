package practice260307;

public class practice1 {
    public static void main (String[] args){
        Account a1=new Account();
        Account a2=new Account();

        a1.balance=1000;
        a2.balance=2000;

        Account.rate = 0.1;

        System.out.println("a1.balance is "+a1.balance);
        System.out.println("a2.balance is "+a2.balance);

        System.out.println("rate = "+ Account.rate);

        //balance는 객체 마다 다름
        //rate는 모두 공유
    }
}

class Account {
    static double rate = 0.05;
    int balance = 0;
}