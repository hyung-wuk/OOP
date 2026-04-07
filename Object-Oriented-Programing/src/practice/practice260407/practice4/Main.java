package practice.practice260407.practice4;

public class Main {
    public static void main(String[] args) {
        Account a = new Account(3000);
        SavingAccount s1 = new SavingAccount(5000);

        a.printInfo();
        s1.printInfo();
    }
}
