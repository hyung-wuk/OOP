package javatutorials.exception;

class Calculator__ {
    int left, right;
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
//        if (right == 0){
//            throw new IllegalArgumentException();
//        } //IllegalArgumentException : 잘못된 인자가 전달 됐다는 오류
    }
    public void divide(){
        if (right == 0){
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }//ArthmeticException 계산 결과 오류
        try {
            System.out.print("계산 결과는 ");
            System.out.print(left / right);
            System.out.print(" 입니다.");
        } catch(Exception e){
            System.out.println("\n\ne.getMessage()\n"+e.getMessage());
            System.out.println("\n\ne.toString()\n"+e.toString());
            System.out.println("\n\ne.printStackTrace()");
            e.printStackTrace();
        }
    }
}

public class CalculatorThorwDemo {
    public static void main(String[] args) {
        Calculator__ calc = new Calculator__();
        calc.setOprands(10, 0);
        try {
            calc.divide();
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        } //getmessage의 오류 내용이 위의 throw에서 설정한 내용인것
    }
}
//throws는 오류를 넘기기, throw는 오류 생성
