package practice.practice260409.practice5;

public class SavingAccount extends Account implements Printable {
    SavingAccount(int balance) {
        super(balance);
    }

    @Override
    public void printInfo(){
        System.out.println("저축 계좌 잔액 : " + balance);
    }
}
