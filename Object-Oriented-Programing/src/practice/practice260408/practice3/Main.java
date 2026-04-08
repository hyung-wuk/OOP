package practice.practice260408.practice3;

public class Main {
    public static void main(String[] args) {
        Account[] AccountArray = new Account[3];

        AccountArray[0] = new Account(1000);
        AccountArray[1] = new SavingAccount(2000);
        AccountArray[2] = new CheckingAccount(3000);

        for (Account acc : AccountArray) {
            acc.showInfo();
        }//확장 for문
        //배열 내의 모든 값을 순회하는 for문의 향상된 형태, 배열의 모든 요소를 스캔하는 과정에서
        //인덱스 자체의 값이 필요하지 않을 때는 확장 for문이 유용
        //확장 for문은 배열의 리스트를 순회 할 때 요소의 값을 변경하지 않고 읽기만 할 때 주로 사용

        // for([배열 자료형] [변수명] : [배열명 또는 컬렉션 객체명]){변수는 배열 내의 각각의 값을 뜻함}
    }
}
