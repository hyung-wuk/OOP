package javatutorials.exception;

class CheckedDividException extends Exception{
    int left, right;
    CheckedDividException(){
        super();
    }
    CheckedDividException(String message, int left, int right){
        super(message);
        this.left = left;
        this.right = right;
    }
}//checked exception class

class UncheckedDividException extends RuntimeException{
    int left, right;
    UncheckedDividException(){
        super();
    }
    UncheckedDividException(String message, int left, int right){
        super(message);
        this.left = left;
        this.right = right;
    }
}//unchecked exception class

class Calculator___{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void divide(){
//        try {
//            if (right == 0) {
//                throw new CheckedDividException("Divide by Zero", left, right);
//            }
//        }
//        catch (CheckedDividException e){
//            System.out.println(e.getMessage());
//            System.out.println(e.left);
//            System.out.println(e.right);
//        }

        if(right == 0){
          throw new UncheckedDividException("Divide by Zero", left, right);
        }
        System.out.println(left/right);
    }
}

public class CalculatorDemo2{
    public static void main(String[] args){
        Calculator___ c = new Calculator___();
        c.setOprands(10,0);
        try {
            c.divide();
        }catch (UncheckedDividException e){
            System.out.println(e.getMessage());
            System.out.println(e.left);
            System.out.println(e.right);
        }
    }
}

//자바에서 기본적으로 제공되는 예외들을 표준 예외 클래스라고 한다.
//예외 사용은 표준 예외를 권장한다. 자바 사용자들 대부분이 이에 익숙하기 때문이다.
//표준 예외 클래스가 100여가지나 되기에 많은 예외 상황을 표현 할 수 있으나, 그렇지 않은 경우도 있기에
//그런 때에는 직접 예외를 만들어서 사용한다.
//예외를 만들기 전에 해야 할 것은 자신의 예외를 checked로 할것인가, unchecked로 할 것인가이다.

//API쪽에서 예외를 던졌을 때, 사용자 쪽에서 예외 상황을 복구 할 수 있다면, checked 예외를 사용한다.
//checked예외는 사용자에게 문제를 해결할 기회를 주는 것이면서 예외처리를 강제하는 것이다.
//그러나 checked 예외를 너무 자주 사용하면 api사용자를 몹시 힘들게 할 수 있다.
//사용자가 api 사용방법을 어겨서 발생하는 문제거나 예외 상황이 이미 발생한 시점에서
//그냥 프로그램을 종로하는것이 덜 위험 할때 unchecked exception을 사용한다.