package practice260310;

public class practice1 {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount();
        System.out.println(sa.balance);
    }
}

class Account {
    int balance;

//    Account(){ //case 1 : 기본생성자가 있는 경우, 자식 클래스에 생성자를 안만들어도 동작, 부모의 기본 생성자가 자동으로 호출됨
//        balance = 0;
//    }

    Account(int balance) { // case 2 : 부모에 매개변수 생성자만 있는 경우 에러발생,
                           // 부모의 기본 생성자가 없는데, 자식은 자동으로 기본생성자를 호출하려고 하기 때문
        this.balance = balance;
    }

    Account() { // case 3 : 기본 생성자를 만들어 두면 자식 클래스는 자동으로 기본 생성자를 인식함
        this.balance = 0;
    }

}

class SavingAccount extends Account {
    //case 1 :

}