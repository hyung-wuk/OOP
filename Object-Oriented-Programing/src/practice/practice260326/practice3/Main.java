package practice.practice260326.practice3;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();

        account.balance = -1000; //문제 있는 값도 직접 넣을 수 있음
        System.out.println(account.balance);
        //접근 제어자 없을 때 문제점
        //외부에서 직접 값을 건드릴 수 있음
    }
}
