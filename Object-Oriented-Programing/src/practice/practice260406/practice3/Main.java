package practice.practice260406.practice3;

public class Main {
    public static void main(String[] args) {
        SavingAccount s = new SavingAccount(1000);
        CheckingAccount c = new CheckingAccount(1000);

        s.deposit(1000);
        c.deposit(3000);

        s.showInfo();
        c.showInfo();
    }
}
