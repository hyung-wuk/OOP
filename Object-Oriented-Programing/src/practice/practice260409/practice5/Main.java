package practice.practice260409.practice5;

public class Main {
    public static void main(String[] args) {
        Printable[] arr = new Printable[3];

        arr[0] = new Account(1000);
        arr[1] = new SavingAccount(2000);
        arr[2] = new LoanAccount(5000);

        for(Printable p : arr){
            p.printInfo();
        }
    }
}
