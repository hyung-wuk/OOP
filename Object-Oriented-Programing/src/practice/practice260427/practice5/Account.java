package practice.practice260427.practice5;

public class Account {
    int balance;

    Account(int balance) {
        this.balance = balance;
    }
}

class Main{
    static void changeValue(Account acc){
        acc.balance = 3000;
    }
    static void changeObject(Account acc){
        acc = new Account(5000);
    }

    public static void main(String[] args){
        Account a1 =new Account(1000);
        changeValue(a1);
        System.out.println("a1.balance : " + a1.balance);
        //결과 = 3000

        Account a2=new Account(1000);
        changeObject(a2);
        System.out.println("a2.balance : " + a2.balance);
        //결과 = 1000
    }
}