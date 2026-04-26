package practice.practice260427.practice2;

public class Account {
    int balance;

    Account(int balance){
        this.balance = balance;
    }
}

class Main{
    public static void main(String[] args) {
        Account a = new Account(1000);
        Account b = a;

        b.balance = 2000;

        System.out.println("a.balance : " + a.balance);
        System.out.println("b.balance : " + b.balance);
    }
}
//객체 참조 복사
//같은 객체를 공유하기에 하나를 바꾸면 같이 바뀜
