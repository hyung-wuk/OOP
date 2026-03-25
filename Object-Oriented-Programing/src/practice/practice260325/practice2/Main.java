//직접 만든 클래스도 API처럼 보기
package practice.practice260325.practice2;

public class Main {
    public static void main(String[] args) {
        Account a = new Account(1000);

        a.deposit(500);
        a.withdraw(200);
        a.showInfo();
    }
    //deposit(), withdraw(), showInfo()도 일종의 API
    //내가 만든 클래스도 기능을 제공하는 도구가 될 수 있음
}
