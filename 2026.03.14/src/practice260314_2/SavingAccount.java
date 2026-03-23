
package practice260314_2;

import practice260314.Account;

public class SavingAccount extends Account {
    public SavingAccount(int balance) {
        super(balance);
    }//부모 생성자가 매개변수를 받는 형태라 생성자를 이렇게 만듬

    @Override
    public void showInfo(){
        System.out.println("저축 계좌 잔액 : " + balance);
    }

}
