package practice.practice260409.practice1;

public class Main {
    public static void main(String[] args) {
        Account a1 = new Account(1000);
        Account a2 = new SavingAccount(2000);
        Account a3 = new CheckingAccount(3000);

        a1.showInfo();
        a2.showInfo();
        a3.showInfo();
        //a2.addInterest() //불가
        //실체 객체는 SavingAccount이나 변수타입이 Account이기 때문에 Account에 없는 메서드는 직접 쓰지 못함
    }
}
