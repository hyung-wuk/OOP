package practice.practice260328.practice2;

public class Account {
    private int balance = 0;

    public void deposit(int money){
        if(isValidMoney(money)){
            balance += money;
        }
    }

    public void showBalance(){
        System.out.println("잔액 : " + balance);
    }

    private boolean isValidMoney(int money){
        return money > 0;
    }
}
