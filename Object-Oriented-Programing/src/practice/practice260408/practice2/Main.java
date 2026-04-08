package practice.practice260408.practice2;

public class Main {
    public static void main(String[] args) {
        Account a1 = new Account(1000);
        Account a2 = new SavingAccount(2000);

        a1.showInfo();
        a2.showInfo();
    }
}
