package practice.practice260408.practice1;

public class Main {
    public static void main(String[] args) {
        Account a = new Account(3000);
        Account b = new SavingAccount(2000);

        a.printInfo();
        b.printInfo();

    }
}
