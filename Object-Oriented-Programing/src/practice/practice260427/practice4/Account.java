package practice.practice260427.practice4;

public class Account {
    int balance;

    Account(int balance) {
        this.balance = balance;
    }
}

class Main{
    static void change(Account acc){
        acc = new Account(5000);
    }
    public static void main(String[] args) {
        Account a = new Account(1000);

        change(a);

        System.out.println("a.balance : " + a.balance); //결과값 = 100
    }
}
//메서드에서 새로운 객체를 생성하여 대입하였기에 원본객체는 바뀌지 않음
