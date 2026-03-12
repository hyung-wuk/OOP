package practice260309;

public class practice1 {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount();
        sa.deposit(500);
        sa.withdraw(200);
        sa.addInterest();
        sa.showBalance();
    }
}

class Account{
    int balance;
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

class SavingAccount extends Account{
    void addInterest() {
        balance += 100;
    }
}