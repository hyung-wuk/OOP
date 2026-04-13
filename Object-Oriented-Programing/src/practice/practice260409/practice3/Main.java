package practice.practice260409.practice3;

import practice.practice260409.practice1.Account;
import practice.practice260409.practice1.SavingAccount;

public class Main {
    public static void main(String[] args) {
        Account acc = new SavingAccount(1000);

        if (acc instanceof SavingAccount) {
            SavingAccount sa = (SavingAccount) acc;
            sa.addInterest();
            sa.showInfo();
        }
        //다운캐스팅
        //부모타입으로 담은 객체를 다시 자식타입으로 바꿀 수 있음
    }
}
