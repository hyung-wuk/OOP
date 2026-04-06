//추상 클래스 없이 만들었을 때
package practice.practice260406.practice1;

class Account {
    int balance;

    Account(int balance) {
        this.balance = balance;
    }
    void deposit(int money) {
        balance += money;
    }
    void showInfo(){
        System.out.println("잔액 : " + balance);
    }
}
