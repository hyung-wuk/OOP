package practice260309;

public class practice2 {
    public static void main(String[] args) {
        Account c1 = new Account();
        SavingAccount s1 = new SavingAccount();

        c1.deposit(500);
        c1.withdraw(200);
        s1.addInterest();
        s1.deposit(500);
        s1.withdraw(200);

        c1.showBalance();
        s1.showBalance();
    }
}

class _Account{
    int balance;

    public void deposit(int money){
        balance+=money;
    }
    public void withdraw(int money){
        balance-=money;
    }
    public void showBalance(){
        System.out.println(balance);
    }
}

class _SavingsAccount extends _Account{
    public void addInterest(){
        balance+=100;
    }
}
