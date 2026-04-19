package javatutorials.exception;

class Calculator {
    int left, right;
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
    public void divide(){
        //계산 결과는 오류가 발생했습니다 : / by zero <- 결과
        try {
            System.out.print("계산 결과는 ");
            System.out.print(left / right);
            System.out.print(" 입니다.");
        } catch(Exception e){
            System.out.println("오류가 발생했습니다 : "+e.getMessage());
        }
        //문제가 발생 할 수도 있다고 예측 되는 부분을 try로 묶음
        //문제가 발생하면 try의 중괄호 안에있는 코드는 실행 중지, 그 뒤 catch안에 있는 구문이 실행됨
        //자바 버츄얼 머신이 오류 발생시 자동으로 catch를 호출 그리고 그 안에 있는 e라는 매개변수를 출력
        //e의 데이터 타입은 Exception이라는 클래스, Exception 안에있는 getMessage라는 메서드를 호출하면
        //에러가 발생한 이유를 반환
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.setOprands(10, 0); //0으로 나누면 오류
        calc.divide();
    }
}
