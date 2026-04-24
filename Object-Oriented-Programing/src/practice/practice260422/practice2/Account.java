package practice.practice260422.practice2;

public class Account implements Cloneable {
    int balance;
    public Account(int balance) {
        this.balance = balance;
    }
    @Override
    public String toString (){
        return balance+"";
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Main{
    public static void main(String[] args) {
        Account account = new Account(1000);
        try {
            Account account1 = (Account) account.clone();
            System.out.println(account);
            System.out.println(account1);
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}