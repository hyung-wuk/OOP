package practice.practice260408.practice3;

public class SavingAccount extends Account{
    SavingAccount(int balance) {
        super(balance);
    }

    @Override
    void showInfo() {
        System.out.println("저축 계좌 잔액 : " + balance);
    }
}
