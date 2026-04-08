package practice.practice260408.practice3;

public class CheckingAccount extends Account {
    public CheckingAccount(int balance) {
        super(balance);
    }

    @Override
    void showInfo() {
        System.out.println("체크 계좌 잔액 : " + balance);
    }
}
