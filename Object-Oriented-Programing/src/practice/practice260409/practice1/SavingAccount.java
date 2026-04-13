package practice.practice260409.practice1;

public class SavingAccount extends Account {
    public SavingAccount(int balance) {
        super(balance);
    }

    @Override
    public void showInfo(){
        System.out.println("저축 계좌 잔액 : " + balance);
    }
    public void addInterest(){
        balance +=100;
    }
}
