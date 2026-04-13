package javatutorials.polymorphism;

public class CalculatorDecoPlus_260409 extends Calculator_260409 {
    public void sum() {
        System.out.println("+++" + (left + right) + "+++");
    }
    public void avg() {
        System.out.println("+++" + (left + right)/2 + "+++");
    }
}
