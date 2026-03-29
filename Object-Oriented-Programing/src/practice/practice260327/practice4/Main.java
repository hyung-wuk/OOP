package practice.practice260327.practice4;

public class Main {
    public static void main(String[] args) {
        _Account a = new _Account();

        a.deposit(1000);
        a.withdraw(300);
        a.withdraw(5000); // 잔액 부족 -> 실행되지 않음
        a.showBalance();
    }
}
