package practice260314;

public class practice1 {
    public static void main(String[] args) {
        Account a = new Account(1000);
        a.deposit(500);
        a.deposit(300, "보너스");
        a.deposit(200.5);

        a.showInfo();
    }
}

