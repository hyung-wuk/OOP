package javatutorials.exception;

class Calculator_ {
    int left, right;
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
    public void divide(){
        //결과 :
//        /Library/Java/JavaVirtualMachines/temurin-21.jdk/Contents/Home/bin/java -javaagent:/Users/wjsguddnr/Desktop/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=62184 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/wjsguddnr/Desktop/work space/객체지향/Object-Oriented-Programing/out/production/Object-Oriented-Programing javatutorials.exception.CalculatorDemo_
//        계산 결과는
//
//        e.getMessage()
//                / by zero
//
//
//        e.toString()
//        java.lang.ArithmeticException: / by zero
//
//
//        e.printStackTrace()
//        java.lang.ArithmeticException: / by zero
//        at javatutorials.exception.Calculator_.divide(CalculatorDemo_.java:13)
//        at javatutorials.exception.CalculatorDemo_.main(CalculatorDemo_.java:28)
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
        System.out.println("divid end");
        //getMessage는 아주 간단한 형태의 에러에 대한 힌트가 들어있음
        //toString은 예외 상황에 대한 좀더 자세한 정보가 들어있음
        //printStaackTrace는 문자열을 리턴하는것이 아닌 printStackTrace 내부적으로 처리 한 것을 화면에 반환 위의 것들보다 더 상세함

        //try에서 예외 처리 발생 시 catch안에 있는 구문이 실행되고 바로 끝나는 것이 아닌 try, catch 바깥에 있는 코드까지 실행 되고 마쳐짐

    }
}

public class CalculatorDemo_ {
    public static void main(String[] args) {
        Calculator_ calc = new Calculator_();
        calc.setOprands(10, 0); //0으로 나누면 오류
        calc.divide();
    }
}
