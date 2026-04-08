package practice.practice260408.practice1;

public class SavingAccount  extends Account implements Printable {
    public SavingAccount(int balance) {
        super(balance);
    }
    @Override
    public void printInfo() {
        System.out.println("Saving Account : " + balance);
    }
}
