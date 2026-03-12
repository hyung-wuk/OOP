package org.opentutorials.javatutorials.Inheritance.example1;

public class CalculatorDemo3 {
    public static void main(String[] args) {
        DivisionableCalculator c1 = new DivisionableCalculator();
        c1.setOprands(10,20);
        c1.sum();
        c1.multiplication();
        c1.division();
    }
}

class DivisionableCalculator extends MultiplacaionableCalculator {
    public void division () {
        System.out.println(this.left / this.right);
    }
}
