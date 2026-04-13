package javatutorials.polymorphism;

public class CaculatorDemo_260409 {
    public static void execute(Calculator_260409 cal){
        System.out.println("실행결과 : ");
        cal.run();
    }
    public static void main(String[] args) {
        Calculator_260409 c1 = new CalculatorDecoPlus_260409();
        Calculator_260409 c2 = new CalculatorDecoMinus_260409();

        c1.setOprands(10,20);
        c2.setOprands(10,20);
//        c1.run();
//        c2.run();

        execute(c1);
        execute(c2);
    }
}
