package practice.practice260422.practice3;

public class Account {
    int balance;
    Account(int balance) {
        this.balance = balance;
    }

    public boolean equals(Object obj){
        Account other = (Account)obj;
        return balance==other.balance;
    }
}

class Main{
    public static void main(String[] args) {
        Account account = new Account(1000);
        Account account2 = new Account(1000);

        System.out.println(account.equals(account2));
    }
}
