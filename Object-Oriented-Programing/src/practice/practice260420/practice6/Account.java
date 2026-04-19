package practice.practice260420.practice6;

public class Account {
    private int balance;
    Account(int balance) {
        this.balance = balance;
    }
    public void withdraw(int money){
        try {
            if (balance < money) {
                throw new ArithmeticException("잔액 부족");
            }
            balance -= money;
            System.out.println("출금 완료");
        }catch (ArithmeticException e){
            System.out.println("출금 실패 : "+e.getMessage());
        }finally {
            System.out.println("현재 잔액 : " + balance);
        }
    }
}
//throw는 강제로 예외를 발생 시킨다.
//만일 프로그램적으로 에러가 아니라도 로직상 개발자가 일부러 에러를 내서 로그에 기록하고 싶은 상황이 올 수 있다.
//자바에서는 throw 키워드를 사용하여 강제로 예외를 발생시킬 수 있다.
//원래는 프로그램이 알아서 에러를 탐지하고 처리 하였지만, 이번에는 사용자가 일부러 에러를 throw하여 에러를 catch 한다는 개념
