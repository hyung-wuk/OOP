//접근제어자 없이 직접 접근하는 문제 보기
package practice.practice260327.pracrtice1;

public class Main {
    public static void main(String[] args) {
        Account a = new Account();

        a.balance = -1000; // 이상한 값도 그냥 들어감
        System.out.println(a.balance);
    }
}

class Account{
    int balance;
}