package practice260312;

public class practice1 {
    public static void main(String[] args) {
        SavingAccount s = new SavingAccount(1000);
        s.deposit(500);
        s.deposit(300, "이자 포함 입금");
        s.showInfo();
    }
}

class Account{
    int balance;

    Account (int balance){
        this.balance = balance;
    }

    void deposit(int money){
        balance += money;
    }

    void deposit(int money, String message){
        balance += money;
        System.out.println(message);
    }

    void showInfo(){
        System.out.println("일반 계좌 잔액 : " + balance);
    }
}

class SavingAccount extends Account{
    SavingAccount (int balance){
        super(balance);
    }//부모 클래스에 기본 생성자가 없어서 super로 직접 밸런스에 매개변수 떄려박기

    @Override
    void showInfo(){
        System.out.println("저축 계좌 잔액 : " + balance);
    }
}