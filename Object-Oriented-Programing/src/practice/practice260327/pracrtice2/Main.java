//private 적용하기
package practice.practice260327.pracrtice2;

public class Main {
    public static void main(String[] args) {
        Account a = new Account();

        //a.balance = 5000; //에러
        a.showBalance();
    }
}

class Account{
    private int balance = 1000;
    public void showBalance(){
        System.out.println("잔액" + this.balance);
    }
}