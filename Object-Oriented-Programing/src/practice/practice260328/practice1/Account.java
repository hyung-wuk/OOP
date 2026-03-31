package practice.practice260328.practice1;

class Account {
    private int balance = 0;

    public void deposit(int money) {
        if (money > 0) {
            balance += money;
        }
    }
    public void withdraw(int money) {
        if (money > 0 && balance >= money) {
            balance -= money;
        }
    }

    public void showBalance() {
        System.out.println("잔액 : " + balance);
    }
}
