package practice.practice260408.practice2;

public class SavingAccount extends Account {
    SavingAccount(int balance) {
        super(balance);
    }

    @Override
    public void showInfo(){
        System.out.println("Saving Account balance : " + balance);
    }
}
