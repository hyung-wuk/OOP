package practice.practice260327.practice3;

public class Main {
    public static void main(String[] args) {
        Account a = new Account();

        a.deposit(1000);
        a.deposit(-500); //무시됨
        a.showBalance();
    }
}

